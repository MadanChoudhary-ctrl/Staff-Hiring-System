import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.io.IOException;

/**
 * A class named 'INGNepal' is created to make GUI for the first part of the coursework, which will be used to store the details
 * of vacancy and hired staffs (part time and full time) details in the list. Differnt GUI componenets are created in this class.
 */

class INGNepal {
    private JFrame frame;
    // labels, textFields, and buttons for FullTimeStaffHire
    private JTextField tfVacancyNumber1;
    private JTextField tfDesignation1;
    private JTextField tfJobType1;
    private JTextField tfSalary1;
    private JTextField tfWorkingHour1;
    private JTextField tfStaffName1;
    private JTextField tfJoiningDate1;
    private JTextField tfQualification1;
    private JTextField tfAppointedBy1;
    private JButton btnAddFullTimeStaff;
    private JButton btnAppointFullTimeStaff;
    private JButton btnClearFullTimeStaff;
    private JButton btnDisplay1;

    // labels, textFields, and buttons for PartTimeStaffHire
    private JTextField tfVacancyNumber2;
    private JTextField tfDesignation2;
    private JTextField tfJobType2;
    private JTextField tfWorkingHour2;
    private JTextField tfWages2;
    private JTextField tfShift2;
    private JTextField tfStaffName2;
    private JTextField tfJoiningDate2;
    private JTextField tfQualification2;
    private JTextField tfAppointedBy2; 
    private JButton btnAddPartTimeStaff;
    private JButton btnAppointPartTimeStaff;
    private JButton btnTerminatePartTimeStaff;
    private JButton btnClearPartTimeStaff;
    private JButton btnDisplay2;

    public static final Color VeryLightYellow = new Color(255, 255, 204);

    // Creating an arraylist of type 'StaffHire'
    ArrayList <StaffHire> list = new ArrayList<>();

