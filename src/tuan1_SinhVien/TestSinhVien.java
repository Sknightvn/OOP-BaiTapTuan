package tuan1_SinhVien;

import java.util.Scanner;

public class TestSinhVien {
	public static void main(String[] args) {
        // Creating 3 student objects
        SinhVien sv1 = new SinhVien(1, "Luu Tran Bao Khanh", 8.5f, 9.0f);
        SinhVien sv2 = new SinhVien(2, "Nguyen Hong Thanh", 7.5f, 8.0f);
        SinhVien sv3 = new SinhVien();

        // Input details for sv3
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ma sinh vien: ");
        sv3.setMaSV(scanner.nextInt());
        scanner.nextLine(); // Consume newline12
        
        System.out.print("Nhap ho ten sinh vien: ");
        sv3.setHoTen(scanner.nextLine());
        
        System.out.print("Nhap diem LT: ");
        sv3.setDiemLT(scanner.nextFloat());
        
        System.out.print("Nhap diem TH: ");
        sv3.setDiemTH(scanner.nextFloat());

        // Print header
        System.out.printf("%-10s%-30s%10s%10s%10s\n", "MSSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
        
        // Print student information
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
    }
}
