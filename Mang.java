public class Mang {
    public static boolean töötab = true;
    public static void main(String[] args) {
        Renderdaja renderdaja = new Renderdaja(100);
        Mangija a = new Mangija((byte) 50, new int[]{0, 0});
        Mangija b = new Mangija((byte) 50, new int[]{0, 0});
        int number = 0;
        Input.inputiLõim.start();
        a.liigu();
        while (töötab){
            number++;
            System.out.println(number);
            System.out.println();
            try {
                Thread.sleep(100); // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
