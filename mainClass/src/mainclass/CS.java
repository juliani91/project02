package mainclass;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julian_knd
 */
public class CS extends Department { // cs is inheriting from Deparment
    
    //private member for this specific class
    private boolean gradProgram = true;
    private final boolean gradProgramf = false;
    Scanner in = new Scanner(System.in);
    // public constructor to access attributes from Deparment class (super)
    public CS(String deptLongName, String deptBuilding, int facultyMembers, String secretaryName,String[] courses) {
        super(deptLongName, deptBuilding, facultyMembers, secretaryName, courses);   
    }
    
    @Override
    void printStats(){  // overriding method from parent class, it also adds a new user input field
        System.out.println("Enter the RESEARCH faculty members for " + super.getDeptLongName() + " (Integer)");
        String researchMembers = in.next();
       
        System.out.println("Is there GRADUATE program for " + super.getDeptLongName() + "?" + " yes or no");
        String answer = in.next();
        super.printStats(); // call the method from parent class and prints what we set on main class
          if(("yes").equals(answer)){
          System.out.println("GRADUATE program at CS is: " + gradProgram);  
        }else{
          System.out.println("GRADUATE program at CS is: " + gradProgramf);  
        }
        System.out.println("Total RESEARCH faculty members for " + super.getDeptLongName() + " is " + researchMembers);
        System.out.println("");
    }
   
    /**
     * @return the gradProgram
     */
    public boolean isGradProgram() {
        return gradProgram;
    }

    /**
     * @param gradProgram the gradProgram to set
     */
    public void setGradProgram(boolean gradProgram) {
        this.gradProgram = gradProgram;
    }
    
}
