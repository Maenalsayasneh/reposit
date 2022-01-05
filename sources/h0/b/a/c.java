package h0.b.a;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController */
public class c implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController c;
    public final /* synthetic */ AlertController.b d;

    public c(AlertController.b bVar, AlertController alertController) {
        this.d = bVar;
        this.c = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.d.q.onClick(this.c.b, i);
        if (!this.d.s) {
            this.c.b.dismiss();
        }
    }
}
