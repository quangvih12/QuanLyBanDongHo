package Util;

//import com.mycompany.assignment.model.Grade;
//import com.mycompany.assignment.model.Students;
//import com.mycompany.assignment.model.Users;
import model.GioHang.GioHang;
import model.GioHang.GioHangChiTiet;
import model.KhachHang;
import model.HoaDon.HoaDon;
import model.HoaDon.hoaDonChiTiet;
import model.NhanVien.ChucVu;
import model.NhanVien.CuaHang;
import model.NhanVien.NhanVien;
import model.SanPham.ChiTietSanPham;
import model.SanPham.DongSp;
import model.SanPham.MauSac;
import model.SanPham.NamSanXuat;
import model.SanPham.SanPham;

import java.util.Properties;
import model.SanPham.thuongHieu;
import model.khuyenMai.chiTietSPKhuyenMai;
import model.khuyenMai.hoaDonKhuyenMai;
import model.khuyenMai.khuyenMai;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernatUtil {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=demoDuAn2");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "111203");
        properties.put(Environment.SHOW_SQL, "true");
//        gen DB tự động
     //   properties.put(Environment.HBM2DDL_AUTO, "create");
        //gen String id tự động
//        @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
//        @GeneratedValue(generator = "generator")
        conf.setProperties(properties);
        conf.addAnnotatedClass(ChucVu.class);
        conf.addAnnotatedClass(CuaHang.class);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(GioHang.class);
        conf.addAnnotatedClass(SanPham.class);
        conf.addAnnotatedClass(DongSp.class);
        conf.addAnnotatedClass(MauSac.class);
        conf.addAnnotatedClass(thuongHieu.class);
        conf.addAnnotatedClass(NamSanXuat.class);
        conf.addAnnotatedClass(khuyenMai.class);

        conf.addAnnotatedClass(ChiTietSanPham.class);
        conf.addAnnotatedClass(hoaDonChiTiet.class);
        conf.addAnnotatedClass(GioHangChiTiet.class);

        conf.addAnnotatedClass(hoaDonKhuyenMai.class);
        conf.addAnnotatedClass(chiTietSPKhuyenMai.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        getFACTORY();
    }

}
