import java.util.Scanner;

public class NhanVien {
//1. attributes 
	private String HoTen; 
	private int MaNV; 
	private String DiaChi; 
	private String NgaySinh; 
	private float LuongCB; 
	private float HSL; 
	private float tinhLuong; 
	public float tinhTongLuong;
//2. get set 
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public int getMaNV() {
		return MaNV;
	}
	public void setMaNV(int maNV) {
		MaNV = maNV;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public float getLuongCB() {
		return LuongCB;
	}
	public void setLuongCB(float luongCB) {
		LuongCB = luongCB;
	}
	public float getHSL() {
		return HSL;
	}
	public void setHSL(float hSL) {
		HSL = hSL;
	}
	public float getTinhLuong() {
		return tinhLuong;
	}
	public float gettinhTongLuong() {
		return tinhTongLuong;
	}
//3. Constructor 
	public NhanVien() {};
	public NhanVien(String hoTen, int maNV, String diaChi, String ngaySinh, float luongCB, float HSL) {
		this.HoTen = hoTen;
		this.MaNV = maNV;
		this.DiaChi = diaChi;
		this.NgaySinh = ngaySinh;
		this.LuongCB = luongCB;
		this.HSL = HSL;
		this.tinhTongLuong = tinhTongLuong; 
	}
//Input Output 
	public void nhap(Scanner scan) {
		System.out.println("Nhập tên :");
		this.HoTen = scan.nextLine();
		
		System.out.println("Nhập mã NV :");
		this.MaNV = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhập địa chỉ :");
		this.DiaChi = scan.nextLine();
		
		System.out.println("Nhập Ngày Sinh :");
		this.NgaySinh = scan.nextLine();
		
		System.out.println("Nhập Lương Cơ Bản :");
		this.LuongCB = Float.parseFloat(scan.nextLine());
		
		System.out.println("Nhập Hệ Số Lương :");
		this.HSL = Float.parseFloat(scan.nextLine());
		
	}
	public void xuat() {
	System.out.println("Tên Nhân Viên: "+ this.HoTen+ "\t Mã NV "
	+this.MaNV+"\t Ngày Sinh: "+this.NgaySinh+"\t Lương CB:"+this.LuongCB+"\t HSL:"+this.HSL+"\t Tổng Lương: "+this.tinhLuong); 
	}
	
	public void tinhLuong() {
		this.tinhLuong = this.LuongCB * this.HSL;	
	}
	
}
