import java.util.*;

class HashMapDemo {
  public static void main(String args[]) {
    Map<String, String> details = new HashMap<String, String>();
    details.put("name", "Ganesh Kalyan");
    details.put("email", "srikgk333@gmail.com");
    details.put("dept", "B.Tech CSE");
    String json = new String;
    for (Map.Entry<String, String> m: details.entrySet()) {
        json.append("\""+m.getKey()+"\"");
    }
  }
}