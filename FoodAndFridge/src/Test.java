import java.util.UUID;

// Class for testing project
public class Test {
    public static void main(String[] args) {


        Fridge fridge = new Fridge();
        fridge.addNutriment(new Nutriment("Maxi","Eggs with bacon",22.4,15.6,17.8
        ,28.4,12.6,22.8) {
            @Override
            public String totalNutrientTable() {
                String result = "";
                result+= "Weight: " + getWeight() + "g" + " " + "-" + " " + "Proteins: " + getProteins() + "g" + "\n"
                        + "Weight: " + getWeight() + "g" + " " +  "-" + " " + "Carbohydrates: " + getCarbohydrates()  +" g" + "\n"
                        + "Weight: " + getWeight() + "g" + " " + "-" + " " + "Fats: " + getFats() + "g" + "\n"
                        + "Weight: " + getWeight() + "g" + " " + "-" + " " + "Fiber: " +  getFiber() + "g" + "\n";
                return result;

            }

            @Override
            public UUID getId() {
                UUID id = UUID.randomUUID();
                return id;
            }

            @Override
            public boolean equals(Object o) {
                if(this == o){
                    return true;
                }
                if(o == null || this.getClass() != o.getClass()){
                    return false;
                }

                Nutriment nut= (Nutriment) o;
                if(this.getCompany().equals(nut.getCompany()) && this.getName().equals(nut.getName())){
                    return true;
                }else{
                    return false;
                }
            }
        });

        Nutriment nutriment = new Nutriment("Shop&Go","Fish sticks",21.4,22.5,15.8
        ,17.6,18.4,22.8) {
            @Override
            public String totalNutrientTable() {
                String result = "";
                result += "Weight: " + getWeight() + "g" + " " + "-" + " " + "Proteins: " + getProteins() + "g" + "\n"
                        + "Weight: " + getWeight() + "g" + " " + "-" + " " + "Carbohydrates: " + getCarbohydrates() + " g" + "\n"
                        + "Weight: " + getWeight() + "g" + " " + "-" + " " + "Fats: " + getFats() + "g" + "\n"
                        + "Weight: " + getWeight() + "g" + " " + "-" + " " + "Fiber: " + getFiber() + "g" + "\n";
                return result;
            }

            @Override
            public UUID getId() {
                UUID id = UUID.randomUUID();
                return id;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || this.getClass() != o.getClass()) {
                    return false;
                }

                Nutriment n = (Nutriment) o;
                if (this.getCompany().equals(n.getCompany()) && this.getName().equals(n.getName())) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        Nutriment newNutriment = new Nutriment("Idea","Hamburger",12.4,33.5,12.6
        ,18.4,77.6,12.4) {
            @Override
            public String totalNutrientTable() {
                String result = "";
                result+= "Weight: " + getWeight() + "g" + " " + "-" + " " + "Proteins: " + getProteins() + "g" + "\n"
                        + "Weight: " + getWeight() + "g" + " " +  "-" + " " + "Carbohydrates: " + getCarbohydrates()  +" g" + "\n"
                        + "Weight: " + getWeight() + "g" + " " + "-" + " " + "Fats: " + getFats() + "g" + "\n"
                        + "Weight: " + getWeight() + "g" + " " + "-" + " " + "Fiber: " +  getFiber() + "g" + "\n";
                return result;
            }

            @Override
            public UUID getId() {
                UUID id = UUID.randomUUID();
                return id;
            }

            @Override
            public boolean equals(Object o) {
                if(this == o){
                    return true;
                }
                if(o == null || this.getClass() != o.getClass()){
                    return false;
                }

                Nutriment nutriments = (Nutriment) o;
                if(this.getCompany().equals(nutriments.getCompany()) && this.getName().equals(nutriments.getName())){
                    return true;
                }else{
                    return false;
                }
            }

            };
        fridge.addNutriment(nutriment);
        fridge.addNutriment(newNutriment);

        Meal m = new Meal("Tuna fish");
        Meal f = new Meal("Pizza with flavours");
        Meal s = new Meal("Spinach salat");
        Meal t = new Meal("Soup with potato");
        m.add(nutriment);
        m.add(newNutriment);

        Meals meals = new Meals();
        meals.add(m);
        meals.add(f);
        meals.add(f);
        meals.add(s);
        meals.add(t);
        System.out.println(meals);
        System.out.println(m.totalNutrient());



        }



      



}
