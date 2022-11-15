package viewmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVienViewModel {
    private String maNV;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String soDT;
    private String diaChi;
}
