public class Professor extends Monitor {
    private String className;
    private String name;
    private double previousGrade = 0;;

    public Professor(StudentAdm adm, String name, String className) {
        this.name = name;
        this.className = className;
        adm.attachP(this);
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public void update(Student s, double nota, String className) {

        if(className.equals(getClassName())){
            previousGrade = nota;
            System.out.println("Professor " + getName() + " of " + getClassName() + " class evaluated student " + s.getName() + " (" + s.getId() + ") with score: " + nota);
        }
        else
            System.out.println("Professor " + getName() + " of " + getClassName() + " class evaluated student " + s.getName() + " (" + s.getId() + ") with score: " + previousGrade);
    }

}
