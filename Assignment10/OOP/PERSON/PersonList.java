
package Assignment10.OOP.PERSON;

import java.util.ArrayList;


public class PersonList {
    ArrayList<Person> personList = new ArrayList();

    public PersonList() {
    }
    public void addList(Person person)
    {
        personList.add(person);
    }
    public void outputList()
    {
        for (Person n : personList) {
            n.output();
            System.out.println("----------");
        }
    }
}
