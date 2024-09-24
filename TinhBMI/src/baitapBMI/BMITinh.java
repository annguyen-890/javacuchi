package baitapBMI;

import java.util.Scanner;

public class BMITinh {
	
	public static void main(String[] args) {
		
		Scanner banPhim = new Scanner (System.in);
		
		//Nhap Ho Ten
		System.out.print("Ho ten: ");
		String hoTen= banPhim.nextLine();
		// Nhap Chieu Cao
		System.out.print("Chieu cao: ");
		double chieuCao= banPhim.nextDouble();
		// Nhap can nang
		System.out.print("Cang nang: ");
		double canNang= banPhim.nextDouble();
		
		// Tinh chi so BMI
		double bmi = canNang/ (chieuCao*chieuCao);
		
		// In thong tin ra
		System.out.println("Ban" + hoTen);
		System.out.println("Co chi so BMI" + bmi);
		
		if (bmi<18.5)
				System.out.println("Thieu can");
		else if (bmi<25)
			System.out.println("Binh thuong");
		else if (bim<30)
			System.out.println("Tien Beo Phi");
		else if (bim<35)
			System.out.println("Beo Phi do 1");
		else if (bim<40)
			System.out.println("Beo Phi do 2");
		else (bim<40)
			System.out.println("Beo Phi do 3");
	}
	}
	}

}
