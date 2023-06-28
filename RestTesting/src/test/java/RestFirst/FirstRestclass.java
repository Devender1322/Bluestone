package RestFirst;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import groovy.util.logging.Log;
import io.restassured.path.json.JsonPath;


public class FirstRestclass {
	int id;
	@Test
	void getusers() {
		given()
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.body("per_page", equalTo(6))
		.log().all();		
	}
	@Test
	void CreateUser() {
		
		HashMap HM = new HashMap();
		HM.put("name", "Devender");
		HM.put("job", "SE");
		
		given()
		.contentType("application/json")
		.body(HM)
		
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
		.log().all();
		
	}
	@Test
	
	void CreatUser() {
		
		HashMap HM = new HashMap();
		HM.put("name", "Devender");
		HM.put("job", "SE");
		
		id = given()
		.contentType("application/json")
		.body(HM)
		
		
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		
	}
	@Test
	void updateuser() {
		HashMap HM = new HashMap();
		HM.put("name", "Dev");
		HM.put("job", "Engineer");
		
		given()
				.contentType("application/json")
				.body(HM)
		
		
				.when()
				.put("https://reqres.in/api/users"+id)
				.then()
				.statusCode(404)
				.log().all();
		
	}
@Test	
	void deleteusers() {
		given()
		
		.when()
		.delete("https://reqres.in/api/users"+ id)
		
		.then()
		.statusCode(204);
	}
}
