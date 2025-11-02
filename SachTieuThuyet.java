package BaiTap_Tuan8;
public class SachTieuThuyet extends Sach 
{
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,int soLuong, double giaCoBan, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.laSachSeries = laSachSeries;
    }

    public boolean isLaSachSeries() { 
        return laSachSeries; 
    }
    public void setLaSachSeries(boolean laSachSeries) { 
        this.laSachSeries = laSachSeries; 
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSeries ? 15000 : 0);
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
               ", La series: " + laSachSeries +
               ", Gia ban: " + tinhGiaBan() + " VND";
    }
}