public class Jokes
{
    //String of the joke
    private static String joke_string;

    //Function to determine if a joke is funny or not
    //If the length of the joke is < 20, it's funny. Otherwise, it is not funny
    public static void is_funny()
    {
        int count = joke_string.length();

        if(count < 20)
        {
            System.out.println("It's funny");
        }

        else
        {
            System.out.println("It’s not funny");
        }
    }

    // Function to get the first word of the joke, separated by space
    // Using split method to get the first word of the joke string that separated by a blank space " "
    public static void first_word()
    {
        String start_word = joke_string.split(" ")[0];
        System.out.print(start_word);
        System.out.println("\n");
    }

    //To test the program
    public static void main(String[] args) {
        joke_string = "Knock knock who's there?";
        is_funny();
        first_word();
        joke_string = "Your life";
        is_funny();
        first_word();
    }
}
