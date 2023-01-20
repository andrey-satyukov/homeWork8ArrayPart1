public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){
        int [] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = i + 1;
        }
        double [] numbers1 = {1.57, 7.654, 9.986};
        int[] myArray = {2, 5, 3, 7};
        System.out.println("Task 2");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.printf("%d, ", numbers[i]);
            }
            else {
                System.out.println(numbers[i]);
            }
        }
        for (int i = 0; i < numbers1.length; i++) {
            if (i < numbers1.length - 1) {
                System.out.printf("%.2f, ", numbers1[i]);
            } else {
                System.out.printf("%.2f\n",numbers1[i]);
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (i < myArray.length - 1) {
                System.out.printf("%d, ", myArray[i]);
            } else {
                System.out.println(myArray[i]);
            }
        }
        System.out.println("Task 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.printf("%d, ", numbers[i]);
            }
            else {
                System.out.println(numbers[i]);
            }
        }
        for (int i = numbers1.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.printf("%.2f, ", numbers1[i]);
            } else {
                System.out.printf("%.2f\n", numbers1[i]);
            }
        }
        for (int i = myArray.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.printf("%d, ", myArray[i]);
            } else {
                System.out.printf("%d", myArray[i]);
            }
        }
        System.out.println("Task 4 ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i] +=1;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d ", numbers[i]);
        }
    }

}