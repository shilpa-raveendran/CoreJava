package Day1_Coding.modifiersDemo;

public class PublicExample {
    public static void main(String[] args) {
        PublicExample example = new PublicExample();
        example.display(); // Accessible
    }

    public void display() {
        System.out.println("This is a public method.");
    }
}
