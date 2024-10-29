package tuan1_SinhVien;

public class SinhVien {
    // Attributes
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    // Default Constructor
    public SinhVien() {
        this.maSV = 0;
        this.hoTen = "";
        this.diemLT = 0.0f;
        this.diemTH = 0.0f;
    }

    // Parameterized Constructor
    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    // Getters and Setters
    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    // Method to calculate average score
    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    // Method to return string representation
    @Override
    public String toString() {
        return String.format("%-10d%-30s%10.2f%10.2f%10.2f",
                             maSV, hoTen, diemLT, diemTH, tinhDiemTB());
    }
}
