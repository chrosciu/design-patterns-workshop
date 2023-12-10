package eu.chrost.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

class Database {
    private Map<String, String> data;

    public void init() {
        data = new HashMap<>();
        data.put("Chrost", "Marcin");
    }

    public String get(String key) {
        return data.get(key);
    }
}
