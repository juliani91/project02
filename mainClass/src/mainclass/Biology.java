/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainclass;

/**
 *
 * @author julian_knd
 */
public class Biology extends Department {
    //public constructor accessing the inherited class (Department)
    public Biology(String deptLongName, String deptBuilding, int facultyMembers, String secretaryName,String[] courses) {
        super(deptLongName, deptBuilding, facultyMembers, secretaryName,courses);   
    }
    
    @Override
    void printStats(){
        // print the setters from main at the index[2] by calling the method printStats from parent class
        super.printStats();
    }
    
}
