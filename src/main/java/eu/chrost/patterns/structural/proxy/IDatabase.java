package eu.chrost.patterns.structural.proxy;

interface IDatabase {
    void init();
    String get(String key);
}
