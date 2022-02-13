package Task_4.Programming.Course;

/**
 *
 * @author dani
 */
public class Student extends Person{
    private Course c;
    
    /**
     * This is a constructor by default.
     */
    public Student(){
        c = new Course();
        setName("");
        setSurname("");
        setEmail("");
    }
    
    /**
     * This is a constructor by parameters.
     * @param name is the Person name.
     * @param surname is the Person surname.
     * @param email is the Person email.
     * @param other is the Student Course.
     */
    public Student(Course other, String name, String surname, String email){
        c = new Course(other);
        setName(name);
        setSurname(surname);
        setEmail(email);
    }
    
    /**
     * This is a copy constructor.
     * @param copy is the Student object.
     */
    public Student(Student copy){
        c = new Course(copy.c);
        setName(copy.getName());
        setSurname(copy.getSurname());
        setEmail(copy.getEmail());
    }
    
    /**
     * This method set the course of Student.
     * @param name is the name of the Student.
     */
    public void setCourse(Course other){
        c = new Course(other);
    }
    
    public String toString(){
        return "Name: "+getName()+" | Surname: "+getSurname()+" | Email: "+getEmail()+" | Course: "+this.c.getName()+" | Identification: "+this.c.getID();
    }
    
}
