package Assignment10.OOP.PERSON;

public class Processor {

    public static void main(String[] args) {
        PersonList pl = new PersonList();
        Student std = new Student();
        std.input();
        Teacher tc = new Teacher();
        tc.input();
        pl.addList(std);
        pl.addList(tc);
        System.out.println("\n === LIST ===\n");
        pl.outputList();
    }
}
