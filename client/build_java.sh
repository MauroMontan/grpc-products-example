#/bin/sh


protos_source_path="src/main/java/protos"
rm -rf $protos_source_path 

mvn clean install

generated_protos_path="target/generated-sources/protobuf/java/protos"

mv "$generated_protos_path" $protos_source_path

mv target/generated-sources/protobuf/grpc-java/protos/* $protos_source_path


echo " code genrated"
