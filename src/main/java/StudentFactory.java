public class StudentFactory extends SetupFactory {


    @Override
    public PatternUser CreatePatterUser() {
        return new Volwassenstudent();
    }
}
