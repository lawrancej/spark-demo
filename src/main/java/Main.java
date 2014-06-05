import static spark.Spark.*;

import spark.template.mustache.MustacheTemplateEngine;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;

public class Main {

    public static void main(String[] args) {
        get("/",(request, response) -> {
            return "Hello World!";
        });
        get("/signup",(request, response) -> {
            return "Let's sign up, just kidding!";
        });
        Map map = new HashMap();
        map.put("name", "Sam");

        // hello.mustache file is in resources/templates directory
        get("/hello", (rq, rs) -> new ModelAndView(map, "hello.mustache"), new MustacheTemplateEngine());
    }
}
