public class Director {
    private Course degreeName;

    public Director (StudentAdm student, Course degree) {
        this.degreeName = degree;
        // ...
    }

    public Course getCourseName() {
        return degreeName;
    }

}
