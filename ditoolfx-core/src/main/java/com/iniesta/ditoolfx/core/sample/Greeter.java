package com.iniesta.ditoolfx.core.sample;

import javax.inject.Singleton;

@Singleton
public class Greeter {

  public String greet(){
    return "Hello, I'm using Micronaut Depencency Injection";
  }
}
