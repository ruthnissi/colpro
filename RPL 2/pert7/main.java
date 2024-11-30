public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");

        String[] books = {"Java Programming", "Database Design", "Web Development"};
        System.out.println("Available Books:");
        for (String book : books){
            System.out.println("- " + book);
        }
    }
}
