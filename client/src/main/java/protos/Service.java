// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

// Protobuf Java Version: 3.25.1
package protos;

public final class Service {
  private Service() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rservice.proto\022\010products\032\033google/protob" +
      "uf/empty.proto\032\rProduct.proto2O\n\016Product" +
      "Service\022=\n\013GetProducts\022\026.google.protobuf" +
      ".Empty\032\026.products.ProductReplyB\033\n\006protos" +
      "P\001Z\017protos/productsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          protos.ProductOuterClass.getDescriptor(),
        });
    com.google.protobuf.EmptyProto.getDescriptor();
    protos.ProductOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
