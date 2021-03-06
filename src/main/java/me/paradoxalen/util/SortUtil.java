package me.paradoxalen.util;

import java.util.Comparator;
import java.util.List;

public class SortUtil {
    public static <T> boolean isSorted(List<T> list, Comparator<? super T> comparator) {
        return isSorted(list, 0, list.size(), comparator);
    }

    public static <T> boolean isSorted(List<T> list, int from, int to, Comparator<? super T> comparator) {
        T previous = list.get(from);
        for (int i = from; i < to; i++) {
            T current = list.get(i);
            if (comparator.compare(previous, current) > 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }

    public static <T> boolean isSorted(T[] array, Comparator<? super T> comparator) {
        return isSorted(array, 0, array.length, comparator);
    }

    public static <T> boolean isSorted(T[] array, int from, int to, Comparator<? super T> comparator) {
        for (int i = from + 1; i < to; i++) {
            if (comparator.compare(array[i], array[i - 1]) > 0) {
                return false;
            }
        }
        return true;
    }

}
