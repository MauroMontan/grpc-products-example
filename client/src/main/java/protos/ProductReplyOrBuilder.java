// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

// Protobuf Java Version: 3.25.1
package protos;

public interface ProductReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:products.ProductReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .products.Product product = 1;</code>
   */
  java.util.List<protos.Product> 
      getProductList();
  /**
   * <code>repeated .products.Product product = 1;</code>
   */
  protos.Product getProduct(int index);
  /**
   * <code>repeated .products.Product product = 1;</code>
   */
  int getProductCount();
  /**
   * <code>repeated .products.Product product = 1;</code>
   */
  java.util.List<? extends protos.ProductOrBuilder> 
      getProductOrBuilderList();
  /**
   * <code>repeated .products.Product product = 1;</code>
   */
  protos.ProductOrBuilder getProductOrBuilder(
      int index);
}
