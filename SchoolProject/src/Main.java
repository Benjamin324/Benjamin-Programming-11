
public class Main {
    public static void main(String[] args) {
        School Uhill = new School(1970, "2022 Washington Road",200000);
        Uhill.addStudent("Benzino", "Ray", 11);
        Uhill.addStudent("Veronica","Mars", 9);
        Uhill.addStudent("Charles", "Xavier", 10);
        Uhill.addStudent("Soren","Caron", 12);
        Uhill.addStudent("Elvin", "Sun", 11);
        Uhill.addStudent("Kenneth","Goh", 9);
        Uhill.addStudent("Paul", "Lee", 10);
        Uhill.addStudent("Ray","Liu", 8);
        Uhill.addStudent("Gary", "Geng", 10);
        Uhill.addStudent("Benjamin","Amadi", 11);

        Uhill.addteacher("Hailey","kim", "Science");
        Uhill.addteacher("Gary","Beaton", "Math");
        Uhill.addteacher("Paul","Zaremba", "Programming");
        Uhill.addteacher("Tish","Silvers", "English");

        System.out.println(Uhill.showStudents());
        System.out.println(Uhill.showTeachers());

        Uhill.delStudent("Soren Caron");
        Uhill.delStudent("Elvin");
        Uhill.delteacher("Hailey kim");
        Uhill.delteacher("Paul");
        System.out.println(Uhill.showStudents());
        System.out.println(Uhill.showTeachers());

    }
}
