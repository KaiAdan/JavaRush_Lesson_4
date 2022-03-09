package com.company_javarush_lesson_4.if_while_level_4;

import java.util.Scanner;

public class Condition_l4 {
    //    task2_1
    //    Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
    public static void minimumOfTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int maximum;
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        }
        System.out.println(maximum);
    }


    //    task2_2
    //    Ввести с клавиатуры четыре числа, и вывести максимальное из них.
    public static void minimumOfFourNumbers(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int maximum;
        if (a > b && a > c && a > d){
            maximum = a;
        }
        else if (b > a && b > c && b > d){
            maximum = b;
        }
        else if (c > a && c > b && c > d){
            maximum = c;
        }
        else {
            maximum = d;
        }
        System.out.println(maximum);
    }


    //    task2_3
    //    Ввести с клавиатуры три числа, и вывести их в порядке убывания.
    public static void decrease(){
        Scanner scanner = new Scanner(System.in);
        int maximum;
        int middle;
        int minimum;
        int a = scanner.nextInt();
        maximum = a;
        int b = scanner.nextInt();
        if (b > a){
            maximum = b;
            minimum = a;
        }
        else {
            minimum = b;
        }
        int c = scanner.nextInt();
        if(c > maximum){
            middle = maximum;
            maximum = c;
        }
        else if(c > minimum){
            middle = c;
        }
        else {
            middle = minimum;
            minimum = c;
        }
        System.out.println(maximum + " " + middle + " " + minimum);
    }


    //    task2_4
    //    Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
    //    Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
    public static void equalsString(){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.equals(b)){
            System.out.println("Имена идентичны");
        }
        else if (!a.equals(b) && a.length() == b.length()){
            System.out.println("Длины имен равны");
        }
        else {
            System.out.println("Ничего общего =(((");
        }
    }


    //    task2_5
    //    Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
    public static void age18plus (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("name? : ");
        String a = scanner.nextLine();
        System.out.println("Age? : ");
        int b = scanner.nextInt();
        if (b < 18){
            System.out.println("Подрасти еще");
        }
    }


    //    task2_6
    //    Ввести с клавиатуры имя и возраст.
    //    Если возраст больше 20 вывести надпись «И 18-ти достаточно»
    public static void age20(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("name? : ");
        String a = scanner.nextLine();
        System.out.println("Age? : ");
        int b = scanner.nextInt();
        if (b > 20){
            System.out.println("И 18-ти достаточно");
        }
    }


    //    task3_1
    //    Вывести на экран числа от 1 до 10, используя цикл while.
    public static void oneToTen(){
        int step = 0;
        while (step < 10){
            System.out.println(step + 1);
            step++;
        }
    }

    //    task3_2
    //    Вывести на экран числа от 10 до 1, используя цикл while.
    public static void tenToOne(){
        int step = 10;
        while (step > 0){
            System.out.println(step);
            step--;
        }
    }


    //    task3_3
//    Ввести с клавиатуры строку и число N.
//    Вывести на экран строку N раз, используя цикл while.
    public static void countOfString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("String? : ");
        String a = scanner.nextLine();
        System.out.println("Count? : ");
        int b = scanner.nextInt();
        while (b > 0){
            System.out.println(a);
            b--;
        }
    }


    //    task3_4
    //    Вывести на экран квадрат из 10х10 букв S используя цикл while.
    //    Буквы в каждой строке не разделять.
    public static void s100(){
        int line = 0;
        while (line < 10){
            int string = 0;
            while (string < 10){
                System.out.print("S");
                string++;
            }
            System.out.print("\n");
            line++;
        }
    }

    //    task3_5
    //    Вывести на экран таблицу умножения 10х10 используя цикл while.
    //    Числа разделить пробелом.
    public static void multiplicationTen(){
        int step = 1;
        int col = 1;
        while (step <= 10){
            System.out.print(step + " ");
            while (col < 10){
                col++;
                System.out.print(step * col + " ");
            }
            step++;
            col = 1;
            System.out.print("\n");
        }
    }


    //    task3_1
    //    Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
    //    Через пробел либо с новой строки.
    public static void evenNum(){
        for (int i = 2; i <= 100; i = i + 2){
            System.out.print(i + " ");
        }
    }

    //    task3_2
    //    Ввести с клавиатуры два числа m и n.
    //    Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
    public static void rectangle(){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("8");
            }
            System.out.print("\n");
        }
    }


    //    task3_3
    //    Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
    public static void treangle10(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < i+1; j++){
                System.out.print("8");
            }
            System.out.print("\n");
        }
    }

    //    task3_4
    //    Используя цикл for вывести на экран:
    //            - горизонтальную линию из 10 восьмёрок
    //- вертикальную линию из 10 восьмёрок.
    public static void line(){
        for (int i = 0; i < 10; i++){
            System.out.print("8");
        }
        System.out.print("\n");
        for (int i = 0; i < 9; i++){
            System.out.println("8");
        }
    }



    //    task3_5
    //    Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
    public static void love(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < 10; i++){
            System.out.println(name + " любит меня.");
        }
    }



    //    task4_1
    //    Используя цикл вывести на экран сто раз надпись:
    //    «Я никогда не буду работать за копейки. Амиго»
    public static void target(){
        for (int i = 0; i < 100; i++){
            System.out.println("«Я никогда не буду работать за копейки. Амиго»");
        }
    }


    //    task4_2
    //    Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое.
    public static void middle(){
        Scanner scanner = new Scanner(System.in);
        int maximum;
        int middle;
        int minimum;
        int a = scanner.nextInt();
        maximum = a;
        int b = scanner.nextInt();
        if (b > a){
            maximum = b;
            minimum = a;
        }
        else {
            minimum = b;
        }
        int c = scanner.nextInt();
        if(c > maximum){
            middle = maximum;
            maximum = c;
        }
        else if(c > minimum){
            middle = c;
        }
        else {
            middle = minimum;
            minimum = c;
        }
        System.out.println(middle);
    }

    //    task4_3
    //    Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
    //    -1 должно учитываться в сумме.
    public static void sum(){
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (true){
            int input = scanner.nextInt();
            result += input;
            System.out.println(result);
        }
    }

    //    task4_4
    //    Ввести с клавиатуры строку name.
    //    Ввести с клавиатуры дату рождения (три числа): y, m, d.
    //    Вывести на экран текст:
    //    «Меня зовут name
    //    Я родился d.m.y»
    public static void myName(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        System.out.println("Меня зовут " + name + "\n" + "Я родился " + day + "." + month + "." + year);

    }



}