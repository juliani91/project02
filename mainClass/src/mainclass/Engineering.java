/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainclass;
import java.util.Scanner;
/**
 *
 * @author julian_knd
 */
public class Engineering extends Department { // inheritance from parent class
    
   Scanner in = new Scanner(System.in);
   // public constructor from parent class (super) parent class refering to the one is inheriting
    public Engineering(String deptLongName, String deptBuilding, int facultyMembers, String secretaryName,String[] courses) {
        super(deptLongName, deptBuilding, facultyMembers, secretaryName,courses); 
    }
    
    @Override
    void printStats(){ // same as CS has a research faculty input and also display the same procedure overriding
                       // the method printStats from a different perspective.
        System.out.println("Enter the RESEARCH faculty members for: " + super.getDeptLongName() + "(Integer)");
        String researchMembers = in.next();
        super.printStats(); // call method from parent class and prints the setters from main (for loop iteration)
        System.out.println("Total RESEARCH faculty members for " + super.getDeptLongName() + " is: " + researchMembers);
        System.out.println("");
    }
    
}
