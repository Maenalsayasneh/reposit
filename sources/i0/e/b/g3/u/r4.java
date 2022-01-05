package i0.e.b.g3.u;

import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.FragmentProfileBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.d.a.a.a;
import i0.e.b.d3.k;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: HalfProfileUtil.kt */
public final class r4 {
    public static final r4 a = new r4();

    public final void a(FragmentProfileBinding fragmentProfileBinding, List<UserInList> list, int i) {
        String str;
        FragmentProfileBinding fragmentProfileBinding2 = fragmentProfileBinding;
        List<UserInList> list2 = list;
        ArrayList arrayList = new ArrayList(h.K(list2, 10));
        for (UserInList userInList : list) {
            arrayList.add(userInList.y);
        }
        ConstraintLayout constraintLayout = fragmentProfileBinding2.r;
        i.d(constraintLayout, "followedByContainer");
        constraintLayout.setVisibility(arrayList.size() > 0 ? 0 : 8);
        AvatarView avatarView = fragmentProfileBinding2.B;
        i.d(avatarView, "mutual1");
        k.L(avatarView, Boolean.valueOf(arrayList.size() > 0));
        AvatarView avatarView2 = fragmentProfileBinding2.C;
        i.d(avatarView2, "mutual2");
        k.L(avatarView2, Boolean.valueOf(arrayList.size() > 1));
        AvatarView avatarView3 = fragmentProfileBinding2.D;
        i.d(avatarView3, "mutual3");
        int i2 = 2;
        k.L(avatarView3, Boolean.valueOf(arrayList.size() > 2));
        int size = list.size();
        if (size == 0) {
            ConstraintLayout constraintLayout2 = fragmentProfileBinding2.r;
            i.d(constraintLayout2, "followedByContainer");
            constraintLayout2.setVisibility(8);
        } else if (size == 1) {
            TextView textView = fragmentProfileBinding2.q;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(fragmentProfileBinding2.a.getContext().getText(R.string.followed_by));
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(i.k(" ", arrayList.get(0)));
            spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
            textView.setText(new SpannedString(spannableStringBuilder));
            AvatarView avatarView4 = fragmentProfileBinding2.B;
            i.d(avatarView4, "mutual1");
            v.S0(avatarView4, list2.get(0).Z1, (String) arrayList.get(0), 0.0f, 4);
        } else if (size == 2) {
            String str2 = "null cannot be cast to non-null type kotlin.Array<T>";
            String str3 = "getString(id)";
            String str4 = "mutual2";
            TextView textView2 = fragmentProfileBinding2.q;
            Resources resources = fragmentProfileBinding2.a.getResources();
            i.d(resources, "root.resources");
            Object[] objArr = {arrayList.get(0), arrayList.get(1)};
            ArrayList i1 = a.i1(resources, "<this>", objArr, "rawArgs", 2);
            int i3 = 0;
            while (i3 < i2) {
                Object obj = objArr[i3];
                Object[] objArr2 = objArr;
                if (obj instanceof String) {
                    String str5 = (String) obj;
                    obj = a.p0(str5, "<this>", str5, 63);
                }
                i1.add(obj);
                i3++;
                i2 = 2;
                objArr = objArr2;
            }
            String string = resources.getString(R.string.followed_by_2);
            i.d(string, str3);
            Object[] array = i1.toArray(new Object[0]);
            Objects.requireNonNull(array, str2);
            Object[] copyOf = Arrays.copyOf(array, array.length);
            String format = String.format(string, Arrays.copyOf(copyOf, copyOf.length));
            i.d(format, "java.lang.String.format(format, *args)");
            Spanned fromHtml = Html.fromHtml(format, 63);
            i.d(fromHtml, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
            textView2.setText(fromHtml);
            AvatarView avatarView5 = fragmentProfileBinding2.B;
            i.d(avatarView5, "mutual1");
            v.S0(avatarView5, list2.get(0).Z1, (String) arrayList.get(0), 0.0f, 4);
            AvatarView avatarView6 = fragmentProfileBinding2.C;
            i.d(avatarView6, str4);
            v.S0(avatarView6, list2.get(1).Z1, (String) arrayList.get(1), 0.0f, 4);
        } else if (size != 3) {
            String str6 = "root.resources";
            String str7 = "<this>";
            String str8 = "rawArgs";
            int size2 = i - arrayList.size();
            String str9 = "getString(id)";
            String str10 = "mutual3";
            String str11 = "null cannot be cast to non-null type kotlin.Array<T>";
            String E = g.E(arrayList, ", ", " ", " ", 0, (CharSequence) null, (l) null, 56);
            TextView textView3 = fragmentProfileBinding2.q;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(fragmentProfileBinding2.a.getContext().getText(R.string.followed_by));
            int i4 = 1;
            StyleSpan styleSpan2 = new StyleSpan(1);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append(E);
            spannableStringBuilder2.setSpan(styleSpan2, length2, spannableStringBuilder2.length(), 17);
            int i5 = size2;
            if (i5 == 1) {
                Resources resources2 = fragmentProfileBinding2.a.getResources();
                i.d(resources2, str6);
                Object[] objArr3 = {Integer.valueOf(i5)};
                String str12 = str7;
                ArrayList i12 = a.i1(resources2, str12, objArr3, str8, 1);
                int i6 = 0;
                while (i6 < i4) {
                    Object obj2 = objArr3[i6];
                    Object[] objArr4 = objArr3;
                    if (obj2 instanceof String) {
                        String str13 = (String) obj2;
                        obj2 = a.p0(str13, str12, str13, 63);
                    }
                    i12.add(obj2);
                    i6++;
                    i4 = 1;
                    objArr3 = objArr4;
                }
                String string2 = resources2.getString(R.string.and_one_other);
                i.d(string2, str9);
                Object[] array2 = i12.toArray(new Object[0]);
                Objects.requireNonNull(array2, str11);
                Object[] copyOf2 = Arrays.copyOf(array2, array2.length);
                String format2 = String.format(string2, Arrays.copyOf(copyOf2, copyOf2.length));
                i.d(format2, "java.lang.String.format(format, *args)");
                Spanned fromHtml2 = Html.fromHtml(format2, 63);
                i.d(fromHtml2, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
                spannableStringBuilder2.append(fromHtml2);
                str = "mutual2";
            } else {
                String str14 = str7;
                String str15 = str9;
                Resources resources3 = fragmentProfileBinding2.a.getResources();
                i.d(resources3, str6);
                int i7 = 1;
                str = "mutual2";
                Object[] objArr5 = {Integer.valueOf(i5)};
                ArrayList i13 = a.i1(resources3, str14, objArr5, str8, 1);
                int i8 = 0;
                while (i8 < i7) {
                    Object obj3 = objArr5[i8];
                    Object[] objArr6 = objArr5;
                    if (obj3 instanceof String) {
                        String str16 = (String) obj3;
                        obj3 = a.p0(str16, str14, str16, 63);
                    }
                    i13.add(obj3);
                    i8++;
                    i7 = 1;
                    objArr5 = objArr6;
                }
                String string3 = resources3.getString(R.string.and_others);
                i.d(string3, str15);
                Object[] array3 = i13.toArray(new Object[0]);
                Objects.requireNonNull(array3, str11);
                Object[] copyOf3 = Arrays.copyOf(array3, array3.length);
                String format3 = String.format(string3, Arrays.copyOf(copyOf3, copyOf3.length));
                i.d(format3, "java.lang.String.format(format, *args)");
                Spanned fromHtml3 = Html.fromHtml(format3, 63);
                i.d(fromHtml3, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
                spannableStringBuilder2.append(fromHtml3);
            }
            textView3.setText(new SpannedString(spannableStringBuilder2));
            AvatarView avatarView7 = fragmentProfileBinding2.B;
            i.d(avatarView7, "mutual1");
            v.S0(avatarView7, list2.get(0).Z1, (String) arrayList.get(0), 0.0f, 4);
            AvatarView avatarView8 = fragmentProfileBinding2.C;
            i.d(avatarView8, str);
            v.S0(avatarView8, list2.get(1).Z1, (String) arrayList.get(1), 0.0f, 4);
            AvatarView avatarView9 = fragmentProfileBinding2.D;
            i.d(avatarView9, str10);
            v.S0(avatarView9, list2.get(2).Z1, (String) arrayList.get(2), 0.0f, 4);
        } else {
            String str17 = "null cannot be cast to non-null type kotlin.Array<T>";
            String str18 = "getString(id)";
            String str19 = "mutual2";
            TextView textView4 = fragmentProfileBinding2.q;
            Resources resources4 = fragmentProfileBinding2.a.getResources();
            i.d(resources4, "root.resources");
            Object[] objArr7 = {arrayList.get(0), arrayList.get(1), arrayList.get(2)};
            int i9 = 3;
            ArrayList i14 = a.i1(resources4, "<this>", objArr7, "rawArgs", 3);
            String str20 = "mutual3";
            int i10 = 0;
            while (i10 < i9) {
                Object obj4 = objArr7[i10];
                Object[] objArr8 = objArr7;
                if (obj4 instanceof String) {
                    String str21 = (String) obj4;
                    obj4 = a.p0(str21, "<this>", str21, 63);
                }
                i14.add(obj4);
                i10++;
                i9 = 3;
                objArr7 = objArr8;
            }
            String string4 = resources4.getString(R.string.followed_by_3);
            i.d(string4, str18);
            Object[] array4 = i14.toArray(new Object[0]);
            Objects.requireNonNull(array4, str17);
            Object[] copyOf4 = Arrays.copyOf(array4, array4.length);
            String format4 = String.format(string4, Arrays.copyOf(copyOf4, copyOf4.length));
            i.d(format4, "java.lang.String.format(format, *args)");
            Spanned fromHtml4 = Html.fromHtml(format4, 63);
            i.d(fromHtml4, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
            textView4.setText(fromHtml4);
            AvatarView avatarView10 = fragmentProfileBinding2.B;
            i.d(avatarView10, "mutual1");
            v.S0(avatarView10, list2.get(0).Z1, (String) arrayList.get(0), 0.0f, 4);
            AvatarView avatarView11 = fragmentProfileBinding2.C;
            i.d(avatarView11, str19);
            v.S0(avatarView11, list2.get(1).Z1, (String) arrayList.get(1), 0.0f, 4);
            AvatarView avatarView12 = fragmentProfileBinding2.D;
            i.d(avatarView12, str20);
            v.S0(avatarView12, list2.get(2).Z1, (String) arrayList.get(2), 0.0f, 4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:208:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0511  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0530  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x05be  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0611  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0629  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x066c  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x06c0  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x073f  */
    /* JADX WARNING: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.clubhouse.android.databinding.FragmentProfileBinding r20, i0.e.b.g3.u.b5 r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "<this>"
            m0.n.b.i.e(r0, r2)
            java.lang.String r3 = "state"
            m0.n.b.i.e(r1, r3)
            com.clubhouse.android.data.models.local.user.UserProfile r3 = r21.k()
            com.clubhouse.android.data.models.local.notification.FollowNotificationType r4 = r21.c()
            boolean r5 = r21.a()
            boolean r6 = r21.e()
            boolean r7 = r21.g()
            java.util.List r8 = r21.d()
            boolean r9 = r1 instanceof i0.e.b.g3.u.c5
            if (r9 == 0) goto L_0x002e
            r9 = r1
            i0.e.b.g3.u.c5 r9 = (i0.e.b.g3.u.c5) r9
            goto L_0x002f
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 != 0) goto L_0x0033
            r9 = 0
            goto L_0x0035
        L_0x0033:
            com.clubhouse.android.data.models.local.user.BasicUser r9 = r9.e
        L_0x0035:
            android.widget.FrameLayout r10 = r0.z
            java.lang.String r11 = "loadingContainer"
            m0.n.b.i.d(r10, r11)
            i0.b.b.b r11 = r21.getRequest()
            boolean r11 = r11 instanceof i0.b.b.f
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x0057
            i0.b.b.b r11 = r21.l()
            boolean r11 = r11 instanceof i0.b.b.f
            if (r11 != 0) goto L_0x0057
            boolean r11 = r21.getLoading()
            if (r11 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r11 = r13
            goto L_0x0058
        L_0x0057:
            r11 = r12
        L_0x0058:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            i0.e.b.d3.k.L(r10, r11)
            java.lang.String r10 = "username"
            java.lang.String r11 = "avatar"
            if (r9 != 0) goto L_0x0068
            r16 = r2
            goto L_0x00ab
        L_0x0068:
            com.clubhouse.android.shared.ui.AvatarView r14 = r0.b
            m0.n.b.i.d(r14, r11)
            i0.e.b.d3.k.u(r14, r9)
            android.widget.TextView r14 = r0.E
            java.lang.String r15 = r9.d
            r14.setText(r15)
            android.widget.TextView r14 = r0.X
            androidx.constraintlayout.widget.ConstraintLayout r15 = r0.a
            android.content.Context r15 = r15.getContext()
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r16 = r2
            java.lang.String r2 = r9.q
            r12[r13] = r2
            r2 = 2131952958(0x7f13053e, float:1.9542373E38)
            java.lang.String r2 = r15.getString(r2, r12)
            r14.setText(r2)
            android.widget.TextView r2 = r0.X
            m0.n.b.i.d(r2, r10)
            java.lang.String r12 = r9.q
            if (r12 == 0) goto L_0x00a3
            int r12 = r12.length()
            if (r12 != 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r12 = r13
            goto L_0x00a4
        L_0x00a3:
            r12 = 1
        L_0x00a4:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            i0.e.b.d3.k.q(r2, r12)
        L_0x00ab:
            if (r8 != 0) goto L_0x00ae
            goto L_0x00e0
        L_0x00ae:
            boolean r2 = r8.isEmpty()
            r2 = r2 ^ 1
            java.lang.String r8 = "followSuggestionsEmpty"
            java.lang.String r12 = "followSuggestionsList"
            if (r2 == 0) goto L_0x00d0
            com.airbnb.epoxy.EpoxyRecyclerView r2 = r0.p
            m0.n.b.i.d(r2, r12)
            i0.e.b.d3.k.K(r2)
            com.airbnb.epoxy.EpoxyRecyclerView r2 = r0.p
            r2.g()
            android.widget.TextView r2 = r0.o
            m0.n.b.i.d(r2, r8)
            i0.e.b.d3.k.p(r2)
            goto L_0x00e0
        L_0x00d0:
            com.airbnb.epoxy.EpoxyRecyclerView r2 = r0.p
            m0.n.b.i.d(r2, r12)
            i0.e.b.d3.k.r(r2)
            android.widget.TextView r2 = r0.o
            m0.n.b.i.d(r2, r8)
            i0.e.b.d3.k.K(r2)
        L_0x00e0:
            boolean r2 = r21.b()
            r8 = 8
            if (r2 == 0) goto L_0x00f4
            androidx.constraintlayout.widget.ConstraintLayout r2 = r0.n
            r2.setVisibility(r13)
            android.widget.ImageView r2 = r0.m
            r12 = 1
            r2.setActivated(r12)
            goto L_0x00ff
        L_0x00f4:
            r12 = 1
            androidx.constraintlayout.widget.ConstraintLayout r2 = r0.n
            r2.setVisibility(r8)
            android.widget.ImageView r2 = r0.m
            r2.setActivated(r13)
        L_0x00ff:
            int r2 = r4.ordinal()
            if (r2 == 0) goto L_0x0121
            if (r2 == r12) goto L_0x0116
            r4 = 2
            if (r2 == r4) goto L_0x010b
            goto L_0x012c
        L_0x010b:
            android.widget.ImageView r2 = r0.I
            r2.setActivated(r12)
            android.widget.ImageView r2 = r0.I
            r2.setSelected(r13)
            goto L_0x012c
        L_0x0116:
            android.widget.ImageView r2 = r0.I
            r2.setActivated(r13)
            android.widget.ImageView r2 = r0.I
            r2.setSelected(r13)
            goto L_0x012c
        L_0x0121:
            android.widget.ImageView r2 = r0.I
            r2.setActivated(r13)
            android.widget.ImageView r2 = r0.I
            r4 = 1
            r2.setSelected(r4)
        L_0x012c:
            android.widget.ImageView r2 = r0.I
            java.lang.String r4 = "notifyOptions"
            m0.n.b.i.d(r2, r4)
            if (r6 == 0) goto L_0x0137
            r4 = r13
            goto L_0x0138
        L_0x0137:
            r4 = r8
        L_0x0138:
            r2.setVisibility(r4)
            android.widget.LinearLayout r2 = r0.U
            java.lang.String r4 = "socialOptions"
            m0.n.b.i.d(r2, r4)
            r4 = r5 ^ 1
            if (r4 == 0) goto L_0x0148
            r12 = r13
            goto L_0x0149
        L_0x0148:
            r12 = r8
        L_0x0149:
            r2.setVisibility(r12)
            android.widget.ImageView r2 = r0.A
            java.lang.String r12 = "menu"
            m0.n.b.i.d(r2, r12)
            if (r4 == 0) goto L_0x0157
            r4 = r13
            goto L_0x0158
        L_0x0157:
            r4 = r8
        L_0x0158:
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r0.R
            java.lang.String r4 = "settings"
            m0.n.b.i.d(r2, r4)
            if (r5 == 0) goto L_0x0166
            r4 = r13
            goto L_0x0167
        L_0x0166:
            r4 = r8
        L_0x0167:
            r2.setVisibility(r4)
            android.widget.ImageView r2 = r0.S
            java.lang.String r4 = "share"
            m0.n.b.i.d(r2, r4)
            if (r5 == 0) goto L_0x0175
            r4 = r13
            goto L_0x0176
        L_0x0175:
            r4 = r8
        L_0x0176:
            r2.setVisibility(r4)
            com.clubhouse.android.core.ui.TriStateButton r2 = r0.k
            r2.setChecked(r6)
            com.clubhouse.android.core.ui.TriStateButton r2 = r0.k
            r2.setBlocked(r7)
            android.widget.ImageView r2 = r0.g
            java.lang.String r4 = "close"
            m0.n.b.i.d(r2, r4)
            boolean r4 = r1 instanceof i0.e.b.g3.u.q4
            if (r4 == 0) goto L_0x0190
            r6 = r13
            goto L_0x0191
        L_0x0190:
            r6 = r8
        L_0x0191:
            r2.setVisibility(r6)
            android.widget.ImageView r2 = r0.c
            java.lang.String r6 = "back"
            m0.n.b.i.d(r2, r6)
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x01a0
            r8 = r13
        L_0x01a0:
            r2.setVisibility(r8)
            com.clubhouse.android.databinding.ProfileUpcomingEventBinding r2 = r0.W
            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.a
            java.lang.String r4 = "upcomingEventContainer.root"
            m0.n.b.i.d(r2, r4)
            com.clubhouse.android.data.models.local.EventInProfile r4 = r21.f()
            if (r4 != 0) goto L_0x01b4
            r4 = 1
            goto L_0x01b5
        L_0x01b4:
            r4 = r13
        L_0x01b5:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            i0.e.b.d3.k.q(r2, r4)
            com.clubhouse.android.data.models.local.EventInProfile r2 = r21.f()
            if (r2 != 0) goto L_0x01c4
            goto L_0x024e
        L_0x01c4:
            com.clubhouse.android.databinding.ProfileUpcomingEventBinding r4 = r0.W
            android.widget.TextView r4 = r4.c
            java.lang.String r6 = "upcomingEventContainer.eventClub"
            m0.n.b.i.d(r4, r6)
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r6 = r2.c
            if (r6 != 0) goto L_0x01d3
            r6 = 1
            goto L_0x01d4
        L_0x01d3:
            r6 = r13
        L_0x01d4:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            i0.e.b.d3.k.q(r4, r6)
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r4 = r2.c
            if (r4 != 0) goto L_0x01e0
            goto L_0x01e9
        L_0x01e0:
            com.clubhouse.android.databinding.ProfileUpcomingEventBinding r6 = r0.W
            android.widget.TextView r6 = r6.c
            java.lang.String r4 = r4.y
            r6.setText(r4)
        L_0x01e9:
            java.lang.String r4 = r2.y
            if (r4 != 0) goto L_0x01ee
            goto L_0x01f5
        L_0x01ee:
            com.clubhouse.android.databinding.ProfileUpcomingEventBinding r6 = r0.W
            android.widget.TextView r6 = r6.g
            r6.setText(r4)
        L_0x01f5:
            j$.time.OffsetDateTime r4 = r2.Z1
            if (r4 != 0) goto L_0x01fa
            goto L_0x021b
        L_0x01fa:
            com.clubhouse.android.databinding.ProfileUpcomingEventBinding r6 = r0.W
            android.widget.TextView r6 = r6.d
            androidx.constraintlayout.widget.ConstraintLayout r8 = r0.a
            android.content.Context r8 = r8.getContext()
            java.lang.String r12 = "root.context"
            m0.n.b.i.d(r8, r12)
            java.lang.String r8 = h0.b0.v.J1(r4, r8)
            r6.setText(r8)
            com.clubhouse.android.databinding.ProfileUpcomingEventBinding r6 = r0.W
            android.widget.TextView r6 = r6.f
            java.lang.String r4 = h0.b0.v.L1(r4)
            r6.setText(r4)
        L_0x021b:
            com.clubhouse.android.databinding.ProfileUpcomingEventBinding r4 = r0.W
            com.clubhouse.android.core.ui.RSVPButton r4 = r4.b
            java.lang.String r6 = "upcomingEventContainer.bellIcon"
            m0.n.b.i.d(r4, r6)
            if (r5 != 0) goto L_0x0237
            java.lang.Integer r6 = r21.j()
            boolean r6 = r2.h(r6)
            if (r6 != 0) goto L_0x0237
            boolean r6 = r2.d2
            if (r6 == 0) goto L_0x0235
            goto L_0x0237
        L_0x0235:
            r6 = r13
            goto L_0x0238
        L_0x0237:
            r6 = 1
        L_0x0238:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            i0.e.b.d3.k.q(r4, r6)
            com.clubhouse.android.databinding.ProfileUpcomingEventBinding r4 = r0.W
            com.clubhouse.android.core.ui.RSVPButton r4 = r4.b
            java.lang.Boolean r2 = r2.g()
            boolean r2 = r2.booleanValue()
            r4.setChecked(r2)
        L_0x024e:
            if (r3 != 0) goto L_0x0252
            goto L_0x074a
        L_0x0252:
            if (r5 != 0) goto L_0x025c
            if (r7 != 0) goto L_0x025c
            boolean r2 = r3.j2
            if (r2 == 0) goto L_0x025c
            r2 = 1
            goto L_0x025d
        L_0x025c:
            r2 = r13
        L_0x025d:
            android.widget.Button r4 = r0.v
            java.lang.String r6 = "giveMoneyButton"
            m0.n.b.i.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            i0.e.b.d3.k.L(r4, r6)
            boolean r4 = r21.i()
            java.lang.String r6 = "sendWave"
            java.lang.String r8 = "sendMessage"
            java.lang.String r12 = "buttonsShadow"
            java.lang.String r14 = "sendMessageButton"
            if (r4 == 0) goto L_0x030a
            boolean r4 = r3.a2
            if (r5 != 0) goto L_0x028b
            if (r7 != 0) goto L_0x028b
            java.lang.Boolean r7 = r3.s2
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            boolean r7 = m0.n.b.i.a(r7, r15)
            if (r7 == 0) goto L_0x028b
            r7 = 1
            goto L_0x028c
        L_0x028b:
            r7 = r13
        L_0x028c:
            android.widget.ImageView r15 = r0.P
            m0.n.b.i.d(r15, r14)
            i0.e.b.d3.k.p(r15)
            android.widget.Button r14 = r0.O
            m0.n.b.i.d(r14, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            i0.e.b.d3.k.L(r14, r8)
            android.widget.Button r8 = r0.Q
            m0.n.b.i.d(r8, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            i0.e.b.d3.k.L(r8, r6)
            boolean r1 = r21.h()
            if (r1 == 0) goto L_0x02d3
            android.widget.Button r1 = r0.Q
            androidx.constraintlayout.widget.ConstraintLayout r6 = r0.a
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131951818(0x7f1300ca, float:1.9540061E38)
            java.lang.String r6 = r6.getString(r8)
            r1.setText(r6)
            android.widget.Button r1 = r0.Q
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r6 = 2131231343(0x7f08026f, float:1.8078764E38)
            r1.setIconResource(r6)
            goto L_0x02f3
        L_0x02d3:
            android.widget.Button r1 = r0.Q
            androidx.constraintlayout.widget.ConstraintLayout r6 = r0.a
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131952783(0x7f13048f, float:1.9542018E38)
            java.lang.String r6 = r6.getString(r8)
            r1.setText(r6)
            android.widget.Button r1 = r0.Q
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r6 = 2131231335(0x7f080267, float:1.8078748E38)
            r1.setIconResource(r6)
        L_0x02f3:
            android.view.View r1 = r0.f
            m0.n.b.i.d(r1, r12)
            if (r2 != 0) goto L_0x0301
            if (r7 != 0) goto L_0x0301
            if (r4 == 0) goto L_0x02ff
            goto L_0x0301
        L_0x02ff:
            r2 = r13
            goto L_0x0302
        L_0x0301:
            r2 = 1
        L_0x0302:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            i0.e.b.d3.k.L(r1, r2)
            goto L_0x0343
        L_0x030a:
            android.widget.ImageView r1 = r0.P
            m0.n.b.i.d(r1, r14)
            if (r5 != 0) goto L_0x031f
            if (r7 != 0) goto L_0x031f
            java.lang.Boolean r4 = r3.s2
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r4 = m0.n.b.i.a(r4, r7)
            if (r4 == 0) goto L_0x031f
            r4 = 1
            goto L_0x0320
        L_0x031f:
            r4 = r13
        L_0x0320:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            i0.e.b.d3.k.L(r1, r4)
            android.view.View r1 = r0.f
            m0.n.b.i.d(r1, r12)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            i0.e.b.d3.k.L(r1, r2)
            android.widget.Button r1 = r0.O
            m0.n.b.i.d(r1, r8)
            i0.e.b.d3.k.p(r1)
            android.widget.Button r1 = r0.Q
            m0.n.b.i.d(r1, r6)
            i0.e.b.d3.k.p(r1)
        L_0x0343:
            android.widget.ImageView r1 = r0.Y
            java.lang.String r2 = "verifyEmail"
            m0.n.b.i.d(r1, r2)
            if (r5 == 0) goto L_0x0358
            java.lang.Boolean r2 = r3.m2
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r2 = m0.n.b.i.a(r2, r4)
            if (r2 == 0) goto L_0x0358
            r2 = 1
            goto L_0x0359
        L_0x0358:
            r2 = r13
        L_0x0359:
            if (r2 == 0) goto L_0x035d
            r2 = r13
            goto L_0x035f
        L_0x035d:
            r2 = 8
        L_0x035f:
            r1.setVisibility(r2)
            android.widget.ImageView r1 = r0.e
            java.lang.String r2 = "blockedByNetwork"
            m0.n.b.i.d(r1, r2)
            boolean r2 = r3.b2
            if (r2 == 0) goto L_0x036f
            r2 = r13
            goto L_0x0371
        L_0x036f:
            r2 = 8
        L_0x0371:
            r1.setVisibility(r2)
            if (r9 != 0) goto L_0x0378
            r1 = 0
            goto L_0x037a
        L_0x0378:
            java.lang.String r1 = r9.x
        L_0x037a:
            if (r1 == 0) goto L_0x0385
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0383
            goto L_0x0385
        L_0x0383:
            r1 = r13
            goto L_0x0386
        L_0x0385:
            r1 = 1
        L_0x0386:
            if (r1 == 0) goto L_0x0390
            com.clubhouse.android.shared.ui.AvatarView r1 = r0.b
            m0.n.b.i.d(r1, r11)
            i0.e.b.d3.k.u(r1, r3)
        L_0x0390:
            java.lang.String r1 = r3.c
            if (r1 == 0) goto L_0x039d
            int r1 = r1.length()
            if (r1 != 0) goto L_0x039b
            goto L_0x039d
        L_0x039b:
            r1 = r13
            goto L_0x039e
        L_0x039d:
            r1 = 1
        L_0x039e:
            java.lang.String r2 = "fullname"
            if (r1 == 0) goto L_0x03b2
            android.widget.TextView r1 = r0.E
            java.lang.String r4 = r3.u2
            r1.setText(r4)
            android.widget.TextView r1 = r0.u
            m0.n.b.i.d(r1, r2)
            i0.e.b.d3.k.p(r1)
            goto L_0x03da
        L_0x03b2:
            android.widget.TextView r1 = r0.E
            java.lang.String r4 = r3.c
            r1.setText(r4)
            android.widget.TextView r1 = r0.u
            r4 = 40
            java.lang.StringBuilder r4 = i0.d.a.a.a.N0(r4)
            java.lang.String r6 = r3.u2
            r4.append(r6)
            r6 = 41
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r1.setText(r4)
            android.widget.TextView r1 = r0.u
            m0.n.b.i.d(r1, r2)
            i0.e.b.d3.k.K(r1)
        L_0x03da:
            android.widget.TextView r1 = r0.X
            androidx.constraintlayout.widget.ConstraintLayout r2 = r0.a
            android.content.Context r2 = r2.getContext()
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r6 = r3.v2
            r4[r13] = r6
            r6 = 2131952958(0x7f13053e, float:1.9542373E38)
            java.lang.String r2 = r2.getString(r6, r4)
            r1.setText(r2)
            android.widget.TextView r1 = r0.X
            m0.n.b.i.d(r1, r10)
            java.lang.String r2 = r3.v2
            if (r2 == 0) goto L_0x0405
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0403
            goto L_0x0405
        L_0x0403:
            r2 = r13
            goto L_0x0406
        L_0x0405:
            r2 = 1
        L_0x0406:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            i0.e.b.d3.k.q(r1, r2)
            android.widget.TextView r1 = r0.t
            java.lang.String r2 = "followsYou"
            m0.n.b.i.d(r1, r2)
            boolean r2 = r3.a2
            if (r2 == 0) goto L_0x041a
            r2 = r13
            goto L_0x041c
        L_0x041a:
            r2 = 8
        L_0x041c:
            r1.setVisibility(r2)
            android.widget.LinearLayout r1 = r0.l
            java.lang.String r2 = "followCountContainer"
            m0.n.b.i.d(r1, r2)
            r1.setVisibility(r13)
            android.widget.TextView r1 = r0.J
            int r2 = r3.y
            java.lang.String r2 = i0.e.b.f3.d.a(r2)
            r1.setText(r2)
            android.widget.TextView r1 = r0.L
            int r2 = r3.Y1
            java.lang.String r2 = i0.e.b.f3.d.a(r2)
            r1.setText(r2)
            android.widget.TextView r1 = r0.s
            androidx.constraintlayout.widget.ConstraintLayout r2 = r0.a
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131820551(0x7f110007, float:1.927382E38)
            int r6 = r3.y
            java.lang.String r2 = r2.getQuantityString(r4, r6)
            r1.setText(r2)
            java.lang.String r1 = r3.d
            if (r1 == 0) goto L_0x0464
            boolean r1 = kotlin.text.StringsKt__IndentKt.o(r1)
            if (r1 == 0) goto L_0x0462
            goto L_0x0464
        L_0x0462:
            r1 = r13
            goto L_0x0465
        L_0x0464:
            r1 = 1
        L_0x0465:
            r2 = 2131099709(0x7f06003d, float:1.7811779E38)
            r4 = 2131099687(0x7f060027, float:1.7811734E38)
            if (r1 == 0) goto L_0x0491
            if (r5 == 0) goto L_0x0491
            android.widget.TextView r1 = r0.d
            androidx.constraintlayout.widget.ConstraintLayout r6 = r0.a
            android.content.Context r6 = r6.getContext()
            r7 = 2131951670(0x7f130036, float:1.9539761E38)
            java.lang.String r6 = r6.getString(r7)
            r1.setText(r6)
            android.widget.TextView r1 = r0.d
            androidx.constraintlayout.widget.ConstraintLayout r6 = r0.a
            android.content.Context r6 = r6.getContext()
            int r6 = h0.i.b.a.getColor(r6, r2)
            r1.setTextColor(r6)
            goto L_0x04a7
        L_0x0491:
            android.widget.TextView r1 = r0.d
            java.lang.String r6 = r3.d
            r1.setText(r6)
            android.widget.TextView r1 = r0.d
            androidx.constraintlayout.widget.ConstraintLayout r6 = r0.a
            android.content.Context r6 = r6.getContext()
            int r6 = h0.i.b.a.getColor(r6, r4)
            r1.setTextColor(r6)
        L_0x04a7:
            android.widget.LinearLayout r1 = r0.T
            java.lang.String r6 = "socialContainer"
            m0.n.b.i.d(r1, r6)
            java.lang.String r6 = r3.q
            if (r6 == 0) goto L_0x04bb
            boolean r6 = kotlin.text.StringsKt__IndentKt.o(r6)
            if (r6 == 0) goto L_0x04b9
            goto L_0x04bb
        L_0x04b9:
            r6 = r13
            goto L_0x04bc
        L_0x04bb:
            r6 = 1
        L_0x04bc:
            if (r6 == 0) goto L_0x04d3
            java.lang.String r6 = r3.x
            if (r6 == 0) goto L_0x04cb
            boolean r6 = kotlin.text.StringsKt__IndentKt.o(r6)
            if (r6 == 0) goto L_0x04c9
            goto L_0x04cb
        L_0x04c9:
            r6 = r13
            goto L_0x04cc
        L_0x04cb:
            r6 = 1
        L_0x04cc:
            if (r6 == 0) goto L_0x04d3
            if (r5 == 0) goto L_0x04d1
            goto L_0x04d3
        L_0x04d1:
            r6 = r13
            goto L_0x04d4
        L_0x04d3:
            r6 = 1
        L_0x04d4:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            i0.e.b.d3.k.L(r1, r6)
            android.widget.Button r1 = r0.V
            java.lang.String r6 = "twitter"
            m0.n.b.i.d(r1, r6)
            java.lang.String r6 = r3.q
            if (r6 == 0) goto L_0x04ef
            boolean r6 = kotlin.text.StringsKt__IndentKt.o(r6)
            if (r6 == 0) goto L_0x04ed
            goto L_0x04ef
        L_0x04ed:
            r6 = r13
            goto L_0x04f0
        L_0x04ef:
            r6 = 1
        L_0x04f0:
            if (r6 == 0) goto L_0x04f7
            if (r5 == 0) goto L_0x04f5
            goto L_0x04f7
        L_0x04f5:
            r6 = r13
            goto L_0x04f8
        L_0x04f7:
            r6 = 1
        L_0x04f8:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            i0.e.b.d3.k.L(r1, r6)
            android.widget.Button r1 = r0.w
            java.lang.String r6 = "instagram"
            m0.n.b.i.d(r1, r6)
            java.lang.String r6 = r3.x
            if (r6 == 0) goto L_0x0513
            boolean r6 = kotlin.text.StringsKt__IndentKt.o(r6)
            if (r6 == 0) goto L_0x0511
            goto L_0x0513
        L_0x0511:
            r6 = r13
            goto L_0x0514
        L_0x0513:
            r6 = 1
        L_0x0514:
            if (r6 == 0) goto L_0x051b
            if (r5 == 0) goto L_0x0519
            goto L_0x051b
        L_0x0519:
            r6 = r13
            goto L_0x051c
        L_0x051b:
            r6 = 1
        L_0x051c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            i0.e.b.d3.k.L(r1, r6)
            java.lang.String r1 = r3.q
            if (r1 == 0) goto L_0x0530
            boolean r1 = kotlin.text.StringsKt__IndentKt.o(r1)
            if (r1 == 0) goto L_0x052e
            goto L_0x0530
        L_0x052e:
            r1 = r13
            goto L_0x0531
        L_0x0530:
            r1 = 1
        L_0x0531:
            if (r1 == 0) goto L_0x0557
            if (r5 == 0) goto L_0x0557
            android.widget.Button r1 = r0.V
            androidx.constraintlayout.widget.ConstraintLayout r6 = r0.a
            android.content.Context r6 = r6.getContext()
            r7 = 2131951692(0x7f13004c, float:1.9539806E38)
            java.lang.String r6 = r6.getString(r7)
            r1.setText(r6)
            android.widget.Button r1 = r0.V
            androidx.constraintlayout.widget.ConstraintLayout r6 = r0.a
            android.content.Context r6 = r6.getContext()
            int r6 = h0.i.b.a.getColor(r6, r2)
            r1.setTextColor(r6)
            goto L_0x057d
        L_0x0557:
            java.lang.String r1 = r3.q
            if (r1 == 0) goto L_0x0564
            boolean r1 = kotlin.text.StringsKt__IndentKt.o(r1)
            if (r1 == 0) goto L_0x0562
            goto L_0x0564
        L_0x0562:
            r1 = r13
            goto L_0x0565
        L_0x0564:
            r1 = 1
        L_0x0565:
            if (r1 != 0) goto L_0x057d
            android.widget.Button r1 = r0.V
            java.lang.String r6 = r3.q
            r1.setText(r6)
            android.widget.Button r1 = r0.V
            androidx.constraintlayout.widget.ConstraintLayout r6 = r0.a
            android.content.Context r6 = r6.getContext()
            int r6 = h0.i.b.a.getColor(r6, r4)
            r1.setTextColor(r6)
        L_0x057d:
            java.lang.String r1 = r3.x
            if (r1 == 0) goto L_0x058a
            boolean r1 = kotlin.text.StringsKt__IndentKt.o(r1)
            if (r1 == 0) goto L_0x0588
            goto L_0x058a
        L_0x0588:
            r1 = r13
            goto L_0x058b
        L_0x058a:
            r1 = 1
        L_0x058b:
            if (r1 == 0) goto L_0x05b1
            if (r5 == 0) goto L_0x05b1
            android.widget.Button r1 = r0.w
            androidx.constraintlayout.widget.ConstraintLayout r4 = r0.a
            android.content.Context r4 = r4.getContext()
            r6 = 2131951685(0x7f130045, float:1.9539791E38)
            java.lang.String r4 = r4.getString(r6)
            r1.setText(r4)
            android.widget.Button r1 = r0.w
            androidx.constraintlayout.widget.ConstraintLayout r4 = r0.a
            android.content.Context r4 = r4.getContext()
            int r2 = h0.i.b.a.getColor(r4, r2)
            r1.setTextColor(r2)
            goto L_0x05d7
        L_0x05b1:
            java.lang.String r1 = r3.x
            if (r1 == 0) goto L_0x05be
            boolean r1 = kotlin.text.StringsKt__IndentKt.o(r1)
            if (r1 == 0) goto L_0x05bc
            goto L_0x05be
        L_0x05bc:
            r1 = r13
            goto L_0x05bf
        L_0x05be:
            r1 = 1
        L_0x05bf:
            if (r1 != 0) goto L_0x05d7
            android.widget.Button r1 = r0.w
            java.lang.String r2 = r3.x
            r1.setText(r2)
            android.widget.Button r1 = r0.w
            androidx.constraintlayout.widget.ConstraintLayout r2 = r0.a
            android.content.Context r2 = r2.getContext()
            int r2 = h0.i.b.a.getColor(r2, r4)
            r1.setTextColor(r2)
        L_0x05d7:
            android.widget.TextView r1 = r0.y
            androidx.constraintlayout.widget.ConstraintLayout r2 = r0.a
            android.content.Context r2 = r2.getContext()
            r4 = 2131952383(0x7f1302ff, float:1.9541207E38)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            j$.time.OffsetDateTime r7 = r3.Z1
            java.lang.String r8 = "MMM d',' uuuu"
            j$.time.format.DateTimeFormatter r8 = j$.time.format.DateTimeFormatter.ofPattern(r8)
            java.lang.String r7 = r7.format(r8)
            r6[r13] = r7
            java.lang.String r2 = r2.getString(r4, r6)
            r1.setText(r2)
            com.clubhouse.android.data.models.local.user.BasicUser r1 = r3.f2
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r2 = r3.g2
            com.clubhouse.android.shared.ui.AvatarView r4 = r0.G
            java.lang.String r6 = "nominatorAvatar"
            m0.n.b.i.d(r4, r6)
            if (r1 != 0) goto L_0x060c
            if (r2 == 0) goto L_0x060a
            goto L_0x060c
        L_0x060a:
            r7 = r13
            goto L_0x060d
        L_0x060c:
            r7 = 1
        L_0x060d:
            if (r7 == 0) goto L_0x0611
            r7 = r13
            goto L_0x0613
        L_0x0611:
            r7 = 8
        L_0x0613:
            r4.setVisibility(r7)
            android.widget.TextView r4 = r0.H
            java.lang.String r7 = "nominatorName"
            m0.n.b.i.d(r4, r7)
            if (r1 != 0) goto L_0x0624
            if (r2 == 0) goto L_0x0622
            goto L_0x0624
        L_0x0622:
            r7 = r13
            goto L_0x0625
        L_0x0624:
            r7 = 1
        L_0x0625:
            if (r7 == 0) goto L_0x0629
            r7 = r13
            goto L_0x062b
        L_0x0629:
            r7 = 8
        L_0x062b:
            r4.setVisibility(r7)
            java.lang.String r4 = "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )"
            java.lang.String r7 = "java.lang.String.format(format, *args)"
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.lang.String r9 = "getString(id)"
            java.lang.String r10 = "rawArgs"
            java.lang.String r11 = "root.resources"
            if (r1 != 0) goto L_0x063e
            goto L_0x06b7
        L_0x063e:
            if (r2 != 0) goto L_0x06b7
            com.clubhouse.android.shared.ui.AvatarView r12 = r0.G
            m0.n.b.i.d(r12, r6)
            i0.e.b.d3.k.u(r12, r1)
            android.widget.TextView r12 = r0.H
            androidx.constraintlayout.widget.ConstraintLayout r14 = r0.a
            android.content.res.Resources r14 = r14.getResources()
            m0.n.b.i.d(r14, r11)
            r15 = 1
            r17 = r5
            java.lang.Object[] r5 = new java.lang.Object[r15]
            java.lang.String r1 = r1.d
            r5[r13] = r1
            r1 = r16
            java.util.ArrayList r13 = i0.d.a.a.a.i1(r14, r1, r5, r10, r15)
            r16 = 0
            r18 = r16
            r16 = r3
            r3 = r18
        L_0x066a:
            if (r3 >= r15) goto L_0x0685
            r15 = r5[r3]
            r21 = r5
            boolean r5 = r15 instanceof java.lang.String
            if (r5 == 0) goto L_0x067c
            java.lang.String r15 = (java.lang.String) r15
            r5 = 63
            java.lang.String r15 = i0.d.a.a.a.p0(r15, r1, r15, r5)
        L_0x067c:
            r13.add(r15)
            int r3 = r3 + 1
            r15 = 1
            r5 = r21
            goto L_0x066a
        L_0x0685:
            r3 = 2131952539(0x7f13039b, float:1.9541524E38)
            java.lang.String r3 = r14.getString(r3)
            m0.n.b.i.d(r3, r9)
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object[] r5 = r13.toArray(r5)
            java.util.Objects.requireNonNull(r5, r8)
            int r13 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r13)
            int r13 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r13)
            java.lang.String r3 = java.lang.String.format(r3, r5)
            m0.n.b.i.d(r3, r7)
            r5 = 63
            android.text.Spanned r3 = android.text.Html.fromHtml(r3, r5)
            m0.n.b.i.d(r3, r4)
            r12.setText(r3)
            goto L_0x06bd
        L_0x06b7:
            r17 = r5
            r1 = r16
            r16 = r3
        L_0x06bd:
            if (r2 != 0) goto L_0x06c0
            goto L_0x0728
        L_0x06c0:
            com.clubhouse.android.shared.ui.AvatarView r3 = r0.G
            m0.n.b.i.d(r3, r6)
            i0.e.b.d3.k.t(r3, r2)
            android.widget.TextView r3 = r0.H
            androidx.constraintlayout.widget.ConstraintLayout r5 = r0.a
            android.content.res.Resources r5 = r5.getResources()
            m0.n.b.i.d(r5, r11)
            r6 = 2131952371(0x7f1302f3, float:1.9541183E38)
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.String r2 = r2.y
            r13 = 0
            r12[r13] = r2
            java.util.ArrayList r2 = i0.d.a.a.a.i1(r5, r1, r12, r10, r11)
            r10 = 0
        L_0x06e3:
            if (r10 >= r11) goto L_0x06fa
            r11 = r12[r10]
            boolean r13 = r11 instanceof java.lang.String
            if (r13 == 0) goto L_0x06f3
            java.lang.String r11 = (java.lang.String) r11
            r13 = 63
            java.lang.String r11 = i0.d.a.a.a.p0(r11, r1, r11, r13)
        L_0x06f3:
            r2.add(r11)
            int r10 = r10 + 1
            r11 = 1
            goto L_0x06e3
        L_0x06fa:
            java.lang.String r1 = r5.getString(r6)
            m0.n.b.i.d(r1, r9)
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object[] r2 = r2.toArray(r5)
            java.util.Objects.requireNonNull(r2, r8)
            int r5 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
            int r5 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
            java.lang.String r1 = java.lang.String.format(r1, r2)
            m0.n.b.i.d(r1, r7)
            r2 = 63
            android.text.Spanned r1 = android.text.Html.fromHtml(r1, r2)
            m0.n.b.i.d(r1, r4)
            r3.setText(r1)
        L_0x0728:
            i0.e.b.g3.u.r4 r1 = a
            r2 = r16
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r3 = r2.d2
            int r4 = r2.c2
            r1.a(r0, r3, r4)
            if (r17 != 0) goto L_0x073f
            java.util.List<com.clubhouse.android.data.models.local.club.ClubWithAdmin> r1 = r2.h2
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x074a
        L_0x073f:
            android.widget.LinearLayout r1 = r0.h
            r2 = 0
            r1.setVisibility(r2)
            com.airbnb.epoxy.EpoxyRecyclerView r0 = r0.i
            r0.g()
        L_0x074a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.u.r4.b(com.clubhouse.android.databinding.FragmentProfileBinding, i0.e.b.g3.u.b5):void");
    }
}
