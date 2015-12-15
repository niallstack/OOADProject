import java.util.Date;

/**
 * Created by Hunter on 10-Dec-15.
 */
public class PlaygroundMain {
    public static void main(String[] args)
    {

        School mySchool=new School("itt");
        System.out.println("new school created : "+mySchool.getSchoolName());
        //UC1 Create Class Grouping
        ClassGrouping class1 = new ClassGrouping("Year 1",mySchool);
        mySchool.addClassGrouping(class1);

        //uc2 Assign student
        Student student1 = new Student(1,"Quentin","MARECHAL",new Date(),class1);
        class1.addStudent(student1);

        //uc3 post school message
        student1.postSchoolMessage("Hello everyone !");
        student1.getClassGrouping().getSchool().getAllMessages();

        //uc4 send private message
        Student student2 = new Student(2,"Niall","Stack",new Date(),class1);
        student1.addnewFriend(student2);
        student1.sendPrivateMessage(student2,"hello Niall");
        student1.showprivateMessage(student2);
        student2.showprivateMessage(student1);

        //uc5


        //uc6
        student1.setForename("Thomas");
        student1.setSurname("Rivière");

    }
}
