package baitap.doingoaite;

import java.util.Scanner;

public class DoiNgoaiTe {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tỉ giá hiện tại của USD sang VND
        double tiGia = 24000; 

        // Nhập số tiền USD từ người dùng
        System.out.print("Nhập số tiền USD: ");
        double soTienUSD = scanner.nextDouble();

        // Đổi sang VND
        double soTienVND = soTienUSD * tiGia;

        // Hiển thị kết quả
        System.out.println(soTienUSD + " USD = " + soTienVND + " VND");
    }
}