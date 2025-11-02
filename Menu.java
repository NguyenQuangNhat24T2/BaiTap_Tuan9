package BaiTap_Tuan8;
import java.util.Scanner;

public class Menu {
    private IQuanLySach quanLy;
    private Scanner scanner = new Scanner(System.in);

    public Menu(IQuanLySach quanLy) {
        this.quanLy = quanLy;
    }

    private void hienThiMenu() {
        System.out.println("\n===== CHUONG TRINH QUAN LY SACH =====");
        System.out.println("1. Them Sach Giao Trinh");
        System.out.println("2. Them Sach Tieu Thuyet");
        System.out.println("3. Hien thi danh sach tat ca sach");
        System.out.println("4. Tim kiem sach theo Tieu De");
        System.out.println("5. Xoa sach theo Ma Sach");
        System.out.println("6. Kiem tra Ton Kho va Cap nhat Vi tri (Demo)");
        System.out.println("0. Thoat chuong trinh");
        System.out.print("Moi ban chon chuc nang: ");
    }

    public void chayChuongTrinh() {
        int luaChon;
        do {
            hienThiMenu();
            try {
                if (scanner.hasNextInt()) {
                    luaChon = scanner.nextInt();
                    scanner.nextLine(); 
                    xuLyLuaChon(luaChon);
                } else {
                    System.out.println("Lua chon khong hop le. Vui long nhap so.");
                    scanner.nextLine(); 
                    luaChon = -1; 
                }
            } catch (java.util.InputMismatchException e) {
                 System.out.println("Loi nhap du lieu. Vui long thu lai.");
                 scanner.nextLine();
                 luaChon = -1;
            }
        } while (luaChon != 0);
        System.out.println("Tam biet!");
    }

    private void xuLyLuaChon(int luaChon) {
        switch (luaChon) {
            case 1:
                themSachGiaoTrinh();
                break;
            case 2:
                themSachTieuThuyet();
                break;
            case 3:
                quanLy.hienThiDanhSachSach();
                break;
            case 4:
                timKiemSach();
                break;
            case 5:
                xoaSach();
                break;
            case 6:
                kiemTraVaCapNhatDemo();
                break;
            case 0:
                break; 
            default:
                System.out.println("Chuc nang khong ton tai. Vui long chon lai.");
        }
    }

    // --- Các hàm nhập liệu chi tiết ---

    private void themSachGiaoTrinh() {
        try {
            System.out.println("--- THEM SACH GIAO TRINH ---");
            System.out.print("Nhap Ma Sach: ");
            String maSach = scanner.nextLine();
            System.out.print("Nhap Tieu De: ");
            String tieuDe = scanner.nextLine();
            System.out.print("Nhap Tac Gia: ");
            String tacGia = scanner.nextLine();
            System.out.print("Nhap Nam Xuat Ban (int): ");
            int namXuatBan = scanner.nextInt();
            System.out.print("Nhap So Luong (int): ");
            int soLuong = scanner.nextInt();
            System.out.print("Nhap Gia Co Ban (double): ");
            double giaCoBan = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Nhap Mon Hoc: ");
            String monHoc = scanner.nextLine();
            
            SachGiaoTrinh s = new SachGiaoTrinh(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, monHoc);
            quanLy.themSach(s);
            System.out.println("Da them Sach Giao Trinh thanh cong!");
        } catch (java.util.InputMismatchException e) {
             System.out.println("Loi nhap du lieu. Vui long kiem tra dinh dang so.");
             scanner.nextLine();
        }
    }

    private void themSachTieuThuyet() {
        try {
            System.out.println("--- THEM SACH TIEU THUYET ---");
            System.out.print("Nhap Ma Sach: ");
            String maSach = scanner.nextLine();
            System.out.print("Nhap Tieu De: ");
            String tieuDe = scanner.nextLine();
            System.out.print("Nhap Tac Gia: ");
            String tacGia = scanner.nextLine();
            System.out.print("Nhap Nam Xuat Ban (int): ");
            int namXuatBan = scanner.nextInt();
            System.out.print("Nhap So Luong (int): ");
            int soLuong = scanner.nextInt();
            System.out.print("Nhap Gia Co Ban (double): ");
            double giaCoBan = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Co phai Sach Series khong (true/false): ");
            boolean laSachSeries = scanner.nextBoolean();
            scanner.nextLine(); 

            SachTieuThuyet s = new SachTieuThuyet(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan, laSachSeries);
            quanLy.themSach(s);
            System.out.println("Da them Sach Tieu Thuyet thanh cong!");
        } catch (java.util.InputMismatchException e) {
             System.out.println("Loi nhap du lieu. Vui long kiem tra dinh dang.");
             scanner.nextLine();
        }
    }

    private void timKiemSach() {
        System.out.print("Nhap Tieu De hoac tu khoa can tim: ");
        String tieuDe = scanner.nextLine();
        quanLy.timKiemSach(tieuDe);
    }

    private void xoaSach() {
        System.out.print("Nhap Ma Sach can xoa: ");
        String maSach = scanner.nextLine();
        quanLy.xoaSach(maSach);
    }
    
    private void kiemTraVaCapNhatDemo() {
        System.out.println("--- DEMO CHUC NANG KIEM KE (IKiemKe) ---");
        // Để demo, chúng ta tạo một đối tượng sách tạm thời
        System.out.println("Tao doi tuong sach demo: [Demo01] - Sach Kiem Ke, So luong: 50");
        SachGiaoTrinh kiemKeSach = new SachGiaoTrinh("Demo01", "Sach Kiem Ke", "TG", 2020, 50, 10000, "Demo");
        
        System.out.println("Kiem tra ton kho >= 100: " + kiemKeSach.kiemTraTonKho(100));
        System.out.print("Nhap Vi tri moi de cap nhat cho sach Demo: ");
        String viTriMoi = scanner.nextLine();
        kiemKeSach.capNhatViTri(viTriMoi);
    }
}