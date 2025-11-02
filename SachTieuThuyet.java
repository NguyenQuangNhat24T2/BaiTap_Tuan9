package BaiTap_Tuan8;
public class SachTieuThuyet extends Sach 
{
    private String theLoai;
    private boolean laSachSeries;
    
    public SachTieuThuyet() {};

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries)
    {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai()
    {
        return theLoai;
    }
    public void setTheLoai(String theLoai)
    {
        this.theLoai = theLoai;
    }
    public boolean getLaSachSeries()
    {
        return laSachSeries;
    }
    public void setLaSachSeries(boolean laSachSeries)
    {
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan()
    {
        // Logic: Giá bán = giaCoBan + (Nếu laSachSeries là true thì cộng thêm 15.000 VNĐ)
        if(this.laSachSeries)
            return this.getGiaCoBan() + 15000;
        else
            return this.getGiaCoBan();

        // Cách 2: Dùng toán tử 3 ngôi (ngầu hơn)
        /* return this.getGiaCoBan() + (this.laSachSeries ? 15000 : 0);*/
    }
    @Override
    public String toString()
    {
        return super.toString()+
        "The loai: "+theLoai+"\n"+
        "La sach series: "+(laSachSeries ? "Co" : "Khong")+"\n";
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu)
    {
        return this.getSoLuong() >= soLuongToiThieu; /*them () de lay gia tri tu 1 method */
    }

    @Override
    public void capNhatViTri(String viTriMoi)
    {
        System.out.println("Da chuyen sach [ "+this.getTieuDe()+"] den khu vuc "+ viTriMoi);
    }
}
