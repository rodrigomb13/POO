
public class Quadrado {
	private double alt;
	private double larg;

	public double getAlt() {
		return alt;
	}

	public void setAlt(double alt) {
		this.alt = alt;
	}

	public double getLarg() {
		return larg;
	}

	public void setLarg(double larg) {
		this.larg = larg;

	}

	public boolean equals(Object q) {

		if (q == null) {
			return false;
		}
		Quadrado q2 = (Quadrado) q;
		if (this.getAlt() == q2.getAlt() && this.getLarg() == q2.getLarg()) {
			return true;
		} else
			return false;

	}
}
