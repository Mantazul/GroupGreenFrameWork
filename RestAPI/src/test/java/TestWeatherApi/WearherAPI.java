package TestWeatherApi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.seleniumhq.jetty9.http.MetaData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WearherAPI {
    @Test
    public void testResponseCode(){
        Response response= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        int code=response.getStatusCode();
        Assert.assertEquals(code,200);
        System.out.println(code);
    }
}
