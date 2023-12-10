package eu.chrost.patterns.structural.proxy;

class DatabaseClient {
    private final Database database;

    DatabaseClient(Database database) {
        this.database = database;
        database.init();
    }

    public String get(String key) {
        return database.get(key);
    }
}
