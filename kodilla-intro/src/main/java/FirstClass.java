public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(-566, 1000, 2019);
        System.out.println("This notebook right here weighs " + notebook.weight + " grams and costs " + notebook.price + " bucks. It was made in " + notebook.year + ".");
        notebook.checkPrice();
        notebook.checkYear();
        notebook.checkWeight();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2021);
        System.out.println("This notebook right here weighs " + heavyNotebook.weight + " grams and costs " + heavyNotebook.price + " bucks. It was made in " + heavyNotebook.year + ".");
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook(1600, 500, 1980);
        System.out.println("This notebook right here weighs " + oldNotebook.weight + " grams and costs " + oldNotebook.price + " bucks. It was made in " + oldNotebook.year + ".");
        oldNotebook.checkPrice();
        oldNotebook.checkYear();
        oldNotebook.checkWeight();

    }
}