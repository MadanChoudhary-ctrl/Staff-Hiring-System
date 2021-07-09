//Class FullTimeStaffHire inheritates the StaffHire class. 
class FullTimeStaffHire extends StaffHire {

    /*Declaration of all attributes of FullTimeStaffHire class
    access modifier is declared as private.
     */
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    public boolean joined;

    //The constructor accepts five parameters of datatype integer and String.
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour) {
        //Super class constructor is invoked.
        super (vacancyNumber, designation, jobType);
        this.salary = salary;
        this.workingHour = workingHour;
        this.staffName = "";
        this.joiningDate = "";
        this.qualification = "";
        this.appointedBy = "";
        this.joined = false;
    }

    //Creating corresponding accessor method of every attribute.
    public int getSalary () {
        return salary;
    }

    /*A setter method is declared which takes a parameter (newSalary)
     *and assigns it to the salary variable.
     *It has its own conditional statement(if else).
     */
    public void setSalary (int newSalary) {
        if (joined == false) {
            this.salary = newSalary;
        }else{
            System.out.println("It is not possible to change the salary.");
        }
    }

    public int getWorkingHour () {
        return workingHour;
    }

    //This method takes a parameter (newWorkingHour) and assigns it to the workingHour attribute.
    public void setWorkingHour (int newWorkingHour) {
        this.workingHour = newWorkingHour;
    }

    public String getStaffName () {
        return staffName;
    }

    public String getJoiningDate () {
        return joiningDate;
    }

    public String getQualification () {
        return qualification;
    }

    public String getAppointedBy () {
        return appointedBy;
    }

    /*A method is created to hire full time staff
     * different values can be passed through the constructor.
     * It has if else condition.
     */
    public void hireFullTimeStaff (String staffName, String joiningDate, String qualification, String appointedBy) {
        if (joined == true) {
            System.out.println("The name of staff is "+staffName+""+"and the joining date is "+joiningDate);
        }else{
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            joined = true;
        }
    }

    /*A method is created to display all the details of the full time 
     *staff if he/she is has already joined.
     *
     */
    public void display () {
        super.display ();
        if (joined == true) {
            System.out.println("Staff name: "+staffName+
                "\nSalary: "+salary+
                "\nWorking hour: "+workingHour+
                "\nJoining date: "+joiningDate+
                "\nQualification: "+qualification+
                "\nAppointed by: "+appointedBy);
        }
    }
}