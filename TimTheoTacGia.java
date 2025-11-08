package BaiTap_Tuan9;

public class TimTheoTacGia implements ITimKiem {
    private String tacGia;

    public TimTheoTacGia(String tacGia) {
        this.tacGia = tacGia.toLowerCase();
    }

    @Override
    public boolean thoaMan(Sach s) {
        return s.getTacGia().toLowerCase().contains(tacGia);
    }
}



