import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static Thread inputiLõim = new Thread(() -> {
        Mangija a = new Mangija((byte) 50, new int[]{0, 0});
        Mangija b = new Mangija((byte) 50, new int[]{0, 0});
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (Mang.töötab) {
                if (reader.ready()) { // Only read when input is available
                    char key = (char) reader.read();
                    //mängija a
                    if (key == 'q') {
                        Mang.töötab = false;
                    } else if (key == 'd') {
                        a.setKiirus((byte) (a.getKiirus()+1));
                        System.out.println(a.getKiirus());
                    } else if (key == 'a') {
                        a.setKiirus((byte) (a.getKiirus() - 1));
                        System.out.println(a.getKiirus());
                    }
                    System.out.println("You pressed: " + key);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    });
}