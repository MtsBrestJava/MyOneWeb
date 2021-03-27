package by.brest.mts.webapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HumanService {
    public List<Human> generateHumans() {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Leha", 15, 50));
        humans.add(new Human("Sasha", 25, 58));
        humans.add(new Human("Serega", 44, 47));
        humans.add(new Human("Ruslan", 35, 62));
        humans.add(new Human("Sasha", 37, 33));

        return humans;
    }
}
