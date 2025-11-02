package BaiTap_Tuan8;

public class QuanLySach {
    import java.util.*;

interface IQuanLySach {
    void themSach(Sach s);
    Sach timKiemSach(String tieuDe);
    boolean xoaSach(String tieuDe);
    void hienThiDanhSach();
}

class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach s) {
        danhSach.add(s);
        System.out.println("Da them sach " + s.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String tieuDe) {
        for (Sach s : danhSach) {
            if (s.getTieuDe().equalsIgnoreCase(tieuDe)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String tieuDe) {
        Sach s = timKiemSach(tieuDe);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach" + tieuDe);
            return true;
        }
        System.out.println("Khong tim thay sach can xoa");
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println("Danh sach hien co:");
        for (Sach s : danhSach) {
            System.out.println(s);
        }
    }
}

