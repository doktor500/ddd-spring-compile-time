package com.intenthq.ddd.domain;

import com.intenthq.ddd.components.Dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Client {

  @Autowired
  private Dependency dependency;

  public Dependency getDependency() {
    return dependency;
  }
}