import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    String SelectACC;
    String text;
    Scanner scanner = new Scanner(System.in);
    List<PatternUser> Users = new ArrayList<>();
    boolean flag = false;
    String calanderchoice;



        while (!flag) {
            System.out.println("Welkom bij het rooster! Heeft u al een account (Y/N)");
            text = scanner.nextLine();

            if (text.equals("Y") || text.equals("y")) {
                System.out.println("Kies een account! Als je alsnog een account aan wilt maken druk dan op B");
                for (PatternUser item : Users) {
                    System.out.println(item.getUsername());
                }
                 SelectACC = scanner.nextLine();
               if (SelectACC.equals("b") || SelectACC.equals("B")) {
                } else {
                   planner planner = new planner();
                   for (PatternUser item : Users) {
                       if (item.getUsername().equals(SelectACC)) {
                           System.out.println("Wat wil je doen");
                           if (item.getUserrank() == 1 || item.getUserrank() == 2) {
                               System.out.println("Druk op A om een bestaande task in the plannen");
                               System.out.println("Druk op X om een bestaande task in te zien");
                           }
                           if (item.getUserrank() == 2) {
                               System.out.println("Druk op B om een nieuwe task aan te maken");
                               System.out.println("Druk op C om een task aan een student te geven");
                           }
                           if (item.getUserrank() == 3) {
                               System.out.println("Van welke student wilt u een task inzien");
                               String b = scanner.nextLine();
                               for (PatternUser itm : Users) {
                                   if (itm.getUserrank() < 3){
                                   if (itm.getUsername().equals(b)) {
                                        planner.viewStudentTaskPlan(itm);
                                   }  else {
                                       System.out.println("U kunt alleen leerlingen hun rooster inzien");
                                       }
                                   }

                               }

                           }

                           System.out.println("Uw user rank is: " + item.getUserrank());
                       calanderchoice = scanner.nextLine();
                       if (item.getUserrank() == 2 && calanderchoice.equals("B")) {
                           planner.makeNewtask(item);
                       }
                           if (item.getUserrank() == 2 && calanderchoice.equals("C")) {
                               planner.AssignTask(Users, item);
                           }
                       if (item.getUserrank() == 1 || item.getUserrank() == 2 && calanderchoice.equals("A")) {
                           planner.Planfortask(item);
                       }
                           if (item.getUserrank() == 1 || item.getUserrank() == 2 && calanderchoice.equals("X")) {
                               planner.viewStudentTaskPlan(item);
                           }

                    }
                   }




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

