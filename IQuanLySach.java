package BaiTap_Tuan9;
import java.util.List;
public interface IQuanLySach 
{
    void themSach(Sach s);
    Sach timKiemTheoMa(String maSach);
    boolean xoaSach(String maSach);
    List<Sach> timKiemTheoTieuDe(String phanChu);
    void hienThiDanhSach();
}
