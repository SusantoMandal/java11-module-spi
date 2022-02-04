#! /bin/bash

# This is the module script!
java --module-path "gui/target/classes;api/target/classes;impl/target/classes;" -m my.company.gui/my.company.gui.Frontend
