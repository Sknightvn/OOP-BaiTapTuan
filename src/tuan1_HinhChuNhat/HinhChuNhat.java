package tuan1_HinhChuNhat;

public class HinhChuNhat {
	
	
	public HinhChuNhat()
	{
		super();
	}
	
	public HinhChuNhat(int cd, int cr)
	{
		super();
		this.chieuDai = cd;
		this.chieuRong = cr;
	}
	private int chieuDai, chieuRong;
	
	public int getChieuDai() {
		return chieuDai;
	}
	
	public void setChieuDai(int chieuDai)
	{
		this.chieuDai = chieuDai;
	}
	
	public int getChieuRong() {
		return chieuRong;
	}
	
	public void setChieuRong(int cRong) {
		chieuRong = cRong;
	}
	
	public long tinhDienTich()
	{
		int cDai, cRong;
		long dienTich;
		cDai = this.getChieuDai();
		cRong = getChieuRong();
		dienTich = cDai*cRong;
		return dienTich;
	}
	public int tinhChuvi()
	{
		int cDai, cRong;
		int chuVi;
		cDai = this.getChieuDai();
		cRong = getChieuRong();
		chuVi = (cDai+cRong)*2;
		return chuVi;
	}

	
	public String toString()
	{
		
		return String.format("%10d %10d %12d %12d", getChieuDai(), getChieuRong(), tinhDienTich(), tinhChuvi());
	}
}
