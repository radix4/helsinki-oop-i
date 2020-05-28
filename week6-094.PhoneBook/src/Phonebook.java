import java.util.ArrayList;

public class Phonebook {
        private ArrayList<Person> phoneBook;

        public Phonebook(){
            this.phoneBook = new ArrayList<Person>();
        }

    public void add(String name, String number){
        Person person = new Person(name,number);        // OR this.phonebook.add(new Person(name,number)
        this.phoneBook.add(person);

    }

    public void printAll(){
        for (Person persons: this.phoneBook){
            System.out.println(persons);
        }
    }

    public String searchNumber(String name){
            for (Person persons : this.phoneBook){
                if (persons.getName().contains(name)){
                    return persons.getNumber();
                }
            }
            return "number not known";
    }


}
