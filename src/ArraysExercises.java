import java.util.Arrays;


public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));       //Returns a string representation of the array.

        Person[] arr;
        arr = new Person[3];
        arr[0] = new Person("Justin1");
        arr[1] = new Person("Justin2");
        arr[2] = new Person("Justin3");
//        System.out.println(Arrays.toString(arr[0].name));
        System.out.println("My name is " + arr[0].name);
        for (int i = 0; i <= arr.length; i += 1) {
            System.out.println(arr[i].name);
        }
    }
}
