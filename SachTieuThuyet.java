package BaiTap_Tuan8;

public class SachTieuThuyet {
class SachTieuThuyet extends Sach {
    private String theLoai;

    public SachTieuThuyet(String tieuDe, double giaCoBan, int soLuong, String viTri, String theLoai) {
        super(tieuDe, giaCoBan, soLuong, viTri);
        this.theLoai = theLoai;
    }

    // Hoàn thiện IGiaBan
    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.2; // Tiểu thuyết bán cao hơn 20%
    }

    // Hoàn thiện IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        setViTri(viTriMoi);
        System.out.println("Da chuyen sach" + getTieuDe() + "den khu vuc" + viTriMoi);
    }

    @Override
    public String toString() {
        return "Tieu thuyet" + getTieuDe() +
               "The loai" + theLoai +
               "Gia ban" + tinhGiaBan() +
               "So luong" + getSoLuong() +
               "Vi tri" + getViTri();
    }
}

