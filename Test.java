package BaiTap_Tuan9;
import java.util.List;
import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) 
    {
        QuanLySachImpl ql = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int choice;
        // Them mot vai sach mau
        ql.themSach(new SachGiaoTrinh("GT001", "Lap Trinh Java", "Nguyen Van A", 2022, 10, 50000, "Lap trinh", "Dai hoc"));
        ql.themSach(new SachTieuThuyet("TT001", "Harry Potter", "J.K. Rowling", 2000, 5, 80000, "Fantasy", true));
        ql.themSach(new SachThamKhao("TK001", "Vat Ly tham khao", "Nguyen B", 2019, 3, 60000, 10.0));

        do 
        {
            System.out.println("\n===== MENU QUAN LY SACH (Tuan 9) =====");
            System.out.println("1. Hien thi danh sach");
            System.out.println("2. Tim sach theo ma");
            System.out.println("3. Tim sach theo tieu de (chua)");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("5. Kiem tra ton kho (vi du >= so luong)");
            System.out.println("6. Cap nhat vi tri sach (capNhatViTri)");
            System.out.println("7. Tong gia ban uoc tinh cua tat ca sach");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) 
            {
                case 1 -> ql.hienThiDanhSach();
                case 2 -> 
                {
                    System.out.print("Nhap ma: ");
                    String ma = sc.nextLine();
                    Sach s = ql.timKiemTheoMa(ma);
                    if (s != null) System.out.println(s);
                    else System.out.println("Khong tim thay.");
                }
                case 3 -> 
                {
                    System.out.print("Nhap chuoi tim trong tieu de: ");
                    String key = sc.nextLine();
                    List<Sach> ketQua = ql.timKiemTheoTieuDe(key);
                    if (ketQua.isEmpty()) System.out.println("Khong tim thay.");
                    else 
                    {
                        for (Sach x : ketQua) System.out.println(x + "\n---");
                    }
                }
                case 4 -> 
                {
                    System.out.print("Nhap ma can xoa: ");
                    String ma = sc.nextLine();
                    ql.xoaSach(ma);
                }
                case 5 -> 
                {
                    System.out.print("Nhap ma va so luong toi thieu (cach nhau boi dau phay). Vi du: GT001,5\n> ");
                    String line = sc.nextLine();
                    String[] parts = line.split(",");
                    if (parts.length == 2) 
                    {
                        String ma = parts[0].trim();
                        int so = Integer.parseInt(parts[1].trim());
                        Sach s = ql.timKiemTheoMa(ma);
                        if (s != null) 
                        {
                            System.out.println("Ton kho >= " + so + " ? " + (s.kiemTraTonKho(so) ? "Du" : "Khong du"));
                        } else System.out.println("Khong tim thay ma.");
                    } else System.out.println("Nhap sai dinh dang.");
                }
                case 6 -> 
                {
                    System.out.print("Nhap ma sach: ");
                    String ma = sc.nextLine();
                    Sach s = ql.timKiemTheoMa(ma);
                    if (s != null) 
                    {
                        System.out.print("Nhap vi tri moi: ");
                        String viTri = sc.nextLine();
                        s.capNhatViTri(viTri);
                    } else System.out.println("Khong tim thay ma.");
                }
                case 7 -> System.out.println("Tong gia ban uoc tinh: " + ql.tongGiaBanTatCa());
                case 0 -> System.out.println("Thoat chuong trinh.");
                default -> System.out.println("Chon khong hop le.");
            }
        } while (choice != 0);
        sc.close();
    }
}
