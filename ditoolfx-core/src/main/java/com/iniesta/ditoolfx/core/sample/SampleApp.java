package com.iniesta.ditoolfx.core.sample;

import com.iniesta.ditoolfx.core.LoaderFXMLFactory;
import com.iniesta.ditoolfx.core.MainView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.inject.Singleton;
import java.io.IOException;
import java.net.URL;

@Singleton
public class SampleApp implements MainView {

  private final LoaderFXMLFactory loaderFXMLFactory;

  public SampleApp(LoaderFXMLFactory loaderFXMLFactory) {
    this.loaderFXMLFactory = loaderFXMLFactory;
  }

  @Override
  public void start(Stage stage) {
    URL url = getClass().getClassLoader().getResource("fxml/Sample.fxml");
    FXMLLoader fxmlLoader = loaderFXMLFactory.get(url);
    try {
      Parent parent = fxmlLoader.load();
      Scene scene = new Scene(parent);
      stage.setScene(scene);
      stage.show();
      stage.setOnCloseRequest(e->System.exit(0));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
