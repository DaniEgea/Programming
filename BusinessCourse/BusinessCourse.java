package Task_4;

/**
 *
 * @author dani
 */
public class BusinessCourse extends Course{
    
    public BusinessCourse(){
        this.setName("");
        this.setTeacher("");
        this.setID("");
        this.setDuration(30);
    }
    
    public BusinessCourse(String name, String teacher, String ID, int duration){
        this.setName(name);
        this.setTeacher(teacher);
        this.setID(ID);
        this.setDuration(30);
    }
    
    public String toString(){
        return "Name: "+getName()+" | Teacher: "+getTeacher()+" | ID: "+getID()+" | Duration: "+getDuration()+" with an internship that lasts for at least 15 hours.";
    }
    
    public Course clone(){
        Course otro = new Course();
        otro.setName(this.name);
        otro.setTeacher(this.teacher);
        otro.setID(ID);
        otro.setDuration(duration);
        return otro;
    }
    
    public boolean equals(Course otro){
        if(otro == this){
            return true;
        }
        return false;
    }
}
