

/**
 * @author Dell
 * @version 1.0
 * @created 10-Apr-2020 4:06:40 PM
 */
public class Student {

	private int credit_hours;
	private String degree;
	private String Name;
	private String reg_no;

   
        ///////////////////////////////////////////SETTERS AND GETTERS//////////////////////////////////////
        
        
    public int getCredit_hours() {
        return credit_hours;
    }

    public void setCredit_hours(int credit_hours) {
        this.credit_hours = credit_hours;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }
    
    
    //////////////////////////////////////CONSTRUCTORS/////////////////////////////////////////
    
     public Student(int credit_hours, String degree, String Name, String reg_no, StudentController m_StudentController) {
        this.credit_hours = credit_hours;
        this.degree = degree;
        this.Name = Name;
        this.reg_no = reg_no;
        this.m_StudentController = m_StudentController;
    }

    public StudentController getM_StudentController() {
        return m_StudentController;
    }

    public void setM_StudentController(StudentController m_StudentController) {
        this.m_StudentController = m_StudentController;
    }
	public StudentController m_StudentController;

	public Student(){

	}

	public void finalize() throws Throwable {

	}

}