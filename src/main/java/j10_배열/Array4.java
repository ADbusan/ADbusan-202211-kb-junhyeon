package j10_배열;

public class Array4 {
        /*
        1. 두 배열에서 중복된 값 중 최소값
        2. 두 배열에서 중볻되지 않은 값 최대값
         */
//     int min = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
        public static void main(String[] args) {
            int[] num1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] num2 = new int[]{6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
            for (int i = 0; i < num2.length; i++) {
                for (int j = 0; j < num1.length; j++) {
                    if (num1[i]==num2[j]){
                    }
                }
            }
        }
}
