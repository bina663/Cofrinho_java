package moeda;

public class Euro {
	private static double valorDaMoeda = 5.34;
	
	public double conveterReal(double moeda) {
		return moeda * valorDaMoeda;
    }
}
