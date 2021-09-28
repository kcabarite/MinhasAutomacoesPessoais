package getRequest;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	@Test
	public void testResponsecode() {

		Response resp = RestAssured.get("https://httpbin.org/get");

		int code = resp.getStatusCode();

		System.out.println("Status code is " + code);

		Assert.assertEquals(code, 200);
	}
	
	@Test
	public void testbody() {

		Response resp = RestAssured.get("https://httpbin.org/get");

		String data = resp.asString();

		System.out.println("Data is " + data);

		System.out.println("O tempo de resposta é de " +resp.getTime() + "ms");
	}
}
