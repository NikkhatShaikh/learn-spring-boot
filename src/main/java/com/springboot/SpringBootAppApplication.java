package com.springboot;

//import com.springboot.di.School;
//import com.springboot.di.Student;
//import com.springboot.ioc.BubbleSort;
//import com.springboot.ioc.InsertionSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootAppApplication.class);
//		ConfigurableApplicationContext applicationContext= SpringApplication.run(SpringBootAppApplication.class, args);
//		BubbleSort bubbleSort = applicationContext.getBean(BubbleSort.class);
//		bubbleSort.sort();
//		bubbleSort.display();
//
//		InsertionSort insertionSort = applicationContext.getBean(InsertionSort.class);
//		insertionSort.sort();
//		insertionSort.display();
//
//		School school = applicationContext.getBean(School.class);
//		school.show();
	}

}
