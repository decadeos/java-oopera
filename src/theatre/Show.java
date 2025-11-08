package theatre;

import people.Actor;
import people.Director;

import java.util.ArrayList;

public class Show {
    public String title;
    public int duration;
    public Director director;
    public ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        System.out.println("Актёры в спектакле \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor actor) {
        boolean isExist = false;
        for (Actor a : listOfActors) {
            if (a.getName().equals(actor.getName()) &&
                    a.getSurname().equals(actor.getSurname()) &&
                    a.getHeight() == actor.getHeight()) {
                isExist = true;
                break;
            }
        }

        if (isExist) {
            System.out.println("Актёр " + actor.getName() + " " + actor.getSurname() + " уже добавлен");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surnameToReplace) {
        boolean isReplace = false;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр с фамилией " + surnameToReplace + " заменён на " + newActor.getSurname());
                isReplace = true;
                break;
            }
        }

        if (!isReplace) {
            System.out.println("Актёр с фамилией " + surnameToReplace + " не найден");
        }
    }

    public void printDirector() {
        System.out.println("Режиссёр спектакля \"" + title + "\":");
        System.out.println(director.toString());
    }

}
