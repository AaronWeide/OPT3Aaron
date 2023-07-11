import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Adapterpatternexample {

        public void getAge();
        public void leesactie();

    }


     class Docenttest implements Adapterpatternexample{
        @Override
        public void getAge(){
            System.out.println("Ik ben de oudste doelgroep");
        }

         @Override
         public void leesactie() {
             System.out.println("Ik lees momenteel een student hun werk in");
         }


     }

    class Softwarebeheer{

    public void closeServer(){

        System.exit(0);
    }

    }

class beheerAdapter implements  Adapterpatternexample{
    Softwarebeheer beheerder;

    public beheerAdapter(Softwarebeheer a) {
        this.beheerder = a;
    }

    @Override
    public void getAge() {
        System.out.println("Mijn leeftijd is niet relevant");
    }

    @Override
    public void leesactie() {
        beheerder.closeServer();
    }
}