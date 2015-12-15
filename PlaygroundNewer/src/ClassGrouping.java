import java.util.*;

/**
 * Created by t00166011 on 10/12/2015.
 */
public class ClassGrouping {
    private String classGroupName;
    private School school;
    private  List<Student> students;
    private NoticeBoard noticeBoard;

    public ClassGrouping(String classGroupName, School school) {
        this.classGroupName = classGroupName;
        this.school = school;
        this.students = new ArrayList<>();
    }

    public List getStudents() {
        return students;
    }

    public void addStudent(Student student) {

    }

    public School getSchool() {
        return school;
    }



    public NoticeBoard getNoticeBoard()
    {
        return noticeBoard;
    }

}
