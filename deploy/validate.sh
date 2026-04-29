#!/bin/bash

sleep 10

PORT=8080

if lsof -i:$PORT > /dev/null; then
  echo "Application is running on port $PORT"
  exit 0
else
  echo "Application failed to start"
  exit 1
fi
