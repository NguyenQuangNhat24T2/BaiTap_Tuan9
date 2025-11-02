package BaiTap_Tuan8;
public class SachGiaoTrinh extends Sach 
{
    private String monHoc;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
    }
    public String getMonHoc() { 
        return monHoc; 
    }
    public void setMonHoc(String monHoc) { 
        this.monHoc = monHoc; 
    }

    @Override
    public double tinhGiaBan()  {
        int soNam = 2025 - namXuatBan;
        return giaCoBan + (soNam * 5000);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Da chuyen sach [" + tieuDe + "] den khu vuc: " + viTriMoi);
    }
    
    @Override
    public String toString() 
    {
        return super.toString() +
               ", Mon hoc: " + monHoc +
               ", Gia ban: " + tinhGiaBan() + " VND";
    }
}