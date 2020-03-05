package pas.raga.fakultasapp;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

import pas.raga.fakultasapp.Adapter.AdapterTeknik;
import pas.raga.fakultasapp.Network.ApiService;
import pas.raga.fakultasapp.Network.InitRetrofit;
import pas.raga.fakultasapp.Response.ResponseTeknik;
import pas.raga.fakultasapp.Response.ResultItem;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TeknikActivity extends AppCompatActivity {
    ImageView backcoy;

    RecyclerView rvHomee;
    SwipeRefreshLayout srlHomee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teknik);
        backcoy = findViewById(R.id.img_back);
        backcoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TeknikActivity.this, MenuActivity.class));
                finish();
            }
        });

        rvHomee = findViewById(R.id.rvHome);
        srlHomee = findViewById(R.id.srlHome);

        rvHomee.setHasFixedSize(true);
        rvHomee.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        tampilkanDataPuskesmas();

        srlHomee.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                tampilkanDataPuskesmas();
                srlHomee.setRefreshing(false);
            }
        });
    }

    private void tampilkanDataPuskesmas() {
        ApiService apiService = InitRetrofit.getInstance();
        final Call<ResponseTeknik> dataTeknik = apiService.getPenjualan();
        dataTeknik.enqueue(new Callback<ResponseTeknik>() {
            @Override
            public void onResponse(Call<ResponseTeknik> call, Response<ResponseTeknik> response) {
                if (response.isSuccessful()) {
                    List<ResultItem> dataItemTeknik = response.body().getResult();

                    AdapterTeknik adapter = new AdapterTeknik(TeknikActivity.this, dataItemTeknik);
                    rvHomee.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ResponseTeknik> call, Throwable t) {

            }
        });
}
}
