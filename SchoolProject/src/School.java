import java.util.ArrayList;

public class School {


    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<String> courses = new ArrayList<>();
    private int budget;
    private int age;
    private String location;



    //two constructors
    School() {
    }
    School(int age, String location, int budget) {
        this.age = age;
        this.location = location;
        this.budget = budget;
    }


    //adding a teacher
  public void addteacher(String first ,String last, String subject){
          teachers.add(new Teacher(first, last,subject));
      }

      //deleting a teacher using a for loop
    public void delteacher(String Name) {
        for (int i = 0; i < teachers.size(); i++) {
            Teacher obj = teachers.get(i);
            if (obj.getFirst().equalsIgnoreCase((Name))||obj.getName().equalsIgnoreCase((Name))){
            teachers.remove(i);
            break;
            }

        }
    }

    //adding student
    public void addStudent(String first, String last, int grade){
        students.add(new Student(first, last, grade));
    }

    //deleting a student using a for loop
    public void delStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            Student obj = students.get(i);
            if (obj.getFirst().equalsIgnoreCase((name))||obj.getName().equalsIgnoreCase((name))){
                students.remove(i);
                break;
            }

        }
    }

    //show teachers
    public String showTeachers() {
        return String.valueOf(teachers);
    }

    //show students
    public String showStudents() {
        return String.valueOf(students);
    }


    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    }


 