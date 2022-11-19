package moeda;

public class Real {
	private static int valorDaMoeda = 1;
	
	public double conveterReal(double moeda) {
		return moeda * valorDaMoeda;
    }
}
