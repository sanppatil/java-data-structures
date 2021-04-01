package linear.search;

public class Main {

    public static void main(String[] args) {

        int array[] = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(linearSearch(array, 5));
        System.out.println(linearSearch(array, -22));
        System.out.println(linearSearch(array, 22));
        System.out.println(linearSearch(array, 35));
    }

    public static int linearSearch(int array[], int number) {
        int resultIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                resultIndex = i;
                break;
            }
        }
        return resultIndex;
    }
}
