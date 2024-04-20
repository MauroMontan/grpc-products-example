import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import protos.Product;
import protos.ProductReply;
import protos.ProductServiceGrpc;

import java.util.List;

public class Main {



    public static void main(String[] args)  {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext() // Use plaintext communication (not recommended for production)
                .build();


        // Create a stub for the HelloService
       ProductServiceGrpc.ProductServiceBlockingStub stub = ProductServiceGrpc.newBlockingStub(channel);

        // Create a request message

       Empty empty = Empty.getDefaultInstance();



        // Call the remote service
        ProductReply response = stub.getProducts(empty);


        // Print the response
        List<Product> products = response.getProductList();

       products.forEach((e)->{
           System.out.println(e.getName());
       });


        // Shutdown the channel
        channel.shutdown();

    }
}
