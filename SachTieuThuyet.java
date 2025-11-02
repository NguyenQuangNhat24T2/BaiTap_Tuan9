package BaiTap_Tuan9;

public class SachTieuThuyet extends Sach {
    private String theLoai;

    public SachTieuThuyet(String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri, String theLoai) {
        super(tieuDe, tacGia, giaCoBan, soLuong, viTri);
        this.theLoai = theLoai;
    }

    public String getTheLoai() { return theLoai; }
    public void setTheLoai(String theLoai) { this.theLoai = theLoai; }

    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.2; // Giá bán = giá cơ bản + 20%
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
        return "[Tieu thuyet] " + super.toString() + ", The loai: " + theLoai + ", Gia ban: " + tinhGiaBan();
    }
}