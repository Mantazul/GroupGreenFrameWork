package jsonServer;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMethods {
    @Test
    public void testPost(){
        RequestSpecification request= RestAssured.given();
        request.header("Content-type","application/json");
        JSONObject json=new JSONObject();
        json.put("id",86);
        json.put("title", "selenium");
        json.put("author","rabiul islam");
        request.body(json.toString());
        Response response=request.post("http://localhost:3000/posts");
        int code=response.getStatusCode();
        Assert.assertEquals(code,201);
    }
    @Test
    public void testDelete(){
    RequestSpecification request=RestAssured.given();
    Response response=request.delete("http://localhost:3000/posts/1");
    int code=response.getStatusCode();
    Assert.assertEquals(code,200);
    }
    @Test
    public void testPut(){
        RequestSpecification request= RestAssured.given();
        request.header("Content-type","application/json");
        JSONObject json=new JSONObject();
        json.put("id",86);
        json.put("title", "selenium");
        json.put("author","rabiul islam");
        request.body(json.toString());
        Response response=request.post("http://localhost:3000/posts/86");
        int code=response.getStatusCode();
        Assert.assertEquals(code,200);
    }




}
