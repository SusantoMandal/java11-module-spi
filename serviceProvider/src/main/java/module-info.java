module my.company.impl {
  requires my.company.spi;
  provides my.company.spi.Vehicle with my.company.impl.Bike,
                  my.company.impl.Car, my.company.impl.Truck;
  // ...
}