package eu.chrost.patterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.assertj.core.api.Assertions.assertThat;

public class IteratorsTest {
    private final List<Integer> list = List.of(2, 3, 1);

    @Test
    void regularIteratorTest() {
        Iterator<Integer> iterator = Iterators.regularIterator(list);
        assertThat(toList(iterator)).containsExactly(2, 3, 1);
    }

    @Test
    void reverseIteratorTest() {
        Iterator<Integer> iterator = Iterators.reverseIterator(list);
        assertThat(toList(iterator)).containsExactly(1, 3, 2);
    }

    private static <T> List<T> toList(Iterator<? extends T> iterator) {
        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(iterator, 0), false)
                .collect(Collectors.toList());
    }
}
