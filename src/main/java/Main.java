import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        get("/",(request, response) -> {
            return "Hello World!";
        });
        get("/signup",(request, response) -> {
            return "Let's sign up, just kidding!";
        });
    }
}
