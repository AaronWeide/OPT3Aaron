import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Setup {
    public static PatternUser MakeUser() {

        String text = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is uw leeftid");
        int leeftijd = scanner.nextInt();
        if (leeftijd < 16) {
            System.out.println("U bent helaas te jong");
        } else if (leeftijd < 18 && leeftijd >= 16) {
            Student acc = new Student();
            acc.setCreds(leeftijd);

            return acc;
        } else if (leeftijd >= 18 && leeftijd < 28) {
            Volwassenstudent acc = new Volwassenstudent();
            acc.setCreds(leeftijd);

            return acc;
        } else if(leeftijd > 28) {
            Docent acc = new Docent();
            acc.setCreds(leeftijd);

            return acc;
        }
    Student exceptionacc = new Student();
        exceptionacc.isException();
        return exceptionacc;
    }
}
