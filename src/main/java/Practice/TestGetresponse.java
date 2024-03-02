package Practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;

public class TestGetresponse
{
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Response res =RestAssured
                .get("https://api.npoint.io/55c40163142ad7c1504d");

       // ValidatableResponse validatableResponse=  res.then();
        //validatableResponse.statusCode(200);

        String body=res.getBody().asPrettyString().toString();
        System.out.println(body);

        JSONArray jsonArray = new JSONArray(body);
        System.out.println(jsonArray.toString());
         int cnt= jsonParse.getKey(jsonArray,"files");
        System.out.println(cnt);





        //System.out.println(Practice.jsonParse.getKey(jsonArray,"files"));


        //ObjectMapper objectMapper =new ObjectMapper() ;

//        JsonPath jsonPath = new JsonPath(res.body().asString());
//        int size=jsonPath.getList("$").size();
//        String filename=jsonPath.getString("[0].name");
//        //Assert.assertEquals(filename,"File 1");
//        System.out.println(size);
//        //Assert.assertEquals(size,3);
//        List<String> listallName= jsonPath.getList("[2].files.name");
//        System.out.println(listallName);



//        List<Object> jsonObject=RestAssured.get("https://api.npoint.io/55c40163142ad7c1504d")
//                .as(List.class);
//
//        System.out.println(jsonObject.toString());



//       Map<String,String> mapObject= (Map<String,String>) jsonObject.get();
//        System.out.println(mapObject.get("name"));


    }








//     int statusCode=res.getStatusCode();
//     //ResponseBody body= res.getBody();
//    ValidatableResponse validatableResponse = res.then();
//    validatableResponse.statusCode(200);


    //System.out.println(statusCode);

















}


