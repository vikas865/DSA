package Practice;

import org.json.JSONArray;

import java.util.Iterator;

public class JsonCOuntKey
{

    public  static  int filecount=0;
    public  static int foldercount=0;
    public static void  getKeycount(JSONArray jsonArray, String key){

        int len= jsonArray.length();
        Iterator<?> keys;
        for(int i=0; i<len;i++)
        {
           String str= (String)jsonArray.getJSONObject(i).get(key);
            System.out.println("count "+i+ " " +str);
            if((jsonArray.getJSONObject(i).has(key) && jsonArray.getJSONObject(i).has("size"))
            )
            {
                System.out.println(jsonArray.getJSONObject(i).get("size"));
               if( jsonArray.getJSONObject(i).get("size").toString().isEmpty()
                || jsonArray.getJSONObject(i).isNull("size"))
                   System.out.println("Empty Size----->");
                filecount++;
            }
            else
            {
                foldercount++;
            }

             keys =jsonArray.getJSONObject(i).keys();

            while (keys.hasNext()){
               String nextstr= (String)keys.next();
                if(jsonArray.getJSONObject(i).get(nextstr) instanceof JSONArray){

                  getKeycount((JSONArray) jsonArray.getJSONObject(i).get(nextstr),key);
                }
                else {
                    System.out.println("no nesting");
                }
            }



            if(jsonArray.getJSONObject(i).get(key) instanceof  JSONArray){
                System.out.println("Array");
            }
            else{

                System.out.println("not Array");
            }

        }



    }
    public static void main(String[] args) {
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
                "                \"size\": null\n" +
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

        getKeycount(inputjson, "name");
        System.out.println("filecount"+filecount);
        System.out.println("foldercount"+foldercount);
    }

}
