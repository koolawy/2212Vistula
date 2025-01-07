public class MainForException {
    public static void main(String[] args) {
        try {
            ExceptionGenerator.generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("An error just occurred!");
            System.out.println(e.toString());
            e.printStackTrace();

        }
    }
}
