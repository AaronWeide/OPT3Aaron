import org.intellij.lang.annotations.Pattern;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    String SelectACC;
    String text = new String();
    Scanner scanner = new Scanner(System.in);
    List<PatternUser> Users = new ArrayList<PatternUser>();
    boolean flag = false;


        while (flag == false) {
            System.out.println("Welkom bij het rooster! Heeft u al een account (Y/N)");
            text = scanner.nextLine();

            if (text.equals("Y") || text.equals("y")) {
                flag = true;
                System.out.println("Kies een account! Als je alsnog een account aan wilt maken druk dan op B");
                for (PatternUser item : Users) {
                    System.out.println(item.getUsername());
                }
                 SelectACC = scanner.nextLine();
               if (SelectACC.equals("b") || SelectACC.equals("B")) { /// wat als je jezelf b noemt.
                   flag = false;
                } else if (Users.contains(SelectACC)) {



                }
            } else if (text.equals("N") || text.equals("n")) {
                Setup program = new Setup();
                Users.add(Setup.MakeUser());
            } else {
                System.out.println("Graag een Y of een N invullen");
            }
        }



    }
}

