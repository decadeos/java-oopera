package people;

import java.util.Objects;

public class Actor extends Person {
    public int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(name, otherActor.getName()) &&
                Objects.equals(surname, otherActor.getSurname()) &&
                (height == otherActor.getHeight());
    }

    @Override
    public String toString() {
        return "Актер: " +
                " " + name  +
                " " + surname +
                " (" + height +
                ')';
    }
}
