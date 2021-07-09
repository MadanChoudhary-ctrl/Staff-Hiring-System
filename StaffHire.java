/*StaffHire is a parent class which is inherited by two child classes.
 * They are FullTimeStaffHire and PartTimeStaffHire.
 */
class StaffHire { 
    //Three atttributes are declared, access modifier is declared as private.
    private int vacancyNumber;
    private String designation, jobType;

    //The attributes are initialized in a constructor.
    public StaffHire (int vacancyNumber, String designation, String jobType) {
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
    }

    //Corresponding accessor method(getter/setter)
    public int getVacancyNumber() {
        return vacancyNumber;
    }

    public void setVacancyNumber (int vacancyNumber) {
        this.vacancyNumber = vacancyNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation (String designation) {
        this.designation = designation;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType (String jobType) {
        this.jobType = jobType;
    }

    /*This method displays vacancy number, designation and job type.
     *The method has no return type. 
     */
    public void display () {
        System.out.println("vacancy number: "+vacancyNumber);
        System.out.println("designation: "+designation);
        System.out.println("job type: "+jobType);
    }
}
