#!/bin/bash

PID=$(pgrep -f 'java -jar')

if [ -n "$PID" ]; then
  echo "Stopping application (PID: $PID)"
  kill -15 $PID
  sleep 5
else
  echo "No application running"
fi
