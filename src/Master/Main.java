package Master;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Obține data curentă
        LocalDate dataCurenta = LocalDate.now();

        // Creați o listă de nume de studenți
        List<String> numeStudenti = new ArrayList<>();
        numeStudenti.add("Ana");
        numeStudenti.add("Mihai");
        numeStudenti.add("Ioana");
        numeStudenti.add("Alex");
        numeStudenti.add("Elena");
        numeStudenti.add("Andrei");
        numeStudenti.add("Maria");
        numeStudenti.add("Gabriel");
        numeStudenti.add("Laura");
        numeStudenti.add("Cristian");

        // Amestecați lista de nume pentru a le atribui aleator studenților
        Collections.shuffle(numeStudenti, new Random());

        // Creați o listă pentru stocarea rezultatelor studenților
        List<Student> studenti = new ArrayList<>();

        // Atribuiți note pentru fiecare lună
        for (int i = 0; i < 12; i++) {
            for (String nume : numeStudenti) {
                int nota = new Random().nextInt(11); // Generați o notă între 0 și 10
                Student student = gasesteStudent(studenti, nume);
                if (student == null) {
                    student = new Student(nume);
                    studenti.add(student);
                }
                student.adaugaNota(dataCurenta.getMonth().toString(), nota);
            }
            dataCurenta = dataCurenta.minusMonths(1); // Mergem cu o lună înapoi
        }

        // Afișați rezultatele pentru fiecare student
        for (Student student : studenti) {
            System.out.println("Nume student: " + student.getNume());
            System.out.println("Note:");
            for (String luna : student.getLuni()) {
                System.out.println(luna + ": " + student.getNota(luna));
            }
            System.out.println();
        }
    }

    public static Student gasesteStudent(List<Student> studenti, String nume) {
        for (Student student : studenti) {
            if (student.getNume().equals(nume)) {
                return student;
            }
        }
        return null;
    }
}