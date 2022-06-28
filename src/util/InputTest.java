package util;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();     //Why are we needing to do this?


//        System.out.printf("You entered \"%s\" ;)", in.getString());

//        System.out.println(in.yesNo());

//        System.out.printf("%d is a good number!", in.getInt(1,10));

//        System.out.printf("%d is a mighty fine number, good choice!", in.getInt());

        System.out.println(in.getDouble(1,20));

//        System.out.printf("%f , nice! worth the wait!", in.getDouble());

        //todo  Exceptions and Error Handling

//        System.out.println(in.getInt());

//        System.out.println(in.getDouble());

    }
}
