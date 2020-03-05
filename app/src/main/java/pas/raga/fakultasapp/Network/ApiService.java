package pas.raga.fakultasapp.Network;

import pas.raga.fakultasapp.Response.ResponseTeknik;
import pas.raga.fakultasapp.ResponseJadwal.ResponseJadwal;
import pas.raga.fakultasapp.ResponseKarya.ResponseKaryaTI;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("read_mahasiswa.php")
    Call<ResponseTeknik> getPenjualan();

    @FormUrlEncoded
    @POST("karya_informatika.php")
    Call<ResponseKaryaTI>  getKarya(@Field("nik") String nik);

    @FormUrlEncoded
    @POST("jadwalmatkulti.php")
    Call<ResponseJadwal>  getJadwal(@Field("nik") String nik);
}
