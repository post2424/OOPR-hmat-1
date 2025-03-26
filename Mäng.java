public class Mäng {
    public static boolean töötab = true;
    public static void main(String[] args) {
        Renderdaja renderdaja = new Renderdaja(100);
        int number = 0;
        Input.inputiLõim.start();
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
