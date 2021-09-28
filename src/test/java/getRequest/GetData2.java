package getRequest;

import org.junit.Assert;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.*;

public class GetData2 {

	@Test
	public void testbody() {

//		String procurarpor = "https://httpbin.org/get";
//		System.out.println("Se existir a palavra é true, se não existir é false: "  + data.contains(procurarpor));	

		Response resp = RestAssured.get("https://httpbin.org/get");
		int code = resp.getStatusCode();

		if (code == 200) {
			when().get("https://httpbin.org/get").then().statusCode(200).body("url",
					equalTo("https://httpbin.org/get"));
			
			String data = get("https://httpbin.org/get").asString();
			System.out.println("Os Dados são: \r" + data);

			long time = get("https://httpbin.org/get").getTime();
			System.out.println("O tempo de resposta " + time);

			System.out.println("Status code is " + code);
			Assert.assertEquals(code, 200);
		}

		else {
			System.out.println("Status code is " + code);

		}
	}
}
