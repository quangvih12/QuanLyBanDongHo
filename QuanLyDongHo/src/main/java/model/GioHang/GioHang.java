/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.GioHang;

import model.KhachHang;
import model.NhanVien.NhanVien;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.jar.Attributes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.Nationalized;

/**
 *
 * @author asus_vinh
 */
@Data
@Entity
@Table(name = "Gio_Hang")
public class GioHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "IdKH")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "IdNV")
    private NhanVien idNV;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ngay_Tao")
    private String ngayTao;

    @Column(name = "Ngay_Thanh_Toan")
    private String ngayThanhToan;

    @Column(name = "Ten_Nguoi_Nhan")
    private String tenNguoiNhan;

    @Column(name = "Dia_Chi")
    private String DiaChi;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "trang_thai")
    private int trangthai;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @OneToMany(mappedBy = "gioHang", fetch = FetchType.EAGER)
    List<GioHangChiTiet> list = new ArrayList<>();

}
