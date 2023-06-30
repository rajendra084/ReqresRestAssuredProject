package restAssured;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class UpdateUser {
	
	@SuppressWarnings("unchecked")
	@Test
	public void updateUserDetails()
	{
		JSONObject req = new JSONObject();
		
		req.put("name", "TestUser");
		req.put("job", "Service");
		
		given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(req.toJSONString())
		.when()
				.put("https://reqres.in/api/users/2")
		.then()
				.statusCode(200)
				.log().all();
	}
	

}
