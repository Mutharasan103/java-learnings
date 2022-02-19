



import java.io.FileWriter;
import java.io.IOException;

public class JsonDemo {
        public static void main(String[] args) {
            JSONObject emp = new JSONObject();
            //JSONParser emp = new JSONParser();
            emp.put("firstname","Muthu");
            emp.put("lastname","Arasan");
            emp.put("mail","muthu@gmail.com");
            emp.put("City","Nazareth");

            JSONObject empObj = new JSONObject();
            empObj.put("employee",emp);

            JSONObject emp1 = new JSONObject();
            emp1.put("firstname","Pearl");
            emp1.put("lastname","King");
            emp1.put("mail","king@gmail.com");
            emp1.put("City","Tuticorin");

            JSONObject empObj1 = new JSONObject();
            empObj1.put("employee",emp1);

            org.json.simple.JSONArray empList = new org.json.simple.JSONArray();
            empList.add(empObj);
            empList.add(empObj1);

            try {FileWriter file = new FileWriter("employee.json");
                {
                    file.write(empList.toJSONString());
                    file.flush();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    private static class JSONObject {
            String firstname;
            String lastname;
            String mail;
            String city;
    }
}



}
