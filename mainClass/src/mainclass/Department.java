package mainclass;
/**
 *
 * @author julian_knd
 */
public class Department{
    // class members variables for setting and getting the data in the future
    private String deptLongName;
    private String deptBuilding;
    private int facultyMembers;
    private String secretaryName;
    private String[] courses = new String[2];
// class constructor
public Department(String deptLongName, String deptBuilding, int facultyMembers, String secretaryName, String[] courses){
    this.deptLongName = deptLongName;
    this.deptBuilding = deptBuilding;
    this.facultyMembers = facultyMembers;
    this.secretaryName = secretaryName;
    this.courses = courses; // Array
    
}
    // method which prints the information from the getters (its overrided in later classes)
    // every pass of the for loop on main is reflected here depending on the object class is using.
 void printStats(){
     System.out.println("");
     
     System.out.println("The DEPARTMENT is: " + getDeptLongName());
     
     System.out.println("The BUILDING is: " + getDeptBuilding());
     
     System.out.println("The NUMBER of FACULTY members for " + getDeptLongName() + " is: " + getFacultyMembers());
     
     System.out.println("The SECRETARY name of " + getDeptLongName() + " is: " + getSecretaryName());
     
     System.out.println("The COURSES for " + getDeptLongName() + " are: " + courses[0] + ", " + courses[1]);             
 }
    /**
     * @return the deptLongName
     */
    public String getDeptLongName() {
        return deptLongName;
    }

    /**
     * @param deptLongName the deptLongName to set
     */
    public void setDeptLongName(String deptLongName) {
        this.deptLongName = deptLongName;
    }

    /**
     * @return the deptBuilding
     */
    public String getDeptBuilding() {
        return deptBuilding;
    }

    /**
     * @param deptBuilding the deptBuilding to set
     */
    public void setDeptBuilding(String deptBuilding) {
        this.deptBuilding = deptBuilding;
    }

    /**
     * @return the facultyMembers
     */
    public int getFacultyMembers() {
        return facultyMembers;
    }

    /**
     * @param facultyMembers the facultyMembers to set
     */
    public void setFacultyMembers(int facultyMembers) {
        this.facultyMembers = facultyMembers;
    }

    /**
     * @return the secretaryName
     */
    public String getSecretaryName() {
        return secretaryName;
    }

    /**
     * @param secretaryName the secretaryName to set
     */
    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName;
    }

    /**
     * @return the courses
     */
    public String[] getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    
}
