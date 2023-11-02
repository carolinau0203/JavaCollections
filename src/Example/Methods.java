package Example;

public class Methods {
    public static void main(String[] args) {
        Methods numeprenume = new Methods();
        numeprenume.myMethod("Carolina", "Udrea", 26);

    }

    public void myMethod(String fname, String lname) {
        System.out.println("My name is " + fname + " " + lname);
    }

    public void myMethod(String fname, String lname, int age) {
        System.out.println("My name is " + fname + " " + lname + " and I'm"+ " " + age + " years old");


    }
}