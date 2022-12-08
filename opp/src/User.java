public class User {
    public static int onlineNumber = 161;
    /**
     * 实例成员变量，无static修饰， 属于每个对象， 必须用对象名访问
     */
    private String name;
    private int age;

    public static void main(String[] args){
        System.out.println(User.onlineNumber);
        User u = new User();
        u.name = " william";
        u.age = 21;
        System.out.println(u.age);
        System.out.println(u.name);
        u.onlineNumber++;
        System.out.println(u.onlineNumber);
    }
}
