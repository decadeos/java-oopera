package theatre;

import people.Actor;
import people.Director;
import people.Person;

import java.util.ArrayList;
import java.util.HashMap;

public class Opera extends MusicalShow {

    public int choirSize;

    public Opera(String title, int duration, Director director, HashMap<String, Actor> listOfActors,
                 Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
