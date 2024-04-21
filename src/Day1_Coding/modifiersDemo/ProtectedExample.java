package Day1_Coding.modifiersDemo;
//Accessible within the class and to its subclass even in different package
public class ProtectedExample {
    protected void display() {
        System.out.println("This is a protected method.");
    }
}
class SubClass extends ProtectedExample{
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display(); // Accessible
    }
}
