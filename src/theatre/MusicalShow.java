package theatre;

import people.Actor;
import people.Director;
import people.Person;

import java.util.ArrayList;

public class MusicalShow extends Show{

    public Person musicAuthor;
    public String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getTitle() {
        return title;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
