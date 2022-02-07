package my.company.loader;

import java.util.ServiceLoader;
import my.company.spi.Vehicle;

public class VehicleShowroom {
  public static void main(String[] args) {
    ServiceLoader<Vehicle> serviceLoader = ServiceLoader.load(Vehicle.class);

    System.out.println("Total number of implented class - "+serviceLoader.stream().count());
		
    for (Vehicle service : serviceLoader) {
			  service.intro();  
        service.wheels();
		}
    
  }
}
