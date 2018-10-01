package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		float d1=(float)Math.random();     // 0-1
		float d2=d1*5;                     // 0-5
		int d3=Math.round(d2);             // 0-5 integer
		return d3 + 1;                     // 1-6

		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		int counter6 = 0;

		if (d3+1==1) {
			counter1++;
		}
		else if (d3+1==2) {
			counter2++;
		}
		else if (d3+1==3) {
			counter3++;
		}
		else if (d3+1==4) {
			counter4++;
		}
		else if (d3+1==5) {
			counter5++;
		}
		else if (d3+1==6) {
			counter6++;
		}
		else {
			System.out.println("FEJL!");
		}
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(roll() + " ");
			System.out.println();

		}
	}
}
