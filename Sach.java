package BaiTap_Tuan9;
public abstract class Sach implements IGiaBan, IKiemKe 
{
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan;

    public Sach() {}

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) 
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    // getters / setters
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    // từ interface IGiaBan
    @Override
    public abstract double tinhGiaBan();

    // từ interface IKiemKe: một phương thức mặc định nhưng lớp con có thể override
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) 
    {
        return this.soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) 
    {
        System.out.println("Đã chuyển sách \"" + this.tieuDe + "\" đến: " + viTriMoi);
    }

    @Override
    public String toString() 
    {
        return "Ma sach: " + maSach + "\n" +
               "Tieu de: " + tieuDe + "\n" +
               "Tac gia: " + tacGia + "\n" +
               "Nam xb: " + namXuatBan + "\n" +
               "So luong: " + soLuong + "\n" +
               "Gia co ban: " + giaCoBan;
    }
}
