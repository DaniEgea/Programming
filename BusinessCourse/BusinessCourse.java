package Task_4;

/**
 *
 * @author dani
 */
public class BusinessCourse extends Course{
    protected int internship;
    
    /**
     * This is the constructor by default.
     */
    public BusinessCourse(){
        this.setName("");
        this.setTeacher("");
        this.setId("");
        this.setDuration(30);
        this.internship = 15;
    }
    
    /**
     * This is the constructor with parameters.
     * @param name is the name of the course.
     * @param teacher is the name of the teacher.
     * @param id is the identification of the course.
     * @param duration is the duration of the course.
     */
    public BusinessCourse(String name, String teacher, String id){
        this.setName(name);
        this.setTeacher(teacher);
        this.setId(id);
        this.setDuration(30);
        this.internship = 15;
    }
    
    /**
     * This is a copy constructor.
     * @param copy is the object name.
     */
    public BusinessCourse(BusinessCourse copy){
        this.name = copy.name;
        this.teacher = copy.teacher;
        this.id = copy.id;
        this.duration = copy.duration;
        this.internship = copy.internship;
    }
    
    /**
     * This method set the name of course.
     * @param name is the name of the Course.
     */
    public void setName(String name){
        if(name.length()>=4){
            this.name = name;
        }
    }
    
    /**
     * This method set the name of the teacher.
     * @param teacher is the name of the Teacher.
     */
    public void setTeacher(String teacher){
        String nombre = teacher.substring(teacher.indexOf(",")+1);
        if(teacher.contentEquals(",") && !nombre.contentEquals(" ")){
            this.teacher = teacher;
        }
    }
    
    /**
     * This method set the ID of the course.
     * @param id  is the ID of the Course.
     */
    public void setId(String id){
        if(id.startsWith(name.substring(0, 1)) && id.endsWith(teacher.substring(0, 1))){
            this.id = id;
        }
    }
    
    /**
     * This method set the duration of the course.
     * @param duration is the duration of the Course.
     */
    public void setDuration(int duration){
        if(duration >= 30){
            this.duration = duration;
        }
    }
    
    /**
     * This method return the value of the name of course.
     * @return a String.
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * This method return the teacher's name.
     * @return a String.
     */
    public String getTeacher(){
        return this.teacher;
    }
    
    /**
     * This method return the course's ID.
     * @return a String.
     */
    public String getId(){
        return this.id;
    }
    
    /**
     * This method return the course's duration.
     * @return an Integer.
     */
    public int getDuration(){
        return this.duration;
    }
    
    /**
     * This method return all the values.
     * @return a String.
     */
    public String toString(){
        return "Name: "+getName()+" | Teacher: "+getTeacher()+" | ID: "+getId()+" | Duration: "+getDuration()+" with an internship that lasts for at least 15 hours.";
    }
    
    /**
     * This method clone the BusinessCourse Course.
     * @return an BusinessCourse object.
     */
    public BusinessCourse clone(){
        BusinessCourse otro = new BusinessCourse();
        otro.setName(this.name);
        otro.setTeacher(this.teacher);
        otro.setId(id);
        otro.setDuration(duration);
        otro.internship = this.internship;
        return otro;
    }
    
    /**
     * This method compare two objects.
     * @param otro is the name of the course object.
     * @return a Boolean.
     */
    public boolean equals(BusinessCourse otro){
        if(otro == this){
            return true;
        }
        return false;
    }
}
