package com.example.demo;

import java.util.Arrays;

public class Service {

	public static void main(String[] args) {
		User user1=new User("461","Madhav","Sivaram Nagar,Kadapa,Ap");
		User user2=new User("462","Giri","Vidhyanager,Tamilnadu");
		List<User> users= Arrays.asList(user1,user2);
		public List<User> getAllUsers()
		{
			return users;
		}

	}

}
