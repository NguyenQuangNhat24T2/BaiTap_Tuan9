package BaiTap_Tuan9;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Khởi tạo quản lý sách
        QuanLySachImpl quanLy = new QuanLySachImpl(); 

        Sach s1 = new SachGiaoTrinh(
            "Lap trinh huong doi tuong", "Nguyen Van A", 100000, 10, "Ke A1", "Cong nghe thong tin"
        ); // Gia ban: 110,000
        Sach s2 = new SachTieuThuyet(
            "Toi thay hoa vang tren co xanh", "Nguyen Nhat Anh", 150000, 5, "Ke B2", "Tinh cam"
        ); // Gia ban: 180,000
        Sach s3 = new SachTieuThuyet(
            "Dac nhan tam", "Dale Carnegie", 120000, 8, "Ke B1", "Ky nang song"
        ); // Gia ban: 144,000

        // Thêm sách
        System.out.println("===== THEM SACH =====");
        quanLy.themSach(s1);
        quanLy.themSach(s2);
        quanLy.themSach(s3);

        // Hiển thị danh sách ban đầu
        System.out.println("\n===== DANH SACH SACH HIEN CO =====");
        quanLy.hienThiDanhSach();

        // Kiểm tra tồn kho và Cập nhật vị trí
        System.out.println("\n===== KIEM KE & CAP NHAT VI TRI =====");
        Sach sachCheck = quanLy.timKiemSach("Toi thay hoa vang tren co xanh");
        if (sachCheck != null) {
            int soLuongToiThieu = 4;
            System.out.println("So luong toi thieu yeu cau: " + soLuongToiThieu);
            if (sachCheck.kiemTraTonKho(soLuongToiThieu)) {
                System.out.println("-> Du so luong ton kho!");
            } else {
                System.out.println("-> Sach ton kho it hon yeu cau!");
            }
            sachCheck.capNhatViTri("Ke C3");
        }
        
        // Thống kê
        System.out.println("\n===== THONG KE KHO SACH =====");
        System.out.println("Tong so luong sach hien co: " + quanLy.tinhTongSoLuongSach() + " cuon.");
        System.out.printf("Tong gia tri ton kho (tinh theo gia ban): %.0f VND.\n", quanLy.tinhTongGiaTriTonKho());

        // Tìm kiếm nâng cao
        System.out.println("\n===== TIM KIEM NANG CAO =====");
        String tacGiaCanTim = "Nguyen Nhat Anh";
        List<Sach> sachTheoTacGia = quanLy.timKiemSachTheoTacGia(tacGiaCanTim);
        System.out.println("-> Ket qua tim kiem theo Tac gia: " + tacGiaCanTim);
        for (Sach s : sachTheoTacGia) {
            System.out.println("    - " + s.getTieuDe() + " (Vi tri: " + s.getViTri() + ")");
        }

        // Sắp xếp
        System.out.println("\n===== SAP XEP DANH SACH =====");
        
        System.out.println("\n-> SAP XEP THEO GIA BAN (Tang dan):");
        quanLy.sapXepTheoGiaBan();
        quanLy.hienThiDanhSach();

        System.out.println("\n-> SAP XEP THEO TIEU DE (A-Z):");
        quanLy.sapXepTheoTieuDe();
        quanLy.hienThiDanhSach();
        
        // Xóa sách
        System.out.println("\n===== XOA SACH =====");
        quanLy.xoaSach("Dac nhan tam"); 

        // Hiển thị lại danh sách sau khi xóa
        System.out.println("\n===== DANH SACH SACH CUOI CUNG =====");
        quanLy.hienThiDanhSach();
    }
}