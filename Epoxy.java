public abstract class Epoxy {
	Material material;

	abstract void prepare();

	public String toString() {
		return material + " epoxy floor covering prepared.";
	}
}
