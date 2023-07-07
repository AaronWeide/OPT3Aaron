import java.util.Scanner;
abstract class PatternUser {

    int age;
    Boolean loggedInStatus;
    String password;
    String username;
    boolean kleurenblind;

    boolean licentie;
    int userrank;
    boolean Cancreatetask;
    boolean Canviewtask;
    boolean exception = false;

    public void setCreds(int age) {
    }

    public int getAge(){

        return this.age;
    }

    public void isException(){

        this.exception = true;

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
    public void setUserrank(int a){

        this.userrank = a;

    }

    public int getUserrank(){

        return this.userrank;
    }

}



class Student extends PatternUser {


    @Override
    public void setCreds(int age) {
        Scanner scanner = new Scanner(System.in);
        this.userrank = 1;
            System.out.println("Geef uw naam op");
            this.username = scanner.nextLine();
            System.out.println("Geef uw wachtwoord op");
            this.password = scanner.nextLine();
            this.age = age;
            System.out.println("Minderjarig studenten Account succesvol aangemaakt");
        }

    }


class Volwassenstudent extends PatternUser {


    @Override
    public void setCreds(int age) {
        Scanner scanner = new Scanner(System.in);
        this.userrank = 2;
        System.out.println("Geef uw naam op");
        this.username = scanner.nextLine();
        System.out.println("Geef uw wachtwoord op");
        this.password = scanner.nextLine();
        this.age = age;
        System.out.println("Volwassen studenten Account succesvol aangemaakt");
    }

}

class Docent extends PatternUser {


    @Override
    public void setCreds(int age) {
        Scanner scanner = new Scanner(System.in);
        this.userrank = 3;
        System.out.println("Geef uw naam op");
        this.username = scanner.nextLine();
        System.out.println("Geef uw wachtwoord op");
        this.password = scanner.nextLine();
        this.age = age;
        System.out.println("Docenten Account succesvol aangemaakt");
    }

}



