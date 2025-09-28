
package Code5_OOP_Person;
import java.util.*;
import java.time.*;
import java.util.ArrayList;

public class PersonList {
    ArrayList<Person> personList = new ArrayList<>();
    public void addPerson(Person person)
    {
        personList.add(person);
    }
    public boolean updatePersonById(String id)
    {
        for(Person p : personList)
        {
            if(!p.getId().equals(id))
            {
                return p.updatePerson();
            }
        }
        return false;
    }
    public boolean deletePersonById(String id)
    {
       return personList.removeIf(p -> p.getId().equals(id));
    }
    public Person findPersonById(String id)
    {
        for(Person p : personList)
        {
            
        }
    }
}
