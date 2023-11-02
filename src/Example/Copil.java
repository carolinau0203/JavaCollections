package Example;

class Copil {
    protected String nume = "Carolina";
    protected int varsta = 26;

    public void numevarsta() {
        System.out.println("Numele, prenumele si varsta");
    }

    static class Parinte extends Copil {
        private final String prenume = "Udrea";

        public static void main(String[] args) {
            Parinte c = new Parinte();
            c.numevarsta();
            System.out.println(c.nume + " " + c.prenume + " " + " " + c.varsta);
        }
    }
}