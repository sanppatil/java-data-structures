package binary.search.recursive;


public class Main {

    public static void main(String[] args) {

        int array[] = {-20, -15, 1, 7, 20, 35, 55};

        System.out.println(recursiveBinarySearch(array, -86));
        System.out.println("------------------------------------------------------------------");
        System.out.println(recursiveBinarySearch(array, 5));
        System.out.println("------------------------------------------------------------------");
        System.out.println(recursiveBinarySearch(array, -20));
        System.out.println("------------------------------------------------------------------");
        System.out.println(recursiveBinarySearch(array, 7));
        System.out.println("------------------------------------------------------------------");
        System.out.println(recursiveBinarySearch(array, 35));
        System.out.println("------------------------------------------------------------------");
        System.out.println(recursiveBinarySearch(array, 95));
    }

    public static int recursiveBinarySearch(int array[], int number) {
        return binarySearch(array, 0, array.length, number);
    }

    public static int binarySearch(int array[], int start, int end, int number) {
        if (start >= end)
            return -1;
        int midPoint = (start + end) / 2;
        System.out.println("Mid-Point - " + midPoint);
        if (array[midPoint] == number)
            return midPoint;
        else if (array[midPoint] < number)
            return binarySearch(array, midPoint + 1, end, number);
        else
            return binarySearch(array, start, midPoint, number);
    }

}
