package pas.raga.fakultasapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import pas.raga.fakultasapp.Adapter.AdapterJadwal;
import pas.raga.fakultasapp.Adapter.AdapterKarya;
import pas.raga.fakultasapp.Adapter.AdapterTeknik;
import pas.raga.fakultasapp.Network.ApiService;
import pas.raga.fakultasapp.Network.InitRetrofit;
import pas.raga.fakultasapp.Response.ResponseTeknik;
import pas.raga.fakultasapp.Response.ResultItem;
import pas.raga.fakultasapp.ResponseJadwal.ResponseJadwal;
import pas.raga.fakultasapp.ResponseJadwal.ResultItemJadwal;
import pas.raga.fakultasapp.ResponseKarya.ResponseKaryaTI;
import pas.raga.fakultasapp.ResponseKarya.ResultItemKarya;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Field;

public class DetailTeknikActivity extends AppCompatActivity {
    TextView namamahasiswa, nik, jurusan, specialissss,  tahunAngkatan, KetLulus, Kelass, Semesterr, Jenis_kelas, total_sks, special2;
    RecyclerView rvHomee2, rvhomeJadwal;

    SwipeRefreshLayout srlHomee2;
    ImageView ImgFb, ImgIg, ImgGithub, ImgTwitter;

     String linkFb, linkIG, linkGithub, linkTwitter, namamahasiswaa, nikk, jurusann, specialiss,  tahunAngkatann, KetLuluss, Kelasss, Semesterrr, Jenis_kelass, total_skss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_teknik);
        special2 = findViewById(R.id.spesial);
        namamahasiswa = findViewById(R.id.namacoy);
        nik = findViewById(R.id.nikk);
        jurusan = findViewById(R.id.jurusannn);
        specialissss = findViewById(R.id.specialis);
        tahunAngkatan = findViewById(R.id.tahun_angkatan);
        KetLulus = findViewById(R.id.ket_lulus);
        Kelass = findViewById(R.id.kelas);
        Semesterr = findViewById(R.id.smsester);
        Jenis_kelas = findViewById(R.id.jenis_kelas);
        total_sks = findViewById(R.id.sks);
        ImgFb  = findViewById(R.id.klikfacebook);
        ImgIg = findViewById(R.id.klikig);
        ImgTwitter = findViewById(R.id.kliktwitter);
        ImgGithub = findViewById(R.id.klikgithub);




        namamahasiswaa = getIntent().getStringExtra("nama");
        nikk = getIntent().getStringExtra("nik");
        jurusann = getIntent().getStringExtra("jurusan");
        specialiss = getIntent().getStringExtra("spesialll");
        tahunAngkatann = getIntent().getStringExtra("tahun_angkatan");
        KetLuluss = getIntent().getStringExtra("keterangan");
        Kelasss = getIntent().getStringExtra("kelas");
        Semesterrr = getIntent().getStringExtra("semester");
        Jenis_kelass = getIntent().getStringExtra("jenis_kelas");
        total_skss = getIntent().getStringExtra("totalsks");
        linkFb = getIntent().getStringExtra("linkfb");
        linkIG = getIntent().getStringExtra("linkig");
        linkGithub = getIntent().getStringExtra("linkgithub");
        linkTwitter = getIntent().getStringExtra("linktwitter");

        namamahasiswa.setText(namamahasiswaa);
        nik.setText(nikk);
        jurusan.setText(jurusann);
        specialissss.setText(specialiss);
        tahunAngkatan.setText(tahunAngkatann);
        KetLulus.setText(KetLuluss);
        Kelass.setText(Kelasss);
        Semesterr.setText(Semesterrr);
        Jenis_kelas.setText(Jenis_kelass);
        total_sks.setText(total_skss);
        special2.setText(specialiss);
        rvhomeJadwal = findViewById(R.id.rvJadwal);
        rvHomee2 = findViewById(R.id.rvHomeCoy);
        srlHomee2 = findViewById(R.id.srlHomeCoy);

        rvhomeJadwal.setHasFixedSize(true);
        rvhomeJadwal.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        rvHomee2.setHasFixedSize(true);
        rvHomee2.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        Log.d("TAG", "NIK SISWA : " + nikk);

        String getNIK = String.valueOf(nikk);

        tampilkanDataKarya(getNIK);
        tampilkanDataJadwal(getNIK);

        ImgFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri url =  Uri.parse(linkFb);
                Intent intentFb = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intentFb);
            }
        });

        ImgIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri urlIg = Uri.parse(linkIG);
                Intent intentIg = new Intent(Intent.ACTION_VIEW, urlIg);
                startActivity(intentIg);
            }
        });

        ImgGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri urlGithub = Uri.parse(linkGithub);
                Intent intentGIt = new Intent(Intent.ACTION_VIEW, urlGithub);
                startActivity(intentGIt);
            }
        });

        ImgTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri urlTwitter = Uri.parse(linkTwitter);
                Intent intenttiwt = new Intent(Intent.ACTION_VIEW, urlTwitter);
                startActivity(intenttiwt);
            }
        });

        srlHomee2.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                String getNIK = String.valueOf(nikk);

                tampilkanDataKarya(getNIK);
                tampilkanDataJadwal(getNIK);

                srlHomee2.setRefreshing(false);
            }
        });
    }

    private void tampilkanDataJadwal(String nikJadwal) {

        ApiService apiService = InitRetrofit.getInstance();
        final  Call<ResponseJadwal> dataJadwal = apiService.getJadwal(nikJadwal);
        dataJadwal.enqueue(new Callback<ResponseJadwal>() {
            @Override
            public void onResponse(Call<ResponseJadwal> call, Response<ResponseJadwal> response) {
                if (response.isSuccessful()){
                    List<ResultItemJadwal> dataItemJadwal = response.body().getJadwal();
                    AdapterJadwal adapterJadwal = new AdapterJadwal(DetailTeknikActivity.this, dataItemJadwal);
                    rvhomeJadwal.setAdapter(adapterJadwal);

                 }
            }

            @Override
            public void onFailure(Call<ResponseJadwal> call, Throwable t) {

            }
        });
    }

    private void tampilkanDataKarya(String nikKarya) {
        ApiService apiService = InitRetrofit.getInstance();
        final Call<ResponseKaryaTI> dataKarya = apiService.getKarya(nikKarya);
        dataKarya.enqueue(new Callback<ResponseKaryaTI>() {
            @Override
            public void onResponse(Call<ResponseKaryaTI> call, Response<ResponseKaryaTI> response) {
                if (response.isSuccessful()) {
                    List<ResultItemKarya> dataItemKarya = response.body().getKarya();

                    AdapterKarya adapter = new AdapterKarya(DetailTeknikActivity.this, dataItemKarya);
                    rvHomee2.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ResponseKaryaTI> call, Throwable t) {

            }
        });
    }
}
