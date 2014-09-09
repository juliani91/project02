
package mainclass;
import java.util.Scanner;

/**
 *
 * @author julian_knd
 */
public class MainClass {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in); // scanner for user input
        // string array for the courses (made it two)
        String[] str = new String [2];        
        
        // instantiation of the class Department as an array of 3 objects
        Department[] baseObj = new Department[3];
        baseObj[0] = new CS("", "", 0, "",str); // object for CS class with parameters for constructor
        baseObj[1] = new Engineering("", "", 0, "",str); // object for engineering class with parameters for constructor
        baseObj[2] = new Biology("", "", 0, "",str); // object for biology random parameters with parameters for constructor
        
        // Array for information display at the beginning of each user input
        String[] buildingName = new String [3];
        buildingName[0] = "CS";
        buildingName[1] = "Engineering";
        buildingName[2] = "Biology";
        // a counter for iterating the building name
        int x = 0;
        // getting the input from the user from different questions and updating the object every iteration
        for(int i = 0; i < baseObj.length; i++){
                        
            System.out.println("Current Department is " + buildingName[x]);
            baseObj[i].setDeptLongName(buildingName[x]); // setting building name
            System.out.println("Enter the Building name of " + buildingName[x] + " (String no spaces)");
            String buildingNum = in.next();
            baseObj[i].setDeptBuilding(buildingNum); // setting building name (String)
            System.out.println("Number of Faculty members for " + buildingName[x] + " (Integer) ");
            int facultyMembers = in.nextInt();
            baseObj[i].setFacultyMembers(facultyMembers); // setting faculty members (integer)
            System.out.println("Enter the name of the Secretary for " + buildingName[x] + " (String no spaces)");
            String secretaryName = in.next();
            baseObj[i].setSecretaryName(secretaryName); // setting secretary name (String)
            //Array courses
            System.out.println("Enter the first course for " + buildingName[x] + " (String no spaces)");
            str[0] = in.next();
            baseObj[i].setCourses(str); // setting course at index[0]
            System.out.println("Enter the second course for " + buildingName[x] + " (String no spaces)");
            str[1] = in.next();
            baseObj[i].setCourses(str); // setting course at index[1]
            baseObj[i].printStats(); // calling the method printStats with index object.
            x = x + 1; // add one for the buildingName[x] to change every iteration.
        }
        }   
    }