    /**
     * A constructor of the INGNepal class is made inorder to create frame and complete the whole design part of the 
     * GUI using different in-built functions such as setBounds(), setSize(), setVisible, getText(), and so on.
     */
    public INGNepal() 
    {
        frame = new JFrame("INGNepal");
        frame.setSize(900, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(VeryLightYellow);

        JLabel title1 = new JLabel("F O R      F U L L     T I M E     S T A F F");
        title1.setBounds(300, 15, 500, 40);
        frame.add(title1);

        JLabel title2 = new JLabel("F O R      P A R T     T I M E     S T A F F");
        title2.setBounds(300, 285, 500, 40);
        frame.add(title2);

        JLabel border = new JLabel("_____________________________________________________________________________________________________________________");
        border.setBounds(40, 270, 900, 20);
        frame.add(border);

        // setting GUI components for FullTimeStaffHire
        JLabel lbVacancyNumber1 = new JLabel("Vacancy Number");
        lbVacancyNumber1.setBounds(40, 65, 100, 25);
        frame.add(lbVacancyNumber1);
        tfVacancyNumber1 = new JTextField();
        tfVacancyNumber1.setBounds(170, 65, 200, 20);
        frame.add(tfVacancyNumber1);

        JLabel lbDesignation1 = new JLabel("Designation");
        lbDesignation1.setBounds(40, 95, 100, 25);
        frame.add(lbDesignation1);
        tfDesignation1 = new JTextField();
        tfDesignation1.setBounds(170, 95, 200, 20);
        frame.add(tfDesignation1);

        JLabel lbJobType1 = new JLabel("Job Type");
        lbJobType1.setBounds(40, 125, 100, 25);
        frame.add(lbJobType1);
        tfJobType1 = new JTextField();
        tfJobType1.setBounds(170, 125, 200, 20);
        frame.add(tfJobType1);

        JLabel lbSalary1 = new JLabel("Salary");
        lbSalary1.setBounds(510, 65, 100, 25);
        frame.add(lbSalary1);
        tfSalary1 = new JTextField();
        tfSalary1.setBounds(620, 65, 200, 20);
        frame.add(tfSalary1);

        JLabel lbWorkingHour1 = new JLabel("Working Hour");
        lbWorkingHour1.setBounds(510, 95, 100, 25);
        frame.add(lbWorkingHour1);
        tfWorkingHour1 = new JTextField();
        tfWorkingHour1.setBounds(620, 95, 200, 20);
        frame.add(tfWorkingHour1);

        btnAddFullTimeStaff = new JButton("ADD");
        btnAddFullTimeStaff.setBounds(620, 125, 90, 25);
        frame.add( btnAddFullTimeStaff);

        JLabel lbStaffName1 = new JLabel("Staff Name");
        lbStaffName1.setBounds(40, 180, 100, 25);
        frame.add(lbStaffName1);
        tfStaffName1 = new JTextField();
        tfStaffName1.setBounds(170, 180, 200, 20);
        frame.add(tfStaffName1);

        JLabel lbJoinignDate1 = new JLabel("Joining Date");
        lbJoinignDate1.setBounds(40, 210, 100, 25);
        frame.add(lbJoinignDate1);
        tfJoiningDate1 = new JTextField();
        tfJoiningDate1.setBounds(170, 210, 200, 20);
        frame.add(tfJoiningDate1); 

        JLabel lbAppointedBy1 = new JLabel("Appointed By");
        lbAppointedBy1.setBounds(40, 240, 100, 25);
        frame.add(lbAppointedBy1);
        tfAppointedBy1 = new JTextField();
        tfAppointedBy1.setBounds(170, 240, 200, 20);
        frame.add(tfAppointedBy1); 

        JLabel lbQualification1 = new JLabel("Qualification");
        lbQualification1.setBounds(510, 180, 100, 25);
        frame.add(lbQualification1);
        tfQualification1 = new JTextField();
        tfQualification1.setBounds(620, 180, 200, 20);
        frame.add(tfQualification1); 

        btnAppointFullTimeStaff = new JButton("APPOINT");
        btnAppointFullTimeStaff.setBounds(620, 210, 90, 25);
        frame.add(btnAppointFullTimeStaff);

        btnClearFullTimeStaff = new JButton("CLEAR");
        btnClearFullTimeStaff.setBounds(620, 245, 90, 25);
        frame.add(btnClearFullTimeStaff);

        btnDisplay1 = new JButton("DISPLAY");
        btnDisplay1.setBounds(730, 210, 90, 25);
        frame.add(btnDisplay1);

        // setting GUI components for PartTimeStaffHire
        JLabel lbVacancyNumber2 = new JLabel("Vacancy Number");
        lbVacancyNumber2.setBounds(40, 350, 100, 25);
        frame.add(lbVacancyNumber2);
        tfVacancyNumber2 = new JTextField();
        tfVacancyNumber2.setBounds(170, 350, 200, 20);
        frame.add(tfVacancyNumber2);

        JLabel lbDesignation2 = new JLabel("Designation");
        lbDesignation2.setBounds(40, 380, 100, 25);
        frame.add(lbDesignation2);
        tfDesignation2 = new JTextField();
        tfDesignation2.setBounds(170, 380, 200, 20);
        frame.add(tfDesignation2);

        JLabel lbJobType2 = new JLabel("Job Type");
        lbJobType2.setBounds(40, 410, 100, 25);
        frame.add(lbJobType2);
        tfJobType2 = new JTextField();
        tfJobType2.setBounds(170, 410, 200, 20);
        frame.add(tfJobType2);

        JLabel lbWorkingHour2 = new JLabel("Working Hour");
        lbWorkingHour2.setBounds(40, 440, 100, 25);
        frame.add(lbWorkingHour2);
        tfWorkingHour2 = new JTextField();
        tfWorkingHour2.setBounds(170, 440, 200, 20);
        frame.add(tfWorkingHour2);

        JLabel lbWages2 = new JLabel("Wages Per Hour");
        lbWages2.setBounds(510, 350, 100, 25);
        frame.add(lbWages2);
        tfWages2 = new JTextField();
        tfWages2.setBounds(620, 350, 200, 20);
        frame.add(tfWages2);

        JLabel lbShift2 = new JLabel("Shift");
        lbShift2.setBounds(510, 380, 100, 25);
        frame.add(lbShift2);
        tfShift2 = new JTextField();
        tfShift2.setBounds(620, 380, 200, 20);
        frame.add(tfShift2);

        btnAddPartTimeStaff = new JButton("ADD");
        btnAddPartTimeStaff.setBounds(620, 410, 90, 25);
        frame.add(btnAddPartTimeStaff);

        JLabel lbStaffName2 = new JLabel("Staff Name");
        lbStaffName2.setBounds(40, 495, 100, 25);
        frame.add(lbStaffName2);
        tfStaffName2 = new JTextField();
        tfStaffName2.setBounds(170, 495, 200, 20);
        frame.add(tfStaffName2);

        JLabel lbJoiningDate2 = new JLabel("Joining Date");
        lbJoiningDate2.setBounds(40, 525, 100, 25);
        frame.add(lbJoiningDate2);
        tfJoiningDate2 = new JTextField();
        tfJoiningDate2.setBounds(170, 525, 200, 20);
        frame.add(tfJoiningDate2);

        JLabel lbQualification2 = new JLabel("Qualification");
        lbQualification2.setBounds(40, 555, 100, 25);
        frame.add(lbQualification2);
        tfQualification2 = new JTextField();
        tfQualification2.setBounds(170, 555, 200, 20);
        frame.add(tfQualification2);

        JLabel lbAppointed2 = new JLabel("Appointed By");
        lbAppointed2.setBounds(510, 495, 100, 25);
        frame.add(lbAppointed2);
        tfAppointedBy2 = new JTextField();
        tfAppointedBy2.setBounds(620, 495, 200, 20);
        frame.add(tfAppointedBy2);

        btnAppointPartTimeStaff = new JButton("APPOINT");
        btnAppointPartTimeStaff.setBounds(620, 525, 90, 25);
        frame.add(btnAppointPartTimeStaff);

        btnClearPartTimeStaff = new JButton("CLEAR");
        btnClearPartTimeStaff.setBounds(730, 525, 90, 25);
        frame.add(btnClearPartTimeStaff);

        btnTerminatePartTimeStaff = new JButton("TERMINATE");
        btnTerminatePartTimeStaff.setBounds(620, 560, 200, 25);
        frame.add(btnTerminatePartTimeStaff);

        btnDisplay2 = new JButton("DISPLAY");
        btnDisplay2.setBounds(525, 615, 90, 25);
        frame.add(btnDisplay2);

        JLabel lbView = new JLabel("Click this button to display all the details of Part Time Staff.");
        lbView.setBounds(170, 620, 500, 20);
        frame.add(lbView);

        // creating new object of 'Font' and changing the font of the labels
        Font f = new Font("Serif", Font.BOLD, 16);
        Font f1 = new Font("Serif", Font.BOLD, 13);
        lbView.setFont(f1);
        title1.setFont(f);
        title1.setForeground(Color.BLUE);
        title2.setFont(f);
        title2.setForeground(Color.BLUE);
        border.setForeground(Color.GRAY);

        /*
        ActionListener is added to different buttons of the frame inorder to make them functional. Default library of java 
        i.e. actionPerformed is used here. When the buttons are clicked, they call their respective method. 
         */
        btnAddFullTimeStaff.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) 
                {
                    addFullTimeStaff();
                }       
            });

        btnAppointFullTimeStaff.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) 
                {
                    appointFullTimeStaff();
                }       
            });

        btnDisplay1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) 
                {
                    displayFullTimeStaff();
                }       
            });

        btnClearFullTimeStaff.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) 
                {
                    clearFullTimeStaff();
                }       
            });

        btnAddPartTimeStaff.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent ae) 
                {
                    addPartTimeStaff();
                }
            });

        btnAppointPartTimeStaff.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) 
                {
                    appointPartTimeStaff();
                }
            });

        btnTerminatePartTimeStaff.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) 
                {
                    terminatePartTimeStaff();
                }
            });

        btnDisplay2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) 
                {
                    displayPartTimeStaff();
                }
            });

        btnClearPartTimeStaff.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) 
                {
                    clearPartTimeStaff();
                }
            });
    }

    // This is the main method of this class.
    public static void main(String args []) 
    {
        new INGNepal().frame.setVisible(true);
    }

    /**
     * This method is created to add vacancyNumber, designation, jobType, salary, workingHour of full time staff
     * in the arraylist. Here the constructor of the FullTimeStaffHire class is called. Number format and null pointer exceptions 
     * are handled properly. The method 'trim()' is used inorder to remove whitespace from both ends of a string.
     */
    public void addFullTimeStaff() 
    {
        String vac = tfVacancyNumber1.getText().trim();
        String designation = tfDesignation1.getText().trim();
        String jobType = tfJobType1.getText().trim();
        String sal = tfSalary1.getText().trim();
        String workHour = tfWorkingHour1.getText().trim();
        int vacancyNumber, salary, workingHour;
        if(vac.equals("") || designation.equals("") || jobType.equals("") || sal.equals("") || workHour.equals("")) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields.", "Vacancy for Full Time Staff", 0);
        } else {
            try {
                vacancyNumber = Integer.parseInt(vac);
                salary = Integer.parseInt(sal);
                workingHour = Integer.parseInt(workHour);
                if(vacancyNumber < 0 || salary < 0 || workingHour < 0) {
                    JOptionPane.showMessageDialog(frame, "Negative values are not allowed. Please enter positive values.", "Vacancy for Full Time Staff", 0);
                } else {
                    FullTimeStaffHire ftsh = new FullTimeStaffHire(vacancyNumber, designation, jobType, salary, workingHour);
                    // adding the object of FullTimeStaffHire in the arraylist 
                    list.add(ftsh);
                    JOptionPane.showMessageDialog(frame, "Vacancy added successfully.", "Vacancy for Full Time Staff", 1);
                } 
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Please enter the data in correct format.", "Vacancy for Full Time Staff", 0);
            } catch (NullPointerException npe) {
                JOptionPane.showMessageDialog(frame, "Please fill all the fields.", "Vacancy for Full Time Staff", 0);
            }
        }
    }

    /**
     * This method is created to hire or appoint full time staff when a valid vacancy number is entered. 
     * An object of StaffHire is casted as FullTimeStaffHire and the method to hire full time staff is invoked here.
     * Also comparison between input vacancy and existing vacancy is done.
     */
    public void appointFullTimeStaff() 
    {
        String staffName = tfStaffName1.getText().trim();
        String joiningDate = tfJoiningDate1.getText().trim();
        String qualification = tfQualification1.getText().trim();
        String appointedBy = tfAppointedBy1.getText().trim();
        String vac = tfVacancyNumber1.getText().trim();
        int vacancyNumber;

        if(staffName.equals("") || joiningDate.equals("") || qualification.equals("") || appointedBy.equals("")) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields.", "Appointing Full Time Staff", 0);
        } else {
            try {
                vacancyNumber = Integer.parseInt(vac);
                for(int i = 0; i < list.size(); ++i) {
                    StaffHire sh = list.get(i);
                    if(sh instanceof FullTimeStaffHire) {
                        // casting the object of StaffHire to FullTimeStaffHire and initializing it to ftsh 
                        FullTimeStaffHire ftsh = (FullTimeStaffHire) sh;
                        if(ftsh.getVacancyNumber () == vacancyNumber) {
                            if(ftsh.joined == false) {
                                // invoking the method to hire full time staff from FullTimeStaffHire class
                                ftsh.hireFullTimeStaff(staffName, joiningDate, qualification, appointedBy);
                                JOptionPane.showMessageDialog(frame, "Staff hired successfully.", "Appointing Full Time Staff", 1);
                                break;
                            } else {
                                JOptionPane.showMessageDialog(frame, "Staff is already hired.", "Appointing Full Time Staff", 0);
                            }
                        } 
                    }
                }
            } catch (NullPointerException npe) {
                JOptionPane.showMessageDialog(frame, "Please fill all the fields.", "Appointing Full Time Staff", 0);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Please enter the data in correct format.", "Appointing Full Time Staff", 0);   
            } catch (ClassCastException cce) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid vacancy number.", "Appointing Full Time Staff", 0);   
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid vacancy number.", "Appointing Full Time Staff", 0);   
                return;
            }
        }
    }

    // This method is used to display all the details relating to full time staff. 'For each' loop is implemented here.
    public void displayFullTimeStaff() 
    {
        for(StaffHire sh : list) {
            if(sh instanceof FullTimeStaffHire) {
                FullTimeStaffHire ftsh = (FullTimeStaffHire) sh;
                ftsh.display();
                System.out.println();
            }                       
        }
    }

    /*
     * This method helps to clear all the textFields of full time staff allowing user to enter new data during the same time i.e. 
     * the user does not have to re-execute the program.
     */
    public void clearFullTimeStaff() 
    {
        int x = JOptionPane.showConfirmDialog(frame, "Do you really want to clear?", "Clear Full Time Staff", JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.YES_OPTION) {
            tfVacancyNumber1.setText(null);
            tfDesignation1.setText(null);
            tfJobType1.setText(null);
            tfSalary1.setText(null);
            tfWorkingHour1.setText(null);
            tfStaffName1.setText(null);
            tfJoiningDate1.setText(null);
            tfQualification1.setText(null);
            tfAppointedBy1.setText(null);  
            JOptionPane.showMessageDialog(frame, new JLabel("Fields have been cleared.", JLabel.CENTER), "Clear Full Time Staff", JOptionPane.PLAIN_MESSAGE);
        } else {

        }
    }

    /**
     * This method is created to add vacancyNumber, designation, jobType, workingHour, wages, and shifts of part time staff
     * in the arraylist. Here the constructor of the PartTimeStaffHire class is called. Number format and null pointer exceptions 
     * are try-catched as exception handling.
     */
    public void addPartTimeStaff() 
    {
        String vac = tfVacancyNumber2.getText().trim();
        String designation = tfDesignation2.getText().trim();
        String jobType = tfJobType2.getText().trim();
        String workHour = tfWorkingHour2.getText().trim();
        String wagesPerHour = tfWages2.getText().trim();
        String shifts = tfShift2.getText().trim();
        int vacancyNumber, workingHour, wages;
        if(vac.equals("") || designation.equals("") || jobType.equals("") || workHour.equals("") || wagesPerHour.equals("") || shifts.equals("")) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields.", "Vacancy for Part Time Staff", 0);
        } else {
            try {
                vacancyNumber = Integer.parseInt(vac);
                workingHour = Integer.parseInt(workHour);
                wages = Integer.parseInt(wagesPerHour);
                if(vacancyNumber < 0 || workingHour < 0 || wages < 0) {
                    JOptionPane.showMessageDialog(frame, "Negative values are not allowed. Please enter positive values.", "Vacancy for Part Time Staff", 0);
                } else {
                    PartTimeStaffHire ptsh = new PartTimeStaffHire(vacancyNumber, designation, jobType, workingHour, wages, shifts);
                    list.add(ptsh);
                    JOptionPane.showMessageDialog(frame, "Vacancy added successfully.", "Vacancy for Part Time Staff", 1);
                } 
            } catch (NullPointerException npe) {
                JOptionPane.showMessageDialog(frame, "Please fill all the fields.", "Vacancy for Part Time Staff", 0);
            }  catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Please enter the data in correct format.", "Vacancy for Part Time Staff", 0);
            }               
        }
    }

    /**
     * This method is created to hire or appoint part time staff when a valid vacancy number is entered. 
     * An object of StaffHire is casted as PartTimeStaffHire and the method to hire part time staff is called here.
     * Also comparison between input vacancy number and existing vacancy number is done.
     */
    public void appointPartTimeStaff() 
    {
        String staffName = tfStaffName2.getText().trim();
        String joiningDate = tfJoiningDate2.getText().trim();
        String qualification = tfQualification2.getText().trim();
        String appointedBy = tfAppointedBy2.getText().trim();
        String vac = tfVacancyNumber2.getText().trim();
        int vacancyNumber;

        if(staffName.equals("") || joiningDate.equals("") || qualification.equals("") || appointedBy.equals("")) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields.", "Appointing Part Time Staff", 0);
        } else {
            try {
                vacancyNumber = Integer.parseInt(vac);

                for(int i = 0; i < list.size(); ++i) {
                    StaffHire sh = list.get(i);
                    if(sh instanceof PartTimeStaffHire) {
                        // casting the object of StaffHire to PartTimeStaffHire and initializing it to ptsh 
                        PartTimeStaffHire ptsh = (PartTimeStaffHire) sh;
                        if(ptsh.getVacancyNumber () == vacancyNumber) {
                            if(ptsh.joined == false) {
                                // calling the method to hire part time staff from PartTimeStaffHire class
                                ptsh.hirePartTimeStaff(staffName, joiningDate, qualification, appointedBy);
                                JOptionPane.showMessageDialog(frame, "Staff hired successfully.", "Appointing Part Time Staff", 1);
                                break;
                            } else {
                                JOptionPane.showMessageDialog(frame, "Staff is already hired.", "Appointing Part Time Staff", 0);
                            } 
                        } 
                    }
                }
            } catch (NullPointerException npe) {
                JOptionPane.showMessageDialog(frame, "Please fill all the fields.", "Appointing Part Time Staff", 0);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(frame, "Please enter the data in correct format.", "Appointing Part Time Staff", 0);   
            } catch (ClassCastException cce) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid vacancy number.", "Appointing Part Time Staff", 0);   
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid vacancy number.", "Appointing Part Time Staff", 0);   
                return;
            }
        }
    }

    /**
     * This method is created to terminate part time staff. Here input vacancy number and existing vacancy number are compared
     * as well as the join status of the staff is checked. The method to terminate staff from PartTimeStaffHire class is 
     * called inside this method. 
     */
    public void terminatePartTimeStaff() 
    {
        String vac = tfVacancyNumber2.getText().trim();  
        int vacancyNumber;
        boolean found = false;
        try {
            vacancyNumber = Integer.parseInt(vac);
            for(int i = 0; i < list.size(); ++i) {
                StaffHire sh = list.get(i);
                if(sh instanceof PartTimeStaffHire) {
                    // casting the object of StaffHire to PartTimeStaffHire and initializing it to ptsh  
                    PartTimeStaffHire ptsh = (PartTimeStaffHire) sh;
                    if(sh.getVacancyNumber () == vacancyNumber) {
                        if(ptsh.joined == false) {
                            JOptionPane.showMessageDialog(frame, "Staff is not appointed yet.", "Terminating Part Time Staff", 0);
                            return;
                        } else {
                            // invoking terminate() method from PartTimeStaffHire class
                            ptsh.terminate();
                            list.remove(sh);
                            JOptionPane.showMessageDialog(frame, "Staff terminated successfully.", "Terminating Part Time Staff", 1);
                            found = true;
                            break;
                        }
                    } 
                }
            }
            if(!found) {
                JOptionPane.showMessageDialog(frame, "Vacancy not found.", "Terminating Part Time Staff", 0);
                return;
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(frame, "Please fill all the fields.", "Terminating Part Time Staff", 0);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(frame, "Please enter the data in correct format.", "Terminating Part Time Staff", 0);   
        } catch (ClassCastException cce) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid vacancy number.", "Terminating Part Time Staff", 0);   
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid vacancy number.", "Terminating Part Time Staff", 0);   
            return;
        }
    }

    // This method is used to display all the details of part time staff. 'For each' loop is implemented here.
    public void displayPartTimeStaff() 
    {
        for(StaffHire sh : list) {
            if(sh instanceof PartTimeStaffHire) {
                PartTimeStaffHire ptsh = (PartTimeStaffHire) sh;
                ptsh.display();
                System.out.println();
            }                       
        }
    }

    /*
     * This method helps to clear all the textFields of part time staff allowing user to enter new data during the same time i.e. 
     * the user does not have to re-execute the program.
     */
    public void clearPartTimeStaff()
    {
        int x = JOptionPane.showConfirmDialog(frame, "Do you really want to clear?", "Clear Part Time Staff", JOptionPane.YES_NO_OPTION);
        if(x == JOptionPane.YES_OPTION) {
            tfVacancyNumber2.setText(null);
            tfDesignation2.setText(null);
            tfJobType2.setText(null);       
            tfWorkingHour2.setText(null);
            tfWages2.setText(null);
            tfStaffName2.setText(null);
            tfJoiningDate2.setText(null);
            tfQualification2.setText(null);
            tfAppointedBy2.setText(null);  
            tfShift2.setText(null);  
            JOptionPane.showMessageDialog(frame, new JLabel("Fields have been cleared.", JLabel.CENTER), "Clear Part Time Staff", JOptionPane.PLAIN_MESSAGE);
        } else {

        }
    }
}