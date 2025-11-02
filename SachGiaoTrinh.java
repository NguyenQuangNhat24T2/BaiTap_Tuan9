package BaiTap_Tuan8;
public class SachGiaoTrinh extends Sach 
{
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh() {}

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String monHoc, String capDo)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
     
    public String getMonHoc()
    {
        return monHoc;
    }
    public void setMonHoc(String monHoc)
    {
        this.monHoc = monHoc;
    }
    public String getCapDo()
    {
        return capDo;
    }
    public void setCapDo(String capDo)
    {
        this.monHoc = capDo;
    }
    /* Trien khai public abstract double tinhGiaBan(); trong lop Sach */
    @Override
    public double tinhGiaBan()
    {
        // Logic: Giá bán = giaCoBan + (Số năm đã xuất bản × 5.000 VNĐ)
        int soNamDaXuatBan;
        soNamDaXuatBan = 2025 - this.getNamXuatBan();
        return this.getGiaCoBan() + (soNamDaXuatBan * 5000);
    }
    // BƯỚC 4: Cập nhật toString()
    // Lưu ý: Anh sẽ KHÔNG thêm giá bán vào đây, 
    // vì Yêu cầu 4 muốn chúng ta gọi nó ở lớp QuanLySach
    @Override
    public String toString()
    {
        return super.toString()+ // Gọi toString() của lớp Sach (in 6 thông tin chung)
        "Mon Hoc: "+monHoc+"\n"+
        "Cap Do: "+capDo+"\n";
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu)
    {
        return this.getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi)
    {
        System.out.println("Da chuyen sach [" + this.getTieuDe()+"] den khu vuc: " + viTriMoi);
    }
}
