FROM java:8
EXPOSE 8081
ADD /target/product-0.0.1-SNAPSHOT.jar product.jar
ENTRYPOINT ["java", "-jar", "product.jar"]