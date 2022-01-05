package com.clubhouse.android.ui.events;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.extensions.ContextExtensionsKt$openShareTweet$tweetValue$1$hosts$1;
import com.clubhouse.android.ui.channels.ChannelNavigation;
import com.clubhouse.app.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.NetworkLog;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.o.o0;
import i0.e.b.g3.o.q0;
import i0.e.b.g3.o.t0;
import i0.e.b.g3.o.u0;
import i0.e.b.g3.o.w;
import i0.e.b.z2.f.e;
import i0.j.f.p.h;
import j$.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.j.g;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.events.HalfEventFragment$onViewCreated$1", f = "HalfEventFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HalfEventFragment d;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<j, i> {
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj) {
            super(1);
            this.c = i;
            this.d = obj;
        }

        public final Object invoke(Object obj) {
            int i = this.c;
            if (i == 0) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showBanner");
                jVar.e(((HalfEventFragment) this.d).getString(R.string.copied_to_clipboard));
                return i.a;
            } else if (i == 1) {
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showNegativeBanner");
                jVar2.e(((d) ((b) this.d)).a);
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventFragment$onViewCreated$1(HalfEventFragment halfEventFragment, m0.l.c<? super HalfEventFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = halfEventFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HalfEventFragment$onViewCreated$1 halfEventFragment$onViewCreated$1 = new HalfEventFragment$onViewCreated$1(this.d, cVar);
        halfEventFragment$onViewCreated$1.c = obj;
        return halfEventFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        HalfEventFragment$onViewCreated$1 halfEventFragment$onViewCreated$1 = new HalfEventFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        halfEventFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        halfEventFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        boolean z = true;
        if (bVar instanceof o0) {
            o0 o0Var = (o0) bVar;
            int ordinal = o0Var.a.ordinal();
            if (ordinal == 0) {
                String str3 = "actionTrailRecorder";
                i0.e.a.b.a aVar = this.d.s2;
                if (aVar != null) {
                    aVar.e("Share-Type-Event", SourceLocation.BULLETIN_EVENT);
                    Context requireContext = this.d.requireContext();
                    m0.n.b.i.d(requireContext, "requireContext()");
                    String str4 = o0Var.b.e2;
                    m0.n.b.i.e(requireContext, "<this>");
                    if (str4 != null) {
                        i0.d.a.a.a.e(requireContext, com.clubhouse.android.core.R.string.share_prompt, i0.d.a.a.a.K("android.intent.action.SEND", NetworkLog.PLAIN_TEXT, "android.intent.extra.TEXT", str4));
                    }
                } else {
                    m0.n.b.i.m(str3);
                    throw null;
                }
            } else if (ordinal == 1) {
                ((AmplitudeAnalytics) v.l(this.d)).a("Bulletin-Sharing-Tweet");
                Context requireContext2 = this.d.requireContext();
                m0.n.b.i.d(requireContext2, "requireContext()");
                EventInClub eventInClub = o0Var.b;
                m0.n.b.i.e(requireContext2, "<this>");
                m0.n.b.i.e(eventInClub, "event");
                StringBuilder sb = new StringBuilder();
                String str5 = eventInClub.a2;
                if (str5 != null) {
                    StringBuilder N0 = i0.d.a.a.a.N0(8220);
                    N0.append(StringsKt__IndentKt.X(str5).toString());
                    N0.append(8220);
                    sb.append(N0.toString());
                }
                List<UserInList> list = eventInClub.b2;
                m0.n.b.i.c(list);
                String E = g.E(list, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, ContextExtensionsKt$openShareTweet$tweetValue$1$hosts$1.c, 31);
                StringBuilder N02 = i0.d.a.a.a.N0(' ');
                N02.append(requireContext2.getResources().getString(R.string.with_small));
                N02.append(' ');
                N02.append(E);
                N02.append('.');
                sb.append(N02.toString());
                OffsetDateTime offsetDateTime = eventInClub.c2;
                if (offsetDateTime != null) {
                    sb.append(" ");
                    sb.append(v.J1(offsetDateTime, requireContext2) + ' ' + requireContext2.getResources().getString(R.string.at) + ' ' + v.L1(offsetDateTime));
                }
                sb.append(m0.n.b.i.k(" ", requireContext2.getResources().getString(R.string.on_clubhouse)));
                String str6 = eventInClub.e2;
                if (str6 != null) {
                    sb.append(m0.n.b.i.k(" ", str6));
                }
                String sb2 = sb.toString();
                m0.n.b.i.d(sb2, "StringBuilder().apply {\n        // Event name: [“Get Unstuck: Founder Office Hours”]\n        event.name?.let { name ->\n            append(\"“${name.trim()}“\")\n        }\n\n        // Event hosts: [with @gregarious, @hardaway, @VittorioJessica, @kidbombay, @cavaughn]\n        val hosts = event.hosts!!.joinToString { host ->\n            if (host.twitter.isNullOrEmpty()) {\n                host.name ?: \"\"\n            } else {\n                \"@\".plus(host.twitter!!.toLowerCase())\n            }\n        }\n        append(\" ${resources.getString(R.string.with_small)} ${hosts}.\")\n\n        // Event date: [Today, 2 Apr at 5:30 PM]\n        event.timeStart?.let { timeStart ->\n            append(\" \")\n            val formattedDate = timeStart.readableDateFormat(this@openShareTweet)\n            val formattedTime = timeStart.readableTimeFormat()\n            append(\"${formattedDate} ${resources.getString(R.string.at)} ${formattedTime}\")\n        }\n\n        // Clubhouse twitter: [on @clubhouse!]\n        append(\" ${resources.getString(R.string.on_clubhouse)}\")\n\n        // Event url: [https://www.clubhouse.com/event/PAe3AeZ6]\n        event.url?.let { url ->\n            append(\" ${url}\")\n        }\n    }.toString()");
                v.m1(requireContext2, sb2);
            } else if (ordinal == 2) {
                ((AmplitudeAnalytics) v.l(this.d)).a("Bulletin-Sharing-CopyLink");
                Context requireContext3 = this.d.requireContext();
                m0.n.b.i.d(requireContext3, "requireContext()");
                EventInClub eventInClub2 = o0Var.b;
                String str7 = eventInClub2.y;
                if (str7 == null) {
                    str7 = eventInClub2.e2;
                }
                m0.n.b.i.e(requireContext3, "<this>");
                if (str7 != null) {
                    Object systemService = requireContext3.getSystemService("clipboard");
                    Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(requireContext3.getResources().getString(com.clubhouse.android.core.R.string.copied_text), str7));
                }
                HalfEventFragment halfEventFragment = this.d;
                v.b2(halfEventFragment, new a(0, halfEventFragment));
            } else if (ordinal == 3) {
                ((AmplitudeAnalytics) v.l(this.d)).a("Bulletin-Sharing-AddToLocalCalendar");
                Context requireContext4 = this.d.requireContext();
                m0.n.b.i.d(requireContext4, "requireContext()");
                EventInClub eventInClub3 = o0Var.b;
                m0.n.b.i.e(requireContext4, "<this>");
                m0.n.b.i.e(eventInClub3, "event");
                String str8 = eventInClub3.a2;
                if (str8 == null) {
                    str8 = "";
                }
                OffsetDateTime offsetDateTime2 = eventInClub3.c2;
                if (offsetDateTime2 == null) {
                    offsetDateTime2 = OffsetDateTime.now();
                }
                m0.n.b.i.d(offsetDateTime2, "event.timeStart ?: OffsetDateTime.now()");
                long m2 = v.m2(offsetDateTime2);
                OffsetDateTime offsetDateTime3 = eventInClub3.c2;
                if (offsetDateTime3 == null) {
                    offsetDateTime3 = OffsetDateTime.now();
                }
                OffsetDateTime plusHours = offsetDateTime3.plusHours(1);
                m0.n.b.i.d(plusHours, "event.timeStart ?: OffsetDateTime.now()).plusHours(1)");
                long m22 = v.m2(plusHours);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(eventInClub3.a2);
                ClubWithAdmin clubWithAdmin = eventInClub3.c;
                if (clubWithAdmin == null || (str2 = clubWithAdmin.y) == null) {
                    str = "actionTrailRecorder";
                } else {
                    str = "actionTrailRecorder";
                    sb3.append(m0.n.b.i.k("\n", requireContext4.getResources().getString(R.string.from_club, new Object[]{str2})));
                }
                String str9 = eventInClub3.Z1;
                if (!(str9 == null || str9.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    sb3.append(m0.n.b.i.k("\n\n", eventInClub3.Z1));
                }
                String str10 = eventInClub3.y;
                if (str10 == null) {
                    str10 = eventInClub3.e2;
                }
                sb3.append(m0.n.b.i.k("\n\n", str10));
                String sb4 = sb3.toString();
                m0.n.b.i.d(sb4, "StringBuilder().apply {\n        append(event.name)\n        event.club?.name?.let { clubName ->\n            append(\"\\n${context.resources.getString(R.string.from_club, clubName)}\")\n        }\n        if (!event.description.isNullOrEmpty()) {\n            append(\"\\n\\n${event.description}\")\n        }\n        append(\"\\n\\n${event.clubInviteUrl ?: event.url}\")\n    }.toString()");
                Intent putExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, str8).putExtra("allDay", false).putExtra("beginTime", m2).putExtra("endTime", m22).putExtra(InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION, sb4);
                m0.n.b.i.d(putExtra, "Intent(Intent.ACTION_INSERT)\n        .setData(CalendarContract.Events.CONTENT_URI)\n        .putExtra(CalendarContract.Events.TITLE, title)\n        .putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, false)\n        .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, startTime)\n        .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime)\n        .putExtra(CalendarContract.Events.DESCRIPTION, desc)");
                try {
                    requireContext4.startActivity(putExtra);
                } catch (Exception e) {
                    v0.a.a.d.i(e);
                }
                i0.e.a.b.a aVar2 = this.d.s2;
                if (aVar2 != null) {
                    aVar2.a.a("event_added_to_external_calendar", h.S2(new Pair("event_id", String.valueOf(o0Var.b.Y1))));
                } else {
                    m0.n.b.i.m(str);
                    throw null;
                }
            }
        } else if (bVar instanceof e) {
            ChannelNavigation.a(this.d, (e) bVar);
            this.d.dismiss();
        } else if (bVar instanceof d) {
            v.e2(this.d, new a(1, bVar));
        } else if (bVar instanceof t0) {
            final HalfEventFragment halfEventFragment2 = this.d;
            v.b2(halfEventFragment2, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showBanner");
                    jVar.e(halfEventFragment2.getString(R.string.club_invite_available, ((t0) bVar).a.getName()));
                    jVar.g(halfEventFragment2.getString(R.string.accept), new i0.e.b.g3.o.v(halfEventFragment2, jVar, bVar));
                    jVar.f(halfEventFragment2.getString(R.string.ignore), new w(jVar));
                    return i.a;
                }
            });
        } else if (bVar instanceof u0) {
            this.d.dismiss();
            ((EventsViewModel) this.d.v2.getValue()).p(q0.a);
        }
        return i.a;
    }
}
