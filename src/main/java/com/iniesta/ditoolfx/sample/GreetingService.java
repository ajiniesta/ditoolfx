package com.iniesta.ditoolfx.sample;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

import javax.inject.Singleton;

@Singleton
public class GreetingService extends Service<String> {

  private final Greeter greeter;

  public GreetingService(Greeter greeter) {
    this.greeter = greeter;
  }


  @Override
  protected Task<String> createTask() {
    return  new Task<String>() {
      @Override
      protected String call() throws Exception {
        return greeter.greet();
      }
    };
  }
}
