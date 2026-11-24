class Course{
    String courseName;
    int duration;
    double fee;
    Course(String courseName,int duration,double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    void displayCourse(){
        System.out.println("coursename:"+courseName);
        System.out.println("duration:"+duration);
        System.out.println("fee:"+fee);
        System.out.println();
    }
}
public class Task30 {
    public static void main(String[] args) {
        Course c1=new Course("java",5 , 1500);
        Course c2=new Course("c",67, 8000);
        c1.displayCourse();
        c2.displayCourse();
    }
    
}
