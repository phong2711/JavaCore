//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class u01_arithmetic_operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x ,y;
        System.out.println("Nhap so thu nhat = ");
        x = scanner.nextInt();
        System.out.println("Nhap so thu hai = ");
        y = scanner.nextInt();

        int z = x + y;
        System.out.println("Tong cua x va y = " + z);

        int a, b;
        System.out.println("So thu nhat = ");
        a = scanner.nextInt();
        System.out.println("So thu hai = ");
        b = scanner.nextInt();

        int c = a * b;
        System.out.println("Tich cua a va b = " + c);

        int p ,l;
        System.out.println("Nhap so thu nhat");
        p = scanner.nextInt();
        System.out.println("Nhap so thu hai");
        l = scanner.nextInt();

        int n = p - l;
        System.out.println("Hieu cua p va l = " + n);

        int v, m;
        System.out.println("Nhap so thu nhat = ");
        v = scanner.nextInt();
        System.out.println("Nhap so thu hai = ");
        m = scanner.nextInt();

        int d = v / m ;
        System.out.println("Thuong cua v và m = " + d);


        int s, g;
        System.out.println("Nhap so thu nhat = ");
        s = scanner.nextInt();
        System.out.println("Nhap so thu hai = ");
        g = scanner.nextInt();

        int t = s % g;
        System.out.println("Phan du cua s va g = " + t);

    }
}