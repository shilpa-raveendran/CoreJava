package dev.shilpa.coreJava.StringDemo;

public class StringDemo {

    public static void main(String[] args) {

        String s1= "Hello";
        concat1(s1);
        System.out.println("String s1: "+s1+" & hashcode: "+s1.hashCode());

//        String str= "Hello";
//        System.out.println("String str: "+str+" & hashcode: "+str.hashCode());

        //explicitly changing the s1 value
        s1= concat4(s1);
        System.out.println("String s1: "+s1+" & hashcode: "+s1.hashCode());

        StringBuffer s2= new StringBuffer("Hello");
        concat2(s2);
        System.out.println("StringBuffer s2: "+s2);

        StringBuilder s3= new StringBuilder("Hello");
        concat3(s3);
        System.out.println("StringBuilder s3: "+s3);

    }

    public static void concat1(String s1){
        s1+= "World";
    }

    public static String concat4(String s1){
        s1+= "World";
        return s1;
    }

    public static void concat2(StringBuffer s2){
        s2.append("World");
    }

    public static void concat3(StringBuilder s3){
        s3.append("World");
    }
}
