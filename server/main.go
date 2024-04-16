package main

import (
	"context"
	"fmt"
	"grpc/client/proto/products"
	"log"
	"net"

	"google.golang.org/grpc"
	"google.golang.org/protobuf/types/known/emptypb"
)

type server struct {
	products.UnimplementedProductServiceServer
}

func (*server) GetProducts(ctx context.Context, req *emptypb.Empty) (*products.ProductReply, error) {

	println("has been called")
	productList := []*products.Product{{
		Name:  "Pencil",
		Price: 23.0,
	}, {
		Name:  "Pen",
		Price: 12.0,
	}}

	res := &products.ProductReply{
		Product: productList,
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
