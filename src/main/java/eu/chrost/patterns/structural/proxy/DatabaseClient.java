package eu.chrost.patterns.structural.proxy;

class DatabaseClient {
    private final IDatabase databaseProxy;

    public DatabaseClient(IDatabase database) {
        databaseProxy = new CachedDatabaseProxy(new LazyInitDatabaseProxy(database));
    }

    public String get(String key) {
        return databaseProxy.get(key);
    }
}
