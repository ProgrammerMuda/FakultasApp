package pas.raga.fakultasapp.Response;

import com.google.gson.annotations.SerializedName;

public class ResultItem{

	@SerializedName("tahun_angkatan")
	private String tahunAngkatan;

	@SerializedName("nama_mahasiswa")
	private String namaMahasiswa;

	@SerializedName("jenis_kelas")
	private String jenisKelas;

	@SerializedName("jurusan")
	private String jurusan;

	@SerializedName("link_facebook")
	private String linkFacebook;

	@SerializedName("nik")
	private String nik;

	@SerializedName("ambil_specialis")
	private String ambilSpecialis;

	@SerializedName("kelas")
	private String kelas;

	@SerializedName("link_twitter")
	private String linkTwitter;

	@SerializedName("link_instagram")
	private String linkInstagram;

	@SerializedName("link_github")
	private String linkGithub;

	@SerializedName("keterangan_lulus")
	private String keteranganLulus;

	@SerializedName("semester")
	private String semester;

	@SerializedName("total_sks")
	private String totalSks;

	public void setTahunAngkatan(String tahunAngkatan){
		this.tahunAngkatan = tahunAngkatan;
	}

	public String getTahunAngkatan(){
		return tahunAngkatan;
	}

	public void setNamaMahasiswa(String namaMahasiswa){
		this.namaMahasiswa = namaMahasiswa;
	}

	public String getNamaMahasiswa(){
		return namaMahasiswa;
	}

	public void setJenisKelas(String jenisKelas){
		this.jenisKelas = jenisKelas;
	}

	public String getJenisKelas(){
		return jenisKelas;
	}

	public void setJurusan(String jurusan){
		this.jurusan = jurusan;
	}

	public String getJurusan(){
		return jurusan;
	}

	public void setLinkFacebook(String linkFacebook){
		this.linkFacebook = linkFacebook;
	}

	public String getLinkFacebook(){
		return linkFacebook;
	}

	public void setNik(String nik){
		this.nik = nik;
	}

	public String getNik(){
		return nik;
	}

	public void setAmbilSpecialis(String ambilSpecialis){
		this.ambilSpecialis = ambilSpecialis;
	}

	public String getAmbilSpecialis(){
		return ambilSpecialis;
	}

	public void setKelas(String kelas){
		this.kelas = kelas;
	}

	public String getKelas(){
		return kelas;
	}

	public void setLinkTwitter(String linkTwitter){
		this.linkTwitter = linkTwitter;
	}

	public String getLinkTwitter(){
		return linkTwitter;
	}

	public void setLinkInstagram(String linkInstagram){
		this.linkInstagram = linkInstagram;
	}

	public String getLinkInstagram(){
		return linkInstagram;
	}

	public void setLinkGithub(String linkGithub){
		this.linkGithub = linkGithub;
	}

	public String getLinkGithub(){
		return linkGithub;
	}

	public void setKeteranganLulus(String keteranganLulus){
		this.keteranganLulus = keteranganLulus;
	}

	public String getKeteranganLulus(){
		return keteranganLulus;
	}

	public void setSemester(String semester){
		this.semester = semester;
	}

	public String getSemester(){
		return semester;
	}

	public void setTotalSks(String totalSks){
		this.totalSks = totalSks;
	}

	public String getTotalSks(){
		return totalSks;
	}

	@Override
 	public String toString(){
		return 
			"ResultItemKarya{" +
			"tahun_angkatan = '" + tahunAngkatan + '\'' + 
			",nama_mahasiswa = '" + namaMahasiswa + '\'' + 
			",jenis_kelas = '" + jenisKelas + '\'' + 
			",jurusan = '" + jurusan + '\'' + 
			",link_facebook = '" + linkFacebook + '\'' + 
			",nik = '" + nik + '\'' + 
			",ambil_specialis = '" + ambilSpecialis + '\'' + 
			",kelas = '" + kelas + '\'' + 
			",link_twitter = '" + linkTwitter + '\'' + 
			",link_instagram = '" + linkInstagram + '\'' + 
			",link_github = '" + linkGithub + '\'' + 
			",keterangan_lulus = '" + keteranganLulus + '\'' + 
			",semester = '" + semester + '\'' + 
			",total_sks = '" + totalSks + '\'' + 
			"}";
		}
}