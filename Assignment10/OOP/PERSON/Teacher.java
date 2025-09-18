package Assignment10.OOP.PERSON;

public class Teacher extends Person {

    private String teacherId;

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher(String teacherId) {
        this.teacherId = teacherId;
    }

    public Teacher() {
    }

    @Override
    public void input() {
        System.out.println("Input teacherId: ");
        setTeacherId(sc.nextLine());
    }

    public void type() {
        System.out.println("input: 1.A 2.B 3.C 4.D ");
        int type = sc.nextInt();
        switch (type) {
            case 1:
                System.out.println("A!");
                break;
            case 2:
                System.out.println("B!");
                break;
            case 3:
                System.out.println("C!");
                break;
            case 4:
                System.out.println("D!");
                break;
            default:
                System.out.println("ERROR!");
                break;
        }
    }
    @Override
    public String output() {
        super.output();
        return "TeacherID: " + teacherId;
    }
}
