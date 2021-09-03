import java.util.ArrayList;
import java.util.List;

// Create class Fridge
public class Fridge {
    private List<Nutriment> nutriments;

    // Create constructor
    public Fridge() {
        this.nutriments = new ArrayList<>();
    }
    // Increase value of nutriment if value
    // already exists in nutriments.
    public void addNutriment(Nutriment n){
        if(!nutriments.contains(n)){
            nutriments.add(n);
        }else{
            System.out.println("The value that you picked already exist, new value for (weight) is: " + " " );
            System.out.println(n.getWeight() + 10);
        }
    }
    public void remove(Nutriment n){
        if(nutriments.contains(n)){
            nutriments.remove(n);
        }
    }
    // If given Nutriment n value exists in nutriments
    // collection reduce the value with given value.
    public void remove(Nutriment n ,Double weight){
        if(weight == null || weight <=0){
            System.out.println("You did not enter valid weight");
            return;
        }
        if(nutriments.contains(n)){
            System.out.println("The value that you picked already exists new value for (weight) is: " );
            System.out.println(n.getWeight() - weight);
        }
    }
    //Get nutriments;
    public List<Nutriment> getNutriments() {
        return nutriments;
    }


}
