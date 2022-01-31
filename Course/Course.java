package Task_4;

/**
 *
 * @author dani
 */
public class Course {
    protected String name, id, teacher;
    protected int duration;
    
    public Course(){
        name = "";
        id = "";
        teacher = "";
        duration = 0;
    }
    
    public Course(String name, String id, String teacher, int duration){
        this.setName(name);
        this.setTeacher(teacher);
        this.setId(id);
        this.setDuration(duration);
    }
    
    public Course(Course copia){
        copia.name = this.name;
        copia.teacher = this.teacher;
        copia.id = this.id;
        copia.duration = this.duration;
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
        return "Name: "+getName()+" | Teacher: "+getTeacher()+" | ID: "+getId()+" | Duration: "+getDuration();
    }
    
    public Course clone(){
        Course otro = new Course();
        otro.name = this.name;
        otro.teacher = this.teacher;
        otro.id = this.id;
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
