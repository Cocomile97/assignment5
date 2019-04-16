package ac.za.cput.factory;

import ac.za.cput.domain.Student;
import ac.za.cput.domain.StudentFactory;
import org.junit.Assert;
import org.junit.Test;

public class StudentFactoryTest {

    @Test
    public void getStudent() {

        String fname = "Tracy";
        String lname ="Atomon" ;
        int age= 21;
        Student a = StudentFactory.getStudent(fname,lname,age);
        System.out.println(a);
        Assert.assertNotNull( a.getStudentId());
    }
}
