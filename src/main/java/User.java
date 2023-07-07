public class User {

    int age;
    int userRank;
    Boolean loggedInStatus;
    Boolean licentie;
    Boolean highcontrast;

    public User(int a, boolean b) {
        this.age = a;
        this.loggedInStatus = b;

        if(a < 18 && a >= 16){
           this.userRank = 1;
        } else if (a > 18 && a <= 27){
            this.userRank = 2;
        } else if (a > 27){
            this.userRank = 3;
        }
        else this.userRank = 0;

    }

    public void setLicentie(boolean a){

        this.licentie = a;

    }

    public void setContrast(boolean a){

        this.highcontrast = a;
    }


    public int getAge(){

        return this.age;
    }

    public int getUserRank(){

        return this.userRank;
    }

    public boolean getLoggedInStatus(){

        return this.loggedInStatus;
    }

}

