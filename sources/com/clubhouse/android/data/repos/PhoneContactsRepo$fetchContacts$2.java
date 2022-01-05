package com.clubhouse.android.data.repos;

import android.database.Cursor;
import android.provider.ContactsContract;
import com.clubhouse.android.data.models.local.PhoneContact;
import i0.e.b.i3.b;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.data.repos.PhoneContactsRepo$fetchContacts$2", f = "PhoneContactsRepo.kt", l = {}, m = "invokeSuspend")
/* compiled from: PhoneContactsRepo.kt */
public final class PhoneContactsRepo$fetchContacts$2 extends SuspendLambda implements p<f0, m0.l.c<? super List<PhoneContact>>, Object> {
    public final /* synthetic */ PhoneContactsRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneContactsRepo$fetchContacts$2(PhoneContactsRepo phoneContactsRepo, m0.l.c<? super PhoneContactsRepo$fetchContacts$2> cVar) {
        super(2, cVar);
        this.c = phoneContactsRepo;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new PhoneContactsRepo$fetchContacts$2(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new PhoneContactsRepo$fetchContacts$2(this.c, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ArrayList arrayList = new ArrayList();
        Cursor query = this.c.a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "data4", "display_name", "photo_uri"}, (String) null, (String[]) null, (String) null);
        if (query != null) {
            PhoneContactsRepo phoneContactsRepo = this.c;
            int columnIndex = query.getColumnIndex("data1");
            int columnIndex2 = query.getColumnIndex("data4");
            int columnIndex3 = query.getColumnIndex("display_name");
            int columnIndex4 = query.getColumnIndex("photo_uri");
            query.moveToFirst();
            while (!query.isAfterLast()) {
                String string = query.getString(columnIndex);
                String string2 = query.getString(columnIndex2);
                if (string2 == null && string != null) {
                    string2 = b.a.b(phoneContactsRepo.a, string, true);
                }
                String string3 = query.getString(columnIndex3);
                String string4 = query.getString(columnIndex4);
                if (string2 != null) {
                    arrayList.add(new PhoneContact(string2, string3, string4));
                }
                query.moveToNext();
            }
            query.close();
        }
        return arrayList;
    }
}
