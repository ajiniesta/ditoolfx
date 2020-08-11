package com.iniesta.ditoolfx;

import com.iniesta.ditoolfx.sample.Greeter;
import io.micronaut.context.ApplicationContext;
import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {

  private static Class<? extends MainView> mainViewClazz;
  private static ApplicationContext context;

  public static void run(Class<? extends MainView> mainViewClazz, String[] args) {
    Launcher.mainViewClazz = mainViewClazz;
    context = ApplicationContext.build("test").build();
    context.start();
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    Greeter greeter = context.getBean(Greeter.class);
    System.out.println(greeter.greet());
    MainView mainView = context.getBean(mainViewClazz);
    mainView.start(stage);
  }
}
