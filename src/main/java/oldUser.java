class oldUser {

    int age;
    String userStatus;
    Boolean loggedInStatus;

    public oldUser(int a, String b, Boolean c) {
        this.age = a;
        this.userStatus = b;
        this.loggedInStatus = c;

    }

    public int getAge(){

        return this.age;
    }

    public String getUserStatus(){

        return this.userStatus;
    }

    public boolean getLoggedInStatus(){

        return this.loggedInStatus;
    }

}

