#!/bin/bash

sudo amazon-linux-extras install java-openjdk11

aws s3 cp s3://evanpricesoftware-deploy/eps-blog/build.jar build.jar

java -jar build.jar