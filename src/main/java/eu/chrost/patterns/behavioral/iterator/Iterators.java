package eu.chrost.patterns.behavioral.iterator;

import lombok.NoArgsConstructor;

import java.util.Iterator;
import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class Iterators {
    public static <E> Iterator<E> regularIterator(List<E> list) {
        return list.iterator();
    }

    public static <E> Iterator<E> reverseIterator(List<E> list) {
        return new Iterator<E>() {

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }
        };
    }
}
