public class Student {
    private String name;
    private String studentNumber;

    //constructor
    public Student(String name, String studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;
    }

    //methods
    public String getName(){    //getters
        return this.name;
    }

    public String getStudentNumber(){   //getters
        return this.studentNumber;
    }

    public String toString(){

        return this.name + " (" + this.studentNumber + ") ";
    }






}
