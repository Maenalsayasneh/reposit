package com.stripe.android.model.parsers;

import com.stripe.android.cards.Bin;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import m0.j.o;
import m0.n.b.i;
import m0.q.e;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/parsers/CardMetadataJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/CardMetadata;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/CardMetadata;", "Lcom/stripe/android/model/parsers/AccountRangeJsonParser;", "accountRangeJsonParser", "Lcom/stripe/android/model/parsers/AccountRangeJsonParser;", "Lcom/stripe/android/cards/Bin;", "bin", "Lcom/stripe/android/cards/Bin;", "<init>", "(Lcom/stripe/android/cards/Bin;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardMetadataJsonParser.kt */
public final class CardMetadataJsonParser implements ModelJsonParser<CardMetadata> {
    private final AccountRangeJsonParser accountRangeJsonParser = new AccountRangeJsonParser();
    private final Bin bin;

    public CardMetadataJsonParser(Bin bin2) {
        i.e(bin2, "bin");
        this.bin = bin2;
    }

    public CardMetadata parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        JSONArray optJSONArray = jSONObject.optJSONArray(MessageExtension.FIELD_DATA);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        e f = m0.q.i.f(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = f.iterator();
        while (it.hasNext()) {
            int a = ((o) it).a();
            AccountRangeJsonParser accountRangeJsonParser2 = this.accountRangeJsonParser;
            JSONObject jSONObject2 = optJSONArray.getJSONObject(a);
            i.d(jSONObject2, "data.getJSONObject(it)");
            AccountRange parse = accountRangeJsonParser2.parse(jSONObject2);
            if (parse != null) {
                arrayList.add(parse);
            }
        }
        return new CardMetadata(this.bin, arrayList);
    }
}
