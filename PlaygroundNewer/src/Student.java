import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by t00166011 on 10/12/2015.
 */
public class Student {
    private int studentID;
    private String forename;
    private String surname;
    private Date dob;
    private ClassGrouping classGrouping;
    private List<Friendship> friends;



    public Student(int studentID,String forename, String surname, Date dob, ClassGrouping classgroup) {
        this.forename = forename;
        this.surname = surname;
        this.studentID = studentID;
        this.dob = dob;
        this.classGrouping = classgroup;
        this.friends= new ArrayList<>();
    }

    public Message postSchoolMessage(String textMessage) {
        Message mes = new Message(textMessage, this);
        this.classGrouping.getNoticeBoard().addMessage(mes);
        return mes;
    }

    public void like(Message message) {
        message.like();
    }

    public void addnewFriend(Student friend){
        this.friends.add(new Friendship(this,friend));
    }
    public void sendPrivateMessage(Student friend, Message message){
        for(Friendship f : friends){
            if(f.getStudentB().equals(friend)|| f.getStudentA().equals(friend)){
                f.addMessage(message);
                break;
            }
        }
    }


    //Getters
    public int getStudentID() {
        return studentID;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDob() {
        return dob;
    }

    public ClassGrouping getClassGroupsing() {
        return classGrouping;
    }

    public List<Friendship> getFriends() {
        return friends;
    }



    //Setters

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setClassGroupsing(ClassGrouping classGrouping) {
        this.classGrouping = classGrouping;
    }
    public void setFriends(List<Friendship> friends) {
        this.friends = friends;
    }
}
