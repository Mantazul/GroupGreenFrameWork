package JASONServer;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostResources {
    @Test
    public void postTest() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 999);
        jsonObject.put("title", "ASIF");
        jsonObject.put("author", "QA");
        request.body(jsonObject.toJSONString());
        Response response = request.post("http://localhost:3000/posts");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201);
    }
    @Test
    public void deletePost() {
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://localhost:3000/posts/91");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void putPost() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 999);
        jsonObject.put("title", "Huckleberry hh");
        jsonObject.put("author", "Homer Simpson");
        request.body(jsonObject.toJSONString());
        Response response = request.put("http://localhost:3000/posts/991");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void putNullPost() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 999);
        jsonObject.put("title", "Huckleberry Fin");
        jsonObject.put("author", "Homer Simpson");
        request.body(jsonObject.toJSONString());
        Response response = request.put("http://localhost:3000/posts/999");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 404);
    }
}
