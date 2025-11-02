package BaiTap_Tuan9;

public abstract class Sach implements IGiaBan, IKiemKe, Comparable<Sach> {
    private String tieuDe;
    private String tacGia;
    private double giaCoBan;
    private int soLuong;
    private String viTri;

    public Sach(String tieuDe, String tacGia, double giaCoBan, int soLuong, String viTri) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.giaCoBan = giaCoBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    // Getter & Setter
    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public String getViTri() { return viTri; }
    public void setViTri(String viTri) { this.viTri = viTri; }

    @Override
    public int compareTo(Sach other) {
        return this.tieuDe.compareToIgnoreCase(other.tieuDe);
    }

    @Override
    public String toString() {
        return "Tieu de: " + tieuDe +
               ", Tac gia: " + tacGia +
               ", Gia co ban: " + giaCoBan +
               ", So luong: " + soLuong +
               ", Vi tri: " + viTri;
    }
}
