package i0.e.b.g3.s.i1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.RecentPaymentBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.d;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;

/* compiled from: RecentPaymentItem.kt */
public abstract class a extends BaseEpoxyModelWithHolder<C0208a> {
    public String j;
    public String k;
    public String l;
    public Boolean m = Boolean.FALSE;
    public OffsetDateTime n;
    public View.OnClickListener o;
    public View.OnClickListener p;
    public View.OnClickListener q;

    /* renamed from: i0.e.b.g3.s.i1.a$a  reason: collision with other inner class name */
    /* compiled from: RecentPaymentItem.kt */
    public static final class C0208a extends d {
        public RecentPaymentBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            RecentPaymentBinding bind = RecentPaymentBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final RecentPaymentBinding b() {
            RecentPaymentBinding recentPaymentBinding = this.b;
            if (recentPaymentBinding != null) {
                return recentPaymentBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(C0208a aVar) {
        String str;
        i.e(aVar, "holder");
        Context context = aVar.b().a.getContext();
        AvatarView avatarView = aVar.b().c;
        i.d(avatarView, "holder.binding.avatar");
        v.S0(avatarView, this.j, this.k, 0.0f, 4);
        aVar.b().c.setOnClickListener(this.o);
        aVar.b().d.setText(this.k);
        if (this.l != null) {
            aVar.b().b.setText(this.l);
        }
        OffsetDateTime offsetDateTime = this.n;
        if (offsetDateTime != null) {
            TextView textView = aVar.b().f;
            i.d(context, "context");
            if (OffsetDateTime.now().minusDays(2).compareTo(offsetDateTime) < 0) {
                Duration between = Duration.between(offsetDateTime.toInstant(), Instant.now());
                if (between.toDays() > 0) {
                    str = context.getResources().getQuantityString(R.plurals.days_ago, (int) between.toDays(), new Object[]{Integer.valueOf((int) between.toDays())});
                } else if (between.toHours() > 0) {
                    str = context.getResources().getQuantityString(R.plurals.hours_ago, (int) between.toHours(), new Object[]{Integer.valueOf((int) between.toHours())});
                } else if (between.toMinutes() > 0) {
                    str = context.getResources().getQuantityString(R.plurals.minutes_ago, (int) between.toMinutes(), new Object[]{Integer.valueOf((int) between.toMinutes())});
                } else {
                    str = context.getResources().getQuantityString(R.plurals.seconds_ago, (int) between.getSeconds(), new Object[]{Integer.valueOf((int) between.getSeconds())});
                }
                i.d(str, "{\n            val duration = Duration.between(toInstant(), Instant.now())\n            when {\n                duration.toDays() > 0 -> {\n                    context.resources.getQuantityString(\n                        R.plurals.days_ago,\n                        duration.toDays().toInt(),\n                        duration.toDays().toInt()\n                    )\n                }\n                duration.toHours() > 0 -> {\n                    context.resources.getQuantityString(\n                        R.plurals.hours_ago,\n                        duration.toHours().toInt(),\n                        duration.toHours().toInt()\n                    )\n                }\n                duration.toMinutes() > 0 -> {\n                    context.resources.getQuantityString(\n                        R.plurals.minutes_ago,\n                        duration.toMinutes().toInt(),\n                        duration.toMinutes().toInt()\n                    )\n                }\n                else -> {\n                    context.resources.getQuantityString(\n                        R.plurals.seconds_ago,\n                        duration.seconds.toInt(),\n                        duration.seconds.toInt()\n                    )\n                }\n            }\n        }");
            } else {
                str = StringsKt__IndentKt.B(StringsKt__IndentKt.B(v.M1(offsetDateTime), " PM", "pm", false, 4), " AM", "am", false, 4);
            }
            textView.setText(str);
        }
        if (i.a(this.m, Boolean.TRUE)) {
            aVar.b().e.setText("");
            aVar.b().e.setIconResource(R.drawable.ic_action_check);
            aVar.b().e.setBackgroundResource(R.drawable.common_gray_rounded);
            aVar.b().e.setOnClickListener(this.p);
            return;
        }
        aVar.b().e.setText(context.getString(R.string.say_thanks));
        aVar.b().e.setIconResource(0);
        aVar.b().e.setBackgroundResource(R.drawable.common_blue_rounded_selected);
        aVar.b().e.setOnClickListener(this.q);
    }

    public int o() {
        return R.layout.recent_payment;
    }
}
