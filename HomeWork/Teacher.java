package HomeWork;

public class Teacher extends Person {

    private String teacherId;
    public Teacher()
    {}
    public Teacher(String teacherId)
    {
        this.teacherId = teacherId;
    }
    public String getTeacherId()
    {
        return teacherId;
    }
    public void setTeacherId(String teacherId)
    {
        this.teacherId = teacherId;
    }
    @Override
    void input() {
        super.input();
        System.out.println("Input teacherID: ");
        setTeacherId(sc.nextLine());
       
    }

    @Override
    void output() {
        System.out.println("Teacher ID: " + teacherId);
        super.output();
    }
    void ranking()
    {
         int choose;
        System.out.println("Choose type: 1.A 2.B 3.C 4.D");
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Type A!");
                break;
            case 2:
                System.out.println("Type B!");
                break;
            case 3:
                System.out.println("Type C!");
                break;
            case 4:
                System.out.println("Type D!");
                break;
        }
    }
    
}
