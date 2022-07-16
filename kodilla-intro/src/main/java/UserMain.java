public class UserMain {
    public static void main(String[] args) {

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        int sumOfAges = 0;
        for (int i = 0; i < users.length; i++) {
            sumOfAges = sumOfAges + users[i].age;
        }
        int result = sumOfAges / users.length;

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < result) {
                System.out.println( users[i].name);
            }
        }
    }
}