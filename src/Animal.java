public class Animal {
    String animalKind;
    int numberOfAnimal;

    public Animal(String animalKind, int numberOfAnimal) {
        this.animalKind = animalKind;
        this.numberOfAnimal = numberOfAnimal;
    }
    public String toString(){
        return "Kind : "+ animalKind+ "\t\t\tNumber of the animal : "+ numberOfAnimal+"\n";
    }


}
