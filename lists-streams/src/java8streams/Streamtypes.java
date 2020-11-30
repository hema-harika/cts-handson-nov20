package java8streams;

import java.util.List;

public class Streamtypes {
	public static void main(String[] args) {
		List<Laptop> laptops=Laptop.fetchLaptops();
	  System.out.println("-----sequential stream-----");
	  laptops.stream().filter(item->item.getRatings()>4.3).forEach(item->System.out.println(item));
	  System.out.println("-----parallel stream-----");
	  laptops.parallelStream().filter(item->item.getRatings()>4.3).forEach(item ->System.out.println(item));

	  
	}
}
