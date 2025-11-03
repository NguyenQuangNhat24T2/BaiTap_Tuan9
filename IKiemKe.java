/**Giao dien Interface (Can-Do relationship)**/
package BaiTap_Tuan9;
public interface IKiemKe
{
    boolean kiemTraTonKho(int soLuongToiThieu);
    /*true (nghĩa là "Đúng" / "Có" / "Bật") / false (nghĩa là "Sai" / "Không" / "Tắt") */
    void capNhatViTri(String viTriMoi);
}

