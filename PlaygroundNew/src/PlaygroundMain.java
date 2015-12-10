import java.util.Date;

/**
 * Created by Hunter on 10-Dec-15.
 */
public class PlaygroundMain {
    public static void main(String[] args)
    {
        School mySchool=new School("itt");
        ClassGrouping year1 = new ClassGrouping("Year 1",mySchool);
        NoticeBoard n = new NoticeBoard();

        Student student = new Student(01,"Quentin","marechal",new Date(),year1);
        Message mes = student.postSchoolMessage("hello");
        student.like(mes);


        n.printMessages();
    }
}
