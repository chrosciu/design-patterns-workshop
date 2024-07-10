package eu.chrost.patterns.behavioral.iterator;

import lombok.NoArgsConstructor;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class Iterators {
    public static <E> Iterator<E> regularIterator(List<E> list) {
        return list.iterator();
    }

    public static <E> Iterator<E> reverseIterator(List<E> list) {
        return new Iterator<>() {
            private int index = list.size() - 1;
            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public E next() {
                try {
                    return list.get(index--);
                } catch (IndexOutOfBoundsException e) {
                    throw new NoSuchElementException();
                }
            }
        };
    }
}
