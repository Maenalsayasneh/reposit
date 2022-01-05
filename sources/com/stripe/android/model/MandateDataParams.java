package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002!\"B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0004\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006#"}, d2 = {"Lcom/stripe/android/model/MandateDataParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/MandateDataParams$Type;", "component1", "()Lcom/stripe/android/model/MandateDataParams$Type;", "", "", "", "toParamMap", "()Ljava/util/Map;", "type", "copy", "(Lcom/stripe/android/model/MandateDataParams$Type;)Lcom/stripe/android/model/MandateDataParams;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/MandateDataParams$Type;", "<init>", "(Lcom/stripe/android/model/MandateDataParams$Type;)V", "Companion", "Type", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: MandateDataParams.kt */
public final class MandateDataParams implements StripeParamsModel, Parcelable {
    public static final Parcelable.Creator<MandateDataParams> CREATOR = new Creator();
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String PARAM_CUSTOMER_ACCEPTANCE = "customer_acceptance";
    @Deprecated
    private static final String PARAM_TYPE = "type";
    private final Type type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/MandateDataParams$Companion;", "", "", "PARAM_CUSTOMER_ACCEPTANCE", "Ljava/lang/String;", "PARAM_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: MandateDataParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<MandateDataParams> {
        public final MandateDataParams createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new MandateDataParams((Type) parcel.readParcelable(MandateDataParams.class.getClassLoader()));
        }

        public final MandateDataParams[] newArray(int i) {
            return new MandateDataParams[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u00020\u00038\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0001\u0001\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/MandateDataParams$Type;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Online", "Lcom/stripe/android/model/MandateDataParams$Type$Online;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: MandateDataParams.kt */
    public static abstract class Type implements StripeParamsModel, Parcelable {
        private final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B+\b\u0000\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#B\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010$J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!¨\u0006&"}, d2 = {"Lcom/stripe/android/model/MandateDataParams$Type$Online;", "Lcom/stripe/android/model/MandateDataParams$Type;", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()Z", "", "", "toParamMap", "()Ljava/util/Map;", "ipAddress", "userAgent", "inferFromClient", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/model/MandateDataParams$Type$Online;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: MandateDataParams.kt */
        public static final class Online extends Type {
            public static final Parcelable.Creator<Online> CREATOR = new Creator();
            public static final Companion Companion = new Companion((f) null);
            /* access modifiers changed from: private */
            public static final Online DEFAULT = new Online((String) null, (String) null, true, 3, (f) null);
            private static final String PARAM_INFER_FROM_CLIENT = "infer_from_client";
            private static final String PARAM_IP_ADDRESS = "ip_address";
            private static final String PARAM_USER_AGENT = "user_agent";
            private final boolean inferFromClient;
            private final String ipAddress;
            private final String userAgent;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/MandateDataParams$Type$Online$Companion;", "", "Lcom/stripe/android/model/MandateDataParams$Type$Online;", "DEFAULT", "Lcom/stripe/android/model/MandateDataParams$Type$Online;", "getDEFAULT$payments_core_release", "()Lcom/stripe/android/model/MandateDataParams$Type$Online;", "", "PARAM_INFER_FROM_CLIENT", "Ljava/lang/String;", "PARAM_IP_ADDRESS", "PARAM_USER_AGENT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: MandateDataParams.kt */
            public static final class Companion {
                private Companion() {
                }

                public final Online getDEFAULT$payments_core_release() {
                    return Online.DEFAULT;
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<Online> {
                public final Online createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new Online(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                public final Online[] newArray(int i) {
                    return new Online[i];
                }
            }

            public Online() {
                this((String) null, (String) null, false, 7, (f) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Online(String str, String str2, boolean z, int i, f fVar) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
            }

            private final String component1() {
                return this.ipAddress;
            }

            private final String component2() {
                return this.userAgent;
            }

            private final boolean component3() {
                return this.inferFromClient;
            }

            public static /* synthetic */ Online copy$default(Online online, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = online.ipAddress;
                }
                if ((i & 2) != 0) {
                    str2 = online.userAgent;
                }
                if ((i & 4) != 0) {
                    z = online.inferFromClient;
                }
                return online.copy(str, str2, z);
            }

            public final Online copy(String str, String str2, boolean z) {
                return new Online(str, str2, z);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Online)) {
                    return false;
                }
                Online online = (Online) obj;
                return i.a(this.ipAddress, online.ipAddress) && i.a(this.userAgent, online.userAgent) && this.inferFromClient == online.inferFromClient;
            }

            public int hashCode() {
                String str = this.ipAddress;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.userAgent;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                int i2 = (hashCode + i) * 31;
                boolean z = this.inferFromClient;
                if (z) {
                    z = true;
                }
                return i2 + (z ? 1 : 0);
            }

            public Map<String, Object> toParamMap() {
                if (this.inferFromClient) {
                    return h.S2(new Pair(PARAM_INFER_FROM_CLIENT, Boolean.TRUE));
                }
                Pair[] pairArr = new Pair[2];
                String str = this.ipAddress;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                pairArr[0] = new Pair(PARAM_IP_ADDRESS, str);
                String str3 = this.userAgent;
                if (str3 != null) {
                    str2 = str3;
                }
                pairArr[1] = new Pair(PARAM_USER_AGENT, str2);
                return g.N(pairArr);
            }

            public String toString() {
                StringBuilder P0 = a.P0("Online(ipAddress=");
                P0.append(this.ipAddress);
                P0.append(", userAgent=");
                P0.append(this.userAgent);
                P0.append(", inferFromClient=");
                return a.D0(P0, this.inferFromClient, ")");
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeString(this.ipAddress);
                parcel.writeString(this.userAgent);
                parcel.writeInt(this.inferFromClient ? 1 : 0);
            }

            public Online(String str, String str2, boolean z) {
                super("online", (f) null);
                this.ipAddress = str;
                this.userAgent = str2;
                this.inferFromClient = z;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public Online(String str, String str2) {
                this(str, str2, false);
                i.e(str, "ipAddress");
                i.e(str2, "userAgent");
            }
        }

        private Type(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }

        public /* synthetic */ Type(String str, f fVar) {
            this(str);
        }
    }

    public MandateDataParams(Type type2) {
        i.e(type2, "type");
        this.type = type2;
    }

    private final Type component1() {
        return this.type;
    }

    public static /* synthetic */ MandateDataParams copy$default(MandateDataParams mandateDataParams, Type type2, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = mandateDataParams.type;
        }
        return mandateDataParams.copy(type2);
    }

    public final MandateDataParams copy(Type type2) {
        i.e(type2, "type");
        return new MandateDataParams(type2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof MandateDataParams) && i.a(this.type, ((MandateDataParams) obj).type);
        }
        return true;
    }

    public int hashCode() {
        Type type2 = this.type;
        if (type2 != null) {
            return type2.hashCode();
        }
        return 0;
    }

    public Map<String, Object> toParamMap() {
        return h.S2(new Pair(PARAM_CUSTOMER_ACCEPTANCE, g.N(new Pair("type", this.type.getCode$payments_core_release()), new Pair(this.type.getCode$payments_core_release(), this.type.toParamMap()))));
    }

    public String toString() {
        StringBuilder P0 = a.P0("MandateDataParams(type=");
        P0.append(this.type);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeParcelable(this.type, i);
    }
}
