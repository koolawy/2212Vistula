import java.io.*;
public class InOut {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\gosia\\IdeaProjects\\2212InOut\\src\\dokLabyJava.txt"; // Podaj nazwę lub ścieżkę pliku źródłowego
        String targetFile = "C:\\Users\\gosia\\IdeaProjects\\2212InOut\\src\\testjava.txt"; // Podaj nazwę lub ścieżkę pliku docelowego
        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replace(" ", "-");
                writer.write(modifiedLine);
                writer.newLine();
            }
            System.out.println("Your file has been copied and I switched spaces with -.");
        } catch (IOException e) {
            System.err.println("There was an error while coping your file: " + e.getMessage());
        }
    }
}