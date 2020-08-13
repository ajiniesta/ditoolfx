package com.iniesta.ditoolfx.core.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

import javax.inject.Singleton;

@Singleton
public class Sample {
  @FXML
  private Label label;

  @FXML
  private TextField textField;

  @FXML
  private ListView<String> listview;

  @FXML
  private ProgressBar progress;

  private final GreetingService greetingService;

  public Sample(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @FXML
  public void initialize(){
    label.textProperty().bind(greetingService.valueProperty());
    greetingService.start();
  }

  @FXML
  void onAddAction(ActionEvent event) {
    String text = textField.getText();
    if(!text.isEmpty()) {
      listview.getItems().add(text);
    }
  }

}
