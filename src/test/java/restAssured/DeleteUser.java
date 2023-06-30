package restAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteUser {

	@Test
	public void delete_user()
	{
	
		given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
		.when()
			.delete("https://reqres.in/api/users/2")
		.then()
			.statusCode(204)
			.log().all();
		
	}
}
