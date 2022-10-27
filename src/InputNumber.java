import java.util.Scanner;

public class InputNumber {
    public String getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четырехзначное число:");
        String findString = scanner.nextLine();
        if ((findString.length() != 4) || (!findString.matches("[0-9]+"))) {
            System.out.println("Вы ввели не четырехзначное число!");
            return "error";
        } else {
            return findString;
        }
    }
}
