package edu.escuelaing.arep.designprimer;

import static spark.Spark.*;
import com.google.gson.Gson;
import edu.escuelaing.arep.Operations.Operation;



public class SparkWebApp {

 public static void main(String[] args) {
   port(getPort());
   staticFiles.location("/pages");
   Gson json = new Gson();
   get("/calcular/:data", (req, res) -> {
      res.type("application/json");
      String resultado = Operation.CalcularPromedioDesviacion(req.params(":data"));
      System.out.println(resultado);
      res.status(200);
      return json.toJson(resultado);
   });

 }
 
 static int getPort() {
   if (System.getenv("PORT") != null) {
      return Integer.parseInt(System.getenv("PORT"));
    }
    return 4567; 
 }
 
}