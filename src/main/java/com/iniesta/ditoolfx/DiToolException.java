package com.iniesta.ditoolfx;

public class DiToolException extends RuntimeException{

  public DiToolException() {
    super();
  }

  public DiToolException(String message) {
    super(message);
  }

  public DiToolException(String message, Throwable cause) {
    super(message, cause);
  }

  public DiToolException(Throwable cause) {
    super(cause);
  }
}
