import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Implement methods from Energy in Meal.
public class Meal implements Energy {
    private UUID id;
    private List<Nutriment> nutriments;
    private String name;
    // Create constructor;
    public Meal(String name) {
        id = UUID.randomUUID();
        this.name =name;
        this.nutriments = new ArrayList<>();

    }
    // Get access for nutriments;
    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    // Get access to meal name;
    public String getName() {
        return name;
    }
    // Get random id;
    public UUID getId() {
        return id;
    }

    // Get calories;
    @Override
    public double getKcal() {
        double result = 0;
        for(Nutriment n : nutriments){
            result += n.getKcal();
        }
        return result;
    }

    // Check if given Nutriment value already exist in nutriments,
    // if value does not exist add new value in nutriments collection,
    // if value exist increase the weight of that value.
    public void add(Nutriment n) {
        if (!nutriments.contains(n)) {
            nutriments.add(n);
        }else{
            System.out.println("Nutriment that you picked already exist,his new value is: ");
            System.out.println(n.getWeight() + 25);
        }
    }

    // If given Nutriment value exist in nutriments collection
    // remove that value from nutriments collection
    public void remove(Nutriment n) {
        if (nutriments.contains(n)) {
            nutriments.remove(n);
        }


    }

    // If given Nutriment value exists in nutriments collection
    // reduce the weight of that value with given value
    public void remove(Nutriment n, Double weight) {
        if(weight == null || weight <=0){
            System.out.println("Invalid input for weight");
            return;
        }
        if (nutriments.contains(n)) {
            System.out.println("You picked the nutriment which already exists you will get new with reduced weight");
            System.out.println(n.getWeight() - weight);
        }
    }
    // Get total number of nutriments in meal.
    public String totalNutrient(){
        String result = "";
        for(Nutriment n : nutriments){
            result+=n.totalNutrientTable();
        }
        return result;
    }
    // Check if two meal objects have same id
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        Meal m = (Meal)o;
        if(this.id.equals(m.getId())){
            return true;
        }else{
            return false;
        }

    }
}










