package model;

public class PersonsEqualsTests {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        p.setLName("Johnson");
        p.setAge(55);
        p.setId(100);

        Person p2 = new Person(100, "John", "Johnson", 55);

        //I. он сравнивает ссылки .
        System.out.println(" ?" + (p == p2));

        Person p100 = p;
        System.out.println("p100==p ?" + (p100 == p));


        // II equals.по умолчанию проверяет ссылки .т.е смотрите пункт.если не переопределить еквилс  ,всегда будут срваниваться ссылки
        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Murzik");


        Person person1 = new Person(123, "Mike", "Tyson", 56);
        person1.setCat(cat1);
        Person person2 = new Person(123, "Mike", "Tyson", 56);
        person2.setCat(cat2);

        //для того чтобы объекты сравнивались надо  перопределить метод иквалс
        //как правило объекты сравниваются по полям

         System.out.println("person1 equals person2? : " + person1.equals(person2));
        System.out.println();
        //HashCode функция которая вернет целое число
        System.out.println("cat1 hashcode : "+cat1.hashCode());
        System.out.println("cat2 hashcode : "+cat2.hashCode());

        System.out.println(" person1  hashcode : "+person1.hashCode());
        System.out.println(" person2  hashcode : "+person2.hashCode());


    }

}
