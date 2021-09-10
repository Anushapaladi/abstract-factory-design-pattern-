public class FlakesEpoxy extends Epoxy {

	public void prepare() {
		System.out.println("Preparing flakes epoxy");
		material = new Flakes();
	}

}
