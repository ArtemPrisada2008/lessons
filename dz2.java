package lesson1;

import java.util.Random;

public class dz2 {
    public static void main(String[] args) {
        Random random = new Random();

        int random_number = random.nextInt(20) -20;
        System.out.println(random_number);
    }
}