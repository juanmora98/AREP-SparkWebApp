package edu.escuelaing.arep.designprimer;

import static spark.Spark.*;

import edu.escuelaing.arep.Operations.Operation;
import edu.escuelaing.arep.models.LinkedList;
import spark.Request;
import spark.Response;

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
    get("/results", (req, res) -> {
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
 
public static void ResultPage(Request req, Response res){
   String list[] = req.queryParams("data").split(",");
   LinkedList<Double> linkedNum = new LinkedList<Double>();
   for (String val: list){
      linkedNum.add(Double.parseDouble(val));
   }

   double promedio = Operation.Promedio(linkedNum);
   double variacionEs = Operation.DesviacionEstandar(linkedNum);
}
 
}