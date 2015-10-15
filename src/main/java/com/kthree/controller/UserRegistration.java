package com.kthree.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean(name = "userRegistration")
@RequestScoped
public class UserRegistration {

		private String firstName;
		private String lastName;
		private int age;
		
		private String city;
		private double salary;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		public String processRegistration(){
			
			System.out.println("Values:");
			System.out.println("First name:"+getFirstName());
			System.out.println("Last name:"+getLastName());
			return "Success";
		}
		
}
