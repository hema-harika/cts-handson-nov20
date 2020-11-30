package java8streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class examplebu {
	public static void main(String[] args) throws IOException {    
		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);     
		integers.forEach(i -> writeToFile(i)); }

	private static Object writeToFile(Integer i) {
		// TODO Auto-generated method stub
		return i;
	}

	
}
