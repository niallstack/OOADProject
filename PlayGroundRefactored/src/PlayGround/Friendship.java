package PlayGround;

/**
 * Created by qmare on 12/12/2015.
 */
class Friendship {

    private Student studentA;
    private Student studentB;
    private NoticeBoard privateMessages;

    public Friendship(Student studentA, Student studentB) {
        this.studentA = studentA;
        this.studentB = studentB;
        this.privateMessages = new NoticeBoard();
    }

    public void addMessage(Message message){
        this.privateMessages.addMessage(message);
    }

    public NoticeBoard getPrivateMessages() {
        return privateMessages;
    }

    public void setPrivateMessages(NoticeBoard privateMessages) {
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