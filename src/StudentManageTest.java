public class StudentManageTest {

    public static void main(String[] args) {
        StudentManage studentManager = new StudentManage(100);
        Student student1 = new Student(1,"Tommy",20,"Tommy@gmail.com");
        studentManager.add(student1);
        Student student2 = new Student(5,"Arhur",20,"Arthur.com");
        studentManager.add(student2);
        Student student3 = new Student(7,"Ada",20,"ada@gmail.com");
        studentManager.add(student3);
        Student student4 = new Student(2,"Fin",20,"Fin.com");
        studentManager.add(student4);
        studentManager.display();
        System.out.println("------------------------");

        studentManager.sortById();
        studentManager.display();

        System.out.println("------------------------");

        Student updateStudent = new Student(2, "Grace", 20, "Grace@gmail.com");
        studentManager.updateStudent(2, updateStudent);
        studentManager.display();

        System.out.println("------------------------");

        studentManager.findByName("Tommy");

        System.out.println("------------------------");

        studentManager.findByID(2);

        System.out.println("------------------------");

        studentManager.deleteStudent(2);
        studentManager.display();

        System.out.println("------------------------");

        studentManager.sortByName();
        studentManager.display();

    }
}

