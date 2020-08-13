module com.iniesta.ditoolfx.core {

  requires javafx.graphics;
  requires javafx.fxml;
  requires javafx.controls;

  requires javax.inject;
  requires io.micronaut.inject;
  requires io.micronaut.core;

  exports com.iniesta.ditoolfx.core;
  //exports com.iniesta.sample;

  opens fxml;
  opens com.iniesta.ditoolfx.core.sample;
}
