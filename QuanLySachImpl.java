package BaiTap_Tuan9;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySachImpl implements IQuanLySach 
{
    private final List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) 
    {
        if (s == null) return;
        danhSach.add(s);
        System.out.println("Đã thêm: " + s.getMaSach() + " - " + s.getTieuDe());
    }

    @Override
    public Sach timKiemTheoMa(String maSach) 
    {
        if (maSach == null) return null;
        for (Sach s : danhSach) 
        {
            if (s.getMaSach().equalsIgnoreCase(maSach.trim())) return s;
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) 
    {
        Sach s = timKiemTheoMa(maSach);
        if (s != null) 
        {
            danhSach.remove(s);
            System.out.println("Đã xóa sách mã: " + maSach);
            return true;
        } else 
        {
            System.out.println("Không tìm thấy sách mã: " + maSach);
            return false;
        }
    }

    @Override
    public List<Sach> timKiemTheoTieuDe(String phanChu) 
    {
        if (phanChu == null) return new ArrayList<>();
        String key = phanChu.toLowerCase();
        return danhSach.stream()
                .filter(s -> s.getTieuDe().toLowerCase().contains(key))
                .collect(Collectors.toList());
    }

    @Override
    public void hienThiDanhSach() 
    {
        if (danhSach.isEmpty()) 
        {
            System.out.println("Danh sách rỗng.");
            return;
        }
        System.out.println("=== DANH SÁCH SÁCH ===");
        for (Sach s : danhSach) 
        {
            System.out.println(s);
            System.out.println("-------------------------");
        }
    }

    // Phần mở rộng: thống kê tổng giá bán (tính theo tinhGiaBan mỗi sách)
    public double tongGiaBanTatCa() 
    {
        double tong = 0;
        for (Sach s : danhSach) tong += s.tinhGiaBan();
        return tong;
    }
}
