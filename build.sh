#! /bin/bash
mvn clean compile install
sudo docker build -f Dockerfile -t product .
sudo docker run -p 8081:8081 product &
sudo docke tag product:1.2 saidu007/product:latest
sudo docker push saidu007/product:latest
