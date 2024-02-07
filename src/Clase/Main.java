package Clase;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VideoJuego v1 = new VideoJuego(1, "Zelda", "Nintendo", new BigInteger("100"));
		
		VideoJuego v2 = new VideoJuego(2, "Pokemon", "Nintendo", new BigInteger("130"));

		VideoJuego v3 = new VideoJuego(1, "R6", "EA", new BigInteger("150"));

		VideoJuego v4 = new VideoJuego(31, "PvZ", "EA", new BigInteger("110"));
		
		Set<VideoJuego> sv = new HashSet<>();
		
		sv.add(v4);
		sv.add(v3);
		sv.add(v2);
		sv.add(v1);
		
		sv.forEach(System.out::println);
		System.out.println("-----");
		
		List<VideoJuego> vfilt = sv.stream()
				.filter(a -> !a.getDesarrolladora().equalsIgnoreCase("nintendo"))
				.collect(Collectors.toList());
		
		System.out.println(vfilt);
		
		System.out.println("------");
		
		List<String> fruits = Arrays.asList("apple", "banana", "cherry", "organge");
		
		for(String s: fruits) {
			if(s.contains("a")) 
				System.out.println(s);
		}
		System.out.println();
		
		//Streams para filtrar
		List<String> filtrado = fruits.stream()
				.filter(s -> s.contains("a"))
				.filter(s -> s.startsWith("b"))
				.map(fruit -> fruit.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(filtrado);
		System.out.println("------");

		List<Integer> numbers = Arrays.asList(3,4,3,2,45,21,13);
		List<Integer> dnumbers = numbers.stream()
				.map(n -> n*2)
				.collect(Collectors.toList());
		
		System.out.println(dnumbers);
		System.out.println("------");
		
		VideoJuego V1 = new VideoJuego(1, "Hollow Night", "Cherry", 
				new BigInteger("100000"));
		
		VideoJuego V2 = new VideoJuego(2, "Fortnite", "Epic", 
				new BigInteger("331"));
		
		VideoJuego V3 = new VideoJuego(8, "Fifa 23", "EA", 
				new BigInteger("4585"));
		
		VideoJuego V4 = new VideoJuego(1, "Mario Kart 64", "Valve", 
				new BigInteger("1458"));
		
		List<VideoJuego> juegos = Arrays.asList(V1,V2,V3,V4);
		juegos.stream().sorted(Comparator.comparing(VideoJuego::getId)
								.thenComparing(VideoJuego::getNombre).reversed())
						.collect(Collectors.toList())
						.forEach(System.out::println);
		
		System.out.println("------");
		List<Integer> masN = Arrays.asList(1,3,4,3,43221,4234);
		int sum = masN.stream()
				.filter(n-> n%2==0)
				.reduce(0, Integer::sum);
		System.out.println(sum);
		
		Optional<Integer> max = masN.stream().max(Integer::compare);
		System.out.println(max);
		
		long cont = masN.stream().filter(s -> s%2!=0).count();
		System.out.println(cont);
		
		System.out.println("------");

		List<String> words = Arrays.asList("Java", "is", "fun", "and", "useful", "yey!");
		Map<Integer, List<String>> groupedByLength = words.stream()
				.collect(Collectors.groupingBy(String::length));
		
		System.out.println(groupedByLength);

	}

}
