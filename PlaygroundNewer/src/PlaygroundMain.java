import java.util.Date;

/**
 * Created by Hunter on 10-Dec-15.
 */
public class PlaygroundMain {
    public static void main(String[] args)
    {

        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";

        School mySchool=new School("itt");
        System.out.println("new school created : " + mySchool.getSchoolName());

        //UC1 Create Class Grouping
        ClassGrouping class1 = new ClassGrouping("Year 1",mySchool);
        mySchool.addClassGrouping(class1);

        //uc2 Assign student
        Student student1 = new Student(1,"Quentin","MARECHAL",new Date(),class1);
        class1.addStudent(student1);

        //uc3 post school message
        System.out.println("School messages printed before any likes");
        student1.postSchoolMessage("Hello somebody !");
        student1.postSchoolMessage("Hello everyone !");
        student1.getClassGrouping().getSchool().printAllMessages(ANSI_RED);
        System.out.println("-----");



        //uc4 send private message
        System.out.println("School messages printed after a like");
        Student student2 = new Student(2,"Niall","Stack",new Date(),class1);
        Message mes = student2.getClassGrouping().getSchool().getAllMessages().get(1);
        student2.like(mes);
        student1.getClassGrouping().getSchool().printAllMessages(ANSI_BLUE);
        System.out.println("----------");

        student1.addnewFriend(student2);
        student1.sendPrivateMessage(student2, "hello Niall");
        student1.sendPrivateMessage(student2, "how are you");
        System.out.println("Private messages from Quentin ");
        student1.showPrivateMessage(student2);
        System.out.println("Private messages from Niall ");
        student2.showPrivateMessage(student1);

        //uc5

        //uc6
        student1.setForename("Thomas");
        student1.setSurname("Rivière");

    }
}
