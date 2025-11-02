package BaiTap_Tuan8;

public class TimTheoTacGia implements ITimKiem {
    private String tacGia;

    public TimTheoTacGia(String tacGia) {
        this.tacGia = tacGia.toLowerCase();
    }

    @Override
    public boolean thoaDieuKien(Sach s) {
        return s.getTacGia().toLowerCase().contains(tacGia);
    }
}

