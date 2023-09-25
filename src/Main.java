import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int MAXFLOR = 25;
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        String viv = "";
        while (true) {
            System.out.println("Ввод номеров этажей");
            String input = scanner.nextLine();
            if (Integer.parseInt(input) == 0) {
                for (String s: queue) {
                    System.out.print(s);
                }
                return;
            }
            
            if (queue.isEmpty()) {
                viv = " -> ";
            } else {
                viv = "";
            }

            if (Integer.parseInt(input) > MAXFLOR) {
                System.out.println("Вы ввели неправильный этаж, попробуйте от 1 до 25");
            } else {
                queue.offer("Этаж " + input + viv);
            }
        }
    }
}
