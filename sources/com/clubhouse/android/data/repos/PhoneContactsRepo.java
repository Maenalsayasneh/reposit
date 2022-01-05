package com.clubhouse.android.data.repos;

import android.app.Application;
import com.afollestad.assent.Permission;
import com.clubhouse.android.data.models.local.PhoneContact;
import h0.b0.v;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.l.c;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.m0;

/* compiled from: PhoneContactsRepo.kt */
public class PhoneContactsRepo {
    public final Application a;

    public PhoneContactsRepo(Application application) {
        i.e(application, "application");
        this.a = application;
    }

    public final Object a(c<? super List<PhoneContact>> cVar) {
        if (!v.E0(this.a, Permission.READ_CONTACTS)) {
            return EmptyList.c;
        }
        return a.k4(m0.c, new PhoneContactsRepo$fetchContacts$2(this, (c<? super PhoneContactsRepo$fetchContacts$2>) null), cVar);
    }
}
