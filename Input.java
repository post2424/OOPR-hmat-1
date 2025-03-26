import java.io.IOException;
public class Input {
    public static Thread inputiLõim = new Thread(() -> {
        try {
            while (Mäng.töötab) {
                int key = System.in.read(); // Reads one character
                if (key == 'q') {
                    Mäng.töötab = false;
                }
                System.out.println("You pressed: " + (char) key);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    });
}
