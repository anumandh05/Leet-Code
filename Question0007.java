public class Question0007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 156389759;
		String out = "";
		int len = 0;
		if (x > 0) {
			out = out + x;
			len = out.length();
		} else {
			out = out + x;
			len = out.length() - 1;
		}

		
//      int power =10;
		int remainder = 0;
		int multiply = 0;
		int Adder = 0;
		double power = Math.pow(10, len - 1);
		int powered = (int) power;
		double max = Math.pow(2, 31) -1;
		double min = -(Math.pow(2, 31));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(x);
		
		boolean a = 156389759<2147483647;
		System.out.println(a);
		
		if (max > x && min < x) {
			for (int i = 0; i < len; i++) {
				remainder = x % 10;
				x = x / 10;
				multiply = remainder * powered;
				powered = powered / 10;
				Adder = Adder + multiply;
			}
		} else {
			Adder =0;
		}
		System.out.println(Adder);
	}

}
