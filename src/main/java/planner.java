import java.util.List;
import java.util.Scanner;

public class planner {

    ListObserver Nameprinter;

    public void makeNewtask(PatternUser a){
        Scanner scanner = new Scanner(System.in);
        planning task = new planning();
        System.out.println("Hoe noemt u deze task");
        task.setTaskName(scanner.nextLine());
        a.addTask(task);
        System.out.println("Task succesvol toegevoegd");

    }

    public void Planfortask(PatternUser a) {
        for (planning item : a.getTasks()) {
            System.out.println(item.getTaskName());
        }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Typ de gewensde tasknaam in");
            String b = scanner.nextLine();
        for (planning itm : a.getTasks()) {
            if (itm.getTaskName().equals(b)) {
                itm.setWeek();
            }
        }
    }
    public void AssignTask(List<PatternUser> b, PatternUser a) {
        System.out.println("Welke task wilt u geven");
        for (planning item : a.getTasks()) {
            System.out.println(item.getTaskName());
        }
        Scanner scanner = new Scanner(System.in);
        String c = scanner.nextLine();
        for (planning item : a.getTasks()) {
            if (item.getTaskName().equals(c)) {
                System.out.println("Welke jonge leerling wilt u deze task geven");
                for (PatternUser itm : b) {
                    if (itm.getUserrank() == 1) {
                        System.out.println(itm.getUsername());
                        if (itm.getUsername().equals(scanner.nextLine())) {
                            itm.addTask(item);
                        }
                    }
                }
            }
        }
    }
    public void viewStudentTaskPlan(PatternUser a) {
        for (planning item : a.getTasks()) {
            System.out.println(item.getTaskName());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typ de gewensde tasknaam in");
        String b = scanner.nextLine();
        for (planning itm : a.getTasks()) {
            if (itm.getTaskName().equals(b)) {
                System.out.println(itm.getWeek());
            }
        }
    }


}
class ListObserver{

    public void PrintNamelist(PatternUser a){

        for (planning item : a.getTasks()) {
            System.out.println(item.getTaskName());

        }

    }


}