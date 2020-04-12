

/**
 * @author Dell
 * @version 1.0
 * @created 10-Apr-2020 4:06:28 PM
 */
import java.util.Scanner;
public class StudentController
{

	public StudentController()
        {
	}
        
	public void finalize() throws Throwable
        {
	}

	public int addStudent(Student stu)
        {
		return 0;
	}
        
	public int deleteStudent(int reg_no)
        {
		return 0;
	}

	public void menu()
        {
		System.out.println("MAIN MENU");
                
                        Scanner input = new Scanner(System.in);
                        boolean mainLoop = true;

                        int choice;
                        do
                        {
                            System.out.println("Product Management Menu\n");
                            System.out.print("1.) Add new Student \n");
                            System.out.print("2.) Edit Student\n");
                            System.out.print("3.) Delete Student\n");
                            System.out.print("4.) Search Student\n");
                            System.out.print("5.) Print List of Students.\n");
                            System.out.print("6.) Exit\n");
                            System.out.print("\nEnter Your Menu Choice: ");

                            choice = input.nextInt();
                            
                        }
                        while(choice >7);
                   
                    switch(choice)
                    {
                    case 1:

                        System.out.print("Student Added ");
                        break;

                    case 2: 
                        System.out.println("Student Record Edited ");
                        break;
                    case 3:
                        break;
                    case 4: 
                        break;
                    case 5:
                        System.out.println("***STUDENT LIST***");
                        break;
                    case 6: 
                        System.out.println("Exiting Program...");
                        System.exit(0);
                         break;
                    }
       // Bad Menu Option Direct
        if (choice > 6 || choice < 1)
        {
        System.out.println("This is not a valid Menu Option! Please Select Another.");
        do
        {
            choice = input.nextInt();
        }
        while(choice < 7 );
        }
    // End bad menu option 
	}
        
	public Student searchStudent( String name)
        {
		return null;
	}

        public boolean updateStudent(int Name, int reg_no, int degree, int credit_hours){
		return false;
	}
        
        
        public static void main(String[] args)
        {
            StudentController stucont = new StudentController();
            stucont.menu();
        }

}