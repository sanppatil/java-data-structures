package binary.search.iterative;

public class Main {

    public static void main(String[] args) {

        int array[] = {-20, -15, 1, 7, 20, 35, 55};

        System.out.println(iterativeBinarySearch(array, 5));
        System.out.println("------------------------------------------------------------------");
        System.out.println(iterativeBinarySearch(array, -20));
        System.out.println("------------------------------------------------------------------");
        System.out.println(iterativeBinarySearch(array, 7));
        System.out.println("------------------------------------------------------------------");
        System.out.println(iterativeBinarySearch(array, 35));
        System.out.println("------------------------------------------------------------------");
        System.out.println(iterativeBinarySearch(array, 95));
    }

    public static int iterativeBinarySearch(int array[], int number) {
        int start = 0;
        int end = array.length;

        while (start < end) {
            int midPoint = (start + end) / 2;
            System.out.println("Mid-Point - " + midPoint);
            if (array[midPoint] == number)
                return midPoint;
            else if (array[midPoint] < number)
                start = midPoint + 1;
            else
                end = midPoint;
        }
        return -1;
    }

}
