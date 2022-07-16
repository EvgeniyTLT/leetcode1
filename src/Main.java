import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите через пробел '(', ')', '{', '}', '[', ']'");
        int counter = 0;
        boolean result = true;
        String s1 = "(";
        String s2 = ")";
        String s3 = "{";
        String s4 = "}";
        String s5 = "[";
        String s6 = "]";
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] array = s.split(" ");
        for (String u : array) {
            if (!u.equals(s1) && !u.equals(s2) && !u.equals(s3) && !u.equals(s4) && !u.equals(s5) && !u.equals(s6)) {
                System.out.println("направильный ввод");
                return;
            }
        }
        if (array.length % 2 != 0) {
            System.out.println("Вы ввели нечетное число");
            return;
        }

        while (result && counter < array.length) {
            if (array[counter].equals(s1)) {
                if (!array[counter + 1].equals(s2)) {
                    result = false;
                }
            } else if (array[counter].equals(s3)) {
                if (!array[counter + 1].equals(s4)) {
                    result = false;
                }
            } else if (array[counter].equals(s5)) {
                if (!array[counter + 1].equals(s6)) {
                    result = false;
                }
            } else if (array[counter].equals(s2)) {
                if (!array[counter + 1].equals(s1)) {
                    result = false;
                }
            } else if (array[counter].equals(s4)) {
                if (!array[counter + 1].equals(s3)) {
                    result = false;
                }
            } else if (array[counter].equals(s6)) {
                if (!array[counter + 1].equals(s5)) {
                    result = false;
                }
            }
            counter += 2;
        }
        System.out.println("результат: " + result);
    }
}

