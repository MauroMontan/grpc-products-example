// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

// Protobuf Java Version: 3.25.1
package protos;

public final class ProductOuterClass {
  private ProductOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_products_ProductReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_products_ProductReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rProduct.proto\022\010products\"G\n\007Product\022\n\n\002" +
      "id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\023\n\013description\030\003 " +
      "\001(\t\022\r\n\005price\030\004 \001(\001\"2\n\014ProductReply\022\"\n\007pr" +
      "oduct\030\001 \003(\0132\021.products.ProductB\033\n\006protos" +
      "P\001Z\017protos/productsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_products_Product_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_products_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_Product_descriptor,
        new java.lang.String[] { "Id", "Name", "Description", "Price", });
    internal_static_products_ProductReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_products_ProductReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_products_ProductReply_descriptor,
        new java.lang.String[] { "Product", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
