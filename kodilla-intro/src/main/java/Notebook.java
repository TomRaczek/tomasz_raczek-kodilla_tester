public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 900) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 900 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkYear() {
        if (this.year < 2016 && this.year >= 1981){
            System.out.println("This laptop is old");
        } else if (this.year >= 2016 && this.year <= 2019) {
            System.out.println("This notebook is not too old");
        } else if (this.year > 2019 && this.year <= 2022) {
            System.out.println("This notebook is new");
        } else {
            System.out.println("This notebook does not exist");
        }
    }
    public void checkWeight() {
        if (this.weight <= 1000 && this.weight > 0) {
            System.out.println("This notebook is light");
        } else if (this.weight > 1000 && this.weight <= 2000) {
            System.out.println("This notebook is not too heavy");
        } else if (this.weight > 2000) {
            System.out.println("This notebook is heavy");
        } else {
            System.out.println("This notebook somehow has negative weight. Weird.");
        }
    }
}