package stringArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        String studyId;
        students.add(new Student("20180302","william",10,"room5"));
        students.add(new Student("20180304","kai",6,"room26"));
        students.add(new Student("20180305","emily",18,"room19"));
        students.add(new Student("20180308","steve",19,"room20"));
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getStudyId() + "\t\t"+ s.getName()+ "\t\t"+ s.getAge()+ "\t\t"+ s.getClassName());

            // let user enter the students number
            Scanner sc = new Scanner(System.in);
            while ( true) {
                System.out.println("please enter the student id ");
                String id = sc .next();
                Student sq = getStudentByStudyId(students,id);
                if(sq == null){
                    System.out.println("cannot find this person");
                }else {System.out.println(s.getStudyId() + "\t\t"+ s.getName()+ "\t\t"+ s.getAge()+ "\t\t"+ s.getClassName());

                }
            }

        }

    }
    public static  Student getStudentByStudyId(ArrayList <Student>students,String studyId){
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.getStudyId().equals(studyId)){
                return s;
            }

        }
        return null;

    }

}
