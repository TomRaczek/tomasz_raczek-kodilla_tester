public class Grades {
    private int[] grades;
    private int pointer;

    public Grades() {
        this.grades = new int[10];
        this.pointer = 0;

    }

    public void add(int value) {
        if (this.pointer == 10) {
            return;
        }
        this.grades[this.pointer] = value;
        this.pointer++;
    }

    public int lastGrade() {
        if (this.pointer > 0) {
            return this.grades[this.pointer - 1];
        } else {
            return 0;
        }
    }

    public double averageGrade() {
        int result = 0;
        double average;
        for (int i = 0; i < this.pointer; i++) {
            result = result + this.grades[i];
        }
        if (this.pointer <= 0) {
            return 0;
        } else {
            average = result / this.pointer;
            return average;
        }
    }
}