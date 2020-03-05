package pas.raga.fakultasapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import pas.raga.fakultasapp.DetailTeknikActivity;
import pas.raga.fakultasapp.R;
import pas.raga.fakultasapp.Response.ResultItem;

public class AdapterTeknik  extends RecyclerView.Adapter <AdapterTeknik.MyViewHolder>{

    Context context;
    List<ResultItem> ItemTeknik;

    public AdapterTeknik(Context context, List<ResultItem> ItemTeknik){
        this.context = context;
        this.ItemTeknik = ItemTeknik;
    }


    @NonNull
    @Override
    public AdapterTeknik.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_main, viewGroup, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;     }

    @Override
    public void onBindViewHolder(@NonNull AdapterTeknik.MyViewHolder myViewHolder, final int i) {
        myViewHolder.txtnik.setText(ItemTeknik.get(i).getNik());
        myViewHolder.txtnama.setText(ItemTeknik.get(i).getNamaMahasiswa());

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getApplicationContext(), DetailTeknikActivity.class);
                Bundle b = new Bundle();
                intent.putExtras(b);
                intent.putExtra("nik", ItemTeknik.get(i).getNik());
                intent.putExtra("nama", ItemTeknik.get(i).getNamaMahasiswa());
                intent.putExtra("jurusan", ItemTeknik.get(i).getJurusan());
                intent.putExtra("spesialll", ItemTeknik.get(i).getAmbilSpecialis());
                intent.putExtra("tahun_angkatan", ItemTeknik.get(i).getTahunAngkatan());
                intent.putExtra("keterangan", ItemTeknik.get(i).getKeteranganLulus());
                intent.putExtra("kelas", ItemTeknik.get(i).getKelas());
                intent.putExtra("jenis_kelas", ItemTeknik.get(i).getJenisKelas());
                intent.putExtra("semester", ItemTeknik.get(i).getSemester());
                intent.putExtra("linkfb", ItemTeknik.get(i).getLinkFacebook());
                intent.putExtra("linkig", ItemTeknik.get(i).getLinkInstagram());
                intent.putExtra("linkgithub", ItemTeknik.get(i).getLinkGithub());
                intent.putExtra("linktwitter", ItemTeknik.get(i).getLinkTwitter());
                intent.putExtra("totalsks", ItemTeknik.get(i).getTotalSks());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);











            }
        });

    }

    @Override
    public int getItemCount() {
        return ItemTeknik.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtnama, txtnik;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtnama = itemView.findViewById(R.id.namamahasiswa);
            txtnik = itemView.findViewById(R.id.nik);
        }
    }
}
