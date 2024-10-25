package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sf.beans.Student;

@Configuration
public class SpringConfigFile {

    @Bean
    public Student std1() {
        Student obj1 = new Student();
        obj1.setMarks(100);
        obj1.setName("Sanyam Kapoor");
        obj1.setRollNo(1);
        return obj1;
    }

    @Bean
    public Student std2() {
        Student obj = new Student();
        obj.setMarks(70);
        obj.setName("Student 2");
        obj.setRollNo(2);
        return obj;
    }

}
