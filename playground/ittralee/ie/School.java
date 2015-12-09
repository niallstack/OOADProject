package playground.ittralee.ie;


import java.util.ArrayList;
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
public class School {
    private String schoolName;
    private List<ClassGrouping> classGroups;
    private List<Message> messages ;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.classGroups= new ArrayList<>();
        this.messages=new ArrayList<>();
    }
    
    public void addClassGrouping(ClassGrouping classgroup)           
    {
       this.classGroups.add(classgroup);
    }
    
    public void addMessage(Message message){
        this.messages.add(message);
    }
    
    public void printMessages(){
        
        for(Message m : messages){
            System.out.println(m.getTextMessage() + "\n likes : "+ m.getLike());
        }
    }
    
    

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List<ClassGrouping> getClassGroups() {
        return classGroups;
    }

    public void setClassGroups(List<ClassGrouping> classGroups) {
        this.classGroups = classGroups;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
    
    
    
}
