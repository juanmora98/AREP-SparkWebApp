package edu.escuelaing.arep.designprimer;

import static spark.Spark.*;

public class SparkWebApp {

 public static void main(String[] args) {
   staticFiles.location("/pages");
    port(getPort());
    get("/hello", (req, res) -> "Hello Heroku");
    get("/calculator", (req, res) -> {
       res.redirect("/calculator.html");
       res.status(200);
       return null;

    });

 }
 
 static int getPort() {
   if (System.getenv("PORT") != null) {
      return Integer.parseInt(System.getenv("PORT"));
    }
    return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
 }
 

 
}