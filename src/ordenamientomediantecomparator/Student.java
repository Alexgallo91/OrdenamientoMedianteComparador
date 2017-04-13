
package ordenamientomediantecomparator;

public class Student implements Comparable{
    
    private String studentName;
    private int rollno;
    private int studentAge;
    
    public Student(int roll, String name, int age)
    {
        this.studentAge = age;
        this.rollno = roll;
        this.studentName = name;
    }

    //*********GETTERS*****************
    public String getStudentName() {
        return studentName;
    }

    public int getRollno() {
        return rollno;
    }

    public int getStudentAge() {
        return studentAge;
    }

    //************SETTERS***************
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public int compareTo(Object comp) {

        int compareAge = 0;
        if(comp instanceof Student)
        {
            compareAge = ((Student)comp).getStudentAge();
        }
        
        /*DE MAYOR A MENOR CON RESPECTO A SU EDAD*/
        //return compareAge - this.getStudentAge();
        
        /*DE MENOR A MAYOR CON RESPECTO A SU EDAD*/
        return this.getStudentAge() - compareAge; 
    }

    @Override
    public String toString() {
        return String.format("[rollno = %d,"+
                             " name = %s, age = %d]",
                             this.getRollno(), 
                             this.getStudentName(),
                             this.getStudentAge());
    }

    
    
    
}
