package i0.j.b.t.j.b;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.bug.R;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: VisualUserStepItemViewHolder */
public class b extends RecyclerView.b0 implements View.OnClickListener {
    public i0.j.b.p.b Y1;
    public String Z1;
    public final ImageView c;
    public final TextView d;
    public final ImageView q;
    public final TextView x;
    public d y;

    public b(View view, d dVar) {
        super(view);
        this.d = (TextView) view.findViewById(R.id.ib_bug_repro_step_title);
        this.x = (TextView) view.findViewById(R.id.ib_bug_repro_step_sub_title);
        this.q = (ImageView) view.findViewById(R.id.ib_bug_repro_step_screenshot);
        this.c = (ImageView) view.findViewById(R.id.ib_bug_repro_step_delete);
        this.y = dVar;
    }

    public void onClick(View view) {
        if (view == this.itemView) {
            this.y.r0(this.Z1, this.Y1.d);
        } else if (view.getId() == R.id.ib_bug_repro_step_delete) {
            this.y.j0(getAdapterPosition(), this.Y1);
        }
    }
}
