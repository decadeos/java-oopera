package theatre;

import people.Actor;
import people.Director;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Show {
    public String title;
    public int duration;
    public Director director;
    public HashMap<String, Actor> listOfActors;

    public Show(String title, int duration, Director director, HashMap<String, Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        System.out.println("Актёры в спектакле \"" + title + "\":");
        for (Actor actor : listOfActors.values()) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.containsKey(actor.getSurname())) {
            System.out.println("Актёр с фамилией " + actor.getSurname() + " уже добавлен.");
        } else {
            listOfActors.put(actor.getSurname(), actor);
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        if (listOfActors.containsKey(surnameToReplace)) {
            listOfActors.put(surnameToReplace, newActor);
            System.out.println("Актёр с фамилией " + surnameToReplace + " заменён.");
        } else {
            System.out.println("Актёр с фамилией " + surnameToReplace + " не найден.");
        }
    }


}
