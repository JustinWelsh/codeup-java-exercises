import org.w3c.dom.ls.LSOutput;

public class ServerNameGenerator {
    //TODO      Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    private static String[] adjectiveArr = {"impossible", "earthy", "meaty", "shaggy", "uttermost", "aggressive", "devilish", "spiffy", "grumpy", "parsimonious"};
    private static String[] nounArr = {"preference", "series", "king", "artisan", "buyer", "chemistry", "ratio", "worker", "alcohol", "city"};


    //TODO      Create a method that will return a random element from an array of strings.
    public static String randomElement(String[] strings) {
        int randomNum = (int) (Math.random() * strings.length);
        return strings[randomNum];
    }

    //TODO      Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s\n", randomElement(adjectiveArr), randomElement(nounArr));

    }
}