package theatre;

import people.Actor;
import people.Director;
import people.Person;

import java.util.HashMap;

public class Ballet extends MusicalShow {
    public Person choreographer;

    public Ballet(String title, int duration, Director director,  HashMap<String, Actor> listOfActors,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}

