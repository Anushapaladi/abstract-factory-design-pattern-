public class NYEpoxyStore extends EpoxyStore {

    protected Epoxy createEpoxy(String type) {
        Epoxy epoxy = null;

        if (type.equals("flakes"))
            epoxy = new FlakesEpoxy();
        else if (type.equals("metallic"))
            epoxy = new MetallicEpoxy();

        return epoxy;
    }
}
