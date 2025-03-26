import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static Thread inputiLõim = new Thread(() -> {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (Mang.töötab) {
                if (reader.ready()) { // Only read when input is available
                    char key = (char) reader.read();
                    if (key == 'q') {
                        Mang.töötab = false;  // Stop the game
                    }
                    System.out.println("You pressed: " + key);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    });
}