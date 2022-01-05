package com.clubhouse.android.ui.clubs.create.topics;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.clubhouse.android.data.models.local.ParentTopic;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.databinding.ClubTopicsHeaderBinding;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.d.a.a.a;
import i0.e.b.d3.k;
import i0.e.b.g3.l.v2.z.d;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: ClubTopicsFragment.kt */
public final class ClubTopicsFragment$buildTopicsList$1 extends Lambda implements l<d, i> {
    public final /* synthetic */ ClubTopicsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubTopicsFragment$buildTopicsList$1(ClubTopicsFragment clubTopicsFragment) {
        super(1);
        this.c = clubTopicsFragment;
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        m0.n.b.i.e(dVar, "state");
        ClubTopicsFragment.N0(this.c).d.removeAllViews();
        List<ParentTopic> list = dVar.b;
        if (list != null && (list.isEmpty() ^ true)) {
            LayoutInflater layoutInflater = this.c.getLayoutInflater();
            LinearLayout linearLayout = ClubTopicsFragment.N0(this.c).d;
            View inflate = layoutInflater.inflate(R.layout.club_topics_header, linearLayout, false);
            linearLayout.addView(inflate);
            ClubTopicsHeaderBinding bind = ClubTopicsHeaderBinding.bind(inflate);
            ClubTopicsFragment clubTopicsFragment = this.c;
            if (dVar.a != null) {
                TextView textView = bind.a;
                Resources resources = clubTopicsFragment.getResources();
                m0.n.b.i.d(resources, "resources");
                Object[] objArr = {dVar.a.getName()};
                ArrayList i1 = a.i1(resources, "<this>", objArr, "rawArgs", 1);
                int i = 0;
                for (int i2 = 1; i < i2; i2 = 1) {
                    Object obj2 = objArr[i];
                    if (obj2 instanceof String) {
                        String str = (String) obj2;
                        obj2 = a.p0(str, "<this>", str, 63);
                    }
                    i1.add(obj2);
                    i++;
                }
                String string = resources.getString(R.string.club_edit_topics);
                m0.n.b.i.d(string, "getString(id)");
                Object[] array = i1.toArray(new Object[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                Object[] copyOf = Arrays.copyOf(array, array.length);
                String format = String.format(string, Arrays.copyOf(copyOf, copyOf.length));
                m0.n.b.i.d(format, "java.lang.String.format(format, *args)");
                Spanned fromHtml = Html.fromHtml(format, 63);
                m0.n.b.i.d(fromHtml, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
                textView.setText(fromHtml);
            } else {
                TextView textView2 = bind.a;
                Resources resources2 = clubTopicsFragment.getResources();
                m0.n.b.i.d(resources2, "resources");
                ArrayList i12 = a.i1(resources2, "<this>", new Object[0], "rawArgs", 0);
                String string2 = resources2.getString(R.string.club_choose_topics);
                m0.n.b.i.d(string2, "getString(id)");
                Object[] array2 = i12.toArray(new Object[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                Object[] copyOf2 = Arrays.copyOf(array2, array2.length);
                String format2 = String.format(string2, Arrays.copyOf(copyOf2, copyOf2.length));
                m0.n.b.i.d(format2, "java.lang.String.format(format, *args)");
                Spanned fromHtml2 = Html.fromHtml(format2, 63);
                m0.n.b.i.d(fromHtml2, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
                textView2.setText(fromHtml2);
            }
            List<ParentTopic> list2 = dVar.b;
            ClubTopicsFragment clubTopicsFragment2 = this.c;
            for (ParentTopic parentTopic : list2) {
                String str2 = parentTopic.d;
                LinearLayout linearLayout2 = ClubTopicsFragment.N0(clubTopicsFragment2).d;
                m0.n.b.i.d(linearLayout2, "binding.mainTopicsList");
                v.k(clubTopicsFragment2, str2, linearLayout2);
                List list3 = parentTopic.x;
                if (list3 == null) {
                    list3 = EmptyList.c;
                }
                List list4 = list3;
                List<Topic> list5 = dVar.c;
                ArrayList arrayList = new ArrayList(h.K(list5, 10));
                for (Topic topic : list5) {
                    arrayList.add(Integer.valueOf(topic.c));
                }
                Set D0 = g.D0(arrayList);
                LinearLayout linearLayout3 = ClubTopicsFragment.N0(clubTopicsFragment2).d;
                m0.n.b.i.d(linearLayout3, "binding.mainTopicsList");
                v.j(clubTopicsFragment2, list4, D0, linearLayout3, 0, new ClubTopicsFragment$buildTopicsList$1$2$2(clubTopicsFragment2), new ClubTopicsFragment$buildTopicsList$1$2$3(clubTopicsFragment2), 8);
            }
            ProgressBar progressBar = ClubTopicsFragment.N0(this.c).c;
            m0.n.b.i.d(progressBar, "binding.loading");
            k.p(progressBar);
        }
        return i.a;
    }
}
