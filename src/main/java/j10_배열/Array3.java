package j10_배열;

import java.util.Random;

public class Array3 {
    public static int foundMinNumber(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
    public static int foundMaxNumber1(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }return max;
        /*
        1. 두 배열에서 중복된 값 중 최소값
        2. 두 배열에서 중볻되지 않은 값 최대값
         */
}
    public static void main(String[] args) {

        /*
        randomArray 배을을 생성 [10개]
        10,2,4,5,3,7 예를들어
         */
        Random random = new Random();
        int total = 0;
        int[] randArray = new int[10];

        for (int i = 0; i < randArray.length; i++) {
            while (true) {
                int randomNumber = random.nextInt(10) + 1;
                boolean found = true;
                for (int j = 0; j < randArray.length; j++) {
                    if (randArray[j] == randomNumber) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    randArray[i] = randomNumber;
                    break;

                }
            }
        }
        System.out.println(foundMaxNumber1(randArray));
    }
}