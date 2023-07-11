import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class planner {


    public void makeNewtask(PatternUser a){
        Scanner scanner = new Scanner(System.in);
        planning task = new planning();
        System.out.println("Hoe noemt u deze task");
        task.setTaskName(scanner.nextLine());
        a.addTask(task);


    }

    public void Planfortask(PatternUser a) {
        for (planning item : a.getTasks()) {
            System.out.println(item.getTaskanme());
        }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Typ de gewensde tasknaam in");
        for (planning itm : a.getTasks()) {
            if (itm.getTaskanme().equals(scanner.nextLine())) {
                System.out.println("Wat wilt u voor maandag plannen");
                itm.setMaandag(scanner.nextLine());
                System.out.println("Wat wilt u voor dinsdag plannen");
                itm.setDinsdag(scanner.nextLine());
                System.out.println("Wat wilt u voor woensdag plannen");
                itm.setWoensdag(scanner.nextLine());
                System.out.println("Wat wilt u voor donderdag plannen");
                itm.setDonderdag(scanner.nextLine());
                System.out.println("Wat wilt u voor vrijdag plannen");
                itm.setVrijdag(scanner.nextLine());
                System.out.println("Wat wilt u voor zaterdag plannen");
                itm.setZaterdag(scanner.nextLine());
                System.out.println("Wat wilt u voor zondag plannen");
                itm.setZondag(scanner.nextLine());
            }
        }
    }
    public void AssignTask(List<PatternUser> b,PatternUser a) {
        System.out.println("Welke task wilt u geven");
        for (planning item : a.getTasks()) {
            System.out.println(item.getTaskanme());
        }
        Scanner scanner = new Scanner(System.in);
        for (planning item : a.getTasks()) {
            if (item.getTaskanme().equals(scanner.nextLine())) {
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
            System.out.println(item.getTaskanme());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Typ de gewensde tasknaam in");
        for (planning itm : a.getTasks()) {
            if (itm.getTaskanme().equals(scanner.nextLine())) {
                System.out.println(itm.getWeek());
            }
        }
    }


}
