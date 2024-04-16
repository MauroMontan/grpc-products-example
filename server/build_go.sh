#/bin/sh

protoc --proto_path=./protobufs  --go-grpc_out=. --go_out=. protobufs/*.proto
