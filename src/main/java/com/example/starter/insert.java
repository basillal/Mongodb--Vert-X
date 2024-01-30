package com.example.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.ext.mongo.MongoClient;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.FindOptions;
import java.util.List;
public class insert {



  @Override
  public void start(){

    JsonObject config = new JsonObject()
      .put("connection_String","mongodb://localhost:27017")
      .put("db_name","my_db");
    MongoClient client =  MongoClient.create(vertx, config);




//JsonObject query = new JsonObject().put("name","John");

//JsonObject queryParam = new JsonObject().put("name","joyal");
//client.count("users",query, res->{
//  if(res.succeeded()){
//   long count = res.result();
//    System.out.println(count);
//  }
//  else{
//    res.cause().printStackTrace();
//  }
//
//});

//client.dropCollection("joyalcollection", res ->{
//  if(res.succeeded()){
//    System.out.println("deleted");
//  }
//  else {
//    System.out.println("not created");
//  }
//});


//client.removeDocuments("users",query , res ->{
//  if(res.succeeded()){
//    System.out.println("item has deleted");
//  }
//  else {
//    res.cause().printStackTrace();
//  }
//
//});

//
//    JsonObject document = new JsonObject()
//        .put("title", "The Hobbit")
//        //ISO-8601 date
//        .put("publicationDate", new JsonObject().put("$date", "1937-09-21T00:00:00+00:00"));
//      client.save("publishedBooks", document).compose(id -> {
//        return client.findOne("publishedBooks", new JsonObject().put("_id", id), null);
//      }).onComplete(res -> {
//        if (res.succeeded()) {
//          System.out.println("To retrieve ISO-8601 date : "
//            + res.result().getJsonObject("publicationDate").getString("$date"));
//        } else {
//          res.cause().printStackTrace();
//        }
//    });


//    JsonObject queryParam = new JsonObject().put("title","learn java");
//    client.removeDocuments("myCollection",queryParam, res ->{
//      if(res.succeeded()){
//        System.out.println("files has deleted");
//
//      }
//      else {
//        System.out.println("not deleted");
//      }
//    });


//
//    JsonObject data = new JsonObject().put("title","learn java").put("author","joyal");
//    client.save("myCollection",data).compose(res ->{
//      return client.findOne("myCollection",new JsonObject().put("_id",res),null );
//
//    }).onComplete(myres ->{
//
//      if(myres.succeeded()){
//          System.out.println("the data author is:"+myres.result().getString("author"));
//      }
//      else {
//        myres.cause().printStackTrace();
//      }
//    });
//







  }

  public static void main(String[] args) {




    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new Insert());

  }
}











