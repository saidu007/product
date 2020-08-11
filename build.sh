#! /bin/bash
mvn clean compile install
sudo docker build -f Dockerfile -t product .
sudo docker run -p 8081:8080 product
