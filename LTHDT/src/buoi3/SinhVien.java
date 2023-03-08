package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {
	private String mSSV, hoTen;
	private Date ngSinh;
	private int n;
	private String mon[], diem[];
	private final int max = 50;
	
	public  SinhVien() {
		mSSV = new String();
		hoTen = new String();
		ngSinh = new Date();
		n = 0;
		mon = new String[max];
		diem = new String[max];
	}
	
	public  SinhVien(SinhVien S) {
		mSSV = new String(S.mSSV);
		hoTen = new String(S.hoTen);
		ngSinh = new Date(S.ngSinh);
		n = S.n;
		mon = new String[max];
		diem = new String[max];
		for(int i = 0; i<n; i++) {
			mon[i] = new String(S.mon[i]);
			diem[i] = new String(S.diem[i]);
		}
	}
	
	private void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap MSSV: ");
		mSSV = sc.nextLine();
		System.out.println("Nhap Ho Ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap nam sinh: ");
		ngSinh.nhapDate();
		
		
	}
	
	private void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so mon: ");
		n = sc.nextInt();sc.NextLine();
		for(int i=0; i<n; i++) {
			System.out.println("Nhap mon thu "+(i+1)+": ");
			mon[i] = sc.nextLine();
			System.out.println("Nhap diem thu "+(i+1)+": ");
			diem[i] = sc.nextLine();
		}
		
	}
	private String toString() {
		return "MSSV: "+mSSV+"\nHo Ten: "+hoTen+"\nNgay Sinh";
	}
	
	
}
