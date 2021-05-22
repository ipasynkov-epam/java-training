import java.util.*;

public class MethodArgExample {
	public static void main(String[] args) {

		double d1 = 10.0d;//10.0000000650098
		double d2 = 10.0d;//10.0000000001450
		if(Math.abs(d1 - d2) < 0.000001){
			System.out.println("equal");
		}

		MethodArgExample m = new MethodArgExample();
		m.methodArg("Correct arg");


		Optional<Integer> integer = m.methodNonNull(1);

		if (integer.isPresent()) {
			System.out.println(integer.get());
		}

		Optional<Integer> integer2 = m.methodNonNull(5);
		System.out.println(integer2.orElse(3));

		List<Integer> integers = m.methodList();
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		for (Integer i : integers) {
			System.out.println(i);
		}

	}

	public void methodArg(Object o){
		int a, a2, a3, a10, a15;
		int b = 0;
		int c = 0;
		b++;c++;c--;--c;
		Objects.requireNonNull(o, "Should not be null");
		if (!(o instanceof String)) {
			throw new IllegalArgumentException("Should be String");
		}
		System.out.println(o.toString());
	}

	public Optional<Integer> methodNonNull(int val) {
		if (val == 1) {
			return Optional.of(1);
		}
		if (val == 2) {
			return Optional.of(2);
		}
		return Optional.empty();
	}

	public int[] methodArr() {
		return new int[0];
	}

	public List<Integer> methodList() {
		return Collections.emptyList();
	}

	public String methodToTest(int value) {
		if (value > 0) {
			return "positive";
		}
		if (value < 0) {
			return "negative";
		} else {
			return "zero";
		}
	}

	public Integer methodToTest(Integer i1, Integer i2){
		if(i1 == null){
			i1 = 0;
		}
		return i1 + i2;
	}

	public int factorial(int value){
		return value * factorial(value - 1);
	}
}
