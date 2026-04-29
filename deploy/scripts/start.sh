#!/bin/bash

cd /home/ubuntu/app

JAR=$(ls *.jar | head -n 1)

echo "Starting application: $JAR"

nohup java -jar $JAR > app.log 2>&1 &
