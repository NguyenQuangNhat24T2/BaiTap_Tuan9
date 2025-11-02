package BaiTap_Tuan8;

// Lớp trừu tượng triển khai 2 interface IGiaBan và IKiemKe
public abstract class Sach implements IGiaBan, IKiemKe {

    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    private double giaCoBan; // thêm thuộc tính giá cơ bản theo yêu cầu đề bài
    private String viTri; // thêm vị trí trong kho (cần cho IKiemKe)

    public Sach() {}
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String viTri) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
        this.viTri = viTri;
    }

    // Getter & Setter cho tất cả các thuộc tính
    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public String getTieuDe() { return tieuDe; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }

    public int getNamXuatBan() { return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }

    public int getSoLuong() { return soLuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    public String getViTri() { return viTri; }
    public void setViTri(String viTri) { this.viTri = viTri; }

    // Phương thức trừu tượng: lớp con phải ghi đè
    @Override
    public abstract double tinhGiaBan();

    // Các phương thức của IKiemKe sẽ được lớp con triển khai

    @Override
    public String toString() {
        return "Ma sach: " + maSach + "\n" +
               "Tieu de: " + tieuDe + "\n" +
               "Tac gia: " + tacGia + "\n" +
               "Nam xuat ban: " + namXuatBan + "\n" +
               "So luong: " + soLuong + "\n" +
               "Gia co ban: " + giaCoBan + " VND\n" +
               "Vi tri kho: " + viTri + "\n";
    }
}
