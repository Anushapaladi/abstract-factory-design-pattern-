public class MetallicEpoxy extends Epoxy {
    public void prepare() {
        System.out.println("Preparing metallic epoxy");
        material = new Metallic();
    }
}
