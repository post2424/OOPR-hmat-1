public class Mangija implements Ese{
    private byte elupunktid;
    private int[] positsioon;
    private byte kiirus;

    public Mangija(byte elupunktid, int[] positsioon) {
        this.elupunktid = elupunktid;
        this.positsioon = positsioon;
    }

    public byte getKiirus() {
        return kiirus;
    }

    public void setKiirus(byte kiirus) {
        this.kiirus = kiirus;
    }
}
