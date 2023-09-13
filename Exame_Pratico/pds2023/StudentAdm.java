public class StudentAdm {
    private Student student;

    public StudentAdm(Student studnt) {
        this.student = studnt;
    }

    public void addScore(String className, double score) {
        student.addScore(className, (Double) score);
        // ...
    }
    public Student getStudent() {
        return student;
    }
    
}








