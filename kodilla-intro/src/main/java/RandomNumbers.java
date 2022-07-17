import java.util.Random;

public class RandomNumbers {

    private int lowestNumber = 0;
    private int highestNumber = 0;

    public void randomizedNubmer() {
        Random random = new Random();
        int sum = 0;
        int max = 5000;
        while (sum < max) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            if (temp > this.highestNumber){
                this.highestNumber = temp;
            }
            if (temp < this.lowestNumber) {
                this.lowestNumber = temp;
            }
        }
    }
    public int getLowestNumber() {
        return this.lowestNumber;
        }
        public int getHighestNumber() {
        return this.highestNumber;
        }
}