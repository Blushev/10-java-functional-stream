package com.example.task03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task03Main {

    public static void main(String[] args) {

        findMinMax(
                Stream.of(2, 9, 5, 4, 8, 1, 3),
                Integer::compareTo,
                (min, max) ->
                        System.out.println("min: " + min + " / max: " + max)
        );

    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        // your implementation here
        final Iterator<? extends T> iterator = stream.iterator();
        T min = iterator.hasNext() ? iterator.next() : null;
        T max = min;

        while (iterator.hasNext()){
            T element = iterator.next();
            if(order.compare(element, min) < 0) min = element;
            else if(order.compare(element, max) > 0) max = element;
        }

        minMaxConsumer.accept(min, max);
    }
}
