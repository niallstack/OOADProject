
import java.util.ArrayList;
import java.util.List;
/**
 * Created by qmare on 12/12/2015.
 */
public class Friendship {

    private Student studentA;
    private Student studentB;
    private List<Message> privateMessages;

    public Friendship(Student studentA, Student studentB) {
        this.studentA = studentA;
        this.studentB = studentB;
        this.privateMessages = new ArrayList<>();
    }

    public void addMessage(Message message){
        this.privateMessages.add(message);
    }

    public List<Message> getPrivateMessages() {
        return privateMessages;
    }

    public void setPrivateMessages(List<Message> privateMessages) {
        this.privateMessages = privateMessages;
    }

    public Student getStudentB() {
        return studentB;
    }

    public void setStudentB(Student studentB) {
        this.studentB = studentB;
    }

    public Student getStudentA() {
        return studentA;
    }

    public void setStudentA(Student studentA) {
        this.studentA = studentA;
    }
}