
//Class PartTimeStaffHire inheritates the parent class StaffHire.
class PartTimeStaffHire extends StaffHire {
    //Declaration of attributes and access modifier(as private).
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    boolean joined;
    private boolean terminated;

    //A method is created and initialized with parameters having different datatypes.
    public PartTimeStaffHire (int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts)
    {
        /*A call is made to the super class constructor with three parameters,
         *vacancy number, designation,and job type. 
         */
        super (vacancyNumber, designation, jobType);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        this.staffName = "";
        this.joiningDate = "";
        this.qualification = "";
        this.appointedBy = "";
        this.joined = false;
    }

    //Corresponding getter method of each attribute.
    public String getShifts ()
    {
        return shifts;
    }

    public String getStaffName () 
    {
        return staffName;
    }

    public String getJoiningDate () {
        return joiningDate;
    }

    public String getQualification () 
    {
        return qualification;
    }

    public String getAppointedBy () 
    {
        return appointedBy;
    }

    /*A setter method is created which takes a parameter (newWorkingShift) 
     *and assigns it to the shifts attribute. 
     *It has its own conditional if else statement.
     */
    public void setWorkingShift (String newWorkingShift)
    {
        if (joined == true) 
        {
            System.out.println("Staff is already hired so not allow to set new shift");
        }
        else
        {
            this.shifts = newWorkingShift;
        }
    }

    /*This method accepts four parameters staffName, joiningDate, 
     * qualification and appointedBy. 
     *It has its own if else conditional statement.
     */
    public void hirePartTimeStaff (String staffName, String joiningDate, String qualification, String appointedBy)
    {
        if (joined == true)
        {
            System.out.println("Staff name: "+staffName+"\n Joined date: "+joiningDate);
        }
        else
        {
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy =appointedBy;
            this.joined = true;
            this.terminated = false;
        }
    }

    /*A method 'terminate' is created to terminate the staff.    
     *It has its own if else statement. 
     */
    public void terminate ()
    {
        if (terminated ==true)
        {
            System.out.println("Staff is already terminated");
        }
        else
        {
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.appointedBy = "";
            this.joined = false;
            this.terminated = true;
        }
    }

    /*A 'display' method is created to display all the details of the part
     *time staff.
     *This method has same method signature as the display method in
     *the parent class.
     */
    public void display () 
    {
        int incomePerDay = wagesPerHour * workingHour;
        //Super class constructor is invoked.
        super.display ();
        if (joined ==true)
        {
            System.out.println("Staff name: "+staffName+
                "\nWages per hour: "+wagesPerHour+
                "\nWorking hour: "+workingHour+
                "\nJoined date: "+joiningDate+
                "\nQualification: "+qualification+
                "\nAppointedBy: "+appointedBy+
                "\nIncome per day: "+incomePerDay+
                "\nShifts: "+shifts
            );
        }
    }
}