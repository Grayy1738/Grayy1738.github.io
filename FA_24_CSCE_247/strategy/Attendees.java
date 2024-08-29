package strategy;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Attendees {
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;
    
public Attendees(String title) {

this.title = title;
this.people = new ArrayList<>();
this.searchBehavior = new LinearSearch();
}

public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
    Person person = new Person(firstName, lastName, phoneNumber, reminder);
    this.people.add(person);
    return person;
}
public String getTitle() {
    return this.title;
}

public void setSearchBehavior(SearchBehavior searchBehavior) {
    this.searchBehavior = searchBehavior;
}

public List<Person> getList() {
    return this.people;
}
public boolean contains (Person person) {
    if (this.searchBehavior == null) {
        throw new IllegalStateException("Search behavior not set");
    }
    return this.searchBehavior.contains(this.people, person);
}
}
