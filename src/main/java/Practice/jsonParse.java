package Practice;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;

public class jsonParse {

    public static int count = 0;

    public static void parseObject(JSONArray jsonObject, String key) {

        // System.out.println(jsonObject.get(0).toString());
        System.out.println("hi");
    }

    public static int getKey(JSONArray jsonArray, String key) throws InstantiationException, IllegalAccessException {
        int len = jsonArray.length();

        System.out.println(jsonArray.toString());

        Map<String, String> map = new HashMap<>();

        Iterator<?> keys;
        String nextKeys;
        JSONObject jsonObject;

        for (int i = 0; i < len; i++) {
            boolean flag = jsonArray.getJSONObject(i).has(key);
            System.out.println(flag);


            if (flag) {

                keys = jsonArray.getJSONObject(i).keys();
                //System.out.println(keys.;
                jsonObject = jsonArray.getJSONObject(i);


                //
                while (keys.hasNext()) {
                    nextKeys = (String) keys.next();


                    if (jsonObject.get(nextKeys) instanceof JSONArray) {
                        count++;
                        System.out.println("insideif flag");
                        // while(keys.hasNext()) {
                        System.out.println(nextKeys);

                        jsonArray = (JSONArray) jsonObject.get(nextKeys);
                        System.out.println("jsonArray" + nextKeys);
                        getKey(jsonArray, key);
                    }

                }

            } else {
                parseObject(jsonArray, key);

            }
        }

     return count;
    }


    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        String jsonInput = "[\n" +
                "    {\n" +
                "        \"name\": \"File 1\",\n" +
                "        \"size\": 20\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"File 2\",\n" +
                "        \"size\": 100\n" +
                "    },\n" +
                "    {\n" +
                "        \"name\": \"Folder 1\",\n" +
                "        \"files\": [\n" +
                "            {\n" +
                "                \"name\": \"File 3\",\n" +
                "                \"size\": 20\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Folder 2\",\n" +
                "                \"files\": [\n" +
                "                    {\n" +
                "                        \"name\": \"File 5\",\n" +
                "                        \"size\": 20\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"name\": \"File 6\",\n" +
                "                        \"size\": 100\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"name\": \"File 7\",\n" +
                "                        \"size\": 100\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"File 4\",\n" +
                "                \"size\": 100\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "]";

        JSONArray inputjson = new JSONArray(jsonInput);

        getKey(inputjson, "name");
        System.out.println(count);

    }

}
