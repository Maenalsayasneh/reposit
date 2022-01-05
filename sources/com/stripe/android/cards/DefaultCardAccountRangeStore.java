package com.stripe.android.cards;

import android.content.Context;
import android.content.SharedPreferences;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import m0.c;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000f\u0010\u0010R%\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeStore;", "Lcom/stripe/android/cards/CardAccountRangeStore;", "Lcom/stripe/android/cards/Bin;", "bin", "", "Lcom/stripe/android/model/AccountRange;", "get", "(Lcom/stripe/android/cards/Bin;Lm0/l/c;)Ljava/lang/Object;", "accountRanges", "Lm0/i;", "save", "(Lcom/stripe/android/cards/Bin;Ljava/util/List;)V", "", "contains", "", "createPrefKey$payments_core_release", "(Lcom/stripe/android/cards/Bin;)Ljava/lang/String;", "createPrefKey", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "prefs$delegate", "Lm0/c;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/stripe/android/model/parsers/AccountRangeJsonParser;", "accountRangeJsonParser", "Lcom/stripe/android/model/parsers/AccountRangeJsonParser;", "<init>", "(Landroid/content/Context;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultCardAccountRangeStore.kt */
public final class DefaultCardAccountRangeStore implements CardAccountRangeStore {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String PREF_FILE = "InMemoryCardAccountRangeSource.Store";
    @Deprecated
    private static final String PREF_KEY_ACCOUNT_RANGES = "key_account_ranges";
    private final AccountRangeJsonParser accountRangeJsonParser = new AccountRangeJsonParser();
    /* access modifiers changed from: private */
    public final Context context;
    private final c prefs$delegate = h.H2(new DefaultCardAccountRangeStore$prefs$2(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeStore$Companion;", "", "", "PREF_FILE", "Ljava/lang/String;", "PREF_KEY_ACCOUNT_RANGES", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultCardAccountRangeStore.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DefaultCardAccountRangeStore(Context context2) {
        i.e(context2, "context");
        this.context = context2;
    }

    private final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs$delegate.getValue();
    }

    public Object contains(Bin bin, m0.l.c<? super Boolean> cVar) {
        return Boolean.valueOf(getPrefs().contains(createPrefKey$payments_core_release(bin)));
    }

    public final String createPrefKey$payments_core_release(Bin bin) {
        i.e(bin, "bin");
        return "key_account_ranges:" + bin;
    }

    public Object get(Bin bin, m0.l.c<? super List<AccountRange>> cVar) {
        Iterable<String> stringSet = getPrefs().getStringSet(createPrefKey$payments_core_release(bin), (Set) null);
        if (stringSet == null) {
            stringSet = EmptySet.c;
        }
        ArrayList arrayList = new ArrayList();
        for (String jSONObject : stringSet) {
            AccountRange parse = this.accountRangeJsonParser.parse(new JSONObject(jSONObject));
            if (parse != null) {
                arrayList.add(parse);
            }
        }
        return arrayList;
    }

    public void save(Bin bin, List<AccountRange> list) {
        i.e(bin, "bin");
        i.e(list, "accountRanges");
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (AccountRange serialize : list) {
            arrayList.add(this.accountRangeJsonParser.serialize(serialize).toString());
        }
        getPrefs().edit().putStringSet(createPrefKey$payments_core_release(bin), g.D0(arrayList)).apply();
    }
}
