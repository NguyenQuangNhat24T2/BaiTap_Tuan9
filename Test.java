public package BaiTap_Tuan8;

public class Test {
    public static void main(String[] args) {
        // Khởi tạo quản lý sách
        IQuanLySach quanLy = new QuanLySachImpl();

        Sach s1 = new SachGiaoTrinh(
            "Lap trinh huong doi tuong", "Nguyen Van A", 100000, 10, "Ke A1", "Cong nghe thong tin"
        );
        Sach s2 = new SachTieuThuyet(
            "Toi thay hoa vang tren co xanh", "Nguyen Nhat Anh", 150000, 5, "Ke B2", "Tinh cam"
        );
        Sach s3 = new SachTieuThuyet(
            "Dac nhan tam", "Dale Carnegie", 120000, 8, "Ke B1", "Ky nang song"
        );

        // Thêm sách vào hệ thống
        quanLy.themSach(s1);
        quanLy.themSach(s2);
        quanLy.themSach(s3);

        // Hiển thị danh sách sách hiện có
        System.out.println("===== DANH SACH SACH HIEN CO =====");
        quanLy.hienThiDanhSach();

        // Kiểm tra tồn kho một sách
        System.out.println("\n===== KIEM TRA TON KHO =====");
        Sach sachCheck = quanLy.timKiemSach("Toi thay hoa vang tren co xanh");
        if (sachCheck != null) {
            int soLuongToiThieu = 4;
            System.out.println("So luong toi thieu yeu cau: " + soLuongToiThieu);
            if (sachCheck.kiemTraTonKho(soLuongToiThieu)) {
                System.out.println("Du so luong ton kho!");
            } else {
                System.out.println(" Sach ton kho it hon yeu cau!");
            }

            // Cập nhật vị trí sách
            String viTriMoi = "Ke C3";
            sachCheck.capNhatViTri(viTriMoi);
        }

        // Hiển thị giá bán từng sách
        System.out.println("\n===== GIA BAN TUNG SACH =====");
        for (Sach s : new Sach[]{s1, s2, s3}) {
            System.out.println(s.getTieuDe() + " => Gia ban: " + s.tinhGiaBan());
        }
    }

}
