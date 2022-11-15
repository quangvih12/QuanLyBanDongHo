package service;

import model.nhanvien.NhanVien;
import repository.NhanVienRepo;
import viewmodel.NhanVienViewModel;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    NhanVienRepo repo = new NhanVienRepo();

    public List<NhanVienViewModel> get() {
        List<NhanVien> nvList = repo.get();
        List<NhanVienViewModel> nvViewModelList = new ArrayList<>();
        for (NhanVien nv : nvList) {
            nvViewModelList.add(new NhanVienViewModel(nv.getMa(),nv.getHo() + " " + nv.getTen(),nv.getNgaySinh(),nv.getGioiTinh(),nv.getSdt(),nv.getDiaChi()));
        }
        return nvViewModelList;
    }
    public void add(NhanVien nv) {
        repo.add(nv);
    }

    public void update(NhanVien nv, String maNV) {
        repo.update(nv, maNV);
    }
}
