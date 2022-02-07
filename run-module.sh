#! /bin/bash

# This is the module script!
java --module-path "serviceLoader/target/classes;serviceProviderInterface/target/classes;serviceProvider/target/classes;" -m my.company.loader/my.company.loader.VehicleShowroom
