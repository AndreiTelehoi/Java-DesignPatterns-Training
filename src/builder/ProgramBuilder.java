package builder;

public class ProgramBuilder {

    public static void main(String[] args) {
        SuperErou Superman =
                new SuperErou.SuperErouBuilder("Superman")
                        .estePozitiv()
                        .esteRanitCritic()
                        .setSuperPutere("Zboara")
                        .build();
    }
}
