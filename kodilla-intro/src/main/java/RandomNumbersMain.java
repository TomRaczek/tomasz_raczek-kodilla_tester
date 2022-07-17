public class RandomNumbersMain {
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.randomizedNubmer();
        System.out.println(randomNumbers.getLowestNumber());
        System.out.println(randomNumbers.getHighestNumber());
    }
}