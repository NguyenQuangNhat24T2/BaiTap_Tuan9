package BaiTap_Tuan9;
public class SachTieuThuyet extends Sach 
{
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet() {}

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXb, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) 
    {
        super(maSach, tieuDe, tacGia, namXb, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() 
    {
        return getGiaCoBan() + (laSachSeries ? 15000 : 0);
    }

    @Override
    public String toString() {
        return super.toString() + "\nThe loai: " + theLoai + "\nLa series: " + (laSachSeries ? "Co" : "Khong") + "\nGia ban (uoc tinh): " + tinhGiaBan();
    }
}
