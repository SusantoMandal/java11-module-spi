package my.company.impl;

import my.company.api.Backend;

public class Middleware implements Backend {
  
  public void greeting() {
    System.out.println("Hello i am a interface from api");
    System.out.println("and I am imlemnted in impl");

  };
}
