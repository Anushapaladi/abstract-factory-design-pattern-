public abstract class EpoxyStore {
	protected abstract Epoxy createEpoxy(String type);

	public Epoxy orderEpoxy(String type) {
		Epoxy epoxy = createEpoxy(type);
		System.out.println("---- Making a " + type + " epoxy floor----");
		epoxy.prepare();
		return epoxy;
	}
}
