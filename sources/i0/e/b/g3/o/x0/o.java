package i0.e.b.g3.o.x0;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.EventDescriptionBinding;
import com.clubhouse.app.R;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: EventDescription.kt */
public abstract class o extends BaseEpoxyModelWithHolder<a> {
    public EventInClub j;
    public boolean k;
    public boolean l;
    public View.OnClickListener m;

    /* compiled from: EventDescription.kt */
    public static final class a extends d {
        public EventDescriptionBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            EventDescriptionBinding bind = EventDescriptionBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final EventDescriptionBinding b() {
            EventDescriptionBinding eventDescriptionBinding = this.b;
            if (eventDescriptionBinding != null) {
                return eventDescriptionBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        String str;
        String str2;
        String str3;
        i.e(aVar, "holder");
        Resources resources = aVar.b().a.getResources();
        EventInClub eventInClub = this.j;
        if (!(eventInClub == null || (str = eventInClub.Z1) == null)) {
            i.c(eventInClub);
            List<UserInList> list = eventInClub.b2;
            if (list == null || list.isEmpty()) {
                str2 = "";
            } else {
                EventInClub eventInClub2 = this.j;
                i.c(eventInClub2);
                List<UserInList> list2 = eventInClub2.b2;
                i.c(list2);
                ArrayList arrayList = new ArrayList(h.K(list2, 10));
                for (UserInList userInList : list2) {
                    arrayList.add(userInList.y);
                }
                if (arrayList.size() == 1) {
                    str3 = (String) arrayList.get(0);
                } else {
                    String str4 = (String) g.G(arrayList);
                    str3 = StringsKt__IndentKt.B(g.E(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62), i.k(", ", str4), i.k(" & ", str4), false, 4);
                }
                str2 = resources.getString(R.string.description_w, new Object[]{str3});
                i.d(str2, "{\n                val names = event!!.hosts!!.map { it.name }\n                val namesValue = if (names.size == 1) {\n                    names[0]\n                } else {\n                    val lastName = names.last()\n                    names.joinToString(separator = \", \").replace(\", \".plus(lastName), \" & \".plus(lastName))\n                }\n                resources.getString(R.string.description_w, namesValue)\n            }");
            }
            aVar.b().b.setText(resources.getString(R.string.description_with_detail, new Object[]{str2, str}));
            TextView textView = aVar.b().b;
            i.d(textView, "holder.binding.desc");
            k.z(textView, str2);
            if (this.l) {
                aVar.b().b.setMaxLines(3);
                aVar.b().b.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        if (this.k) {
            FrameLayout frameLayout = aVar.b().c;
            i.d(frameLayout, "holder.binding.descRoot");
            k.G(frameLayout, 0);
        }
        aVar.b().a.setOnClickListener(this.m);
    }
}
