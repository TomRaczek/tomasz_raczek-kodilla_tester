public class SimpleArray {
    public static void main(String[] args) {

        String[] spices = new String[5];
        spices[0] = "Salt";
        spices[1] = "Pepper";
        spices[2] = "Paprika";
        spices[3] = "Nutmeg";
        spices[4] = "Cinnamon";

        int numberOfSpices = spices.length;

        System.out.println("I've got " + numberOfSpices + " spices in my kitchen");
        System.out.print("My favorite spice is ");
        System.out.print(spices[3]);
    }
}