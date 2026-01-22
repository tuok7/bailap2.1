/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;
import java.util.Scanner;
import java.util.Arrays;

public class Bai1 {
    // Biến Scanner dùng chung cho tất cả các hàm
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n========= MENU LAB =========");
            System.out.println("1. In loi chao          2. Tong 2 so");
            System.out.println("3. Chan le              4. CV & DT Hinh chu nhat");
            System.out.println("5. So sanh 2 so         6. In tu 1-100");
            System.out.println("7. Tong 1 den n         8. Bang cuu chuong");
            System.out.println("9. Dem chu so           10. Kiem tra SNT");
            System.out.println("11. Tong mang           12. Max/Min mang");
            System.out.println("13. Dao nguoc chuoi     14. Liet ke SNT 1-100");
            System.out.println("15. Quan ly sinh vien   0. Thoat");
            System.out.print("Moi ban chon (0-15): ");
            chon = sc.nextInt();

            switch (chon) {
                case 1 -> bai1();
                case 2 -> bai2();
                case 3 -> bai3();
                case 4 -> bai4();
                case 5 -> bai5();
                case 6 -> bai6();
                case 7 -> bai7();
                case 8 -> bai8();
                case 9 -> bai9();
                case 10 -> bai10();
                case 11 -> bai11();
                case 12 -> bai12();
                case 13 -> bai13();
                case 14 -> bai14();
                case 15 -> bai15();
                case 0 -> System.out.println("Tam biet!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }


    public static void bai1() {
        System.out.println("Xin chào Java!\nTôi đang học lập trình Java.");
    }

    public static void bai2() {
        System.out.print("Nhap a va b: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Tong: " + (a + b));
    }

    public static void bai3() {
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println(n + (n % 2 == 0 ? " la so chan" : " la so le"));
    }

    public static void bai4() {
        System.out.print("Nhap dai va rong: ");
        double d = sc.nextDouble(), r = sc.nextDouble();
        System.out.println("Chu vi: " + (d + r) * 2 + " | Dien tich: " + (d * r));
    }

    public static void bai5() {
        System.out.print("Nhap 2 so: ");
        int a = sc.nextInt(), b = sc.nextInt();
        if (a == b) System.out.println("Hai so bang nhau");
        else System.out.println("So lon hon la: " + Math.max(a, b));
    }

    public static void bai6() {
        for (int i = 1; i <= 100; i++) System.out.print(i + " ");
        System.out.println();
    }

    public static void bai7() {
        System.out.print("Nhap n: ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Tong tu 1 den " + n + " la: " + sum);
    }

    public static void bai8() {
        System.out.print("Nhap n (1-9): ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) System.out.printf("%d x %d = %d\n", n, i, n * i);
    }

    public static void bai9() {
        System.out.print("Nhap so nguyen duong: ");
        int n = Math.abs(sc.nextInt());
        System.out.println("So chu so: " + String.valueOf(n).length());
    }

    public static void bai10() {
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println(n + (isPrime(n) ? " la so nguyen to" : " khong la so nguyen to"));
    }

    public static void bai11() {
        int[] arr = nhapMang();
        int sum = 0;
        for (int x : arr) sum += x;
        System.out.println("Tong mang: " + sum);
    }

    public static void bai12() {
        int[] arr = nhapMang();
        Arrays.sort(arr);
        System.out.println("Min: " + arr[0] + " | Max: " + arr[arr.length - 1]);
    }

    public static void bai13() {
        System.out.print("Nhap chuoi: ");
        sc.nextLine(); // xoa cache
        String s = sc.nextLine();
        System.out.println("Chuoi dao nguoc: " + new StringBuilder(s).reverse());
    }

    public static void bai14() {
        System.out.println("Cac so nguyen to tu 1 den 100:");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bai15() {
        System.out.print("So luong SV: ");
        int n = sc.nextInt();
        String[] ten = new String[n];
        double[] diem = new double[n];
        double tong = 0;

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Ten SV " + (i + 1) + ": "); ten[i] = sc.nextLine();
            System.out.print("Diem: "); diem[i] = sc.nextDouble();
            tong += diem[i];
        }
        System.out.println("--- Ket qua ---");
        System.out.println("Diem TB: " + (tong / n));
        
        // Tim SV diem cao nhat
        int maxIdx = 0;
        for(int i=1; i<n; i++) {
            if(diem[i] > diem[maxIdx]) maxIdx = i;
        }
        System.out.println("SV diem cao nhat: " + ten[maxIdx] + " (" + diem[maxIdx] + " diem)");
        
        // Xep loai
        System.out.println("\n--- Xep loai ---");
        for(int i=0; i<n; i++) {
            String xl = (diem[i]>=8)?"Gioi":(diem[i]>=6.5)?"Kha":(diem[i]>=5)?"TB":"Yeu";
            System.out.println(ten[i] + ": " + xl);
        }
    }

    // --- Ham bo tro (Helper) ---
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }

    public static int[] nhapMang() {
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= "); a[i] = sc.nextInt();
        }
        return a;
    }
}