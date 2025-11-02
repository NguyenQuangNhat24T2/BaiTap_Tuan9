package BaiTap_Tuan9;
public class SachGiaoTrinh extends Sach 
{
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh() {}

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXb, int soLuong, double giaCoBan, String monHoc, String capDo) 
    {
        super(maSach, tieuDe, tacGia, namXb, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() 
    {
        // ví dụ: mỗi năm cũ mất 5k, tăng so với giá cơ bản
        int soNam = 2025 - getNamXuatBan();
        if (soNam < 0) soNam = 0;
        return getGiaCoBan() + soNam * 5000;
    }

    @Override
    public String toString() 
    {
        return super.toString() + "\nMon hoc: " + monHoc + "\nCap do: " + capDo + "\nGia ban (uoc tinh): " + tinhGiaBan();
    }
}
