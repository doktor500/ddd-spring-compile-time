package com.intenthq.ddd.controller;

import com.intenthq.ddd.domain.Client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {

  @RequestMapping("/")
  public String index(ModelMap model) {
    model.addAttribute("dependencyInjected", isDependencyInjected());
    return "index";
  }

  private boolean isDependencyInjected() {
    Client client = new Client();
    return client.getDependency() != null;
  }
}
