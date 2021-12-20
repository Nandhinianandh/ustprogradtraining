import java.util.*;
public class interactivedictionary {
    private Map<String, String> map = new HashMap<>();

    public void newEntry(String key, String value) {
        this.map.put(key, value);
    }

    public String look(String key) {
        return this.map.getOrDefault(key, String.format("Cant find entry for %s", key));
    }
}
