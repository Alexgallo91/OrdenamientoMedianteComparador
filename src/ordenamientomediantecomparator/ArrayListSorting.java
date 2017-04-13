
package ordenamientomediantecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    
    public static void main(String []args)
    {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        
        arrayList.add(new Student(223, "Jose", 26));
        arrayList.add(new Student(245, "Alex", 24));
        arrayList.add(new Student(209, "Manuel", 32));
        
        System.out.println("Antes de ordenar:\n");
        
        for(Student x : arrayList)
            System.out.println(x);
        
        //Obtendre un error si ordeno un arraylist con un objeto Student
        Collections.sort(arrayList);
        
        System.out.println("Despues de ordenar:\n");
        
        for(Student x : arrayList)
            System.out.println(x);
        
        
    }
    
}
