/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.khuyenMai;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import model.SanPham.ChiTietSanPham;

/**
 *
 * @author asus_vinh
 */
@Data
@Entity
@Table(name = "chi_tietsp_khuyen_mai")
public class chiTietSPKhuyenMai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "don_gia")
    private BigDecimal donGia;

    @ManyToOne
    @JoinColumn(name = "Id_chi_tiepsp")
    private ChiTietSanPham chiTietSP;

    @ManyToOne
    @JoinColumn(name = "Id_khuyen_mai")
    private khuyenMai khuyenMai;
}