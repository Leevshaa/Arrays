package app;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {-98, 48, 38, -51, 83, 2, -3, 12, -71, 27,
                -99, 48, 38, -51, 83, 2, -3, 12, -71, 27};

        //Виводимо на екран користувачу елементи масиву
        System.out.println("Елементи масиву: " + Arrays.toString(numbers));

        int sumNegativeNumbers = 0; //змінна, яка накопичує і рахує суму від'ємних чисел
        int count = 0; //<-лічильник
        int oddNumbers; //показуємо користувачу кількість непарних чисел (використовуємо для обрахунку лічильник)

        for (int negativeNumbers : numbers){
            if (negativeNumbers < 0){ //відфільтровуємо від'ємні числа
                sumNegativeNumbers += negativeNumbers;
            }
        }
        System.out.println("Сума від'ємних чисел: " + sumNegativeNumbers);

        for (int evenNumbers : numbers){
            if (evenNumbers % 2 == 0){ //через оператор залишку від ділення визначаємо парні числа
                count++;
            }
        }

        oddNumbers = 20 - count; //знаючи величину масиву і кількість парних чисел визначаємо кількість непарних
        System.out.println("Кількість парних чисел: " + count +
                "\nКількість парних чисел: " + oddNumbers);


        //TODO знайти найменше та найбільше значення в масиві
        // та середнє арифметичне чисел після першого від'ємного числа
        // + заповнити масив рандомними числами

    }
}