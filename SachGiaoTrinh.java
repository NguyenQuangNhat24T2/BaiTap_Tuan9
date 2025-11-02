package BaiTap_Tuan9;

public class SachGiaoTrinh extends Sach {
    private String monHoc;

    public SachGiaoTrinh(String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri, String monHoc) {
        super(tieuDe, tacGia, giaCoBan, soLuong, viTri);
        this.monHoc = monHoc;
    }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.1; // Giá bán = giá cơ bản + 10%
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        setViTri(viTriMoi);
        System.out.println("Da chuyen sach \"" + getTieuDe() + "\" den khu vuc: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "[Giao trinh] " + super.toString() + ", Mon hoc: " + monHoc + ", Gia ban: " + tinhGiaBan();
    }
}