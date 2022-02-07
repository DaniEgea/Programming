package Task_4.Programming.Course;

/**
 *
 * @author dani
 */
public class Student extends Person{
    private Course c;
    
    public Student(){
        c = new Course();
        setName("");
        setSurname("");
        setEmail("");
    }
    
    public Student(Course other, String name, String surname, String email){
        c = new Course(other);
        setName(name);
        setSurname(surname);
        setEmail(email);
    }
    
    public Student(Student copy){
        c = new Course(copy.c);
        setName(copy.getName());
        setSurname(copy.getSurname());
        setEmail(copy.getEmail());
    }
    
    public void setCourse(Course other){
        c = new Course(other);
    }
    
    public String toString(){
        return "Name: "+getName()+" | Surname: "+getSurname()+" | Email: "+getEmail()+" | Course: "+this.c.getName()+" | Identification: "+this.c.getID();
    }
    
}
