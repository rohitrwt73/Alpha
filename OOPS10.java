public class OOPS10 {
    //method overriding (run time ) polymorphism
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eats anything.");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass.");
    }
}
