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
        this.classGrouping.getSchool().addMessage(mes);
        return mes;
    }

    public void like(Message message) {
        message.like();
    }

    public void addnewFriend(Student friend){
        Friendship f=new Friendship(this,friend);
        this.friends.add(f);
        friend.getFriends().add(f);

    }

    public void sendPrivateMessage(Student friend, String message){
        for(Friendship f : friends){
            if(f.getStudentB().equals(friend)|| f.getStudentA().equals(friend)){
                f.addMessage(new Message(message,this));
                break;
            }
        }
    }
    public void showprivateMessage(Student friend){
        for(Friendship f : friends){
            if(f.getStudentB().equals(friend)|| f.getStudentA().equals(friend)){
                f.getPrivateMessages().printMessages();
                break;
            }
        }
    };


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

    public ClassGrouping getClassGrouping() {
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
