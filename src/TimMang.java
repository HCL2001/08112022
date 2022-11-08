import java.util.Scanner;

public class TimMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Baga", "Lmao", "LukLak", "Quang"};
        System.out.print("Nhap vao mot ten bat ky: ");
        String guessName = sc.next();
        int vitri = -1;
        for (int i = 0; i < names.length; i++){
            if (names[i].equals(guessName))
                vitri = i;
        }
        if (vitri == -1){
            System.out.println("Ten cua ban khong co trong danh sach");
        }else
            System.out.println("Ten cua ban can tim nam o vi tri " + (vitri + 1));
    }
}
