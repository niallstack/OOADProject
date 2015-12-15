import java.util.ArrayList;
import java.util.List;

/**
 * Created by t00166011 on 10/12/2015.
 */
public class School {
    private String schoolName;
    private List <ClassGrouping> classGroupings;
    private NoticeBoard noticeBoard;


    public School(String schoolName)
    {
        this.schoolName = schoolName;
        this.classGroupings = new ArrayList<>();
        this.noticeBoard = noticeBoard;
    }

    public void addClassGrouping(ClassGrouping classGroup) {

        this.classGroupings.add(classGroup);
    }

    public List getClassGroupings() {

        return classGroupings;
    }

    public NoticeBoard getNoticeBoard() {
        return noticeBoard;
    }

    public void getAllMessages()
    {
        noticeBoard.printMessages();
    }
}
