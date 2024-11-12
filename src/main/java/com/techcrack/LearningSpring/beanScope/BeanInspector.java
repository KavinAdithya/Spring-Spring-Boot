package com.techcrack.LearningSpring.beanScope;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanInspector implements CommandLineRunner {

    private final ApplicationContext applicationContext;

    public BeanInspector(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) throws Exception {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        System.out.println("Beans created by Spring:");

        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
