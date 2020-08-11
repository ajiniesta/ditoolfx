package com.iniesta.ditoolfx;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.BeanContext;
import javafx.application.Application;
import javafx.stage.Stage;

public class DiApplication extends Application {

  private static Class<? extends MainView> mainViewClazz;
  private final BeanContext context;

  public DiApplication() {
    context = ApplicationContext.build("test").build();
  }

  public static void setMainViewClazz(Class<? extends MainView> mainViewClazz) {
    DiApplication.mainViewClazz = mainViewClazz;
  }

  @Override
  public void start(Stage stage) throws Exception {
    MainView mainView = context.getBean(mainViewClazz);
    mainView.start(stage);
  }
}
