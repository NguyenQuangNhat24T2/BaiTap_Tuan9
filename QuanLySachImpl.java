package BaiTap_Tuan8;

import java.util.ArrayList;
import java.util.Iterator;

public class QuanLySachImpl implements IQuanLySach 
{
    private ArrayList<Sach> danhSachSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) 
    {
        danhSachSach.add(sach);
    }

    @Override
    public void hienThiDanhSachSach() 
    {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach sach hien tai dang rong.");
            return;
        }
        System.out.println("\n--- HIEN THI DANH SACH SACH ---");
        for (Sach sach : danhSachSach) 
        {
            System.out.println(sach.toString());
            System.out.println("------------------------------------");
        }
    }
    
    // Phương thức tìm kiếm sách
    @Override
    public void timKiemSach(String tieuDe) {
        System.out.println("--- KET QUA TIM KIEM SACH [" + tieuDe + "] ---");
        boolean found = false;
        for (Sach sach : danhSachSach) {
            if (sach.getTieuDe().toLowerCase().contains(tieuDe.toLowerCase())) {
                System.out.println(sach.toString());
                System.out.println("------------------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sach co tieu de chua tu khoa: " + tieuDe);
        }
    }

    // Phương thức xóa sách
    @Override
    public void xoaSach(String maSach) {
        Iterator<Sach> iterator = danhSachSach.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Sach sach = iterator.next();
            if (sach.getMaSach().equals(maSach)) {
                iterator.remove();
                removed = true;
                break;
            }
        }
        
        if (removed) {
            System.out.println("Da xoa thanh cong sach co Ma Sach: " + maSach);
        } else {
            System.out.println("Khong tim thay sach co Ma Sach: " + maSach + " de xoa.");
        }
    }
}