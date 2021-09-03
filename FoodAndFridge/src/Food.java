import java.util.UUID;

// Food extends Nutriment
public class Food extends  Nutriment{
    public Food(String company, String name, Double weight, Double kcal, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        super(company, name, weight, kcal, proteins, carbohydrates, fats, fiber);
    }



    // Create random id;
    @Override
    public UUID getId() {
        UUID id = UUID.randomUUID();
        return id;
    }
    // Check if company and the store name are the same(same value);
    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }

        Food compare = (Food) o;
        if(this.getCompany().equals(compare.getCompany()) && this.getName().equals(compare.getName())){
            return true;
        }else{
            return false;
        }
    }
    // Print Nutriments differently.
    @Override
    public String totalNutrientTable() {
        String result = "";
        result+= "Weight: " + getWeight() + "g" + " " + "-" + " " + "Proteins: " + getProteins() + "g" + "\n"
                + "Weight: " + getWeight() + "g" + " " +  "-" + " " + "Carbohydrates: " + getCarbohydrates()  +" g" + "\n"
                + "Weight: " + getWeight() + "g" + " " + "-" + " " + "Fats: " + getFats() + "g" + "\n"
                + "Weight: " + getWeight() + "g" + " " + "-" + " " + "Fiber: " +  getFiber() + "g" + "\n";
        return result;

    }
}
