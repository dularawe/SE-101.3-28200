public class App {
    public static void main(String[] args) throws Exception {
        Employee mrBogdan = new Employee();
        Employee msBird = new Employee();

        
        mrBogdan.setEmpID(1001);
        mrBogdan.setEmpName("Bogdan");
        mrBogdan.setEmpDesignation("Software Engineer");

   
        msBird.setEmpID(1002);
        msBird.setEmpName("Bird");
        msBird.setEmpDesignation("Graphic Designer");

      
        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());


        System.out.println("Employee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
        //////


        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println(b.returnIt()); 

        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println(c.returnIt()); 
        //////


        Student student = new Student();
        student.setName("John Doe");
        student.setId(101);
        student.setCourse("Computer Science");

        // Create a Lecturer object and set its attributes
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Jane Smith");
        lecturer.setId(201);
        lecturer.setProgramme("Software Engineering");

        // Print the details using getters for Student
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Course: " + student.getCourse());

        // Print the details using getters for Lecturer
        System.out.println("\nLecturer Name: " + lecturer.getName());
        System.out.println("Lecturer ID: " + lecturer.getId());
        System.out.println("Lecturer Programme: " + lecturer.getProgramme());
    }
}
