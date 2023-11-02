package Example;

public class GetSET {
    public static void main (String[] args) {
        GetSET v = new GetSET();
        v.setNume ("Carolina");
        System.out.println(v.getNume ());
        GetSET c = new GetSET();
        c.setVarsta (26);
        System.out.println(c.getVarsta());
    }
    private String nume;
    public void setNume (String nume) {
        this.nume = nume;
    }
    public String getNume ()
    {
        return nume;
    }

    private int varsta;

    public void setVarsta (int varsta) {
        this.varsta = varsta;
    }
    public int getVarsta () {
        return varsta;
    }

}
