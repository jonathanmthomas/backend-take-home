
# Quotely

### Task

Write a Java command line program quotely which takes as an argument English or Russian and returns a quote from the forismatic API with the correct language. If a language is not specified, default to English.

### Instructions
* Original Instructions can be found at INSTRUCTIONS.md

#### Install Java SDK (if not already installed)
* Application was tested with OpenJDK 16 but a different version should work without any issues.
* References for OpenJDK 16
    * https://openjdk.java.net/projects/jdk/16/
    
#### Building and Testing
```
$ ./gradlew build
$ ./gradlew test
```  

#### Running Application (3 ways to run)
```
./gradlew run # No Args, Defaults to English
./gradlew run --args="English"
./gradlew run --args="Russian"
```
