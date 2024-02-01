package com.example.starter;

import io.vertx.core.AbstractVerticle;

public class HelloVerticle extends AbstractVerticle {
  public void start(){
    vertx.eventBus().consumer("hello.vertx.addr",msg ->{
      msg.reply("hello vert x world");
    });
    vertx.eventBus().consumer("hello.named.addr", msg ->{
      String name = (String) msg.body();
      msg.reply(String.format("hello %s",name));
    });
  }
}

