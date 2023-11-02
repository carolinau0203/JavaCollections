package Example;

class Student {
    public void nota () {
        System.out.println("Notele studentului");
    }
static class Romana extends Student {
        public void nota () {
            System.out.println("Studentul va primi nota 8");
        }
static class Engleza extends Student {
            public void nota () {
                System.out.println("Studentul va primi nota 10 la engleza");
            }
public static class Polimorfism {
    public static void main(String[] args) {
        Student myStudent = new Student();
        Student myRomana = new Romana();
        Student myEnglish = new Engleza();

        myStudent.nota();
        myRomana.nota();
        myEnglish.nota();
    }

}
}
}
}