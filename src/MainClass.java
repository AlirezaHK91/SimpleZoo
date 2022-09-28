import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        forEach(animalList());
    }
    public static List<Animal> animalList(){
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Tiger", 5));
        animals.add(new Animal("Giraff", 10));
        animals.add(new Animal("Häst", 15));
        animals.add(new Animal("Kanin", 20));
        animals.add(new Animal("Kamel", 8));
        animals.add(new Animal("Apa", 35));
        return animals;
    }
    public static void forEach(List<Animal> animals){
        for (Animal items :animalList()){
            System.out.println(items);
        }
    }
}
