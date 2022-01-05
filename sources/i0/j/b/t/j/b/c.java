package i0.j.b.t.j.b;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.bug.R;
import i0.j.b.p.b;
import java.util.ArrayList;

/* compiled from: VisualUserStepsListAdapter */
public class c extends RecyclerView.Adapter<b> {
    public d a;
    public ArrayList<b> b = new ArrayList<>();

    public c(d dVar) {
        this.a = dVar;
    }

    public int getItemCount() {
        return this.b.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public void onBindViewHolder(RecyclerView.b0 b0Var, int i) {
        b bVar = (b) b0Var;
        b bVar2 = this.b.get(i);
        bVar.Y1 = bVar2;
        String format = String.format("%s%s", new Object[]{bVar.itemView.getContext().getString(R.string.IBGReproStepsListItemName), Integer.valueOf(bVar2.a)});
        bVar.Z1 = format;
        bVar.d.setText(format);
        TextView textView = bVar.x;
        String str = bVar2.b;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        bVar.q.setImageBitmap(bVar2.e);
        bVar.itemView.setOnClickListener(bVar);
        bVar.c.setOnClickListener(bVar);
    }

    public RecyclerView.b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ibg_bug_repro_steps_item, viewGroup, false), this.a);
    }
}
