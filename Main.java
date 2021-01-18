package com.company;

public class Main {

    public static void main(String[] args) {

        //Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte b = 101;
        short s = 1123;
        int i = 64536;
        long l = 2147483648L;
        double d = 4.1;
        float f = 3.14f;
        boolean bool = true;
        char ch = 'c';
        String a = "Hello";
        System.out.println("Значение для типа byte = " + b);
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа double = " + d);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа char = " + ch);
        System.out.println("Значение для типа String = " + a);

        //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        //Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

        String name = "Ольга";
        System.out.println("Привет, " + name + "!");

    }

        //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //где a, b, c, d – аргументы этого метода, имеющие тип float.
        static float doTwo ( float a, float b, float c, float d){

            return a * (b + (c / d));

        }

        //Написать метод, принимающий на вход два целых числа и проверяющий,
        //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        static boolean doThree ( int a, int b){
            int sum = a + b;
            if (sum >= 10 && sum <= 20) {
                return true;
            } else {
                return false;

            }
        }
        //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        //положительное ли число передали или отрицательное.
        //Замечание: ноль считаем положительным числом.


        static void doFour ( int a){
            if (a >= 0) {
                System.out.println("Число" + a + "положительное");
            } else {
                System.out.println("Число" + a + "отрицательное");
            }
        }

        //Написать метод, которому в качестве параметра передается целое число.
        //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        static boolean doFive ( int a){
            if (a < 0) {
                return true;
            } else return false;
        }


    }









