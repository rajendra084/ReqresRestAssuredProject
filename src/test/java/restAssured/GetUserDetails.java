package restAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetUserDetails {
	
	@Test
	void getListOfUsers()
	{
		given()
			.header("Content-Type", "application/json")
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("data[0].id", equalTo(7))
			.body("data.first_name", hasItems("Lindsay", "Tobias"))
			.log().all();			
	}

}
