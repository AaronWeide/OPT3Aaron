import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Setup {
    public static PatternUser MakeUser() {

        String text = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is uw leeftijd");
        int leeftijd = scanner.nextInt();
        PatternUser acc = new PatternUser();
        if (leeftijd < 16) {
            System.out.println("U bent helaas te jong");
            System.exit(0);
        } else if (leeftijd < 18 && leeftijd >= 16) {
            acc = MakeYstudent();
        } else if (leeftijd >= 18 && leeftijd < 28) {
            acc = Makestudent();
        } else if(leeftijd > 28) {
            acc = MakeDocent();
        }
        acc.setCreds();
        return acc;
    }

   public static PatternUser MakeYstudent(){
       Student acc = new Student();
       return acc;
   }
    public static PatternUser Makestudent(){
        Volwassenstudent acc = new Volwassenstudent();
        return acc;
    }
    public static PatternUser MakeDocent(){
        Docent acc = new Docent();
        return acc;
    }
}


//public class Setup {
//    public static PatternUser MakeUser() {
//
//        String text = new String();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wat is uw leeftid");
//        int leeftijd = scanner.nextInt();
//        if (leeftijd < 16) {
//            System.out.println("U bent helaas te jong");
//        } else if (leeftijd < 18 && leeftijd >= 16) {
//            Student acc = new Student()
///             acc.setcreds()
//              return acc;
//        } else if (leeftijd >= 18 && leeftijd < 28) {
//            Volwassenstudent acc = new volwassenstudent()
//            acc.setcreds()
//            return acc;
//        } else if(leeftijd > 28) {
//            Docent acc = new Docent()
//             acc.setcreds()
//             return acc;
//      }
//          Student exceptionacc = new Student();
//        exceptionacc.isException();
//        return exceptionacc;
//    }
//
//}


