package pas.raga.fakultasapp.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InitRetrofit {
    private static Retrofit getInitRetrofit(){
        return new Retrofit.Builder()
                .baseUrl("https://agarsegar.000webhostapp.com/teknik_informatika/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public static ApiService getInstance() {
        return getInitRetrofit().create(ApiService.class);
    }
}
