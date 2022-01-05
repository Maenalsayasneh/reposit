package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.j.o;
import m0.n.b.f;
import m0.q.e;
import m0.q.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u0000 /2\u00020\u0001:\u0001/B9\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b-\u0010.J\u001e\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0003HÀ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0011\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010\u000bR$\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010\u0010R\u0013\u0010+\u001a\u00020\u000e8F@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0012\u001a\u00020\u00038\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b,\u0010\u000b¨\u00060"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "Landroid/os/Parcelable;", "", "", "component4", "()Ljava/util/Map;", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "()Lorg/json/JSONObject;", "toJson", "component1", "()Ljava/lang/String;", "component2$3ds2sdk_release", "component2", "", "component3", "()Z", "name", "id", "criticalityIndicator", "data", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Ljava/util/Map;", "Z", "getCriticalityIndicator", "isProcessable", "getId$3ds2sdk_release", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: MessageExtension.kt */
public final class MessageExtension implements Parcelable {
    public static final Parcelable.Creator<MessageExtension> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private static final int DATA_VALUE_MAX_LENGTH = 8059;
    public static final String FIELD_CRITICALITY_INDICATOR = "criticalityIndicator";
    public static final String FIELD_DATA = "data";
    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";
    private static final int ID_MAX_LENGTH = 64;
    private static final int MESSAGE_EXTENSIONS_MAX_COUNT = 10;
    private static final int NAME_MAX_LENGTH = 64;
    private static final List<String> SUPPORTED_MESSAGE_EXTENSIONS = EmptyList.c;
    private final boolean criticalityIndicator;
    private final Map<String, String> data;
    private final String id;
    private final String name;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0005\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00118\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0016\u0010\u0018\u001a\u00020\u000e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u000e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/MessageExtension$Companion;", "", "Lorg/json/JSONObject;", "messageExtensionJson", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "fromJson", "(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "", "messageExtensions", "Lorg/json/JSONArray;", "toJsonArray", "(Ljava/util/List;)Lorg/json/JSONArray;", "messageExtensionsJson", "(Lorg/json/JSONArray;)Ljava/util/List;", "", "DATA_VALUE_MAX_LENGTH", "I", "", "FIELD_CRITICALITY_INDICATOR", "Ljava/lang/String;", "FIELD_DATA", "FIELD_ID", "FIELD_NAME", "ID_MAX_LENGTH", "MESSAGE_EXTENSIONS_MAX_COUNT", "NAME_MAX_LENGTH", "SUPPORTED_MESSAGE_EXTENSIONS", "Ljava/util/List;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: MessageExtension.kt */
    public static final class Companion {
        private Companion() {
        }

        public final List<MessageExtension> fromJson(JSONArray jSONArray) throws ChallengeResponseParseException {
            if (jSONArray == null) {
                return null;
            }
            e f = i.f(0, jSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList<>();
            Iterator it = f.iterator();
            while (it.hasNext()) {
                JSONObject optJSONObject = jSONArray.optJSONObject(((o) it).a());
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(h.K(arrayList, 10));
            for (JSONObject fromJson : arrayList) {
                arrayList2.add(MessageExtension.Companion.fromJson(fromJson));
            }
            if (arrayList2.size() <= 10) {
                return arrayList2;
            }
            throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeRequestData.FIELD_MESSAGE_EXTENSION);
        }

        public final JSONArray toJsonArray(List<MessageExtension> list) throws JSONException {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (MessageExtension json$3ds2sdk_release : list) {
                jSONArray.put((Object) json$3ds2sdk_release.toJson$3ds2sdk_release());
            }
            return jSONArray;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final MessageExtension fromJson(JSONObject jSONObject) throws ChallengeResponseParseException {
            String optString = jSONObject.optString("name");
            if (optString.length() <= 64) {
                String optString2 = jSONObject.optString("id");
                if (optString2.length() <= 64) {
                    HashMap hashMap = new HashMap();
                    JSONObject optJSONObject = jSONObject.optJSONObject(MessageExtension.FIELD_DATA);
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString3 = optJSONObject.optString(next);
                            if (optString3.length() <= MessageExtension.DATA_VALUE_MAX_LENGTH) {
                                m0.n.b.i.d(next, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
                                m0.n.b.i.d(optString3, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
                                hashMap.put(next, optString3);
                            } else {
                                throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat("messageExtension.data.value");
                            }
                        }
                    }
                    m0.n.b.i.d(optString, "name");
                    m0.n.b.i.d(optString2, "id");
                    return new MessageExtension(optString, optString2, jSONObject.optBoolean(MessageExtension.FIELD_CRITICALITY_INDICATOR), hashMap);
                }
                throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat("messageExtension.id");
            }
            throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat("messageExtension.name");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<MessageExtension> {
        public final MessageExtension createFromParcel(Parcel parcel) {
            m0.n.b.i.e(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (readInt != 0) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                readInt--;
            }
            return new MessageExtension(readString, readString2, z, linkedHashMap);
        }

        public final MessageExtension[] newArray(int i) {
            return new MessageExtension[i];
        }
    }

    public MessageExtension(String str, String str2, boolean z, Map<String, String> map) {
        m0.n.b.i.e(str, "name");
        m0.n.b.i.e(str2, "id");
        m0.n.b.i.e(map, FIELD_DATA);
        this.name = str;
        this.id = str2;
        this.criticalityIndicator = z;
        this.data = map;
    }

    private final Map<String, String> component4() {
        return this.data;
    }

    public static /* synthetic */ MessageExtension copy$default(MessageExtension messageExtension, String str, String str2, boolean z, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageExtension.name;
        }
        if ((i & 2) != 0) {
            str2 = messageExtension.id;
        }
        if ((i & 4) != 0) {
            z = messageExtension.criticalityIndicator;
        }
        if ((i & 8) != 0) {
            map = messageExtension.data;
        }
        return messageExtension.copy(str, str2, z, map);
    }

    public static final List<MessageExtension> fromJson(JSONArray jSONArray) throws ChallengeResponseParseException {
        return Companion.fromJson(jSONArray);
    }

    public static final JSONArray toJsonArray(List<MessageExtension> list) throws JSONException {
        return Companion.toJsonArray(list);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2$3ds2sdk_release() {
        return this.id;
    }

    public final boolean component3() {
        return this.criticalityIndicator;
    }

    public final MessageExtension copy(String str, String str2, boolean z, Map<String, String> map) {
        m0.n.b.i.e(str, "name");
        m0.n.b.i.e(str2, "id");
        m0.n.b.i.e(map, FIELD_DATA);
        return new MessageExtension(str, str2, z, map);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageExtension)) {
            return false;
        }
        MessageExtension messageExtension = (MessageExtension) obj;
        return m0.n.b.i.a(this.name, messageExtension.name) && m0.n.b.i.a(this.id, messageExtension.id) && this.criticalityIndicator == messageExtension.criticalityIndicator && m0.n.b.i.a(this.data, messageExtension.data);
    }

    public final boolean getCriticalityIndicator() {
        return this.criticalityIndicator;
    }

    public final String getId$3ds2sdk_release() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.criticalityIndicator;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        Map<String, String> map = this.data;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public final boolean isProcessable() {
        return SUPPORTED_MESSAGE_EXTENSIONS.contains(this.name);
    }

    public final JSONObject toJson$3ds2sdk_release() throws JSONException {
        JSONObject put = new JSONObject().put("name", (Object) this.name).put("id", (Object) this.id).put(FIELD_CRITICALITY_INDICATOR, this.criticalityIndicator).put(FIELD_DATA, (Object) new JSONObject((Map<?, ?>) this.data));
        m0.n.b.i.d(put, "JSONObject()\n           …D_DATA, JSONObject(data))");
        return put;
    }

    public String toString() {
        StringBuilder P0 = a.P0("MessageExtension(name=");
        P0.append(this.name);
        P0.append(", id=");
        P0.append(this.id);
        P0.append(", criticalityIndicator=");
        P0.append(this.criticalityIndicator);
        P0.append(", data=");
        P0.append(this.data);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        m0.n.b.i.e(parcel, "parcel");
        parcel.writeString(this.name);
        parcel.writeString(this.id);
        parcel.writeInt(this.criticalityIndicator ? 1 : 0);
        Map<String, String> map = this.data;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> next : map.entrySet()) {
            parcel.writeString(next.getKey());
            parcel.writeString(next.getValue());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageExtension(String str, String str2, boolean z, Map map, int i, f fVar) {
        this(str, str2, z, (i & 8) != 0 ? g.o() : map);
    }
}
