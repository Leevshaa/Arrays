package app;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {98, 48, 38, 51, 83, 2, 3, 12, 71, 27,
                99, -48, 38, 51, 85, 2, -3, 12, -71, 27};

        //Виводимо на екран користувачу елементи масиву
        System.out.println("\nЕлементи масиву: " + Arrays.toString(numbers));

        int sumNegativeNumbers = 0; //змінна, яка накопичує і рахує суму від'ємних чисел

        for (int negativeNumbers : numbers) {
            if (negativeNumbers < 0) { //відфільтровуємо від'ємні числа
                sumNegativeNumbers += negativeNumbers;
            }
        }
        System.out.println("\nСума від'ємних чисел: " + sumNegativeNumbers);

        int count = 0; //<-лічильник
        int oddNumbers; //змінна, яка визначає кількість непарних чисел (використовуємо для обрахунку лічильник)

        for (int evenNumbers : numbers){
            if (evenNumbers % 2 == 0){ //через оператор залишку від ділення визначаємо парні числа
                count++;
            }
        }
        oddNumbers = 20 - count; //знаючи величину масиву і кількість парних чисел визначаємо кількість непарних

        System.out.println("\nКількість парних чисел: " + count);
        System.out.println("\nКількість непарних чисел: " + oddNumbers);

        //створюємо змінні для знаходження мін./макс. значення в масиві та їх індексів
        int min = numbers[0];
        int max = numbers[0];
        int minIndex = 0;
        int maxIndex = 0;

        //створюємо цикл, який буде проходити по масиву з умовою оновлення мін./макс. значення та запису їх індексів
        for (int index = 0; index < numbers.length; index++){
            if (numbers[index] < min){
                min = numbers[index];
                minIndex = index;
            }
            if (numbers[index] > max){
                max = numbers[index];
                maxIndex = index;
            }
        }
        System.out.println("\nНайменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("\nНайбільший елемент: " + max + " (з індексом " + maxIndex + ")");;

        int firstNegativeNumber = -1; //створюємо змінну, яка буде знаходити перше від'ємне число
        //-1 оскільки від'ємного числа може і не бути в масиві

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeNumber = i;
                break;//знаходимо перше від'ємне число і зупиняємо цикл
            }
        }

            //якщо перше від'ємне число існує в масиві і не знаходиться в кінці
            if (firstNegativeNumber != -1 && firstNegativeNumber < numbers.length - 1) {

                int sum = 0; //змінна для накопичування суми чисел після першого від'ємного
                int countNumbers = 0; //лічильник чисел після першого від'ємного

                for (int index = firstNegativeNumber + 1; index < numbers.length; index++) {
                    //проходимо масив після першого від'ємного числа
                    sum += numbers[index];
                    countNumbers++;
                }
                double avgSum = (double) sum / countNumbers;

                System.out.printf("\nСереднє арифметичне після першого від'ємного числа: %.2f \n", avgSum);
        } else {
                System.out.println("\nВ масиві немає від'ємних чисел або від'ємне число знаходиться наприкінці масиву");
            }
    }
}