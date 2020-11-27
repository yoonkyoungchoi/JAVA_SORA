package kr.hs.emirim.sora;

import android.hardware.TriggerEvent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context context = null;
    private ArrayList<Context> contexts_item = null;
    private ContextviewListener contextviewListener = null;

    public Adapter(Context context, ArrayList<Context> contexts_item, ContextviewListener contextviewListener) {
        this.context = context;
        this.contexts_item = contexts_item;
        this.contextviewListener = contextviewListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.question_list_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.question.setText(contexts_item.get(i).getQuestions());
        viewHolder.answer.setText(contexts_item.get(i).getAnswer());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView question = null;
        public TextView answer = null;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            question = (TextView)itemView.findViewById(R.id.question_list);
            answer = (TextView)itemView.findViewById(R.id.answer_list);
        }

        @Override
        public void onClick(View view) {
            contextviewListener.onItemClick(getAdapterPosition(), view);
        }
    }
}
