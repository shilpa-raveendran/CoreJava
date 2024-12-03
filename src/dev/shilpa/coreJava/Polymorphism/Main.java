package dev.shilpa.coreJava.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Storing a Child object in a Parent reference
        Parent parentRef = new Child();

        // Accessing the overridden method
        parentRef.display();
        // Trying to call a child-specific method using parent reference
        // parentRef.childSpecificMethod(); // Error: childSpecificMethod() is not in Parent.

        // To access child-specific methods, cast the reference back to Child
        if(parentRef instanceof Child){
            Child childRef= (Child) parentRef;
            childRef.childSpecificMethod();
        }
    }
}
