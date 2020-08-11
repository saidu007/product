#! /bin/bash
mvn clean compile install
docker build -f DockerFile -t product 
docker run -p 8080:8080 product
