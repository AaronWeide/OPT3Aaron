import java.util.Scanner;

public abstract class SetupFactory {

    private static SetupFactory a;
    public abstract PatternUser CreatePatterUser();

    protected static PatternUser createuser(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is uw leeftijd");
        int leeftijd = scanner.nextInt();
        PatternUser acc = new PatternUser();
        if (leeftijd < 16) {
            System.out.println("U bent helaas te jong");
            System.exit(0);
        } else if (leeftijd < 18 && leeftijd >= 16) {
//             return new YoungFactory().CreatePatterUser();
            a = new YoungFactory();
        } else if (leeftijd >= 18 && leeftijd < 28) {
             a = new StudentFactory();
        } else if(leeftijd > 28) {
             a = new DocentFactory();
        }

       return a.CreatePatterUser();
    }

}


