/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package playground.ittralee.ie;

import java.util.Date;

/**
 *
 * @author t00185325
 */
public class PlaygroundMain {
    
   public static void main(String [] args){
       School mySchool=new School("itt");
       Student student = new Student("Quentin","marechal",new Date(),"sweg",new ClassGrouping("Year1",mySchool));
       Message mes = student.postSchoolMessage("hello");
       student.like(mes);
       
       
       mySchool.printMessages();
       
       
    }
 }
