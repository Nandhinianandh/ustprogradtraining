public class reverse {
    public static void main(String[] args) {
        String[] names = {"ust","prograd","training"};
        Integer[] num={1,2,3,4,5};
        printArray(names);
        printArray(num);
    }


    public static <T> void printArray(T[] array) {
        for (int i = array.length - 1; i >= 0; i--)
                System.out.print(array[i] + " ");
        System.out.print("\n");

        }

}


