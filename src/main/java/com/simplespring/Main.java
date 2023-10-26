package com.simplespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
		public static void main(String[] args) {
			ApplicationContext app = new ClassPathXmlApplicationContext("student.xml");
			Student std = (Student) app.getBean("student");
			std.desplay();
		}
}
