package by.brest.mts.webapp;

import org.springframework.stereotype.Component;

@Component
public class Human {

    Integer id;

    String name;
    int age;
    float weight;

    {
        this.weight = 1;
    }

    public Human() {
    }

    public Human(String name) {
        this.name = name;
        this.age = 1;
    }

    public Human(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void runn() {
        System.out.println("I'am running");
    }

    void riseAge() {
        age++;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    // Getters and Setters for correct JSON serialization (for RestController return as OBJECT type)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

