class dog{
    private String name;
    private String breed;

    public dog(String name, String breed){
        this.name = name;
        this.breed =  breed;
    }

    public String getName(){
        return this.name;
    }

    public String getBreed(){
        return this.breed;
    }
}
public class Ques2 {
    // Write a Java program to create a class called "Dog" with a name and breed attribute. 
    // Create two instances of the "Dog" class, set their attributes using the constructor and modify
    // the attributes using the setter methods and print the updated values.
    public static void main(String[] args) {
        dog d1 = new dog("Kiyo", "Labra");
        dog d2 = new dog("olive", "beagle");
        
        d1.getName();
        d1.getBreed();

        d2.getName();
        d2.getBreed();
    }
}
