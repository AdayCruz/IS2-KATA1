
package kata1;

import java.util.Date;


public class Kata1 {


    public static void main(String[] args) {
        Student student = new Student("Aday", new Date(90,10,9));
        System.out.print(student.getAge());
    }
    
}
