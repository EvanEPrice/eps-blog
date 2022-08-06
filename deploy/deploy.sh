#!/usr/bin/env bash

echo "Starting deploy."
mvn clean package
mv target/*.jar target/build.jar
aws s3 cp ./target/build.jar s3://evanpricesoftware-deploy/eps-blog/build.jar
echo "Deploy finished."