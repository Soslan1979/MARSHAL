/**
* Калабеков
*
* */
package Lesson10;

public class StringMethods {
    public static void main(String[] args) {
        String string = new String("Hello World"); // классический метод создания String
        String string2 = "Hello World"; // обычный метод создания String
        String string3 = "Hello";
        String string4 = "World!";
        String string5 = string3 + string4; // конкатенация
        String string6 = string4.substring(0, 3);
        String string7 = "AbraCadabra";
        String string8 = "HELLO";

        System.out.println(string5); // HelloWorld!
        System.out.println(string6); // Wor
        System.out.println(string3.equals(string4)); // сравнение строк: false Hello != World
        System.out.println(string3.equalsIgnoreCase(string8)); // сравнение строк: true > Hello = HELLO
        System.out.println(string3.toUpperCase()); // Hello > HELLO
        System.out.println(string7.length()); // выводит длину строки > 11
        System.out.println("Было Hello, а стало: " + string3.replace("H", "D")); // Dello
        System.out.println(string3.startsWith("H")); // определяет, начинается ли строка с подстроки > true
        System.out.println(string3.indexOf("z")); // определяет индекс подстроки (при отсутствии возвращает -1)

        String string9 = "Я узнал что у меня"; // разделяет на слова по пробелу
        String[] words = string9.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        String s = "";   // строка не указывает на объект
        if(s.isEmpty()) System.out.println("String is empty");
    }

}

