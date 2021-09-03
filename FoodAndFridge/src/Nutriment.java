public abstract class Nutriment extends Grocery {
    // Create nutriments
    private Double weight;
    private Double kcal;
    private Double proteins;
    private Double carbohydrates;
    private Double fats;
    private Double fiber;

    // Check for valid inputs - company & name are from extended Grocery class
    public Nutriment(String company, String name, Double weight, Double kcal, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        super(company, name);
        if(weight == null || weight <= 0){
            this.weight = 12.0;
            System.out.println("You did not enter valid value for (weight), you have new value (12.0)");
        }else{
            this.weight = weight;
        }
        if(kcal == null || kcal <= 0){
            this.kcal = 18.0;
            System.out.println("You did not enter valid value for (kcal), new value is (18.0) ");
        }else{
            this.kcal = kcal;
        }
        if(proteins == null || proteins <= 0){
            this.proteins = 22.4;
            System.out.println("You did not enter valid value for (proteins), new value is (22.4) ");
        }else{
            this.proteins = proteins;
        }
        if(carbohydrates == null || carbohydrates <= 0){
            this.carbohydrates = 21.8;
            System.out.println("You did not enter valid value for(Carbohydrates), new value is (21.8)");
        }else{
            this.carbohydrates = carbohydrates;
        }
        if(fats == null || fats <= 0 ){
            this.fats = 30.5;
            System.out.println("You did not enter valid value for (fats), new value is (30.5)");
        }else{
            this.fats = fats;
        }
        if(fiber == null || fiber <= 0){
            this.fiber = 16.8;
                System.out.println("You did not enter valid value for (fiber), new value is (16.8)");
        }else{
            this.fiber = fiber;
        }

    }
    // Check for valid inputs
    public void update(Double weight, Double kcal,Double proteins,
                       Double carbohydrates,Double fats,Double fiber){
        if(weight == null || weight <= 0){
            System.out.println("Invalid input for (weight),new value is old value" + " " + this.weight);
            return;
        }
        this.weight = weight;

        if(kcal == null || kcal <= 0){
            System.out.println("Invalid input for (kcal), new value is old value" + " "  + this.kcal);
            return;
        }
        this.kcal = kcal;


        if(proteins == null || proteins <= 0){
            System.out.println("Invalid input for (proteins), new value is old value" + " " + this.proteins);
            return;
        }
        this.proteins = proteins;


        if(carbohydrates == null || carbohydrates <= 0){
            System.out.println("Invalid input for (carbohydrates), new value is old value" + " " + this.carbohydrates);
            return;
        }
        this.carbohydrates = carbohydrates;


        if(fats == null || fats <= 0){
            System.out.println("Invalid input for (fats), new value is old value" + " " + this.fats);
            return;
        }
        this.fats = fats;


        if(fiber == null || fiber <= 0){
            System.out.println("Invalid input for (fiber), new value is old value" + " " + this.fiber);
            return;
        }
        this.fiber = fiber;


    }
    // Get access to weight;
    public Double getWeight() {
        return weight;
    }

    // Override method from interface Energy
    @Override
    public double getKcal() {
        return kcal;
    }


    // Get access to Proteins
    public Double getProteins() {
        return proteins;
    }

    // Get access to Carbohydrates
    public Double getCarbohydrates() {
        return carbohydrates;
    }


    // Get access to Fats
    public Double getFats() {
        return fats;
    }

    // Get access to Fiber
    public Double getFiber() {
        return fiber;
    }
    // Get total amount of proteins
    public Double getTotalProteins(){
        return proteins * 4;
    }

    // Create string method to print values.
    @Override
    public String toString() {
        String result = "";
        result += "Company: " + getCompany() + "\n"
                + "Name: " + getName() + "\n"
                + "Weight: " + getWeight() +"g" + "\n"
                + "Kcal: " + getKcal() + "\n"
                + "Proteins: " + getProteins() +"%" + "\n"
                + "Carbohydrates: " + getCarbohydrates() +"%" + "\n"
                + "Fats: " + getFats() + "%" + "\n"
                + "Fiber: " + getFiber() + "%" + "\n";
        return result;

    }
    // create abstract method for nutriments table.
    public abstract  String totalNutrientTable();
}
