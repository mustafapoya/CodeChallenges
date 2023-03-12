import java.util.HashMap;

public class DomainType {
    public static String[] code(String[] array) {
        HashMap<String, String> domains = new HashMap<>();
        domains.put("org", "organization");
        domains.put("com", "commercial");
        domains.put("net", "network");
        domains.put("info", "information");

        String [] result = new String[array.length];

        for(int i = 0; i < array.length; i++) {
            String domain = array[i].substring(array[i].lastIndexOf(".")+1);
            result[i] = domains.get(domain);
        }

        return result;
    }
}
