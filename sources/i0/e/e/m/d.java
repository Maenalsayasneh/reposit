package i0.e.e.m;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.wave.R;
import com.clubhouse.wave.data.models.local.ReceivedWave;
import com.clubhouse.wave.databinding.WaveInFeedBinding;
import h0.b0.v;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.n.b.i;

/* compiled from: WaveInFeedView.kt */
public abstract class d extends BaseEpoxyModelWithHolder<a> {
    public List<ReceivedWave> j = EmptyList.c;
    public View.OnClickListener k;

    /* compiled from: WaveInFeedView.kt */
    public static final class a extends i0.e.b.a3.f.d {
        public WaveInFeedBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            WaveInFeedBinding bind = WaveInFeedBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final WaveInFeedBinding b() {
            WaveInFeedBinding waveInFeedBinding = this.b;
            if (waveInFeedBinding != null) {
                return waveInFeedBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        String str;
        i.e(aVar, "holder");
        aVar.b().a.setOnClickListener(this.k);
        TextView textView = aVar.b().b;
        Resources resources = aVar.b().a.getResources();
        i.d(resources, "holder.binding.root.resources");
        List<ReceivedWave> list = this.j;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (ReceivedWave receivedWave : list) {
            arrayList.add(receivedWave.c);
        }
        ArrayList arrayList2 = (ArrayList) v.s2(arrayList);
        if (arrayList2.size() == 1) {
            str = resources.getString(R.string.waved_at_you_one, new Object[]{arrayList2.get(0)});
        } else if (arrayList2.size() == 2) {
            str = resources.getString(R.string.waved_at_you_two, new Object[]{arrayList2.get(0), arrayList2.get(1)});
        } else if (arrayList2.size() > 2) {
            str = resources.getString(R.string.waved_at_you_more, new Object[]{arrayList2.get(0), Integer.valueOf(arrayList2.size() - 1)});
        } else {
            str = "";
        }
        i.d(str, "when {\n            names.size == 1 -> {\n                resources.getString(R.string.waved_at_you_one, names[0])\n            }\n            names.size == 2 -> {\n                resources.getString(R.string.waved_at_you_two, names[0], names[1])\n            }\n            names.size > 2 -> {\n                resources.getString(\n                    R.string.waved_at_you_more,\n                    names[0],\n                    names.size - 1\n                )\n            }\n            else -> {\n                \"\"\n            }\n        }");
        textView.setText(str);
    }

    public int o() {
        return R.layout.wave_in_feed;
    }
}
