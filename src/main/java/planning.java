import java.util.Scanner;

public class planning {
    String Maandag;
    String Dinsdag;
    String Woensdag;
    String Donderdag;
    String Vrijdag;
    String Zaterdag;
    String Zondag;

    String TaskName;

    public void setWeek(PatternUser a) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Wat wilt u voor maandag plannen");
                this.Maandag = scanner.nextLine();
                System.out.println("Wat wilt u voor dinsdag plannen");
                this.Dinsdag = scanner.nextLine();
                System.out.println("Wat wilt u voor woensdag plannen");
                this.Woensdag = scanner.nextLine();
                System.out.println("Wat wilt u voor donderdag plannen");
                this.Donderdag = scanner.nextLine();
                System.out.println("Wat wilt u voor vrijdag plannen");
                this.Vrijdag = scanner.nextLine();
                System.out.println("Wat wilt u voor zaterdag plannen");
                this.Zaterdag = scanner.nextLine();
                System.out.println("Wat wilt u voor zondag plannen");
                this.Zondag = scanner.nextLine();

    }
    public void setTaskName(String a){
        this.TaskName = a;
    }

    public String getTaskName(){
       return this.TaskName;
    }

    public String getWeek(){
        return("Maandag: " + this.Maandag + "\n" +
                "Dinsdag: " + this.Dinsdag + "\n" +
                "Woensdag: " + this.Woensdag + "\n" +
                 "Donderdag: " + this.Donderdag + "\n" +
                 "Vrijdag: " + this.Vrijdag + "\n" +
                "ZaterDag: " + this.Zaterdag + "\n" +
                "Zondag: " + this.Zondag + "\n" );

    }

}
