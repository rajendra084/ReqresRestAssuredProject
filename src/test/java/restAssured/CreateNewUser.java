package restAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class CreateNewUser {

	@SuppressWarnings("unchecked")
	@Test
	public void addUser() {

		JSONObject req = new JSONObject();

		req.put("name", "Ravi");
		req.put("job", "IT");

		System.out.println(req);
		System.out.println(req.toJSONString());
		
		//Below BDD style code represents create new user
		given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(req.toJSONString())
		
		.when()
			.post("https://reqres.in/api/users")
		
		.then()
			.statusCode(201)
		.log().all();

	}

}
