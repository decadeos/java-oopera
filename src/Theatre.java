import people.Actor;
import people.Director;
import people.Gender;
import people.Person;
import theatre.Ballet;
import theatre.Opera;
import theatre.Show;

import java.util.HashMap;

public class Theatre {

    public static void main(String[] args) {

        Person vdovin = new Person("Игорь", "Игорь", Gender.MALE);
        Person mincus = new Person("Людвиг", "Минкус", Gender.MALE);
        Person petipa = new Person("Мариус", "Петипа", Gender.MALE);

        // пункт 1
        Actor polyanyan = new Actor("Алексей", "Полунян", Gender.MALE, 170);
        Actor akimova = new Actor("Наталья", "Акимова", Gender.FEMALE, 166);
        Actor serebryakov = new Actor("Алексей", "Серебряков", Gender.MALE, 184);

        Director balabanov = new Director("Алексей", "Балабанов", Gender.MALE, 14);
        Director litvinova = new Director("Рената", "Литвинова", Gender.FEMALE, 6);

        // пункт 2
        HashMap<String, Actor> actorsMapCargo = new HashMap<>();
        Show show = new Show("Груз 200", 89, balabanov, actorsMapCargo);

        HashMap<String, Actor> actorsMapWind = new HashMap<>();
        Opera opera = new Opera("Северный ветер", 123, litvinova, actorsMapWind, vdovin,
                "Северный ветер, он — как любовь. Не поймешь, откуда приходит. " +
                        "А когда он исчезает, ты остаешься один с этим ощущением. " +
                        "Ты не можешь его забыть.", 1);

        HashMap<String, Actor> actorsMapDon = new HashMap<>();
        Ballet ballet = new Ballet("Дон Кихот", 140,
                balabanov, actorsMapDon, mincus, "музыка", petipa);

        // пункт 3
        show.addActor(polyanyan);
        show.addActor(akimova);
        show.addActor(serebryakov);

        opera.addActor(akimova);
        opera.addActor(serebryakov);

        ballet.addActor(polyanyan);

        // пункт 4
        show.printActors();
        System.out.println("\n");
        opera.printActors();
        System.out.println("\n");
        ballet.printActors();

        // пункт 5
        System.out.println("\n");
        ballet.replaceActor(serebryakov, "Полунян");
        ballet.printActors();

        // пункт 6
        System.out.println("\n");
        ballet.replaceActor(serebryakov, "Полундра");
        ballet.printActors();

        // пункт 7
        System.out.println("\n");
        System.out.println(opera.getLibrettoText());
        System.out.println("\n");
        System.out.println(ballet.getLibrettoText());
    }
}
