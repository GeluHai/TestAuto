/*
5. Create an Address class with a streetName (String) and a streetNumber(int).
Create a Person class with name(String), age (int) and address (Address).
Create an instance of a HashMap and put a instance of a Person as key and an Integer as Value. hashMap.put(person1,integer);
Get the Integer value using the Person instance person1 created before.
Create a new Person instance, person2, using the same data as before (same name, same age, same address).
Get the Integer value using the new Person instance created.
It should return the same Integer as before. If not fix it to return the same integer.
 */

package exercise5;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {

        Person person1 = new Person("Pop", 26, "Mihai Eminescu", 695);
        Person person2 = person1;

        HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();

        hashMap.put(person1, 1);

        System.out.println(hashMap.get(person1));
        System.out.println(hashMap.get(person2));
    }
}
