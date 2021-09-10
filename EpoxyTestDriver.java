public class EpoxyTestDriver {
	public static void main(String[] args) {
		EpoxyStore store = new NYEpoxyStore();

		Epoxy epoxy = store.orderEpoxy("metallic");
		System.out.println(epoxy + "\n");

		epoxy = store.orderEpoxy("flakes");
		System.out.println(epoxy);
	}
}
