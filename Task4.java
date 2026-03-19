interface User{
    void login();
}
class Student implements User{
    public void login(){
        System.out.println("Student logged in");
    }
}
class Instructor implements User{
    public void login(){
        System.out.println("Instructor logged in");
    }
    public void uploadCourse(){
        System.out.println("Course uploaded");
    }
}

public class Task4 {
    public static void main(String[] args) {

        User s = new Student();
        User i = new Instructor();

        s.login();
        i.login();

        Instructor ins = new Instructor();
        ins.uploadCourse();

    }
}
