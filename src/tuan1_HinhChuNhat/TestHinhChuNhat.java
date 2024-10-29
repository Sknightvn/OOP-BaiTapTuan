package tuan1_HinhChuNhat;

import java.util.Scanner;

public class TestHinhChuNhat {

	public static int nhapSoNguyen (String thongbao)
	{
		int a;
		System.out.println(thongbao);
		Scanner scr = new Scanner(System.in);
		a = scr.nextInt();
		return a;
	}
	
	public static HinhChuNhat nhapThongTinDoiTuong()
	{
		int cd, cr;
		HinhChuNhat cn;
		cd=nhapSoNguyen("Nhap chieu dai: ");
		cr=nhapSoNguyen("Nhap chieu rong: ");
		cn= new HinhChuNhat(cd, cr);
		return cn;
	}
	
	static String tieuDe() {
		return String.format("%-10s %-10s %-12s %-12s", "Chieu dai", "Chieu rong", "Dien tich", "Chu vi");
	}
	public static void nhapCung()
	{
		HinhChuNhat cn1, cn2, cn3;
		cn1 = new HinhChuNhat(12, 6);
		cn2 = new HinhChuNhat(8, 3);
		cn3 = new HinhChuNhat(7, 2);
		System.out.println(cn1);
		System.out.println(cn2);
		System.out.println(cn3);
	}
	public static void main(String[] args)
	{
		HinhChuNhat cn1, cn2;
		System.out.println("Chuong trinh xu li HCN");
		System.out.println(tieuDe());
		nhapCung();
		}
}
