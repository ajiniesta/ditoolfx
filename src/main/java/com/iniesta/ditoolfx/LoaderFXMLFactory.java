package com.iniesta.ditoolfx;

import io.micronaut.context.BeanContext;
import javafx.fxml.FXMLLoader;

import javax.inject.Singleton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

@Singleton
public class LoaderFXMLFactory {

  private final BeanContext beanContext;

  public LoaderFXMLFactory(BeanContext beanContext) {
    this.beanContext = beanContext;
  }

  public FXMLLoader get(URL location){
    FXMLLoader loader = new FXMLLoader(location);
    loader.setControllerFactory(this::getControllerFactory);
    return loader;
  }

  /**
   * With Micronaut DI...
   * @param clazz
   * @param <T>
   * @return
   */
  private <T> T getControllerFactory(Class<T> clazz) {
    return beanContext.getBean(clazz);
  }
}
