package theatre;

import people.Actor;
import people.Director;
import people.Person;

import java.util.ArrayList;
import java.util.HashMap;

public class MusicalShow extends Show{

    public Person musicAuthor;
    public String librettoText;

    public MusicalShow(String title, int duration, Director director, HashMap<String, Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getTitle() {
        return title;
    }

    public String getLibrettoText() {
        String str = "Текст либеретто в постановке " + getTitle() + ":\n";
        return str + librettoText;
    }
}
