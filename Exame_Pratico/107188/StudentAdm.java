import java.util.ArrayList;
import java.util.List;

public class StudentAdm {
    private List<Director> directors = new ArrayList<>();
    private List<Professor> tempProfessors = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();

    private Student student;

    public StudentAdm(Student studnt) {
        this.student = studnt;
    }

    public void addScore(String className, double score) {
        student.addScore(className, (Double) score);
        // sempre que é feito um addScore tem de se notificar o professor e o director
        for(Professor p : tempProfessors)
            if(p.getClassName().equals(className))
                professors.add(p);
        notifyAllMonitors(score, className);
    }
    public Student getStudent() {
        return student;
    }

    public void attachD(Director d) {
        directors.add(d);
    }

    public void attachP(Professor p) {
        tempProfessors.add(p);
    }

    private void notifyAllMonitors(double score, String className) {
        for (Director d : directors) {
            d.update(getStudent(), score, className);
        }

        for(Professor p : professors) {
            p.update(getStudent(), score, className);
        }
    }
}








