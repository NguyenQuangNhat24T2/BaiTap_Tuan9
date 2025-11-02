package BaiTap_Tuan9;
public class SachThamKhao extends Sach 
{
    private double mucThuePhanTram; // phần mở rộng: thuế (%)

    public SachThamKhao() {}

    public SachThamKhao(String maSach, String tieuDe, String tacGia, int namXb, int soLuong, double giaCoBan, double mucThuePhanTram) 
    {
        super(maSach, tieuDe, tacGia, namXb, soLuong, giaCoBan);
        this.mucThuePhanTram = mucThuePhanTram;
    }

    @Override
    public double tinhGiaBan() 
    {
        double base = getGiaCoBan() * getSoLuong();
        return base + base * (mucThuePhanTram / 100.0);
    }

    @Override
    public String toString() 
    {
        return super.toString() + "\nThue%: " + mucThuePhanTram + "\nGia ban tong (uoc tinh): " + tinhGiaBan();
    }
}
