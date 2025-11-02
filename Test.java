package BaiTap_Tuan8;

import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
         // Gọi theo kiểu interface
        IQuanLySach quanLy = new QuanLySachImpl(); //Tao doi tuong ql de su dung tu ban thiet ke QuanLySach

        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT001", "I love you", "Nguyen Thai Ky Duyen", 2022, 10, 100000.0, "Lap trinh", "Dai hoc");
        SachTieuThuyet st1 = new SachTieuThuyet("TT001", "Nhung chang trai xau tinh", "Nguyen Nhat Anh", 2000, 50, 150000.0, "Fantasy", true);

        quanLy.themSach(sg1);
        quanLy.themSach(st1);

        System.out.println("========Danh sach sau khi them========");
        
        quanLy.hienThiDanhSach();
        
        System.out.println("=== Kiem tra chuc nang Giao dien (Interface) IKiemKe ===");

        IKiemKe kiemKe_st1 = st1; /*be asked */

        int soLuongCanKiemTra = 100;
        boolean duHang;
        duHang = kiemKe_st1.kiemTraTonKho(soLuongCanKiemTra);
        System.out.println("Kiem tra ton kho (>= " + soLuongCanKiemTra + "): " + (duHang ? "Du hang" : "Thieu hang"));

        soLuongCanKiemTra = 30;
        duHang = kiemKe_st1.kiemTraTonKho(soLuongCanKiemTra);
        System.out.println("Kiem tra ton kho (>= " + soLuongCanKiemTra + "): " + (duHang ? "Du hang" : "Thieu hang"));

        kiemKe_st1.capNhatViTri("Kho A1-Kệ 5");

        System.out.println("--- Test voi Sach Giao Trinh ---");
        IKiemKe kiemKe_sg1 = sg1;
        kiemKe_sg1.capNhatViTri("Khu vuc Sach Lap Trinh");
/* thêm của chức năng tìm kiếm theo tên + tác giả */
        System.out.println("\n=== Tim sach theo ten co chu 'love' ===");
        for (Sach s : quanLy.timKiem(new TimTheoTen("love"))) {
            System.out.println(s);
        }

        System.out.println("\n=== Tim sach theo tac gia 'Nguyen Nhat Anh' ===");
        for (Sach s : quanLy.timKiem(new TimTheoTacGia("Nguyen Nhat Anh"))) {
            System.out.println(s);
        }

        System.out.println("\nTong gia tri kho sach: " + quanLy.tinhTongGiaTriKho() + " VND");

    }
}
