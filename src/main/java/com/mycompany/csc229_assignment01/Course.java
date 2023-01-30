/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).
    Harvey Tseng
    https://github.com/SUNYFarmingdale/csc229_assignment01-Verdenroz.git

 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
    //Instance fields
    private String ID;
    private String Name;
    private String Code;
    
    //Default constructor
    public Course(){
        ID = "R02112686";
        Name = "Harvey Tseng";
        Code = "CSC 229";
    }
    
    //Overloaded constructor -- create Course object with parameters
    public Course(String ID, String Name, String Code){
        this.ID = ID;
        this.Name = Name;
        this.Code = Code;
    }
    
    // change ID
    public void setID(String id){
        ID = id;
    }
    
    //change Name
    public void setName(String name){
        Name = name;
    }
    
    //change Code
    public void setCode(String code){
        Code = code;
    }
    
    // Get ID
    public String getID(){
        return ID;
    }
    
    // Get Name
    public String getName(){
        return Name;
    }
    
    //Get Cod
    public String getCode(){
        return Code;
    }
}
