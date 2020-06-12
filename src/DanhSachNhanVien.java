import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanVien {
	//1. Attribute
private ArrayList<NhanVien> listNV; 
//2. get set
	public ArrayList<NhanVien> getListNV() {
		return listNV;
	}
	public void setListNV(ArrayList<NhanVien> listNV) {
		this.listNV = listNV;
	}
//3. Constructors
	public DanhSachNhanVien() {
		this.listNV = new ArrayList<NhanVien>();
	}
		
//4. input output 
	public void nhap(Scanner scan) {
		for (NhanVien nv: this.listNV) {
			nv.nhap(scan);
		}
	}
	public void xuat() {
		for (NhanVien nv: this.listNV) {
			nv.xuat();
		}
	}
	public void  tinhLuong() {
		for (NhanVien nv: this.listNV) {
			nv.tinhLuong();
		}
	}
	public float tinhTongLuong() {
		float sum = 0; 
		for (NhanVien nv: this.listNV) {
			sum += nv.getTinhLuong();
		}
		return sum;
	}
	public void xuatTongLuong() {
		System.out.println("Tổng tiền lương: \t"+ this.tinhTongLuong());
	}
	public void themNhanVien(NhanVien nv) {
			this.listNV.add(nv);
	}
	public ArrayList<NhanVien> timNVCoTienLuongCaoNhat(){
		ArrayList<NhanVien> list = new ArrayList<NhanVien>(); 
		int viTriMaxDauTien = 0; 
		NhanVien nvMax = this.listNV.get(0);
		for (int i = 0; i < this.listNV.size(); i++) {
			NhanVien nvCurrent = this.listNV.get(i);
			if(nvCurrent.getTinhLuong() > nvMax.getTinhLuong()) {
				nvMax = nvCurrent; 
				viTriMaxDauTien = i; 
			}
		}
		//thêm nvMax vào list 
				list.add(nvMax);
		for (int i = viTriMaxDauTien + 1; i < this.listNV.size();i++) {
			NhanVien nvCurrent = this.listNV.get(i);
			if (nvCurrent.getTinhLuong() ==nvMax.getTinhLuong()) {
				list.add(nvCurrent);
			}
		}
		return list; 
	}
}


