import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App{
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response)-> {
    Map<String, Object> model = new HashMap<String, Object>();
    model.put("template", "templates/index.vtl");
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

    get("/Cuisine", (request, response)-> {
    Map<String, Object> model = new HashMap<String, Object>();
    String name=request.queryParams("nameOfCuisine");
    Cuisine theirCuisine = new Cuisine (name);
    model.put("Cuisine",theirCuisine);
    model.put("template", "templates/CuisineMainPage.vtl");
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());



  }
}
