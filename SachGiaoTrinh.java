package BaiTap_Tuan8;
public class SachGiaoTrinh {
    private String monHoc;
    public SachGiaoTrinh(String tieuDe, double giaCoBan, int soLuong, String viTri, String monHoc) {
        super(tieuDe, giaCoBan, soLuong, viTri);
        this.monHoc = monHoc;
    }

    // Hoàn thiện IGiaBan
    @Override
    public double tinhGiaBan() {
        return getGiaCoBan() * 1.1;  // Ví dụ: sách giáo trình có VAT 10%
    }

    // Hoàn thiện IKiemKe
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        setViTri(viTriMoi);
        System.out.println("Da chuyen sach" + getTieuDe() + " den khu vuc " + viTriMoi);
    }

    @Override
    public String toString() {
        return "Giao trinh- " + getTieuDe() +
               "Mon hoc" + monHoc +
               "Gia ban" + tinhGiaBan() +
               "So luong" + getSoLuong() +
               "Vi tri" + getViTri();
    }
}
