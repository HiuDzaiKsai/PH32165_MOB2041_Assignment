package com.example.ph32165_mob2041_assignment.model;

public class LoaiSach {
    private int MaLS;
    private String TenLS;

    public LoaiSach() {
    }

    public LoaiSach(int maLS, String tenLS) {
        MaLS = maLS;
        TenLS = tenLS;
    }

    public int getMaLS() {
        return MaLS;
    }

    public void setMaLS(int maLS) {
        MaLS = maLS;
    }

    public String getTenLS() {
        return TenLS;
    }

    public void setTenLS(String tenLS) {
        TenLS = tenLS;
    }
}
