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
public class ClassGrouping {
    private String classGroupName;
    private School school;
    private List<Student> students;

    public ClassGrouping(String classGroupName, School school) {
        this.classGroupName = classGroupName;
        this.school = school;
        this.students = new ArrayList<>();
    }
    
    
    
    public void addStudent(Student student)
    {
        
    }

    public String getClassGroupName() {
        return classGroupName;
    }

    public void setClassGroupName(String classGroupName) {
        this.classGroupName = classGroupName;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    
}
