import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.print("Nhap vao ten: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");
    }
}