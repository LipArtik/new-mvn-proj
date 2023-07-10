package errors;

import model.Person;

public class ExceptionsTester {
    public static void main(String[] args) {
        System.out.println("Begin");
        Person p1 = null;

        //p1.clone();// will throw new NullPointerException object!

        Throwable throwable;
        Error error;
        Exception exception;
        try {
            //потенциально небезопасный  код
            p1.clone();
        } catch (NullPointerException e) { //trying to catch especially NullPointerException/ ожидается кокр.тип исключения
            // обработка исключения
            System.out.println("Ooops ! its NullPointerException (" + e.getMessage());
            e.printStackTrace();

        } finally {
            System.out.println("final job ");//блок выполнится в любом случае ,с ошибкой или без ошибки
        }


        int[] array = {2, 12, 33};

        int c = 2;


        try {
            int val = array[c];
            System.out.println(val);

        } catch (ArrayIndexOutOfBoundsException i) {

            System.out.println("Wrong index" + c);
            i.printStackTrace();
            System.out.println("please user next indexes bound -> from 0 to " + (+array.length - 1));

        } finally {
            //default implementation -> print first element
            System.out.println(array[0]);
        }

        String str= "Hello java World";
        String[] words =str.split(" ");
        for (String word: words){
          try {
              System.out.println(word.charAt(word.indexOf('o')));
          }catch (StringIndexOutOfBoundsException e){
              System.out.println("no such symbol  'o' in "+word+"");
          }
        }


        System.out.println("End");

    }


}