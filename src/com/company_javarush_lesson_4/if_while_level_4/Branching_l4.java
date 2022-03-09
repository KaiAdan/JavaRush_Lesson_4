package com.company_javarush_lesson_4.if_while_level_4;

public class Branching_l4 {
//    Видимость переменных

//    task1_1
//        Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String name
//        равное переданному параметру String name.
        class Cat_1
        {
            private String name;
            public void setName(String name)
            {
                //написать тут ваш код
                this.name = name;
            }
        }


//    task1_2
//        Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось на 1.
//        За количество котов отвечает переменная catsCount.
        class Cat_2
        {
            private static int catsCount = 0;
            public static void addNewCat()
            {
                //написать тут ваш код
                catsCount++;
            }
        }


//      task1_3
//        Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать значение переменной catsCount
//        равное переданному параметру.
        class Cat_3
        {
            private static int catsCount = 0;
            public static void setCatsCount(int catsCount)
            {
                //написать тут ваш код
                Cat_3.catsCount = catsCount;
            }
        }


//        task1_4
//      Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String fullName
//      равное значению локальной переменной String fullName.
        class Cat_4
        {
            private String fullName;
            public void setName(String firstName, String lastName)
            {
                String fullName = firstName + lastName;
                //написать тут ваш код
                this.fullName = fullName;
            }
        }


//        task1_5
//Набросок необходимого класса для задания:
    public static class Cat{
            public static int count = 0;

    public  void newCatSayMeow(){
                count++;
            }
}

//Написать код, который бы подсчитывал количество созданных котов (count) и на экран выдавалось правильно их количество.
//Прекрасно сработает если вызывать методы класса после создания класса, а не вовремя его пояления =)
//из main прекрасно код вызывается и работает
//        Cat cat1 = new Cat();
//        //написать тут ваш код
//        cat1.newCatSayMeow();
//        Cat cat2 = new Cat();
//        //написать тут ваш код
//        cat2.newCatSayMeow();
//        System.out.println("Cats count is " + Cat.count);

}
