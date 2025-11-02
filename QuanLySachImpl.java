package BaiTap_Tuan9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach, IThongKeSach, ITimKiemNangCao, ISapXepSach {
    private List<Sach> danhSachSach = new ArrayList<>();

    // -- IQuanLySach --
    @Override
    public void themSach(Sach s) {
        danhSachSach.add(s);
        System.out.println(" Da them sach: " + s.getTieuDe());
    }

    @Override
    public Sach timKiemSach(String tieuDe) {
        for (Sach s : danhSachSach) {
            if (s.getTieuDe().equalsIgnoreCase(tieuDe)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String tieuDe) {
        Sach sach = timKiemSach(tieuDe);
        if (sach != null) {
            danhSachSach.remove(sach);
            System.out.println(" Da xoa sach: " + tieuDe);
            return true;
        }
        System.out.println(" Khong tim thay sach can xoa!");
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        System.out.println(" DANH SACH SACH:");
        for (Sach s : danhSachSach) {
            System.out.println(s);
        }
    }

    // -- IThongKeSach --
    @Override
    public int tinhTongSoLuongSach() {
        int tongSoLuong = 0;
        for (Sach s : danhSachSach) {
            tongSoLuong += s.getSoLuong();
        }
        return tongSoLuong;
    }

    @Override
    public double tinhTongGiaTriTonKho() {
        double tongGiaTri = 0;
        for (Sach s : danhSachSach) {
            tongGiaTri += s.tinhGiaBan() * s.getSoLuong();
        }
        return tongGiaTri;
    }

    // -- ITimKiemNangCao --
    @Override
    public List<Sach> timKiemSachTheoTacGia(String tacGia) {
        List<Sach> ketQua = new ArrayList<>();
        for (Sach s : danhSachSach) {
            if (s.getTacGia().equalsIgnoreCase(tacGia)) {
                ketQua.add(s);
            }
        }
        return ketQua;
    }

    @Override
    public List<Sach> timKiemSachTheoViTri(String viTri) {
        List<Sach> ketQua = new ArrayList<>();
        for (Sach s : danhSachSach) {
            if (s.getViTri().equalsIgnoreCase(viTri)) {
                ketQua.add(s);
            }
        }
        return ketQua;
    }
    
    // -- ISapXepSach --
    @Override
    public void sapXepTheoTieuDe() {
        Collections.sort(danhSachSach); 
    }

    @Override
    public void sapXepTheoGiaBan() {
        Collections.sort(danhSachSach, new Comparator<Sach>() {
            @Override
            public int compare(Sach s1, Sach s2) {
                return Double.compare(s1.tinhGiaBan(), s2.tinhGiaBan());
            }
        });
    }
}