package eu.chrost.patterns.structural.proxy;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class DatabaseClientTest {
    private final Database database = Mockito.spy(new Database());
    private final DatabaseClient databaseClient = new DatabaseClient(database);

    @Test
    void shouldNotInitializeDatabaseUntilFirstRead() {
        //when / then
        verify(database, never()).init();
    }

    @Test
    void shouldInitializeDatabaseOnFirstRead() {
        //when
        var result = databaseClient.get("Chrost");

        //then
        verify(database).init();
    }

    @Test
    void shouldQueryDatabaseOnFirstRead() {
        //when
        var result = databaseClient.get("Chrost");

        //then
        verify(database).get("Chrost");
    }

    @Test
    void shouldReturnQueryResult() {
        //when
        var result = databaseClient.get("Chrost");

        //then
        assertThat(result).isEqualTo("Marcin");
    }

    @Test
    void shouldNotQueryDatabaseOnRepeatedRead() {
        //when
        var result = databaseClient.get("Chrost");
        var anotherResult = databaseClient.get("Chrost");

        //then
        verify(database, times(1)).get("Chrost");
    }

    @Test
    void shouldReturnTheSameValuesOnRepeatedRead() {
        //when
        var result = databaseClient.get("Chrost");
        var anotherResult = databaseClient.get("Chrost");

        //then
        assertThat(anotherResult).isEqualTo(result);
    }
}
