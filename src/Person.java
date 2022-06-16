public class Person {
    private String name;

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public String setName(String name){
//TODO: change the name field to the passed value
        return this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello %s", name);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Justin");
        person.sayHello();
    }

}
