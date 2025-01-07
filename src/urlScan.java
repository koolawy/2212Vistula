import java.io.*;
import java.net.URL;

public class urlScan {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first three digits of the bank account:");
        String accountNumber = bufferedReader.readLine();

        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            System.out.println("I'm looking for your bank. Please wait...");
            boolean found = false;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(accountNumber)) {
                    String[] parts = line.split("\\s+", 2);
                    if (parts.length == 2) {
                        System.out.println("Bank number prefix: " + parts[0]);
                        System.out.println("Bank name: " + parts[1]);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("Sorry, there is no bank account with your number.");
            }
        } catch (IOException e) {
            System.out.println("An unexpected error occurred!: " + e.getMessage());
        }
    }
}