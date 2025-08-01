import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class PostmanEchoTest {


    @Test
    void postmanEchoTest(){
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Какой сегодня год?")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Какой сегодня день?"))
        ;


    }
}
