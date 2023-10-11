package generics;

public class genericUse {

	public static void main(String[] args) {

//		Pair<Pair<String,Integer>,Integer> p = new Pair<>();
//		System.out.println(p.getFirst());
//		System.out.println(p.getSecond());
//		

		Pair<Integer> p = new Pair<Integer>(10, 20);

		System.out.println(p.getFirst() + " " + p.getSecond());

		Pair<String> P = new Pair<String>("aa", "bb");

		System.out.println(P.getFirst() + " " + P.getSecond());

		Pair<Double> D = new Pair<Double>(12331.12124, 14134.1414);

		System.out.println(D.getSecond() + " " + D.getFirst());

//		Pair<Double> q = new Pair<>();

//		q.setFirst(132.2);

//		System.out.println(q.getFirst() + " " + q.getSecond());

	}

}
