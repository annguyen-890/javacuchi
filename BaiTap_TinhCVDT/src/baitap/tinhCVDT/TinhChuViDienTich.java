package baitap.tinhCVDT;

import java.util.Scanner;

public class TinhChuViDienTich {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng từ người dùng
        System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        // Hiển thị kết quả
        System.out.println("Chu vi hình chữ nhật là: " + chuVi);
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);
    }
}