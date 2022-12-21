public class Student {
    private String name;
    public static int getMax(int age1, int age2){
        return age1>age2 ?age1:age2;
    }
    public  void study(){
        System.out.println(name + "learning hard and growing fast ");
    }

    public static void main(String[] args) {
        System.out.println(Student.getMax(10,3));
        System.out.println(getMax(10,32));

        Student s = new Student();
        s.name = "kaitlyn";
        s.study();
    }
}
