package Master;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Student {
    private String nume;
    private List<String> luni;
    private Map<String, Integer> note;


    public Student(String nume) {
        this.nume = nume;
        this.luni = new ArrayList<>();
        this.note = new HashMap<>();
    }

    public String getNume() {
        return nume;
    }

    public List<String> getLuni() {
        return luni;
    }

    public int getNota(String luna) {
        return note.get(luna);
    }

    public void adaugaNota(String luna, int nota) {
        luni.add(luna);
        note.put(luna, nota);
    }
}