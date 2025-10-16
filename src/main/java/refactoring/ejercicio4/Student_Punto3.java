package refactoring.ejercicio4;

import java.util.Vector;
import java.util.Iterator;

class Student_Punto3 {

    // Clase que un alumno toma
    class ClassTaken {
        String name;
        Boolean done;
        int grade;

        public ClassTaken(String aName) {
            name = aName;
            done = false;
            grade = 0;
        }
    }

    String name;
    private Vector<ClassTaken> classes; // Plan de estudio
    String id;

    public Student_Punto3(String newName, String ident) {
        name = newName;
        id = ident;
        classes = new Vector<ClassTaken>();
    }

    // Agrega una clase
    void addClass(String name) {
        classes.add(new ClassTaken(name));
    }

    // Agrega una clase con "done" true
    void addDoneClass(String name) {
        ClassTaken aClass = new ClassTaken(name);
        aClass.done = true;
        classes.add(aClass);
    }

    // Agrega una clase con "done" true y la nota "grade" con un valor por parametro
    void addGradedClass(String name, int grade) {
        ClassTaken aClass = new ClassTaken(name);
        aClass.done = true;
        aClass.grade = grade;
        classes.add(aClass);
    }

    // Devuelve el promedio de materias aprobadas (nota ≥ 6) sobre las materias cursadas
    float goodGradesOverTaken() {
        int finals = 0;
        int done = 0;
        ClassTaken taken;
        Iterator it = classes.iterator();
        while(it.hasNext()){
            taken = (ClassTaken) it.next();
            if (taken.done)
                done++;
            if (taken.grade >= 6)
                finals++;
        }
        return (float) finals / done ;
    }

    // Devuelve true si el estudiante aprobó más de la mitad de las materias cursadas (nota ≥ 4) y
    // tiene más del 66 % de finales aprobados.
    boolean fitForScolarship() {
        int tally = 0;
        Iterator it = classes.iterator();
        ClassTaken taken;
        while (it.hasNext()) {
            taken = (ClassTaken) it.next();
            if (taken.grade >= 4)
                tally++;
        }
        return ((float) tally / classes.size() >= finalsRatio()) &&
                (this.goodGradesOverTaken() > fitRatio());
    }

    float fitRatio() {
        return 2/3;
    }
    float finalsRatio() {
        return 1/2;
    }
}