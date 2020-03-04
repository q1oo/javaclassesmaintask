import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/training_epam?currentSchema=javaclassestask";
    static final String USER = "postgres";
    static final String PASS = "admin";

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please, type your query:");
//        String query = scanner.nextLine();
        String query = "select * from student";
        //select * from javaclassestask.student where faculty = 'Mechanical';
        //select * from javaclassestask.student where faculty = 'Mechanical' and course = 1;
        //select * from javaclassestask.student where birthdate > '1970-01-01';
        //select * from javaclassestask.student where groupname = 'TF-19-01';
        //select * from javaclassestask.student order by firstname;
        DataBase db = new DataBase();
        List<Student> students;
        students = db.getData(query);
//        for (Student student : students) {
//            System.out.println(student.toString());
//        }
        System.out.println("=========================================");
        System.out.println("a) список студентов заданного факультета:");
        for (Student student : students) {
            if (student.getFacultyName().equals("Mechanical")) {
                System.out.println(student.toString());
            }
        }
        System.out.println("=========================================");
        System.out.println("b) списки студентов для каждого факультета и курса:");
        System.out.println("\n1.Список студентов Механического факультета:");
        for (Student student : students) {
            if (student.getFacultyName().equals("Mechanical")) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n2.Список студентов Технологического факультета:");
        for (Student student : students) {
            if (student.getFacultyName().equals("Technological")) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n3.Список студентов Экономического факультета:");
        for (Student student : students) {
            if (student.getFacultyName().equals("Economic")) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n4.Список студентов Химического факультета:");
        for (Student student : students) {
            if (student.getFacultyName().equals("Chemical")) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n5.Список студентов Первого курса:");
        for (Student student : students) {
            if (student.getCourseNumber() == 1) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n6.Список студентов Второго курса:");
        for (Student student : students) {
            if (student.getCourseNumber() == 2) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n7.Список студентов Третьего курса:");
        for (Student student : students) {
            if (student.getCourseNumber() == 3) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n8.Список студентов Четвертого курса:");
        int temp = 0;
        for (Student student : students) {
            if (student.getCourseNumber() == 4) {
                System.out.println(student.toString());
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("WARNING! Студенты данного курса отсутствуют.");
        }
        System.out.println("\n9.Список студентов Пятого курса:");
        temp = 0;
        for (Student student : students) {
            if (student.getCourseNumber() == 5) {
                System.out.println(student.toString());
            }
        }
        if (temp == 0) {
            System.out.println("WARNING! Студенты данного курса отсутствуют.");
        }

        System.out.println("=========================================");
        System.out.println("c) список студентов, родившихся после заданного года:");
        String checkDate = "1970-01-01";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(checkDate);
        for (Student student : students) {
            Date studentBirthDate = simpleDateFormat.parse(student.getBirthDate());
            if (studentBirthDate.after(date)) {
                System.out.println(student.toString());
            }
        }

        System.out.println("=========================================");
        System.out.println("d) список учебной группы:");
        System.out.println("\n1.Список студентов учебной группы ТФ-18-01:");
        for (Student student : students) {
            if (student.getGroupName().equals("TF-18-01")) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n2.Список студентов учебной группы ХФ-18-01:");
        for (Student student : students) {
            if (student.getGroupName().equals("CF-18-01")) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n3.Список студентов учебной группы ХФ-17-01:");
        for (Student student : students) {
            if (student.getGroupName().equals("CF-17-01")) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n4.Список студентов учебной группы МФ-18-01:");
        for (Student student : students) {
            if (student.getGroupName().equals("MF-18-01")) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n5.Список студентов учебной группы ЭФ-19-01:");
        for (Student student : students) {
            if (student.getGroupName().equals("EF-19-01")) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n6.Список студентов учебной группы ТФ-19-01:");
        for (Student student : students) {
            if (student.getGroupName().equals("TF-19-01")) {
                System.out.println(student.toString());
            }
        }
        System.out.println("\n7.Список студентов учебной группы МФ-19-01:");
        for (Student student : students) {
            if (student.getGroupName().equals("MF-19-01")) {
                System.out.println(student.toString());
            }
        }
    }
}
