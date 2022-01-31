package Task_4;

/**
 *
 * @author dani
 */
public class Course {
    protected String name, ID, teacher;
    protected int duration;
        
    public void setName(String name){
        if(name.length()>=4){
            this.name = name;
        }
    }
    
    public void setTeacher(String teacher){
        if(teacher.contentEquals(",")){
            this.teacher = teacher;
        }
    }
    
    public void setID(String ID){
        if(ID.startsWith(name.substring(0, 1)) && ID.endsWith(teacher.substring(0, 1))){
            this.ID = ID;
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
    
    public String getID(){
        return this.ID;
    }
    
    public int getDuration(){
        return this.duration;
    }
  
    public String toString(){
        return "Name: "+getName()+" | Teacher: "+getTeacher()+" | ID: "+getID()+" | Duration: "+getDuration();
    }
    
    public Course clone(){
        Course otro = new Course();
        otro.name = this.name;
        otro.teacher = this.teacher;
        otro.ID = this.ID;
        otro.duration = this.duration;
        return otro;
    }
    
    public boolean equals(Course otro){
        if(otro == this){
            return true;
        }
        return false;
    }
  }
