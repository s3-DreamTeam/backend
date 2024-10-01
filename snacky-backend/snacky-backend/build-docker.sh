#! /bin/bash

cd ../../

docker build -f snacky-backend/snacky-backend/src/main/docker/Dockerfile.jvm -t snacky-backend .

cd snacky-backend/snacky-backend/

sudo docker save -o docker/test/snacky-backend.tar snacky-backend:latest
