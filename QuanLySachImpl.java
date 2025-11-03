package BaiTap_Tuan9;
import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach
{
    private List<Sach> danhSach = new ArrayList<>(); /*(): "chạy" hàm khởi tạo của ArrayList để tạo ra một cái danh sách rỗng (chưa có phần tử nào). */

    @Override
    public void themSach(Sach s) 
    {
        danhSach.add(s);
    }

    // Xoá sách theo mã
    @Override
    public boolean xoaSach(String maSach) 
    {
        for (Sach s : danhSach) 
            if (s.getMaSach().equals(maSach)) 
            {
                danhSach.remove(s);
                return true;
            }
        return false;
    }

    // Cập nhật sách theo mã
    @Override
    public boolean capNhatSach(String maSach, Sach sMoi) 
    {
        for (int i = 0; i < danhSach.size(); i++) 
            if (danhSach.get(i).getMaSach().equals(maSach)) 
            {
                danhSach.set(i, sMoi);
                return true;
            }
        return false;
    }

    // Tìm kiếm sách theo mã
    @Override
    public Sach timSach(String maSach) 
    {
        for (Sach s : danhSach) 
            if (s.getMaSach().equals(maSach)) 
            {
                return s;
            }
        return null;
    }
    @Override
    public void hienThiDanhSach()
    {
        if(danhSach.isEmpty())
        {
            System.out.println("Thu vien chua co sach nao.");
            return;
        }
        for(Sach s: danhSach)
        {
            System.out.println(s.toString());
         /*Với mỗi đối tượng Sach (mà chúng ta tạm đặt tên là s) nằm ở bên trong danhSach, hãy thực hiện... */

         System.out.println("Gia ban uoc tinh: "+s.tinhGiaBan()+" VND");
        System.out.println("--------------------------------------------");
        
        }
    }

    // ===== Chức năng mở rộng =====

    @Override
    public List<Sach> timKiem(ITimKiem dk) {
        List<Sach> ketQua = new ArrayList<>();
        for (Sach s : danhSach) {
            if (dk.thoaMan(s)) {
                ketQua.add(s);
            }
        }
        return ketQua;
    }

    @Override
    public double tinhTongGiaTriKho() {
        double tong = 0;
        for (Sach s : danhSach) {
            tong += s.tinhGiaBan() * s.getSoLuong();
        }
        return tong;
    }
}

