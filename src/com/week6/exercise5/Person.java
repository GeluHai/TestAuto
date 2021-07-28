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

public class Person {

    public String name;
    public int age;

    public Person(String name, int age, String streetName, int streetNumber) {
        this.name = name;
        this.age = age;
        Address adr = new Address(streetName, streetNumber);
    }

}
