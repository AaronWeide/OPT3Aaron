import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 class PatternUser {

    int age;
    Boolean loggedInStatus;
    String password;
    String username;
    boolean kleurenblind;

    boolean licentie;
    int userrank;
    boolean exception = true;
    List<planning> Task = new ArrayList<planning>();


    public void setCreds() {
        Scanner scanner = new Scanner(System.in);
        this.userrank = this.getUserrank();
        System.out.println("Geef uw naam op");
        this.username = scanner.nextLine();
        System.out.println("Geef uw wachtwoord op");
        this.password = scanner.nextLine();
        this.age = age;
        System.out.println( getString() + " Account succesvol aangemaakt");
        isNoException();
    }

    public String getString() {
        return "Onbekend";

    }

    public int getAge(){

        return this.age;
    }

    public void isNoException(){

        this.exception = false;

    }

    public boolean getLoggedInStatus(){

        return this.loggedInStatus;
    }

    public String getUsername(){

        return this.username;

    }

    public void setlicentie(boolean a){

        this.licentie = a;
    }

    public boolean getlicentie(){

        return this.licentie;
    }
    public void setLoggedInStatus(boolean a){

        this.licentie = a;
    }
    public void setKleurenblind(boolean a){

        this.kleurenblind = a;
    }
    public boolean getKleurenblind(){

        return this.kleurenblind;

    }

    public int getUserrank(){

        return this.userrank;
    }
     public void addTask(planning a){
        this.Task.add(a);
     }
     public List<planning> getTasks(){
        return this.Task;
     }
}



class Student extends PatternUser {


    @Override
    public int getUserrank() {
        return 1;
    }

    @Override
    public String getString() {
        return "minderjarige student";

    }
}

    class Volwassenstudent extends PatternUser {


        @Override
        public int getUserrank() {
            return 2;

        }
        @Override
        public String getString() {
            return "Student";

        }
    }


class Docent extends PatternUser {


    @Override
    public int getUserrank() {
        return 3;

    }
    @Override
    public String getString() {
        return "Docent";

    }
}


