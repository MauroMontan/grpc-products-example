package productsmod

import (
	"encoding/json"
	httpService "grpc/client/http"
	grpcProducts "grpc/client/proto/products"
)

func unmarshalProductResponse(data []byte) (ProductResponse, error) {
	var r ProductResponse
	err := json.Unmarshal(data, &r)
	return r, err
}

func (r *ProductResponse) marshal() ([]byte, error) {
	return json.Marshal(r)
}

type ProductResponse struct {
	Products []Product `json:"products"`
	Total    int64     `json:"total"`
	Skip     int64     `json:"skip"`
	Limit    int64     `json:"limit"`
}

type Product struct {
	ID                 int64    `json:"id"`
	Title              string   `json:"title"`
	Description        string   `json:"description"`
	Price              int64    `json:"price"`
	DiscountPercentage float64  `json:"discountPercentage"`
	Rating             float64  `json:"rating"`
	Stock              int64    `json:"stock"`
	Brand              string   `json:"brand"`
	Category           string   `json:"category"`
	Thumbnail          string   `json:"thumbnail"`
	Images             []string `json:"images"`
}

func GetProductResponse() ProductResponse {
	url := "https://dummyjson.com/products"
	res := httpService.FetchData(url)
	productResponse, err := unmarshalProductResponse(res)

	if err != nil {
		panic(err)
	}

	return productResponse
}

func (product *Product) GrpcMapped() *grpcProducts.Product {

	mappedProduct := &grpcProducts.Product{
		Price: float64(product.Price),
		Id:    int32(product.ID),
		Name:  product.Title,
	}

	return mappedProduct

}

func GetProducts() []Product {
	println("estoy haciendo una llamada a la api")
	products := GetProductResponse().Products

	return products
}
