public class DocentFactory extends SetupFactory {


    @Override
    public PatternUser CreatePatterUser() {
        return new Docent();
    }
}
