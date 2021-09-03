import java.util.UUID;
// Create abstract class Grocery which implements Energy interface
public abstract class Grocery implements Energy{
    // Grocery company name
    private String company;
    // Grocery store name
    private String name;

    // Check for valid inputs
    public Grocery(String company, String name) {
        if(company  == null || company.length() < 3){
            company = "AAA";
            System.out.println("You did not enter valid value for (company) , new value is (AAA)");
        }else{
            this.company = company;
        }
        if(name == null || name.length() < 3){
            name = "BBB";
            System.out.println("You did not enter valid value for (name), new value is (BBB) ");
        }else{
            this.name = name;
        }
    }
    // Get access to company
    public String getCompany() {
        return company;
    }
    // Get access to store
    public String getName() {
        return name;
    }
    // Create abstract method for random id generator
    public abstract UUID getId();

    // Create abstract method for checking equality.
    // Check if the company name and store name are equal(if they have same value,not the same address).
    public abstract boolean equals(Object o);
}
