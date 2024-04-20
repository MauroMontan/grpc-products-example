package main

import (
	"context"
	"fmt"
	productsmod "grpc/client/products"
	"grpc/client/proto/products"
	"log"
	"net"

	"google.golang.org/grpc"
	"google.golang.org/protobuf/types/known/emptypb"
)

type server struct {
	products.UnimplementedProductServiceServer
}

var grpcProducList []*products.Product

func (*server) GetProducts(ctx context.Context, req *emptypb.Empty) (*products.ProductReply, error) {

	if len(grpcProducList) == 0 {
		productList := productsmod.GetProducts()

		for _, product := range productList {
			grpcProducList = append(grpcProducList, product.GrpcMapped())
		}
	}

	res := &products.ProductReply{
		Product: grpcProducList,
	}

	return res, nil
}

func main() {
	fmt.Println("Hello, Go Server is running")

	lis, err := net.Listen("tcp", "0.0.0.0:9090")

	if err != nil {
		log.Fatalf("Failed to listen %v", err)
	}
	s := grpc.NewServer()

	products.RegisterProductServiceServer(s, &server{})

	if err := s.Serve(lis); err != nil {
		log.Fatalf("Failed to serve %v", err)
	}
}
