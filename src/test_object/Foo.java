package test_object;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Foo {

	public static void main(String[] args) {
		List<Foos> foos = new ArrayList<>();

	IntStream
		.range(1,4)	
		.forEach(i -> foos.add(new Foos("Foo" + i)));
	}

}
