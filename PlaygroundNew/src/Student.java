import java.util.Date;

/**
 * Created by t00166011 on 10/12/2015.
 */
public class Student {
    private int studentID;
    private String forename;
    private String surname;
    private Date dob;
    private ClassGrouping classGrouping;



    public Student(int studentID,String forename, String surname, Date dob, ClassGrouping classgroup) {
        this.forename = forename;
        this.surname = surname;
        this.studentID = studentID;
        this.dob = dob;
        this.classGrouping = classgroup;
    }

    public Message postSchoolMessage(String textMessage) {
        Message mes = new Message(textMessage, this);
        this.classGrouping.getNoticeBoard().addMessage(mes);
        return mes;
    }

    public void like(Message message) {
        message.like();
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
}
