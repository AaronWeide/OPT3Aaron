public class YoungFactory extends SetupFactory {


    @Override
    public PatternUser CreatePatterUser() {
        return new Student();
    }
}
