
import java.util.ArrayList;
import java.util.Scanner;

public class xuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DanhSachNhanVien ds = new DanhSachNhanVien();
		doMenu(ds);
	}

	private static void inMenu() {
		System.out.println("Vui Lòng Chọn Thực hiện: ");
		System.out.println("1. Thêm NV");
		System.out.println("2. Xuất NV");
		System.out.println("3. NV có tiền lương cao nhất ");
		System.out.println("0. Thoát");
	}

	private static void doMenu(DanhSachNhanVien ds) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		do {
			inMenu();
			System.out.println("Mời chọn: ");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				NhanVien nv = new NhanVien();
				nv.nhap(scan);
				ds.themNhanVien(nv);
				break;
			case 2:
				ds.tinhLuong();
				ds.xuat();
				ds.xuatTongLuong();
				break;
			case 3:
				ArrayList<NhanVien> list = ds.timNVCoTienLuongCaoNhat();
				for (NhanVien nv1: list) {
					nv1.xuat();
				}
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}
}
