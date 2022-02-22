import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Jsonread {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            FileReader reader = new FileReader("employee.json");
            Object obj = parser.parse(reader);
            JSONArray emplist = (JSONArray) obj;
            System.out.println(emplist);
            emplist.forEach(emp -> parseEmpObj((JSONObject) emp));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
    private static void parseEmpObj(JSONObject emp)
    {
        JSONObject object = (JSONObject) emp.get("employee");
        String firstname = (String) object.get("firstname");
        String lastname = (String) object.get("lastname");
        String mail = (String) object.get("mail");
        String city = (String) object.get("City");
        System.out.println("Firstname is: " +firstname);
        System.out.println("Lastname is: "+lastname);
        System.out.println("Mail is: "+mail);
        System.out.println("City is: "+city);

    }
}
