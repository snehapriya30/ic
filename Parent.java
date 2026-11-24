public class Parent {
    void name(){
        System.out.println("pp");

    }
    
}
class Child extends Parent{

}
class Parent1{
    public static void main(String[] args) {
        Child ch=new Child();
        ch.name();

    }
}
