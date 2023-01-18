import java.util.Scanner;

public class LanguageGreeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String user_language;

        System.out.println("Please tell me your language preference."
                + " For example, enter e for english or f for french ");
        user_language = scan.next();

        //If the user enters e, it prints out hello in English
        if (user_language.equals("e")){
            System.out.println("Hello");
        }//If the user enters f, it prints out hello in French
        else if (user_language.equals("f")){
            System.out.println("Bonjour");
        }//If the user enters j, it prints out hello in Japanese
        else if (user_language.equals("j")){
            System.out.println("Konnichiwa");
        }//If the user enters g, it prints out hello in German
        else if (user_language.equals("g")){
            System.out.println("Hallo");
        }//If the user enters i, it prints out hello in Italian
        else if (user_language.equals("i")){
            System.out.println("Ciao");
        }//If the user enters a language that isn't supported by the code
        else{
            System.out.println("Sorry, but I don't know that language");
        }
    }
}
