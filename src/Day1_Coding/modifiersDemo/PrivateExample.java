package Day1_Coding.modifiersDemo;
//accessible only to created class
public class PrivateExample {

    private void display() {
        System.out.println("This is a private method.");
    }

    public static void main(String[] args) {
        PrivateExample example = new PrivateExample();
        example.display(); // Accessible within the same class
    }
}
