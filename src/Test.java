class A{
    public String name = "父类name";
    public void move(){
        System.out.println("父类move");
    }
}
class B extends A{
    public String name = "子类name";
    @Override
    public void move() {
        // TODO Auto-generated method stub
        System.out.println("子类move");
    }
}
public class Test {
    public static void main(String[] args) {
        A a = new B();
        a.move();
    }
}
