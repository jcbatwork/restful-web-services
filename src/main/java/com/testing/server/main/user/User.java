package com.testing.server.main.user;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

public class User {
  @Getter @Setter private Integer id;
  @Getter @Setter private String name;
  @Getter @Setter private Date dob;

  public User(Integer id, String name, Date dob) {
    this.id = id;
    this.name = name;
    this.dob = dob;
  }

  @Override
  public String toString() {
    return String.format("User [id=%s, name=%s, dob=%s]", id, name, dob);
  }
}
