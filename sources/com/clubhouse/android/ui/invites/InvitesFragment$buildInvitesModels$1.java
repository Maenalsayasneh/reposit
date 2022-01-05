package com.clubhouse.android.ui.invites;

import android.content.Context;
import com.clubhouse.android.data.models.local.SuggestedInvite;
import com.clubhouse.android.ui.invites.viewholder.Type;
import h0.i.e.c;
import i0.b.a.o;
import i0.e.b.g3.q.d;
import i0.e.b.g3.q.e;
import i0.e.b.g3.q.m;
import i0.e.b.g3.q.r.f;
import i0.e.b.i3.b;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: InvitesFragment.kt */
public final class InvitesFragment$buildInvitesModels$1 extends Lambda implements l<m, i> {
    public final /* synthetic */ InvitesFragment c;
    public final /* synthetic */ o d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesFragment$buildInvitesModels$1(InvitesFragment invitesFragment, o oVar) {
        super(1);
        this.c = invitesFragment;
        this.d = oVar;
    }

    public Object invoke(Object obj) {
        boolean z;
        Phonenumber$PhoneNumber phonenumber$PhoneNumber;
        m mVar = (m) obj;
        m0.n.b.i.e(mVar, "state");
        if (mVar.e.length() > 0) {
            Context requireContext = this.c.requireContext();
            m0.n.b.i.d(requireContext, "requireContext()");
            String str = mVar.e;
            m0.n.b.i.e(requireContext, "<this>");
            m0.n.b.i.e(str, "str");
            if (b.b == null) {
                PhoneNumberUtil b = PhoneNumberUtil.b(requireContext);
                m0.n.b.i.d(b, "createInstance(context)");
                b.b = b;
            }
            PhoneNumberUtil phoneNumberUtil = b.b;
            if (phoneNumberUtil != null) {
                m0.n.b.i.e(requireContext, "<this>");
                c c2 = c.c(requireContext.getResources().getConfiguration().getLocales());
                m0.n.b.i.d(c2, "{\n            LocaleListCompat.wrap(resources.configuration.locales)\n        }");
                m0.n.b.i.e(c2, "<this>");
                ArrayList arrayList = new ArrayList();
                int size = c2.a.size();
                if (size > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        Locale b2 = c2.b(i);
                        m0.n.b.i.d(b2, "get(i)");
                        arrayList.add(b2);
                        if (i2 >= size) {
                            break;
                        }
                        i = i2;
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (phoneNumberUtil.p(str, ((Locale) it.next()).getCountry())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z && mVar.g.isEmpty() && mVar.i.isEmpty()) {
                    Context requireContext2 = this.c.requireContext();
                    m0.n.b.i.d(requireContext2, "requireContext()");
                    String str2 = mVar.e;
                    m0.n.b.i.e(requireContext2, "<this>");
                    m0.n.b.i.e(str2, "str");
                    if (b.b == null) {
                        PhoneNumberUtil b3 = PhoneNumberUtil.b(requireContext2);
                        m0.n.b.i.d(b3, "createInstance(context)");
                        b.b = b3;
                    }
                    PhoneNumberUtil phoneNumberUtil2 = b.b;
                    if (phoneNumberUtil2 != null) {
                        m0.n.b.i.e(requireContext2, "<this>");
                        c c3 = c.c(requireContext2.getResources().getConfiguration().getLocales());
                        m0.n.b.i.d(c3, "{\n            LocaleListCompat.wrap(resources.configuration.locales)\n        }");
                        m0.n.b.i.e(c3, "<this>");
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = c3.a.size();
                        if (size2 > 0) {
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                Locale b4 = c3.b(i3);
                                m0.n.b.i.d(b4, "get(i)");
                                arrayList2.add(b4);
                                if (i4 >= size2) {
                                    break;
                                }
                                i3 = i4;
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (phoneNumberUtil2.p(str2, ((Locale) next).getCountry())) {
                                arrayList3.add(next);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            try {
                                phonenumber$PhoneNumber = phoneNumberUtil2.y(str2, ((Locale) it3.next()).getCountry());
                            } catch (Exception unused) {
                                phonenumber$PhoneNumber = null;
                            }
                            if (phonenumber$PhoneNumber != null) {
                                arrayList4.add(phonenumber$PhoneNumber);
                            }
                        }
                        m0.n.b.i.e(arrayList4, "$this$distinct");
                        List<Phonenumber$PhoneNumber> v02 = g.v0(g.C0(arrayList4));
                        o oVar = this.d;
                        InvitesFragment invitesFragment = this.c;
                        for (Phonenumber$PhoneNumber phonenumber$PhoneNumber2 : v02) {
                            i0.e.b.g3.q.r.i iVar = new i0.e.b.g3.q.r.i();
                            iVar.M(phonenumber$PhoneNumber2.toString());
                            Context requireContext3 = invitesFragment.requireContext();
                            m0.n.b.i.d(requireContext3, "requireContext()");
                            m0.n.b.i.e(requireContext3, "<this>");
                            m0.n.b.i.e(phonenumber$PhoneNumber2, "phoneNumber");
                            if (b.b == null) {
                                PhoneNumberUtil b5 = PhoneNumberUtil.b(requireContext3);
                                m0.n.b.i.d(b5, "createInstance(context)");
                                b.b = b5;
                            }
                            PhoneNumberUtil phoneNumberUtil3 = b.b;
                            if (phoneNumberUtil3 != null) {
                                String e = phoneNumberUtil3.e(phonenumber$PhoneNumber2, PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
                                m0.n.b.i.d(e, "phoneUtil.format(phoneNumber, numberFormat)");
                                iVar.N(e);
                                iVar.L(new i0.e.b.g3.q.c(invitesFragment, phonenumber$PhoneNumber2));
                                oVar.add(iVar);
                            } else {
                                m0.n.b.i.m("phoneUtil");
                                throw null;
                            }
                        }
                    } else {
                        m0.n.b.i.m("phoneUtil");
                        throw null;
                    }
                }
            } else {
                m0.n.b.i.m("phoneUtil");
                throw null;
            }
        }
        if (!mVar.c) {
            if (StringsKt__IndentKt.o(mVar.e) && (!mVar.h.isEmpty())) {
                o oVar2 = this.d;
                InvitesFragment invitesFragment2 = this.c;
                f fVar = new f();
                fVar.L("pending");
                fVar.M(Integer.valueOf(mVar.h.size()));
                fVar.N(new e(invitesFragment2, mVar));
                oVar2.add(fVar);
            }
            List<SuggestedInvite> list = mVar.g;
            o oVar3 = this.d;
            InvitesFragment invitesFragment3 = this.c;
            for (SuggestedInvite suggestedInvite : list) {
                i0.e.b.g3.q.r.c cVar = new i0.e.b.g3.q.r.c();
                cVar.M(suggestedInvite.c);
                cVar.O(Type.INVITE);
                cVar.N(suggestedInvite);
                cVar.L(new d(invitesFragment3, suggestedInvite));
                oVar3.add(cVar);
            }
        }
        return i.a;
    }
}
