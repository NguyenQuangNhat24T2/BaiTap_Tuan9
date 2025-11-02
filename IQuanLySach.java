package BaiTap_Tuan8;
import java.util.List;

public interface IQuanLySach{
    void themSach(Sach s);
    boolean xoaSach(String maSach);
    boolean capNhatSach(String maSach, Sach sMoi);
    Sach timSach(String maSach);
    void hienThiDanhSach();
    List<Sach> timKiem(ITimKiem dk);
    double tinhTongGiaTriKho();
}
/*“dịch vụ quản lý sách có thể làm được gì”, nhưng không nói cách làm thế nào. */