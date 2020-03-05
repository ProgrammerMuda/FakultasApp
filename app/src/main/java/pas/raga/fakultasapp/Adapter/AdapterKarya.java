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
import pas.raga.fakultasapp.ResponseKarya.ResultItemKarya;

public class AdapterKarya extends RecyclerView.Adapter<AdapterKarya.Holderrr> {


    Context context;
    List<ResultItemKarya> ItemKarya;

    public AdapterKarya(Context context, List<ResultItemKarya> ItemKarya){
        this.context = context;
        this.ItemKarya = ItemKarya;
    }

    @Override
    public Holderrr onCreateViewHolder(ViewGroup viewGroup, int i) {
        View vieww = LayoutInflater.from(context).inflate(R.layout.item_karya, viewGroup, false);
        Holderrr holderrr = new Holderrr(vieww);
        return holderrr;

    }

    @Override
    public void onBindViewHolder(Holderrr holderrr, int i) {
        holderrr.textView.setText(ItemKarya.get(i).getListKarya());

    }

    @Override
    public int getItemCount() {
        return ItemKarya.size();
    }

    public class Holderrr extends RecyclerView.ViewHolder {
        TextView textView;
        public Holderrr(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.karya);
        }
    }
}
