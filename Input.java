import java.io.IOException;
public class Input {
    private static boolean running = true;
    public static void main(String[] args) throws Exception {
        System.out.println("Press a key (Press 'q' to quit):");
        Thread inputiLõim = new Thread(() -> {
            try {
                while (running) {
                    int key = System.in.read(); // Reads one character
                    if (key == 'q') {
                        running = false;
                    }
                    System.out.println("You pressed: " + (char) key);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        inputiLõim.start();
        int number = 0;
        while (running){
            number++;
            System.out.println(number);
            System.out.println();
            try {
                Thread.sleep(100); // 2000 milliseconds = 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("läbig");
    }
}
