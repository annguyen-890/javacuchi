package baitap.quydoidonvi;

import java.util.Scanner;

public class Baitap_QuyDoiDonVi {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lựa chọn loại chuyển đổi
        System.out.println("Chọn loại chuyển đổi:");
        System.out.println("1. Km -> M");
        System.out.println("2. Byte -> Bit");
        System.out.print("Lựa chọn của bạn: ");
        int luaChon = scanner.nextInt();

        switch (luaChon) {
            case 1:
                // Chuyển đổi Km sang M
                System.out.print("Nhập số Km: ");
                double soKm = scanner.nextDouble();
                double soM = soKm * 1000; // 1 Km = 1000 m
                System.out.println(soKm + " Km = " + soM + " m");
                break;
            case 2:
                // Chuyển đổi Byte sang Bit
                System.out.print("Nhập số Byte: ");
                double soByte = scanner.nextDouble();
                double soBit = soByte * 8; // 1 Byte = 8 Bit
                System.out.println(soByte + " Byte = " + soBit + " Bit");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }
}