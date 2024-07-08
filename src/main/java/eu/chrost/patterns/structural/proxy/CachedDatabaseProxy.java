package eu.chrost.patterns.structural.proxy;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
class CachedDatabaseProxy implements IDatabase {
    private final IDatabase proxiedDatabase;
    private final Map<String, String> cache = new HashMap<>();

    @Override
    public void init() {
        proxiedDatabase.init();
    }

    @Override
    public String get(String key) {
        if (!cache.containsKey(key)) {
            cache.put(key, proxiedDatabase.get(key));
        }
        return cache.get(key);
    }
}
