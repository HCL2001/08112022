import java.util.Scanner;

public class CountChar {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String name;
        System.out.print("Nhap mot chuoi: ");
        name = sc.next();
        System.out.print("Nhap vao mot ky tu: ");
        char kytu = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < name.length(); i++){
            if (kytu == name.charAt(i))
                count++;
        }
        System.out.print(count);
    }
}
