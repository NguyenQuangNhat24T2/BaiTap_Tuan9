package BaiTap_Tuan8;

public class TimTheoTen implements ITimKiem {
    private String tuKhoa;

    public TimTheoTen(String tuKhoa) {
        this.tuKhoa = tuKhoa.toLowerCase();
    }

    @Override
    public boolean thoaDieuKien(Sach s) {
        return s.getTieuDe().toLowerCase().contains(tuKhoa);
    }
}

