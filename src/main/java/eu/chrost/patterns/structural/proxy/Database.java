package eu.chrost.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

class Database implements IDatabase {
    private Map<String, String> data;

    @Override
    public void init() {
        data = new HashMap<>();
        data.put("Chrost", "Marcin");
    }

    @Override
    public String get(String key) {
        return data.get(key);
    }
}
