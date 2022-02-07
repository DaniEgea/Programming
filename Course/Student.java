package Task_4.Programming.Course;

/**
 *
 * @author dani
 */
public class Student extends Person{
    private Course c;
    
    /**
     * This is the constructor by default.
     */
    public Student(){
        c = new Course();
        setName("");
        setSurname("");
        setEmail("");
    }
    
    /**
     * This is the constructor with parameters.
     * @param name is the name of the Business Course.
     * @param teacher is the name of the teacher.
     * @param id is the identification of the course.
     * @param duration is the duration of the course.
     */
    public Student(Course other, String name, String surname, String email){
        c = new Course(other);
        setName(name);
        setSurname(surname);
        setEmail(email);
    }
    
    /**
     * This is a copy constructor.
     * @param copy is the object name.
     */
    public Student(Student copy){
        c = new Course(copy.c);
        setName(copy.getName());
        setSurname(copy.getSurname());
        setEmail(copy.getEmail());
    }
    
    /**
     * This is a copy constructor.
     * @param copy is the object name.
     */
    public void setCourse(Course other){
        c = new Course(other);
    }
    
    /**
     * This method return all the values.
     * @return a String.
     */
    public String toString(){
        return "Name: "+getName()+" | Surname: "+getSurname()+" | Email: "+getEmail()+" | Course: "+this.c.getName()+" | Identification: "+this.c.getID();
    }
    
}
