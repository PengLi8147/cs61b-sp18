public class dog {
	public int weight;
	public dog(int w) {
		weight = w;
	}

	public void makenoise() {
		if (weight < 10) {
			System.out.println("Waaaaa!!");
		} else if (weight < 30) {
			System.out.println("Bark!!!");
		} else {
			System.out.println("woooooof!");
		}

	}

}