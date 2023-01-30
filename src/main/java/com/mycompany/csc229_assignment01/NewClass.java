
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
    
     public static void main(String[] args) {
        Course obj1 = new Course();
        //Create default COurse object
       
        System.out.println("Original Course : " + obj1.getName() + " "+ obj1.getID() + " " + obj1.getCode());
        
        //Test setters by changing name, ID, and Code
        obj1.setName("Mooath Alrajab");
        obj1.setID("Teacher's ID");
        obj1.setCode("CSC 411");
        
        //Test getters and compare if setters worked correctly
        System.out.println("Course has changed : " + obj1.getName() + " "+ obj1.getID() + " " + obj1.getCode());
    }
    
}
