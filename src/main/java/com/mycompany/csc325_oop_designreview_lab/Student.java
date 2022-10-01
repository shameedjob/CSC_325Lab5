
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
    private double gpa;
    private int credits;



    // ToDo 1: Make this class a child of Human

    // ToDo 2: Fix the resulting errors

    // ToDo 3: Add a field for GPA and create setter and getter

    // ToDo 4: Add comments to your code
    public Student(String name, short age, int credits)
    {
        super(name, age);
        this.credits = credits;
        
    }
    
    /**
     * Gets the address of the student, returns "NO ADDRESS" if null
     * @return address of the student
     */
    @Override
    public String getAddress() {
        if(address == null)
        {
            return "NO ADDRESS";
        }
        
        return address;
    }

    /**
     * Sets the address of this student
     * @param address address to set
     */
   
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * 
     * @return the GPA of this student 
     */
    public double getGpa() {
        return gpa;
    }
    
    /**
     * Sets the GPA for the Student
     * @param gpa the GPA to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    /**
     * Gets the credits for the student
     * @return credits for the student
     */
    public int getCredits() {
        return credits;
    }
    
    /**
     * Sets the credits for the student
     * @param credits to set
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
}