import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(permision(17, 10));
        System.out.println(permision(generateRandomAge(), 7));
        System.out.println(permision(25, 7));
        System.out.println(permision(20, 38));
        System.out.println(permision(generateRandomAge(), 7));
        System.out.println(permision(44, -20));
    }
    public static String permision(int age, int temperature){
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "можно идти гулять ";
        } else if (age > 20 && temperature < 0 && temperature > 28) {
            return "можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }
    public static int generateRandomAge() {
        Random random = new Random();
        int number = random.nextInt(70)+1;
        return number;
    }
}