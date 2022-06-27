//TODO:     Object basics
public class Person {
    public String name;        //No value is set because we will set it when we instantiate a 'new' Person()

    public String getName() {
        return this.name;           //TODO: return the person's name

    }

    public void setName(String name) {
        this.name = name;           //TODO: change the name field to the passed value

    }

    public void sayHello() {
        System.out.printf("Hello %s", name);        //TODO: print a message to the console using the person's name
    }

                        //The class should have a constructor that accepts a `String` value and sets
                        //the person's name to the passed string.
                        //
                        //Create a `main` method on the class that creates a new `Person` object and
                        //tests the above methods.


    //***  CONSTRUCTORS  ***
    public Person(String name) {
        //This constructor has parameters.
        //Method-overloading is a good thing to catch diversified inputs.
        this.name = name;
    }

    public Person() {
        //This is an 'empty' constructor.
        // when creating an object this way use No arguments.
        //will need to manually set values by using dot notation.
    }

    public static void main(String[] args) {
        Person Justin = new Person("Justin");       //instantiated a new person!

        Person Marty = new Person("Marty");         //instantiated a new person!
//        Marty.setName("Marty test");
//        System.out.println(Justin.getName());
//        System.out.println(Marty.getName());
        Person Jason = new Person("Jason");
//
        Person Mike = new Person();
//        Mike.setName("Mike");
//        System.out.println(Mike.getName());
//        Marty.sayHello();

//TODO:     Understanding references
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        //true
//        System.out.println(person1 == person2);
//        //false
//
//        Person person3 = new Person("John");
//        Person person4 = person3;
//        System.out.println(person3 == person4);
//        //true
//
//        Person person5 = new Person("John");
//        Person person6 = person5;
//        System.out.println(person5.getName());
//        //John
//        System.out.println(person6.getName());
//        //John
//        person6.setName("Jane");
//        System.out.println(person5.getName());
//        //Jane
//        System.out.println(person6.getName());
//        //Jane
    }
}
