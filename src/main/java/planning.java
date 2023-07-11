public class planning {
    String Maandag;
    String Dinsdag;
    String Woensdag;
    String Donderdag;
    String Vrijdag;
    String Zaterdag;
    String Zondag;

    String TaskName;

    public void setMaandag(String a){
    this.Maandag = a;

    }

    public void setDinsdag(String a){
        this.Dinsdag = a;

    }

    public void setWoensdag(String a){
        this.Woensdag = a;

    }

    public void setDonderdag(String a){
        this.Donderdag = a;

    }

    public void setVrijdag(String a){
        this.Vrijdag = a;

    }

    public void setZaterdag(String a){
        this.Zaterdag = a;

    }

    public void setZondag(String a){
        this.Zondag = a;

    }
    public void setTaskName(String a){
        this.TaskName = a;
    }

    public String getTaskanme(){
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
