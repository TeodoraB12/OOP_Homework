package zadaca_4;

public class Avtomobil {
	private String marka;
	private String model;
	private int kilometri;
	private String boja;
	
	public Avtomobil(String marka, String model, int kilometri, String boja) {
		this.marka = marka;
		this.model = model;
		this.kilometri = kilometri;
		this.boja = boja;
	}
	public int mnozenjeKm (int pomnoziKm) {
		int vk_kilometri = this.kilometri * pomnoziKm;
		return vk_kilometri;
	}
	public String getMarka() {
		return marka;
	}
	public String getModel() {
		return model;
	}
	public int getKilometri() {
		return kilometri;
	}
	public String getBoja() {
		return boja;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setKilometri(int kilometri) {
		this.kilometri = kilometri;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
}
