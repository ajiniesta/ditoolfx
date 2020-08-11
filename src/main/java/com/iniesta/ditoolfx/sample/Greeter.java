package com.iniesta.ditoolfx.sample;

import javax.inject.Singleton;

@Singleton
public class Greeter {

  public String greet(){
    return "Hello, I'm using Micronaut Depencency Injection";
  }
}
