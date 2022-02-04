package my.company.gui;

import java.util.ServiceLoader;
import my.company.api.Backend;

public class Frontend {
  public static void main(String[] args) {
    ServiceLoader<Backend> serviceLoader = ServiceLoader.load(Backend.class);
        // System.out.println(Backend.class);
        System.out.println("Total number of implented class - "+serviceLoader.stream().count());
		for (Backend service : serviceLoader) {
			service.greeting();
		}
  }
}
