package Example;

public class Constructor {

    public static void main(String[] args) {
        Constructor c = new Constructor("caro", "udrea");
        Constructor c1 = new Constructor(26, "udrea");
        Constructor c2 = new Constructor("caro", "udrea");
    }

    public Constructor(String nume, String prenume)
    {
        System.out.println(nume+ " " +prenume);
    }
    public Constructor (int varsta, String prenume)
    {
        System.out.println(varsta+ " "+prenume);
    }
}
