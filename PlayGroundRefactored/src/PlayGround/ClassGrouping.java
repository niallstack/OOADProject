package PlayGround;

import java.util.*;

/**
 * Created by t00166011 on 10/12/2015.
 */
public class ClassGrouping {
    private final School school;
    private final List<Student> students;
    private NoticeBoard noticeBoard;

    public ClassGrouping(String classGroupName, School school) {
        this.school = school;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {

    }

    public List getStudents() {
        return students;
    }

    public School getSchool() {
        return school;
    }



    public NoticeBoard getNoticeBoard()
    {
        return noticeBoard;
    }

}
