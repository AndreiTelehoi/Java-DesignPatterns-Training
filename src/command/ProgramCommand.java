package command;

public class ProgramCommand {

    public static void main(String[] args) {

        //Command
        TaskManager manager = new TaskManager();
        System.out.println("Jocul ruleaza fara probleme");
        System.out.println("Lansare autosave");
        manager.adaugaTask(
                new TaskAsincron("Backup", 1000, new ModulBackupDate()));
        System.out.println("Jocul ruleaza fara probleme");
        System.out.println("Lansare update forum");
        manager.adaugaTask(
                new TaskAsincron("Update forum", 1000, new ModulUpdateForum()));
        System.out.println("Jocul ruleaza fara probleme");
        manager.executaTask();
        System.out.println("Jocul ruleaza fara probleme");
        manager.executaTask();
        System.out.println("Jocul ruleaza fara probleme");
    }
}
