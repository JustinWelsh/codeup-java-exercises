public class Person {
    private String name;        //No value is set because we will set it when we instantiate a 'new' Person()

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
        Marty.setName("Marty test");
        System.out.println(Justin.getName());
        System.out.println(Marty.getName());

        Person Mike = new Person();
        Mike.setName("Mike");
        System.out.println(Mike.getName());
        Marty.sayHello();

    }
}
