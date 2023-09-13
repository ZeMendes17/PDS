import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Director extends Monitor {
    private Course degreeName;
    private Map<Student, List<Double>> students = new HashMap<>();

    public Director (StudentAdm student, Course degree) {
        if(!student.getStudent().getCourse().equals(degree)){
            System.err.println("Error: Director's course must be the same as student's course");
            System.exit(0);
        }
        this.degreeName = degree;
        student.attachD(this);
    }

    public Course getCourseName() {
        return degreeName;
    }

    @Override
    public void update(Student s, double nota, String className){
        double media = 0;
        if(students.get(s) == null) {
            List<Double> temp = new ArrayList<>();
            temp.add(nota);
            students.put(s, temp);
            media = nota;
        } else{
            List<Double> temp = students.get(s);
            temp.add(nota);
            students.put(s, temp);
            int count = 0;
            for(double d : temp){
                media += d;
                count++;
            }
            media = media / count;
        }

        System.out.println(getCourseName() + " director reports that student " + s.getName() + " (" + s.getId() + ") has changed the overall grade: " + media);
    }
}
