package Day1_Coding.modifiersDemo;

public class DefaultExample {
    //only accessible to all the class within the same package

    void display(){
        System.out.println("This is a default method.");
    }
}

class AccessTest {
    public static void main(String[] args) {
        DefaultExample example = new DefaultExample();
        example.display(); // Accessible within the same package
    }
}
