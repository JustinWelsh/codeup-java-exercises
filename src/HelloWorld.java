
//NOTES FROM LEC:
// PascalNamingConvention (every other word) case for method/function names.
// use camel case for variables
//        Single line comment
/*
 *  Multi-line comment :)
 */

public class HelloWorld {
    public static void main (String[] args) {


/*NOTES FROM LEC:*/

//
//        byte tinyNum = 127;
//        tinyNum++;
//
//        int num = 235000;
//
//        long id = 1L;
//
////        System.out.println("Hello, World!" + "!"); // print single line to the console/ you con concatenate
////        System.out.printf("Hello, %s\n ", "Justin!"); // ''%s' similar to temp. strings '${}'
////        System.out.println(id);
//
//        float floater = 8.35F; // 'F' cast to a float
//        float floater2 = (float)8.35F;
//        float noDecimal = 9;
//
////        System.out.println(floater);
////        System.out.println(noDecimal);
//
//        char charmander = '&';
////        System.out.println(charmander);
//
//        String message = "\tI really like marshmallows"; // '\t' tabs in the console?
////        System.out.println(message);
//
//
//        boolean doingJavaRightNow = true;
//        if (doingJavaRightNow == true) {
////            System.out.println("wow, i am cool");
//        }; // no need to use
//        //strict equal operator for comparison '===', since the datatype is already implied in the naming of the variables

/*===============================================================================*/

//   TODO:    EXERCISE: Syntax, Types, Variables
//
//TODO:1.     Create an int variable named 'myFavoriteNumber' and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 33;
        System.out.println(myFavoriteNumber);

//TODO:2.     Create a String variable named 'myString' and assign a string value to it, then print the variable out to the console.

        String myString = "Some fancy string";

//TODO:3.     Change your code to assign a character value to 'myString'.
//              -What do you notice?

//        String myString = "S";


//TODO:4.     Change your code to assign the value '3.14159' to 'myString'.
//              -What happens?

//        String myString = 3.14159; // <- incompatible types!! Will not run.

        System.out.println(myString);

//TODO:5.     Declare an long variable named myNumber, but do not assign anything to it.
//              -Next try to print out myNumber to the console.
//              -What happens?

//        long myNumber = ; // illegal start of expression error!

//TODO:6.     Change your code to assign the value 3.14 to 'myNumber'.
//              -What do you notice?

//        long myNumber = 3.14; // incompatible types!! 3.14 = double?

//TODO:7.     Change your code to assign the value 123L (Note the 'L' at the end) to 'myNumber'.

//        long myNumber = 123L; // prints '123'

//TODO:8.     Change your code to assign the value 123 to 'myNumber'.
//              -Why does assigning the value 3.14 to a variable declared as a long not compile,
//              but assigning an integer value does?

//        long myNumber = 123; //  also prints '123'

//TODO:9.     Change your code to declare 'myNumber' as a float. Assign the value 3.14 to it.
//              -What happens?
//              -What are two ways we could fix this?

        //        float myNumber = 3.14; // incompatible types!! Will not run.
        //        What happens?

    //        What are two ways we could fix this? ANSWER: casting?
                float myNumber = 3.14F;
        //        double myNumber = 3.14;

                System.out.println(myNumber);

//TODO:10.     What is the difference between the below code blocks?
//              -Explain why the code outputs what it does.

//        int x = 5;
//        System.out.println(x++); // still prints '5' in the console because the iteration takes place AFTER being printed.
//        System.out.println(x); // prints the iteration '6'

//        int x = 5;
//        System.out.println(++x); // iterates before printing, so you get '6' in the console.
//        System.out.println(x); // prints x, which is '6' after being iterated.

//
//TODO:11.     Try to create a variable named 'class'.
//              -What happens?

//        String class = "some variable named 'class'.."; // <- not a statement error.
        String notNamedClass = "some variable named 'class'..";

//        System.out.println(class);
        System.out.println(notNamedClass);


//TODO:12.     'Object' is the most generic type in Java. You can assign any value to a variable of type Object.
//              What do you think will happen when the following code is run?

//                String theNumberThree = "three";
//                Object o = theNumberThree;
//                int three = (int) o;

//How is the above example different from the code block below?


//                int three = (int) "three"; // incompatible types error

//What are the two different types of errors we are observing?
//
//TODO:13.     Rewrite the following expressions using the relevant shorthand assignment operators:

        int c = 4;
        c += 5;     //c = c + 5;
        System.out.println("c = " + c); // c = 9

        int a = 3;
        int b = 4;
        b *= a;     //  b = b * a;
        System.out.println("b = " + b); // b = 12


        int x = 10;
        int y = 2;
        x /= y;     //  x = x / y;
        y -= x;     //  y = y - x;
        System.out.println("x = " + x); // 5
        System.out.println("y = " + y); // -8




//TODO:14.     What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//              -What happens if you increment a numeric variable past the type's capacity?
//Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.


//        byte aNumGreaterThanTheDataType = 130; // WILL NOT RUN (type range is -128 to 127)
        short aNumGreaterThanTheDataType = 130; // RUNS (type range is -32,768 to 32,767)
        System.out.println(aNumGreaterThanTheDataType);

    }
};


