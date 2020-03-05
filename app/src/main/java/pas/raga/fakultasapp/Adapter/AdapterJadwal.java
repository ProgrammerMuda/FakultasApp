package pas.raga.fakultasapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import pas.raga.fakultasapp.R;
import pas.raga.fakultasapp.ResponseJadwal.ResultItemJadwal;
import pas.raga.fakultasapp.ResponseKarya.ResultItemKarya;

public class AdapterJadwal  extends RecyclerView.Adapter<AdapterJadwal.HOLDERRR> {

    Context context;
    List<ResultItemJadwal> ItemJadwal;

    public AdapterJadwal(Context context, List<ResultItemJadwal> ItemJadwal){
        this.context = context;
        this.ItemJadwal = ItemJadwal;
    }
    @NonNull
    @Override
    public HOLDERRR onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vieww = LayoutInflater.from(context).inflate(R.layout.item_jadwal, viewGroup, false);
        HOLDERRR holderrr = new HOLDERRR(vieww);
        return  holderrr;

    }

    @Override
    public void onBindViewHolder(HOLDERRR holderrr, int i) {



        holderrr.textsenin1.setText(ItemJadwal.get(i).getSenin());
        holderrr.textrabu1.setText(ItemJadwal.get(i).getRabu());
        holderrr.textjumat1.setText(ItemJadwal.get(i).getJumat());




    }

    @Override
    public int getItemCount() {
        return ItemJadwal.size();
    }

    public class HOLDERRR extends RecyclerView.ViewHolder {
        TextView textsenin1,  textrabu1,  textjumat1, textsenin2, textrabu2, textjumat2;
        public HOLDERRR(@NonNull View itemView) {
            super(itemView);

            textsenin1 = itemView.findViewById(R.id.senin1);
            textrabu1 = itemView.findViewById(R.id.rabu1);
            textjumat1 = itemView.findViewById(R.id.jumat1);




        }
    }
}
