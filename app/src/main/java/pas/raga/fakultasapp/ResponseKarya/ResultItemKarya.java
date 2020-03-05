package pas.raga.fakultasapp.ResponseKarya;

import com.google.gson.annotations.SerializedName;

public class ResultItemKarya {

	@SerializedName("nik")
	private String nik;

	@SerializedName("list_karya")
	private String listKarya;

	@SerializedName("kode_karya")
	private String kodeKarya;

	public void setNik(String nik){
		this.nik = nik;
	}

	public String getNik(){
		return nik;
	}

	public void setListKarya(String listKarya){
		this.listKarya = listKarya;
	}

	public String getListKarya(){
		return listKarya;
	}

	public void setKodeKarya(String kodeKarya){
		this.kodeKarya = kodeKarya;
	}

	public String getKodeKarya(){
		return kodeKarya;
	}

	@Override
 	public String toString(){
		return 
			"ResultItemKarya{" +
			"nik = '" + nik + '\'' + 
			",list_karya = '" + listKarya + '\'' + 
			",kode_karya = '" + kodeKarya + '\'' + 
			"}";
		}
}