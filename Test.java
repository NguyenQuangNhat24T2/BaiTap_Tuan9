package BaiTap_Tuan8;
public class Test
{
    public static void main(String[] args) 
    {
        // Khai báo đối tượng quản lý theo kiểu Interface
        IQuanLySach quanLy = new QuanLySachImpl();

        // Thêm dữ liệu mẫu ban đầu 
        SachGiaoTrinh sGiaoTrinh = new SachGiaoTrinh("GT01", "Cau Truc DU lieu & Giai Thuat", "Hoang Thi My Le", 2020, 120, 80000, "Cong Nghe Thong Tin");
        SachTieuThuyet sTieuThuyet = new SachTieuThuyet("TT01", "Nha Gia Kim", "J.K. Rowling", 2018, 80, 90000, false);

        quanLy.themSach(sGiaoTrinh);
        quanLy.themSach(sTieuThuyet);

        // Khởi tạo và chạy Menu chương trình
        Menu menu = new Menu(quanLy);
        menu.chayChuongTrinh();
    }
}