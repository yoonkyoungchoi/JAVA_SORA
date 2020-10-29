package kr.hs.emirim.sora;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CostomAdapter extends RecyclerView.Adapter<CostomAdapter.CostomViewHolder> {

    private ArrayList<Diary> arrayList;
    private Context context;

    public CostomAdapter(ArrayList<Diary> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CostomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lsit_item, parent, false);
        CostomViewHolder holder = new CostomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CostomAdapter.CostomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CostomViewHolder extends RecyclerView.ViewHolder{
        ImageView img_view;
        TextView date;
        TextView sora_question;
        TextView sora_answer;
        public CostomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.img_view = itemView.findViewById(R.id.imageView);
            this.date = itemView.findViewById(R.id.date);
            this.sora_question = itemView.findViewById(R.id.sora_question);
            this.sora_answer = itemView.findViewById(R.id.sora_answer);

        }
    }
}
