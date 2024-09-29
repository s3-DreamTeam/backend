#!/bin/bash

docker build -f src/main/docker/Dockerfile.jvm -t snacky-backend .

sudo docker save -o docker/test/snacky-backend.tar snacky-backend:latest
