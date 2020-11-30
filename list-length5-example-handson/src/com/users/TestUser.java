package com.users;

import java.util.ArrayList;
import java.util.List;

public class TestUser {
	

	public static void main(String[] args) {
		List<User> list=new ArrayList<User>();
		list.add(new User(12,"hema","Dhh@5678"));
		list.add(new User(23,"dvakar","hgry764"));
		list.add(new User(76,"haveesh","hyu"));
		
		for(User c:list) {
			if(c.getName().length()>5)
				System.out.println(c.getName());
		}
		

	}

}
