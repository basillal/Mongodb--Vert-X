package com.example.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.MultiMap;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.client.WebClient;


public class MainVerticle extends AbstractVerticle {
  @Override
  public void start() {
    vertx.deployVerticle(new HelloVerticle());
    Router router = Router.router(vertx);

    router.get("/print/").handler(ctx ->{
     vertx.eventBus().request("hello.vertx.addr","", reply->{
       ctx.request().response().end((String) reply.result().body());
     });
    });

    router.get("/printname/:name").handler(ctx ->{
      String name = ctx.pathParam("name");
     vertx.eventBus().request("hello.named.addr",name, reply ->{
        ctx.request().response().end((String) reply.result().body());
     });
    });

    vertx.createHttpServer().requestHandler(router).listen(8080);
  }

}
