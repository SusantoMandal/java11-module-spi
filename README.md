# Maven project for Module with SPI

This is a maven project which uses modules to communicate  with each other.

## Getting Started

### 1. Cloning the repository
```bash
# Clone the Repo
$ git clone https://github.com/SusantoMandal/java11-module-spi.git

# Go to repo
$ cd java11-module-spi

``` 

### 2. Compile the Project
Use maven to compile this project
```bash
# Compile the program
$ mvn compile
```

### 3. Run the program
Simply run the shell script present in the root folder.

```bash
# Run the program
$ ./run-module.sh
```

## Introduction
### Parent POM
There is a single parent pom in a root folder which has 3 child modules
- api
- gui
- impl

### Child POM

#### 1. API Module
In this module, there is a single class `Backend.java` which has a interface that is going to use as a `Service Provider Interface`

#### 2. IMPLEMENTATION Module
This module is going to provide the body for `Service Provider Interface`. It has only one class `Middleware.java` right now which act as a `Service Provider`.

#### 3. GUI Module
It is `ServiceLoader` class which loads API module and uses it in `Frontend.java`





