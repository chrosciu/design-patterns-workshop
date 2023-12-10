package eu.chrost.patterns.structural.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class LazyInitDatabaseProxy implements IDatabase {
    private final IDatabase proxiedDatabase;
    private boolean initialized = false;

    @Override
    public void init() {
        //do nothing
    }

    @Override
    public String get(String key) {
        if (!initialized) {
            proxiedDatabase.init();
            initialized = true;
        }
        return proxiedDatabase.get(key);
    }
}
