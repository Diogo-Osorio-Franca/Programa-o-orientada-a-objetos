public class ex2 {

	public static void main(String[] args) {
		int[] x = new int[3];
		double[] y = new double[3];
		String[] z = new String[3];

		x[0] = 1;
		x[1] = 2;
		x[2] = 3;

		y[0] = 1.5;
		y[1] = 2.5;
		y[2] = 3.5;

		z[0] = "a";
		z[1] = "b";
		z[2] = "c";

		print(x);
		print(y);
		print(z);
		// TODO Auto-generated method stub
	}

	public static void print(int[] x) {
		for (int i : x) {
			System.out.println(i);
		}
	}

	public static void print(double[] y) {
		for (double i : y) {
			System.out.println(i);
		}
	}

	public static void print(String[] z) {
		for (String i : z) {
			System.out.println(i);
		}
	}

}
