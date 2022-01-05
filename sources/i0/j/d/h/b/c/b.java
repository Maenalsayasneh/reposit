package i0.j.d.h.b.c;

import android.graphics.Color;
import android.view.View;
import com.instabug.featuresrequest.d.b;
import com.instabug.featuresrequest.eventbus.FeatureRequestsEventBus;
import com.instabug.featuresrequest.ui.b.c.e;
import i0.j.d.b.a;
import org.json.JSONException;

/* compiled from: FeatureHolder */
public class b implements View.OnClickListener {
    public final /* synthetic */ com.instabug.featuresrequest.d.b c;
    public final /* synthetic */ c d;

    public b(c cVar, com.instabug.featuresrequest.d.b bVar) {
        this.d = cVar;
        this.c = bVar;
    }

    public void onClick(View view) {
        com.instabug.featuresrequest.d.b bVar = this.c;
        if (bVar.c2) {
            bVar.a2--;
            bVar.c2 = false;
            this.d.b(Boolean.FALSE);
            this.d.h.setRippleColor(Color.parseColor("#888888"));
            a aVar = this.d.i;
            com.instabug.featuresrequest.d.b bVar2 = this.c;
            P p = ((e) aVar).presenter;
            if (p != null) {
                e eVar = (e) p;
                bVar2.g2 = b.C0102b.USER_UN_VOTED;
                try {
                    i0.j.d.c.a.a(bVar2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                eVar.k();
                FeatureRequestsEventBus.getInstance().post(bVar2);
                d dVar = eVar.c;
                if (dVar != null) {
                    dVar.f();
                    return;
                }
                return;
            }
            return;
        }
        bVar.c2 = true;
        bVar.a2++;
        this.d.h.setRippleColor(Color.parseColor("#ffffff"));
        this.d.b(Boolean.valueOf(this.c.c2));
        a aVar2 = this.d.i;
        com.instabug.featuresrequest.d.b bVar3 = this.c;
        P p2 = ((e) aVar2).presenter;
        if (p2 != null) {
            e eVar2 = (e) p2;
            bVar3.g2 = b.C0102b.USER_VOTED_UP;
            try {
                i0.j.d.c.a.a(bVar3);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            eVar2.k();
            FeatureRequestsEventBus.getInstance().post(bVar3);
            d dVar2 = eVar2.c;
            if (dVar2 != null) {
                dVar2.f();
            }
        }
    }
}
