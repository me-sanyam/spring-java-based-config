package main;

import com.sf.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resources.SpringConfigFile;

public class Main {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
            Student std1 = (Student)context.getBean("std1");
            std1.display();

            Student std2 = (Student)context.getBean("std2");
            std2.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
