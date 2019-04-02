package lab3;

import java.util.Random;

public class U0901Main {
    public static void main(String[] args) {

        Integer[] intArr = {10, 20, 15};
        Float[] floatArr = new Float[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++)
            floatArr[i] = random.nextFloat();

        U0901WorkArray insWorkArrayIn = new U0901WorkArray(intArr);
        System.out.println(insWorkArrayIn.sum());
    }
}
