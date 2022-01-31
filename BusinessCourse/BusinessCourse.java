package Task_4;

/**
 *
 * @author dani
 */
public class BusinessCourse extends Course{
    
    public BusinessCourse(){
        this.setName("");
        this.setTeacher("");
        this.setId("");
        this.setDuration(30);
    }
    
    public BusinessCourse(String name, String teacher, String id, int duration){
        this.setName(name);
        this.setTeacher(teacher);
        this.setId(id);
        this.setDuration(30);
    }
    
    public String toString(){
        return "Name: "+getName()+" | Teacher: "+getTeacher()+" | ID: "+getId()+" | Duration: "+getDuration()+" with an internship that lasts for at least 15 hours.";
    }
    
    public Course clone(){
        Course otro = new Course();
        otro.setName(this.name);
        otro.setTeacher(this.teacher);
        otro.setId(id);
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
