#!/bin/bash
# TODO Referenciar el .so dentro del jar
java -Djava.library.path=./src/main/native -jar target/spring-jni-0.0.1-SNAPSHOT.jar