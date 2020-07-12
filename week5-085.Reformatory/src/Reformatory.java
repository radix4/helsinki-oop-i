public class Reformatory {

    public int weight(Person person) {
        return person.getWeight();
    }
    public void feed(Person person) {
        int weightBeforeEating = person.getWeight();
        person.setWeight(weightBeforeEating + 1);
    }
}
