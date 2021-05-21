package by.brest.mts.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HumanService {

    List<Human> humans;

    public HumanService() {
        this.humans = new ArrayList<>();
        humans.add(new Human("Leha", 15, 50));
        humans.add(new Human("Sasha", 25, 58));
        humans.add(new Human("Serega", 44, 47));
        humans.add(new Human("Ruslan", 35, 62));
        humans.add(new Human("Sasha", 37, 33));
        System.out.println("Humans has been generated");
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void addHuman(Human newHuman) {
        System.out.println("Human added to service: " + newHuman.toString());
        humans.add(newHuman);
        // restTemplate.postFor......
    }
}
