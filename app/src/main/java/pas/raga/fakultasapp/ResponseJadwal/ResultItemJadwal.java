package pas.raga.fakultasapp.ResponseJadwal;

public class ResultItemJadwal {
	private String nik;
	private String senin;
	private String kodeJadwal;
	private String rabu;
	private String jumat;

	public void setNik(String nik){
		this.nik = nik;
	}

	public String getNik(){
		return nik;
	}

	public void setSenin(String senin){
		this.senin = senin;
	}

	public String getSenin(){
		return senin;
	}

	public void setKodeJadwal(String kodeJadwal){
		this.kodeJadwal = kodeJadwal;
	}

	public String getKodeJadwal(){
		return kodeJadwal;
	}

	public void setRabu(String rabu){
		this.rabu = rabu;
	}

	public String getRabu(){
		return rabu;
	}

	public void setJumat(String jumat){
		this.jumat = jumat;
	}

	public String getJumat(){
		return jumat;
	}

	@Override
 	public String toString(){
		return 
			"ResultItemJadwal{" +
			"nik = '" + nik + '\'' + 
			",senin = '" + senin + '\'' + 
			",kode_jadwal = '" + kodeJadwal + '\'' + 
			",rabu = '" + rabu + '\'' + 
			",jumat = '" + jumat + '\'' + 
			"}";
		}
}
