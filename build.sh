#! /bin/bash
mvn clean compile install
sudo docker build -f Dockerfile -t product .
sudo docker run -p 8081:8081 product &
sudo docker tag product:latest saidu007/product:latest
sudo docker push saidu007/product:latest
sudo kubectl apply -f Java.yaml
