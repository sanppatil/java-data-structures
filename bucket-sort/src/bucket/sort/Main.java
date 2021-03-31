package bucket.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] array = {54, 46, 83, 66, 95, 92, 43};

        IntStream.of(array).forEach(i -> System.out.print(i + " "));
        System.out.println();

        bucketSort(array);

        Arrays.stream(array).forEach(i -> System.out.print(i + " "));

        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    public static void bucketSort(int[] array) {
        List<Integer>[] buckets = new List[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }

        for (int number : array) {
            buckets[hash(number)].add(number);
        }

        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (List<Integer> bucket : buckets) {
            for (Integer number : bucket) {
                array[j++] = number.intValue();
            }
        }

    }

    private static int hash(int value) {
        return value / 10;
    }
}

