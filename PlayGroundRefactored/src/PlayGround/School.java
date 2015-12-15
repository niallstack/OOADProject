package PlayGround;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t00166011 on 10/12/2015.
 */
public class School {


    private String schoolName;
    private final List <ClassGrouping> classGroupings;
    private final NoticeBoard noticeBoard;


    public School(String schoolName)
    {
        this.schoolName = schoolName;
        this.classGroupings = new ArrayList<>();
        this.noticeBoard = new NoticeBoard();
    }

    public void addMessage(Message message){
        this.noticeBoard.addMessage(message);
    }

    public void addClassGrouping(ClassGrouping classGroup) {

        this.classGroupings.add(classGroup);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


    public void printAllMessages(String color)
    {
        noticeBoard.printMessages(color);
    }

    public List<Message> getAllMessages(){
        return this.noticeBoard.getMessages();
    }
}
