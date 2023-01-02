import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Linked-list");

        LinkedList<String> wishlist = new LinkedList<>();

        wishlist.add("Menyelesaikan laporan TA");
        wishlist.add("Ujian Pendadaran");
        wishlist.add("Wisuda");

        Scanner scanner = new Scanner(System.in);

        Boolean isProgramRunning = true;

        while (isProgramRunning){
            System.out.println("Menu");
            System.out.println("0. End program");
            System.out.println("1. Show");
            System.out.println("2. Add first");
            System.out.println("3. Add last");
            System.out.println("4. Remove first");
            System.out.println("5. Remove last");
            System.out.println("\nPlease choose the menu:");

            Integer choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 0 -> {
                    System.out.println("Exit program");
                    isProgramRunning = false;
                }
                case 1 -> {
                    System.out.println("Showing wishlist");
                    System.out.println("Total\t: " + wishlist.size());
                    System.out.println(wishlist);
                }
                case 2 -> {
                    System.out.println("Please enter your wishlist: ");
                    String playlistName = scanner.nextLine();
                    wishlist.addFirst(playlistName);
                    System.out.println(playlistName + " added to first wishlist\n");
                }
                case 3 -> {
                    System.out.println("Please enter your wishlist: ");
                    String playlistName = scanner.nextLine();
                    wishlist.addLast(playlistName);
                    System.out.println(playlistName + " Added to last wishlist\n");
                }
                case 4 -> {
                    System.out.println("Remove " + wishlist.getFirst());
                    wishlist.removeFirst();
                }
                case 5 -> {
                    System.out.println("Remove " + wishlist.getLast());
                    wishlist.removeLast();
                }
                default -> isProgramRunning = false;
            }
        }
    }
}