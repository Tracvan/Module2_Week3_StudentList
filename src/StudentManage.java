public class StudentManage {
    private Student[] studentList;
    int size;

    public StudentManage(int capacity) {
        studentList = new Student[capacity];
        size = 0;
    }

    public  void add(Student student) {
        if (size < studentList.length) {
            studentList[size] = student;
            size++;
            System.out.println("Add successed");
        } else {
            System.out.println("List is full");
        }
    }

    public void updateStudent(int id, Student updatedStudent) {
        for (int i = 0; i < size; i++) {
            if (id == studentList[i].getId()) {
                studentList[i] = updatedStudent;
                System.out.println("Update Successed");
                return;
            }
        }
        System.out.println("Can't found ID ");
    }
    public void deleteStudent(int id){
        for (int i = 0; i<size; i++){
            if(studentList[i].getId() == id){
                for( int j = i; j < size-1; j++){
                    studentList[j] = studentList[j+1];
                }
                studentList[size-1] = null;
                size--;
                System.out.println("Deleting successed");
                return;
            }
        }
        System.out.println("ID can not found");
    }
    public void display(){
        System.out.println("All students");
        for (int i = 0; i < size; i++){
            System.out.println(studentList[i]);
        }
    }
    public void findByName(String name){
        for( int i = 0; i<size; i++){
            if(studentList[i].getName().equals(name) ){
                System.out.println(studentList[i].toString());
                return;
            }
        }
        System.out.println("No student found with the name " + name +".");
    }
    public void findByID(int id){
        for( int i = 0; i<size; i++){
            if(studentList[i].getId() == id ){
                System.out.println(studentList[i].toString());
                return;
            }
        }
        System.out.println("No student found with the id " + id +".");
    }
    public void sortById(){
        for(int i = 0; i<size-1; i++){
            for(int j = i+1; j< size; j++){
                if(studentList[i].getId() > studentList[j].getId()){
                    Student temp = studentList[i];
                    studentList[i] = studentList[j];
                    studentList[j] = temp;
                }
            }
        }
    }
    public void sortByName(){
        for(int i = 0; i<size-1; i++){
            for(int j = i+1; j< size; j++){
                if(studentList[i].getName().compareToIgnoreCase(studentList[j].getName() ) > 0){
                    Student temp = studentList[i];
                    studentList[i] = studentList[j];
                    studentList[j] = temp;
                }
            }
        }
    }
}