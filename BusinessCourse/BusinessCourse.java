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
    
    public void setName(String name){
        if(name.length()>=4){
            this.name = name;
        }
    }
    
    public void setTeacher(String teacher){
        String nombre = teacher.substring(teacher.indexOf(",")+1);
        if(teacher.contentEquals(",") && !nombre.contentEquals(" ")){
            this.teacher = teacher;
        }
    }
    
    public void setId(String id){
        if(id.startsWith(name.substring(0, 1)) && id.endsWith(teacher.substring(0, 1))){
            this.id = id;
        }
    }
    
    public void setDuration(int duration){
        if(duration >= 30){
            this.duration = duration;
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getTeacher(){
        return this.teacher;
    }
    
    public String getId(){
        return this.id;
    }
    
    public int getDuration(){
        return this.duration;
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
