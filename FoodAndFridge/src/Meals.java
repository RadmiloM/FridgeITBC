import java.util.ArrayList;
import java.util.List;

// Create class Meals
public class Meals{
    private List<Meal> meals;
    private List<Nutriment>nutriments;
    // Create constructor meals
    public Meals() {
        this.meals = new ArrayList<>();
        this.nutriments = new ArrayList<>();
    }

    // Get list of meals
    public List<Meal> getMeals() {
        return meals;
    }
    // Add meal if meal does not already exist in meals.
    public void add(Meal m){
        if(!meals.contains(m)){
            meals.add(m);
        }else{
            System.out.println("That meal " + m.getName() + " already exist,try again!");
        }
    }
    // Remove meal if meals contains meal
    public void remove(Meal m){
        if(meals.contains(m)){
            meals.remove(m);
        }
    }
    //Return all meals which start with s.
    public List<Meal> search(String s){
        List<Meal> result = new ArrayList<>();
        for(Meal m : meals){
            if(m.getName().startsWith(s)){
                result.add(m);
            }
        }
        return result;

    }
    // Return all the meals which we can make from given nutriments.
    public List<Meal> search(){
        List<Meal> array = new ArrayList<>();
        for(Meal m : meals){
            for(Nutriment n : nutriments){
                if(m.getName().contains(n.totalNutrientTable())){
                    array.add(m);
                }

            }
        }
        return array;
    }
    // Return all meals which are less from given calories.
    public List<Meal> search(Double kcal){
        if(kcal == null || kcal <=0){
            System.out.println("You did not enter valid calories");
            System.exit(1);
        }
        List<Meal> result = new ArrayList<>();
        for(Meal m : meals){
            if(m.getKcal() < kcal){
                result.add(m);
            }
        }
        return result;
    }

    // Print the values
    @Override
    public String toString() {
        String result = "";
        for(Meal m : meals){
            result += m.getId() + " " + "|" + " " + "Name: " + m.getName() + "\n";
        }
        return result;
    }
}
