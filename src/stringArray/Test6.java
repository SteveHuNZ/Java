package stringArray;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        String studyId;
        students.add(new Student(studyId:"20180302",name:"william",age:10,className:"room5"));
        students.add(new Student(studyId:"20180304",name:"kaitlyn",age:6,className:"room26"));
        students.add(new Student(studyId:"20180305",name:"emily",age:18,className:"room19"));
        students.add(new Student(studyId:"20180308",name:"steve",age:19,className:"room20"));
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getStudyId() + "\t\t"+ s.getName()+ "\t\t"+ s.getAge()+ "\t\t"+ s.getClassName());
            
        }

    }
}
