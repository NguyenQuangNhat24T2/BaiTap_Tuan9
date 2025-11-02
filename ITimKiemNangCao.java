package BaiTap_Tuan9;

import java.util.List;

public interface ITimKiemNangCao {
    List<Sach> timKiemSachTheoTacGia(String tacGia);
    List<Sach> timKiemSachTheoViTri(String viTri);
}