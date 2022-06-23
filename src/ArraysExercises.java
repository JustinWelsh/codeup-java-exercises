import java.util.Arrays;


public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] updatedPeople = new Person[people.length + 1];
        System.out.println(people.length);
        System.out.println(updatedPeople.length);
        for(int i = 0; i < people.length; i++) {
            updatedPeople[i] = people[i];
        }
        System.out.println(newPerson.getName());
        updatedPeople[people.length] = newPerson;
        return updatedPeople;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));       //Returns a string representation of the array.

        Person[] arr;
        arr = new Person[3];
        arr[0] = new Person("Justin1");
        arr[1] = new Person("Justin2");
        arr[2] = new Person("Justin3");
        System.out.println("My name is " + arr[0].name);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name);
        }

        Person personToAdd = new Person("Mike");
        Person[] peopleList = ArraysExercises.addPerson(arr, personToAdd);
        System.out.println(Arrays.toString(ArraysExercises.addPerson(arr, personToAdd)));

        System.out.println(peopleList[3].getName());
    }
}
