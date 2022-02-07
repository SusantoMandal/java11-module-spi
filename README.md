# Maven project for Module with SPI

This is a maven project which uses modules to communicate  with each other and implement SPI (Service Provider Interface).

## Getting Started

### Prerequisites
- Before proceeding with this part, your local development machine must have the following installed:
  - GIT CLI - To clone this repository
  - pre install jdk 11 and set it's path in system environment variable.
  - pre install maven and set it's path in system environment variable.

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
$ mvn clean compile
```

### 3. Run the program
Simply run the shell script present in the root folder.

```bash
# Run the program
$ ./run-module.sh
```

## Introduction
### Parent POM
There is a single parent pom with artifactID `my-parent` in a root folder which has 3 child modules
- serviceProviderInterface
- serviceLoader
- serviceProvider

### Child POM

#### 1. serviceProviderInterface Module
In this module, there is a single interface `Vehicle.java` which is going to use as a `Service Provider Interface`

#### 2. serviceProvider Module
This module is going to provide the implementation for `Service Provider Interface`. It has only three implementation classes `Bike.java`, `Car.java`, `Truck.java` which act as a `Service Provider`.

#### 3. serviceLoader Module
This is a Java SPI main class that is used to load the services for a service provider interface and it is used in `VehicleShowroom.java`.





