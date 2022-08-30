package com.testing.server.main;

import lombok.Getter;
import lombok.Setter;

public class HelloWorldBean {
  @Getter
  @Setter
  public String message;
  public HelloWorldBean(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return String.format("HelloWorldBean [message=%s]", message);
  }
}
