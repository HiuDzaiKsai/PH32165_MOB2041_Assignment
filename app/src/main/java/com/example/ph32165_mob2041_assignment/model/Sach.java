package com.example.ph32165_mob2041_assignment.model;

public class Sach {
    private int MaSach;
    private String TenSach;
    private int GiaThue,MaLoai;

    public Sach() {
    }

    public Sach(int maSach, String tenSach, int giaThue, int maLoai) {
        MaSach = maSach;
        TenSach = tenSach;
        GiaThue = giaThue;
        MaLoai = maLoai;
    }

    public int getMaSach() {
        return MaSach;
    }

    public void setMaSach(int maSach) {
        MaSach = maSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public int getGiaThue() {
        return GiaThue;
    }

    public void setGiaThue(int giaThue) {
        GiaThue = giaThue;
    }

    public int getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(int maLoai) {
        MaLoai = maLoai;
    }
}
