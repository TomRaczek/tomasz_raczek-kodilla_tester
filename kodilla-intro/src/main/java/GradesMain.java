public class GradesMain {
    public static void main(String[] args) {
        Grades Grzesiu = new Grades();
        Grzesiu.add(2);
        Grzesiu.add(5);
        Grzesiu.add(1);
        Grzesiu.add(2);
        Grzesiu.add(1);
        Grzesiu.add(2);
        Grzesiu.add(2);
        Grzesiu.add(3);
        Grzesiu.add(5);
        Grzesiu.add(5);
        Grzesiu.add(5);
        Grzesiu.add(1);
        Grzesiu.add(1);
        Grzesiu.add(1);
        Grzesiu.add(1);
        System.out.println(Grzesiu.lastGrade());
        System.out.println(Grzesiu.averageGrade());
    }
}