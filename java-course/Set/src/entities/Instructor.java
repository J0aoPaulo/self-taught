package entities;

import java.util.Objects;

public class Instructor {

    private int numberStudents;

    public Instructor(int numberStudents) {
        this.numberStudents = numberStudents;
    }

    public int getNumberStudents() {
        return numberStudents;
    }

    public void setNumberStudents(int numberStudents) {
        this.numberStudents = numberStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Instructor that)) return false;
        return numberStudents == that.numberStudents;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberStudents);
    }
}