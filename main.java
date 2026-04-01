import java.util.*; class Student {  
    int id;  
    String name;  
    ArrayList<Course> courses = new ArrayList<>();     Student(int id, String name) {  
        this.id = id;         
this.name = name;  
    }  }  class Course {  
    int id;      String name;     int capacity;  
    ArrayList<Student> students = new ArrayList<>();     Course(int id, String name, int capacity) {  
        this.id = id;         this.name = name;         this.capacity = capacity;  
    }  }  public class Main {      public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);          HashMap<Integer, Student> students = new HashMap<>();         HashMap<Integer, Course> courses = new HashMap<>();  
        while (true) {  
            System.out.println("\n1. Add Student");  
            System.out.println("2. Add Course");  
            System.out.println("3. 
Enroll");             
System.out.println("4. Exit");             int choice = sc.nextInt();             if 
(choice == 1) {  
                System.out.print("Enter Student ID: 
");                 int id = sc.nextInt();                 
sc.nextLine();  
                System.out.print("Enter Name: ");                 String name = sc.nextLine();                 students.put(id, new Student(id, name));  
                System.out.println("Student Added");             
} else if (choice == 2) {  
                System.out.print("Enter Course ID: 
");                 int id = sc.nextInt();                 
sc.nextLine();  
                System.out.print("Enter Course Name: ");                 String name = sc.nextLine();                 courses.put(id, new Course(id, name, 2));                 
System.out.println("Course Added");  
           } else if (choice == 3) {  
                System.out.print("Enter Student ID: ");                 int sid = sc.nextInt();  
                System.out.print("Enter Course ID: ");                 int cid = sc.nextInt();  
                Student s = students.get(sid);                 
Course c = courses.get(cid);                 if (s 
!= null && c != null) {                     if 
(c.students.size() < c.capacity) {  
                        c.students.add(s);  
                        s.courses.add(c);  
                        System.out.println("Enrollment Successful");  
                    } else {  
                        System.out.println("Course Full");  
                    }  
                } else {  
                    System.out.println("Invalid IDs");  
                }  
            } else {                 
break;  
            }  
        }  
    }  
}  
