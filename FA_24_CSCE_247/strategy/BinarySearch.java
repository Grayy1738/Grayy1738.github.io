package strategy;
import java.util.List;
import java.util.Collections;

public class BinarySearch implements SearchBehavior {

    @Override
    public boolean contains (List<Person> people, Person person){
        Collections.sort(people);

    int index = Collections.binarySearch(people, person);
    return index >= 0;
}
}
