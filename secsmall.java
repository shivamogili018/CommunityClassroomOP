package com.java;

import java.util.*;

public class SecondSmallest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(10,30,4,50,70,20));
		
		Optional<Integer> result = list.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst();
		System.out.println(result.get());
	}
}

