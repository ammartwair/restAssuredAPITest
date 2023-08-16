package restAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class NewTest {
	 @Test
	    public void testAPIRequestAndValidation() {
	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
	        Response response = given()
	            .when()
	                .get("posts/1") 
	            .then()
	                .statusCode(200)
	                .body("id", equalTo(1)) 
	                .body("userId", equalTo(1))
	            .extract()
	                .response();
	        System.out.println(response.asString());
	    }
}
