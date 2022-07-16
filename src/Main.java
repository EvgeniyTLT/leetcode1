import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите через пробел '(', ')', '{', '}', '[', ']'");
        Boolean result = true;
        String s1 = "(";
        String s2 = ")";
        String s3 = "{";
        String s4 = "}";
        String s5 = "[";
        String s6 = "]";
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] array = s.split(" ");
        for (String u : array
        ) {
            if (!u.equals(s1) && !u.equals(s2) && !u.equals(s3) && !u.equals(s4) && !u.equals(s5) && !u.equals(s6)) {
                System.out.println("направильный ввод");
                result = false;
            }
        }
        if (result) {
            System.out.println("Вы ввели: " + s);
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].equals(s1)) {
                    if (!array[i + 1].equals(s2)) {
                        result = false;
                    }
                } else if (array[i].equals(s3)) {
                    if (!array[i + 1].equals(s4)) {
                        result = false;
                    }
                } else if (array[i].equals(s5)) {
                    if (!array[i + 1].equals(s6)) {
                        result = false;
                    }
                }
            }
            System.out.println(result);
        }
    }
}
