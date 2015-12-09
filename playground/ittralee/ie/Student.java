package playground.ittralee.ie;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t00166011
 */
public class Student {
    private String forename;
    private String surname;
    private Date dob;
    private String passwords;
    private List<Message> privateMessages;
    private ClassGrouping classgroup;

    public Student(String forename, String surname, Date dob, ClassGrouping classgroup) {
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.classgroup = classgroup;
        this.privateMessages= new ArrayList<>();
    }
    
    
    public void postSchoolMessage(String textMessage)
    {
        
    }
    
    public void postClassGroupingMessage(String textMessage)
    {
        
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public List<Message> getPrivateMessages() {
        return privateMessages;
    }

    public void setPrivateMessages(List<Message> privateMessages) {
        this.privateMessages = privateMessages;
    }

    public ClassGrouping getClassgroup() {
        return classgroup;
    }

    public void setClassgroup(ClassGrouping classgroup) {
        this.classgroup = classgroup;
    }
    
    
            
    
}
