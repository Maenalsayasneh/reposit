package com.clubhouse.android.ui.hallway.buddyList;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.clubhouse.android.data.models.local.club.ClubInStatus;
import com.clubhouse.android.data.models.local.user.UserInStatus;
import com.clubhouse.android.ui.hallway.buddyList.viewholder.BuddyListUser;
import com.clubhouse.app.R;
import com.clubhouse.wave.data.models.local.ReceivedWave;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.p.b0.c;
import i0.e.b.g3.p.b0.d;
import i0.e.b.g3.p.b0.f;
import i0.e.b.g3.p.b0.g;
import i0.e.b.g3.p.b0.h;
import i0.e.b.g3.p.b0.j;
import i0.e.b.g3.p.b0.q;
import i0.e.b.g3.p.b0.x.b;
import i0.e.b.g3.p.b0.x.e;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: BuddyListFragment.kt */
public final class BuddyListFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ BuddyListFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListFragment$buildModels$1(BuddyListFragment buddyListFragment) {
        super(1);
        this.c = buddyListFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        BuddyListFragment buddyListFragment = this.c;
        k<Object>[] kVarArr = BuddyListFragment.Z1;
        BuddyListViewModel O0 = buddyListFragment.O0();
        final BuddyListFragment buddyListFragment2 = this.c;
        v.v2(O0, new l<q, i>() {
            public Object invoke(Object obj) {
                SpannableString spannableString;
                q qVar = (q) obj;
                m0.n.b.i.e(qVar, "state");
                int i = 1;
                int i2 = 0;
                if ((!qVar.l.isEmpty()) && !qVar.j) {
                    o oVar = o.this;
                    BuddyListFragment buddyListFragment = buddyListFragment2;
                    e eVar = new e();
                    eVar.N("ActiveClubs");
                    eVar.O(buddyListFragment.getString(R.string.active_clubs));
                    eVar.M(!qVar.h);
                    eVar.L(new j(buddyListFragment));
                    oVar.add(eVar);
                    List<ClubInStatus> list = qVar.l;
                    o oVar2 = o.this;
                    BuddyListFragment buddyListFragment2 = buddyListFragment2;
                    for (ClubInStatus clubInStatus : list) {
                        b bVar = new b();
                        bVar.O(new Number[]{Integer.valueOf(clubInStatus.q)});
                        bVar.N(clubInStatus);
                        bVar.M(new c(buddyListFragment2, clubInStatus));
                        bVar.P(new i0.e.b.g3.p.b0.e(buddyListFragment2, clubInStatus));
                        oVar2.add(bVar);
                    }
                } else if (qVar.m) {
                    o oVar3 = o.this;
                    BuddyListFragment buddyListFragment3 = buddyListFragment2;
                    e eVar2 = new e();
                    eVar2.N("ReceivedWaves");
                    eVar2.O(buddyListFragment3.getString(R.string.waved_to_talk_with_you));
                    oVar3.add(eVar2);
                    List<ReceivedWave> list2 = qVar.c;
                    o oVar4 = o.this;
                    BuddyListFragment buddyListFragment4 = buddyListFragment2;
                    for (ReceivedWave receivedWave : list2) {
                        i0.e.b.g3.p.b0.x.j jVar = new i0.e.b.g3.p.b0.x.j();
                        Number[] numberArr = new Number[i];
                        numberArr[i2] = receivedWave.getId();
                        jVar.O(numberArr);
                        jVar.Q(receivedWave.c);
                        k<Object>[] kVarArr = BuddyListFragment.Z1;
                        BuddyListViewModel O0 = buddyListFragment4.O0();
                        Objects.requireNonNull(O0);
                        m0.n.b.i.e(receivedWave, "wave");
                        OffsetDateTime offsetDateTime = receivedWave.y;
                        if (offsetDateTime != null) {
                            Duration between = Duration.between(offsetDateTime.toInstant(), Instant.now());
                            if (between.compareTo(Duration.ofHours(1)) < 0) {
                                Resources resources = O0.o;
                                Object[] objArr = new Object[i];
                                objArr[i2] = Integer.valueOf((int) between.toMinutes());
                                spannableString = new SpannableString(resources.getString(R.string.wave_status_minutes, objArr));
                                spannableString.setSpan(new ImageSpan(O0.n, R.drawable.ic_hand_wave_emoji), i2, i, 33);
                            } else if (between.compareTo(Duration.ofDays(1)) < 0) {
                                Resources resources2 = O0.o;
                                Object[] objArr2 = new Object[i];
                                objArr2[0] = Integer.valueOf((int) between.toHours());
                                spannableString = new SpannableString(resources2.getString(R.string.wave_status_hours, objArr2));
                                spannableString.setSpan(new ImageSpan(O0.n, R.drawable.ic_hand_wave_emoji), 0, 1, 33);
                            } else {
                                spannableString = new SpannableString(O0.o.getString(R.string.wave_status_waved));
                                spannableString.setSpan(new ImageSpan(O0.n, R.drawable.ic_hand_wave_emoji), i2, i, 33);
                            }
                        } else {
                            String str = receivedWave.c.Z1;
                            if (str == null) {
                                str = "";
                            }
                            spannableString = new SpannableString(str);
                        }
                        jVar.P(spannableString);
                        jVar.N(new h(buddyListFragment4, receivedWave));
                        jVar.M(BuddyListUser.Action.AcceptWave);
                        jVar.L(new f(buddyListFragment4, receivedWave));
                        oVar4.add(jVar);
                        i = 1;
                        i2 = 0;
                    }
                }
                if ((!qVar.b.isEmpty()) && !qVar.j) {
                    o oVar5 = o.this;
                    BuddyListFragment buddyListFragment5 = buddyListFragment2;
                    e eVar3 = new e();
                    eVar3.N("ActiveUsers");
                    eVar3.O(buddyListFragment5.getString(R.string.available_to_chat));
                    oVar5.add(eVar3);
                } else if (qVar.j) {
                    o oVar6 = o.this;
                    BuddyListFragment buddyListFragment6 = buddyListFragment2;
                    e eVar4 = new e();
                    eVar4.N("ActiveUsers");
                    eVar4.O(buddyListFragment6.getString(R.string.up_for_talking));
                    oVar6.add(eVar4);
                }
                if (!qVar.j) {
                    List<UserInStatus> list3 = qVar.b;
                    o oVar7 = o.this;
                    BuddyListFragment buddyListFragment7 = buddyListFragment2;
                    for (UserInStatus userInStatus : list3) {
                        i0.e.b.g3.p.b0.x.j jVar2 = new i0.e.b.g3.p.b0.x.j();
                        jVar2.O(new Number[]{userInStatus.getId()});
                        jVar2.Q(userInStatus);
                        k<Object>[] kVarArr2 = BuddyListFragment.Z1;
                        jVar2.P(new SpannableString(buddyListFragment7.O0().s(userInStatus)));
                        jVar2.N(new d(buddyListFragment7, userInStatus));
                        jVar2.M(BuddyListUser.Action.StartRoom);
                        jVar2.L(new i0.e.b.g3.p.b0.i(buddyListFragment7, userInStatus));
                        oVar7.add(jVar2);
                    }
                } else {
                    List<UserInStatus> list4 = qVar.n;
                    o oVar8 = o.this;
                    BuddyListFragment buddyListFragment8 = buddyListFragment2;
                    for (UserInStatus userInStatus2 : list4) {
                        i0.e.b.g3.p.b0.x.j jVar3 = new i0.e.b.g3.p.b0.x.j();
                        jVar3.O(new Number[]{userInStatus2.getId()});
                        jVar3.Q(userInStatus2);
                        k<Object>[] kVarArr3 = BuddyListFragment.Z1;
                        jVar3.P(new SpannableString(buddyListFragment8.O0().s(userInStatus2)));
                        jVar3.N(new i0.e.b.g3.p.b0.b(buddyListFragment8, userInStatus2));
                        jVar3.M(qVar.a(userInStatus2) ? BuddyListUser.Action.CancelWave : BuddyListUser.Action.SendWave);
                        jVar3.L(new g(buddyListFragment8, qVar, userInStatus2));
                        oVar8.add(jVar3);
                    }
                }
                return i.a;
            }
        });
        return i.a;
    }
}
