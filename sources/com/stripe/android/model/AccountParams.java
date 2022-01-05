package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.model.Token;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\t\b\b\u0018\u0000 %2\u00020\u0001:\u0003&'%B\u001d\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u001f8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/stripe/android/model/AccountParams;", "Lcom/stripe/android/model/TokenParams;", "", "component1", "()Z", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "component2", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "tosShownAndAccepted", "businessTypeParams", "copy", "(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;)Lcom/stripe/android/model/AccountParams;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "Z", "", "getTypeDataParams", "()Ljava/util/Map;", "typeDataParams", "<init>", "(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;)V", "Companion", "BusinessType", "BusinessTypeParams", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AccountParams.kt */
public final class AccountParams extends TokenParams {
    public static final Parcelable.Creator<AccountParams> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private static final String PARAM_BUSINESS_TYPE = "business_type";
    private static final String PARAM_TOS_SHOWN_AND_ACCEPTED = "tos_shown_and_accepted";
    private final BusinessTypeParams businessTypeParams;
    private final boolean tosShownAndAccepted;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessType;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Individual", "Company", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AccountParams.kt */
    public enum BusinessType {
        Individual("individual"),
        Company("company");
        
        private final String code;

        private BusinessType(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0014\u0015B\u0011\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t0\b8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "", "Lkotlin/Pair;", "getParamsList", "()Ljava/util/List;", "paramsList", "Lcom/stripe/android/model/AccountParams$BusinessType;", "type", "Lcom/stripe/android/model/AccountParams$BusinessType;", "getType$payments_core_release", "()Lcom/stripe/android/model/AccountParams$BusinessType;", "<init>", "(Lcom/stripe/android/model/AccountParams$BusinessType;)V", "Company", "Individual", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AccountParams.kt */
    public static abstract class BusinessTypeParams implements StripeParamsModel, Parcelable {
        private final BusinessType type;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b$\b\b\u0018\u0000 {2\u00020\u0001:\u0004|{}~Bë\u0001\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\by\u0010zJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000eJ\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u000eJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u000eJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJô\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b4\u0010\u000eJ\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u000205HÖ\u0001¢\u0006\u0004\b=\u00107J \u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u000205HÖ\u0001¢\u0006\u0004\bB\u0010CR$\u0010(\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010D\u001a\u0004\bE\u0010\u000e\"\u0004\bF\u0010GR$\u0010)\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010D\u001a\u0004\bH\u0010\u000e\"\u0004\bI\u0010GR$\u0010$\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010D\u001a\u0004\bJ\u0010\u000e\"\u0004\bK\u0010GR$\u0010+\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010D\u001a\u0004\bL\u0010\u000e\"\u0004\bM\u0010GR$\u0010!\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010N\u001a\u0004\bO\u0010\u0007\"\u0004\bP\u0010QR$\u0010-\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010D\u001a\u0004\bR\u0010\u000e\"\u0004\bS\u0010GR$\u0010&\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010D\u001a\u0004\bT\u0010\u000e\"\u0004\bU\u0010GR$\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010N\u001a\u0004\bV\u0010\u0007\"\u0004\bW\u0010QR$\u00100\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010D\u001a\u0004\bX\u0010\u000e\"\u0004\bY\u0010GR*\u0010^\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001080[0Z8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R$\u0010'\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010D\u001a\u0004\b_\u0010\u000e\"\u0004\b`\u0010GR$\u00101\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010a\u001a\u0004\bb\u0010\u001f\"\u0004\bc\u0010dR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010e\u001a\u0004\bf\u0010\u0004\"\u0004\bg\u0010hR$\u0010%\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010D\u001a\u0004\bi\u0010\u000e\"\u0004\bj\u0010GR0\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010k\u001a\u0004\bl\u0010\u001a\"\u0004\bm\u0010nR$\u0010#\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010o\u001a\u0004\bp\u0010\u000b\"\u0004\bq\u0010rR$\u0010*\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010D\u001a\u0004\bs\u0010\u000e\"\u0004\bt\u0010GR$\u0010/\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010D\u001a\u0004\bu\u0010\u000e\"\u0004\bv\u0010GR$\u0010,\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010D\u001a\u0004\bw\u0010\u000e\"\u0004\bx\u0010G¨\u0006"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "Lcom/stripe/android/model/Address;", "component1", "()Lcom/stripe/android/model/Address;", "Lcom/stripe/android/model/AddressJapanParams;", "component2", "()Lcom/stripe/android/model/AddressJapanParams;", "component3", "Lcom/stripe/android/model/DateOfBirth;", "component4", "()Lcom/stripe/android/model/DateOfBirth;", "", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "", "component15", "()Ljava/util/Map;", "component16", "component17", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "component18", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "address", "addressKana", "addressKanji", "dateOfBirth", "email", "firstName", "firstNameKana", "firstNameKanji", "gender", "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", "metadata", "phone", "ssnLast4", "verification", "copy", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/DateOfBirth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getGender", "setGender", "(Ljava/lang/String;)V", "getIdNumber", "setIdNumber", "getEmail", "setEmail", "getLastNameKana", "setLastNameKana", "Lcom/stripe/android/model/AddressJapanParams;", "getAddressKana", "setAddressKana", "(Lcom/stripe/android/model/AddressJapanParams;)V", "getMaidenName", "setMaidenName", "getFirstNameKana", "setFirstNameKana", "getAddressKanji", "setAddressKanji", "getSsnLast4", "setSsnLast4", "", "Lkotlin/Pair;", "getParamsList", "()Ljava/util/List;", "paramsList", "getFirstNameKanji", "setFirstNameKanji", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "getVerification", "setVerification", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;)V", "Lcom/stripe/android/model/Address;", "getAddress", "setAddress", "(Lcom/stripe/android/model/Address;)V", "getFirstName", "setFirstName", "Ljava/util/Map;", "getMetadata", "setMetadata", "(Ljava/util/Map;)V", "Lcom/stripe/android/model/DateOfBirth;", "getDateOfBirth", "setDateOfBirth", "(Lcom/stripe/android/model/DateOfBirth;)V", "getLastName", "setLastName", "getPhone", "setPhone", "getLastNameKanji", "setLastNameKanji", "<init>", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/DateOfBirth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;)V", "Companion", "Builder", "Document", "Verification", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: AccountParams.kt */
        public static final class Individual extends BusinessTypeParams {
            public static final Parcelable.Creator<Individual> CREATOR = new Creator();
            private static final Companion Companion = new Companion((f) null);
            @Deprecated
            private static final String PARAM_ADDRESS = "address";
            @Deprecated
            private static final String PARAM_ADDRESS_KANA = "address_kana";
            @Deprecated
            private static final String PARAM_ADDRESS_KANJI = "address_kanji";
            @Deprecated
            private static final String PARAM_DOB = "dob";
            @Deprecated
            private static final String PARAM_EMAIL = "email";
            @Deprecated
            private static final String PARAM_FIRST_NAME = "first_name";
            @Deprecated
            private static final String PARAM_FIRST_NAME_KANA = "first_name_kana";
            @Deprecated
            private static final String PARAM_FIRST_NAME_KANJI = "first_name_kanji";
            @Deprecated
            private static final String PARAM_GENDER = "gender";
            @Deprecated
            private static final String PARAM_ID_NUMBER = "id_number";
            @Deprecated
            private static final String PARAM_LAST_NAME = "last_name";
            @Deprecated
            private static final String PARAM_LAST_NAME_KANA = "last_name_kana";
            @Deprecated
            private static final String PARAM_LAST_NAME_KANJI = "last_name_kanji";
            @Deprecated
            private static final String PARAM_MAIDEN_NAME = "maiden_name";
            @Deprecated
            private static final String PARAM_METADATA = "metadata";
            @Deprecated
            private static final String PARAM_PHONE = "phone";
            @Deprecated
            private static final String PARAM_SSN_LAST_4 = "ssn_last_4";
            @Deprecated
            private static final String PARAM_VERIFICATION = "verification";
            private Address address;
            private AddressJapanParams addressKana;
            private AddressJapanParams addressKanji;
            private DateOfBirth dateOfBirth;
            private String email;
            private String firstName;
            private String firstNameKana;
            private String firstNameKanji;
            private String gender;
            private String idNumber;
            private String lastName;
            private String lastNameKana;
            private String lastNameKanji;
            private String maidenName;
            private Map<String, String> metadata;
            private String phone;
            private String ssnLast4;
            private Verification verification;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001e\u0010\u0014J\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b \u0010\u0014J\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b$\u0010\u0014J\u0017\u0010&\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b&\u0010\u0014J#\u0010)\u001a\u00020\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b,\u0010\u0014J\u0017\u0010.\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b.\u0010\u0014J\u0017\u00101\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0002H\u0016¢\u0006\u0004\b3\u00104R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00105R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u00106R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u00107R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u00107R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u00107R\u0018\u0010%\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u00107R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u00108R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u00108R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u00107R\u0018\u0010!\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u00107R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u00109R$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010:R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u00107R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u00107R\u0018\u0010#\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u00107R\u0018\u0010-\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u00107R\u0018\u0010+\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u00107¨\u0006="}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "Lcom/stripe/android/model/Address;", "address", "setAddress", "(Lcom/stripe/android/model/Address;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Builder;", "Lcom/stripe/android/model/AddressJapanParams;", "addressKana", "setAddressKana", "(Lcom/stripe/android/model/AddressJapanParams;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Builder;", "addressKanji", "setAddressKanji", "Lcom/stripe/android/model/DateOfBirth;", "dateOfBirth", "setDateOfBirth", "(Lcom/stripe/android/model/DateOfBirth;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Builder;", "", "email", "setEmail", "(Ljava/lang/String;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Builder;", "firstName", "setFirstName", "firstNameKana", "setFirstNameKana", "firstNameKanji", "setFirstNameKanji", "gender", "setGender", "idNumber", "setIdNumber", "lastName", "setLastName", "lastNameKana", "setLastNameKana", "lastNameKanji", "setLastNameKanji", "maidenName", "setMaidenName", "", "metadata", "setMetadata", "(Ljava/util/Map;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Builder;", "phone", "setPhone", "ssnLast4", "setSsnLast4", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "verification", "setVerification", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Builder;", "build", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "Lcom/stripe/android/model/DateOfBirth;", "Ljava/lang/String;", "Lcom/stripe/android/model/AddressJapanParams;", "Lcom/stripe/android/model/Address;", "Ljava/util/Map;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: AccountParams.kt */
            public static final class Builder implements ObjectBuilder<Individual> {
                private Address address;
                private AddressJapanParams addressKana;
                private AddressJapanParams addressKanji;
                private DateOfBirth dateOfBirth;
                private String email;
                private String firstName;
                private String firstNameKana;
                private String firstNameKanji;
                private String gender;
                private String idNumber;
                private String lastName;
                private String lastNameKana;
                private String lastNameKanji;
                private String maidenName;
                private Map<String, String> metadata;
                private String phone;
                private String ssnLast4;
                private Verification verification;

                public final Builder setAddress(Address address2) {
                    this.address = address2;
                    return this;
                }

                public final Builder setAddressKana(AddressJapanParams addressJapanParams) {
                    this.addressKana = addressJapanParams;
                    return this;
                }

                public final Builder setAddressKanji(AddressJapanParams addressJapanParams) {
                    this.addressKanji = addressJapanParams;
                    return this;
                }

                public final Builder setDateOfBirth(DateOfBirth dateOfBirth2) {
                    this.dateOfBirth = dateOfBirth2;
                    return this;
                }

                public final Builder setEmail(String str) {
                    this.email = str;
                    return this;
                }

                public final Builder setFirstName(String str) {
                    this.firstName = str;
                    return this;
                }

                public final Builder setFirstNameKana(String str) {
                    this.firstNameKana = str;
                    return this;
                }

                public final Builder setFirstNameKanji(String str) {
                    this.firstNameKanji = str;
                    return this;
                }

                public final Builder setGender(String str) {
                    this.gender = str;
                    return this;
                }

                public final Builder setIdNumber(String str) {
                    this.idNumber = str;
                    return this;
                }

                public final Builder setLastName(String str) {
                    this.lastName = str;
                    return this;
                }

                public final Builder setLastNameKana(String str) {
                    this.lastNameKana = str;
                    return this;
                }

                public final Builder setLastNameKanji(String str) {
                    this.lastNameKanji = str;
                    return this;
                }

                public final Builder setMaidenName(String str) {
                    this.maidenName = str;
                    return this;
                }

                public final Builder setMetadata(Map<String, String> map) {
                    this.metadata = map;
                    return this;
                }

                public final Builder setPhone(String str) {
                    this.phone = str;
                    return this;
                }

                public final Builder setSsnLast4(String str) {
                    this.ssnLast4 = str;
                    return this;
                }

                public final Builder setVerification(Verification verification2) {
                    this.verification = verification2;
                    return this;
                }

                public Individual build() {
                    return new Individual(this.address, this.addressKana, this.addressKanji, this.dateOfBirth, this.email, this.firstName, this.firstNameKana, this.firstNameKanji, this.gender, this.idNumber, this.lastName, this.lastNameKana, this.lastNameKanji, this.maidenName, this.metadata, this.phone, this.ssnLast4, this.verification);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Companion;", "", "", "PARAM_ADDRESS", "Ljava/lang/String;", "PARAM_ADDRESS_KANA", "PARAM_ADDRESS_KANJI", "PARAM_DOB", "PARAM_EMAIL", "PARAM_FIRST_NAME", "PARAM_FIRST_NAME_KANA", "PARAM_FIRST_NAME_KANJI", "PARAM_GENDER", "PARAM_ID_NUMBER", "PARAM_LAST_NAME", "PARAM_LAST_NAME_KANA", "PARAM_LAST_NAME_KANJI", "PARAM_MAIDEN_NAME", "PARAM_METADATA", "PARAM_PHONE", "PARAM_SSN_LAST_4", "PARAM_VERIFICATION", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: AccountParams.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<Individual> {
                public final Individual createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    String str;
                    String str2;
                    Parcel parcel2 = parcel;
                    i.e(parcel2, "in");
                    Address createFromParcel = parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel2) : null;
                    AddressJapanParams createFromParcel2 = parcel.readInt() != 0 ? AddressJapanParams.CREATOR.createFromParcel(parcel2) : null;
                    AddressJapanParams createFromParcel3 = parcel.readInt() != 0 ? AddressJapanParams.CREATOR.createFromParcel(parcel2) : null;
                    DateOfBirth createFromParcel4 = parcel.readInt() != 0 ? DateOfBirth.CREATOR.createFromParcel(parcel2) : null;
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        int readInt = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        while (readInt != 0) {
                            linkedHashMap2.put(parcel.readString(), parcel.readString());
                            readInt--;
                            readString8 = readString8;
                            readString7 = readString7;
                        }
                        str = readString7;
                        str2 = readString8;
                        linkedHashMap = linkedHashMap2;
                    } else {
                        str = readString7;
                        str2 = readString8;
                        linkedHashMap = null;
                    }
                    return new Individual(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, readString, readString2, readString3, readString4, readString5, readString6, str, str2, readString9, readString10, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Verification.CREATOR.createFromParcel(parcel2) : null);
                }

                public final Individual[] newArray(int i) {
                    return new Individual[i];
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B!\b\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006\""}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "", "", "toParamMap", "()Ljava/util/Map;", "front", "back", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: AccountParams.kt */
            public static final class Document implements StripeParamsModel, Parcelable {
                public static final Parcelable.Creator<Document> CREATOR = new Creator();
                private static final Companion Companion = new Companion((f) null);
                @Deprecated
                private static final String PARAM_BACK = "back";
                @Deprecated
                private static final String PARAM_FRONT = "front";
                private String back;
                private String front;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document$Companion;", "", "", "PARAM_BACK", "Ljava/lang/String;", "PARAM_FRONT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
                /* compiled from: AccountParams.kt */
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(f fVar) {
                        this();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
                public static class Creator implements Parcelable.Creator<Document> {
                    public final Document createFromParcel(Parcel parcel) {
                        i.e(parcel, "in");
                        return new Document(parcel.readString(), parcel.readString());
                    }

                    public final Document[] newArray(int i) {
                        return new Document[i];
                    }
                }

                public Document() {
                    this((String) null, (String) null, 3, (f) null);
                }

                public Document(String str) {
                    this(str, (String) null, 2, (f) null);
                }

                public Document(String str, String str2) {
                    this.front = str;
                    this.back = str2;
                }

                private final String component1() {
                    return this.front;
                }

                private final String component2() {
                    return this.back;
                }

                public static /* synthetic */ Document copy$default(Document document, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = document.front;
                    }
                    if ((i & 2) != 0) {
                        str2 = document.back;
                    }
                    return document.copy(str, str2);
                }

                public final Document copy(String str, String str2) {
                    return new Document(str, str2);
                }

                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Document)) {
                        return false;
                    }
                    Document document = (Document) obj;
                    return i.a(this.front, document.front) && i.a(this.back, document.back);
                }

                public int hashCode() {
                    String str = this.front;
                    int i = 0;
                    int hashCode = (str != null ? str.hashCode() : 0) * 31;
                    String str2 = this.back;
                    if (str2 != null) {
                        i = str2.hashCode();
                    }
                    return hashCode + i;
                }

                public Map<String, Object> toParamMap() {
                    List<Pair> K = g.K(new Pair(PARAM_FRONT, this.front), new Pair(PARAM_BACK, this.back));
                    Map<String, Object> o = g.o();
                    for (Pair pair : K) {
                        String str = (String) pair.c;
                        String str2 = (String) pair.d;
                        Map S2 = str2 != null ? h.S2(new Pair(str, str2)) : null;
                        if (S2 == null) {
                            S2 = g.o();
                        }
                        o = g.b0(o, S2);
                    }
                    return o;
                }

                public String toString() {
                    StringBuilder P0 = a.P0("Document(front=");
                    P0.append(this.front);
                    P0.append(", back=");
                    return a.y0(P0, this.back, ")");
                }

                public void writeToParcel(Parcel parcel, int i) {
                    i.e(parcel, "parcel");
                    parcel.writeString(this.front);
                    parcel.writeString(this.back);
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Document(String str, String str2, int i, f fVar) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B!\b\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b&\u0010'J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ(\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010#R$\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b$\u0010\n\"\u0004\b%\u0010#¨\u0006)"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "component1", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "component2", "document", "additionalDocument", "copy", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "getAdditionalDocument", "setAdditionalDocument", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;)V", "getDocument", "setDocument", "<init>", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: AccountParams.kt */
            public static final class Verification implements StripeParamsModel, Parcelable {
                public static final Parcelable.Creator<Verification> CREATOR = new Creator();
                private static final Companion Companion = new Companion((f) null);
                @Deprecated
                private static final String PARAM_ADDITIONAL_DOCUMENT = "additional_document";
                @Deprecated
                private static final String PARAM_DOCUMENT = "document";
                private Document additionalDocument;
                private Document document;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification$Companion;", "", "", "PARAM_ADDITIONAL_DOCUMENT", "Ljava/lang/String;", "PARAM_DOCUMENT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
                /* compiled from: AccountParams.kt */
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(f fVar) {
                        this();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
                public static class Creator implements Parcelable.Creator<Verification> {
                    public final Verification createFromParcel(Parcel parcel) {
                        i.e(parcel, "in");
                        Document document = null;
                        Document createFromParcel = parcel.readInt() != 0 ? Document.CREATOR.createFromParcel(parcel) : null;
                        if (parcel.readInt() != 0) {
                            document = Document.CREATOR.createFromParcel(parcel);
                        }
                        return new Verification(createFromParcel, document);
                    }

                    public final Verification[] newArray(int i) {
                        return new Verification[i];
                    }
                }

                public Verification() {
                    this((Document) null, (Document) null, 3, (f) null);
                }

                public Verification(Document document2) {
                    this(document2, (Document) null, 2, (f) null);
                }

                public Verification(Document document2, Document document3) {
                    this.document = document2;
                    this.additionalDocument = document3;
                }

                public static /* synthetic */ Verification copy$default(Verification verification, Document document2, Document document3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        document2 = verification.document;
                    }
                    if ((i & 2) != 0) {
                        document3 = verification.additionalDocument;
                    }
                    return verification.copy(document2, document3);
                }

                public final Document component1() {
                    return this.document;
                }

                public final Document component2() {
                    return this.additionalDocument;
                }

                public final Verification copy(Document document2, Document document3) {
                    return new Verification(document2, document3);
                }

                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Verification)) {
                        return false;
                    }
                    Verification verification = (Verification) obj;
                    return i.a(this.document, verification.document) && i.a(this.additionalDocument, verification.additionalDocument);
                }

                public final Document getAdditionalDocument() {
                    return this.additionalDocument;
                }

                public final Document getDocument() {
                    return this.document;
                }

                public int hashCode() {
                    Document document2 = this.document;
                    int i = 0;
                    int hashCode = (document2 != null ? document2.hashCode() : 0) * 31;
                    Document document3 = this.additionalDocument;
                    if (document3 != null) {
                        i = document3.hashCode();
                    }
                    return hashCode + i;
                }

                public final void setAdditionalDocument(Document document2) {
                    this.additionalDocument = document2;
                }

                public final void setDocument(Document document2) {
                    this.document = document2;
                }

                public Map<String, Object> toParamMap() {
                    Pair[] pairArr = new Pair[2];
                    Document document2 = this.additionalDocument;
                    pairArr[0] = new Pair(PARAM_ADDITIONAL_DOCUMENT, document2 != null ? document2.toParamMap() : null);
                    Document document3 = this.document;
                    pairArr[1] = new Pair(PARAM_DOCUMENT, document3 != null ? document3.toParamMap() : null);
                    List<Pair> K = g.K(pairArr);
                    Map<String, Object> o = g.o();
                    for (Pair pair : K) {
                        String str = (String) pair.c;
                        Map map = (Map) pair.d;
                        Map S2 = map != null ? h.S2(new Pair(str, map)) : null;
                        if (S2 == null) {
                            S2 = g.o();
                        }
                        o = g.b0(o, S2);
                    }
                    return o;
                }

                public String toString() {
                    StringBuilder P0 = a.P0("Verification(document=");
                    P0.append(this.document);
                    P0.append(", additionalDocument=");
                    P0.append(this.additionalDocument);
                    P0.append(")");
                    return P0.toString();
                }

                public void writeToParcel(Parcel parcel, int i) {
                    i.e(parcel, "parcel");
                    Document document2 = this.document;
                    if (document2 != null) {
                        parcel.writeInt(1);
                        document2.writeToParcel(parcel, 0);
                    } else {
                        parcel.writeInt(0);
                    }
                    Document document3 = this.additionalDocument;
                    if (document3 != null) {
                        parcel.writeInt(1);
                        document3.writeToParcel(parcel, 0);
                        return;
                    }
                    parcel.writeInt(0);
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Verification(Document document2, Document document3, int i, f fVar) {
                    this((i & 1) != 0 ? null : document2, (i & 2) != 0 ? null : document3);
                }
            }

            public Individual() {
                this((Address) null, (AddressJapanParams) null, (AddressJapanParams) null, (DateOfBirth) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, (String) null, (String) null, (Verification) null, 262143, (f) null);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ Individual(com.stripe.android.model.Address r20, com.stripe.android.model.AddressJapanParams r21, com.stripe.android.model.AddressJapanParams r22, com.stripe.android.model.DateOfBirth r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.Map r34, java.lang.String r35, java.lang.String r36, com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification r37, int r38, m0.n.b.f r39) {
                /*
                    r19 = this;
                    r0 = r38
                    r1 = r0 & 1
                    if (r1 == 0) goto L_0x0008
                    r1 = 0
                    goto L_0x000a
                L_0x0008:
                    r1 = r20
                L_0x000a:
                    r3 = r0 & 2
                    if (r3 == 0) goto L_0x0010
                    r3 = 0
                    goto L_0x0012
                L_0x0010:
                    r3 = r21
                L_0x0012:
                    r4 = r0 & 4
                    if (r4 == 0) goto L_0x0018
                    r4 = 0
                    goto L_0x001a
                L_0x0018:
                    r4 = r22
                L_0x001a:
                    r5 = r0 & 8
                    if (r5 == 0) goto L_0x0020
                    r5 = 0
                    goto L_0x0022
                L_0x0020:
                    r5 = r23
                L_0x0022:
                    r6 = r0 & 16
                    if (r6 == 0) goto L_0x0028
                    r6 = 0
                    goto L_0x002a
                L_0x0028:
                    r6 = r24
                L_0x002a:
                    r7 = r0 & 32
                    if (r7 == 0) goto L_0x0030
                    r7 = 0
                    goto L_0x0032
                L_0x0030:
                    r7 = r25
                L_0x0032:
                    r8 = r0 & 64
                    if (r8 == 0) goto L_0x0038
                    r8 = 0
                    goto L_0x003a
                L_0x0038:
                    r8 = r26
                L_0x003a:
                    r9 = r0 & 128(0x80, float:1.794E-43)
                    if (r9 == 0) goto L_0x0040
                    r9 = 0
                    goto L_0x0042
                L_0x0040:
                    r9 = r27
                L_0x0042:
                    r10 = r0 & 256(0x100, float:3.59E-43)
                    if (r10 == 0) goto L_0x0048
                    r10 = 0
                    goto L_0x004a
                L_0x0048:
                    r10 = r28
                L_0x004a:
                    r11 = r0 & 512(0x200, float:7.175E-43)
                    if (r11 == 0) goto L_0x0050
                    r11 = 0
                    goto L_0x0052
                L_0x0050:
                    r11 = r29
                L_0x0052:
                    r12 = r0 & 1024(0x400, float:1.435E-42)
                    if (r12 == 0) goto L_0x0058
                    r12 = 0
                    goto L_0x005a
                L_0x0058:
                    r12 = r30
                L_0x005a:
                    r13 = r0 & 2048(0x800, float:2.87E-42)
                    if (r13 == 0) goto L_0x0060
                    r13 = 0
                    goto L_0x0062
                L_0x0060:
                    r13 = r31
                L_0x0062:
                    r14 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r14 == 0) goto L_0x0068
                    r14 = 0
                    goto L_0x006a
                L_0x0068:
                    r14 = r32
                L_0x006a:
                    r15 = r0 & 8192(0x2000, float:1.14794E-41)
                    if (r15 == 0) goto L_0x0070
                    r15 = 0
                    goto L_0x0072
                L_0x0070:
                    r15 = r33
                L_0x0072:
                    r2 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r2 == 0) goto L_0x0078
                    r2 = 0
                    goto L_0x007a
                L_0x0078:
                    r2 = r34
                L_0x007a:
                    r16 = 32768(0x8000, float:4.5918E-41)
                    r16 = r0 & r16
                    if (r16 == 0) goto L_0x0084
                    r16 = 0
                    goto L_0x0086
                L_0x0084:
                    r16 = r35
                L_0x0086:
                    r17 = 65536(0x10000, float:9.18355E-41)
                    r17 = r0 & r17
                    if (r17 == 0) goto L_0x008f
                    r17 = 0
                    goto L_0x0091
                L_0x008f:
                    r17 = r36
                L_0x0091:
                    r18 = 131072(0x20000, float:1.83671E-40)
                    r0 = r0 & r18
                    if (r0 == 0) goto L_0x0099
                    r0 = 0
                    goto L_0x009b
                L_0x0099:
                    r0 = r37
                L_0x009b:
                    r20 = r19
                    r21 = r1
                    r22 = r3
                    r23 = r4
                    r24 = r5
                    r25 = r6
                    r26 = r7
                    r27 = r8
                    r28 = r9
                    r29 = r10
                    r30 = r11
                    r31 = r12
                    r32 = r13
                    r33 = r14
                    r34 = r15
                    r35 = r2
                    r36 = r16
                    r37 = r17
                    r38 = r0
                    r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.<init>(com.stripe.android.model.Address, com.stripe.android.model.AddressJapanParams, com.stripe.android.model.AddressJapanParams, com.stripe.android.model.DateOfBirth, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String, com.stripe.android.model.AccountParams$BusinessTypeParams$Individual$Verification, int, m0.n.b.f):void");
            }

            public static /* synthetic */ Individual copy$default(Individual individual, Address address2, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, String str11, String str12, Verification verification2, int i, Object obj) {
                Individual individual2 = individual;
                int i2 = i;
                return individual.copy((i2 & 1) != 0 ? individual2.address : address2, (i2 & 2) != 0 ? individual2.addressKana : addressJapanParams, (i2 & 4) != 0 ? individual2.addressKanji : addressJapanParams2, (i2 & 8) != 0 ? individual2.dateOfBirth : dateOfBirth2, (i2 & 16) != 0 ? individual2.email : str, (i2 & 32) != 0 ? individual2.firstName : str2, (i2 & 64) != 0 ? individual2.firstNameKana : str3, (i2 & 128) != 0 ? individual2.firstNameKanji : str4, (i2 & 256) != 0 ? individual2.gender : str5, (i2 & 512) != 0 ? individual2.idNumber : str6, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? individual2.lastName : str7, (i2 & 2048) != 0 ? individual2.lastNameKana : str8, (i2 & 4096) != 0 ? individual2.lastNameKanji : str9, (i2 & 8192) != 0 ? individual2.maidenName : str10, (i2 & 16384) != 0 ? individual2.metadata : map, (i2 & 32768) != 0 ? individual2.phone : str11, (i2 & 65536) != 0 ? individual2.ssnLast4 : str12, (i2 & 131072) != 0 ? individual2.verification : verification2);
            }

            public final Address component1() {
                return this.address;
            }

            public final String component10() {
                return this.idNumber;
            }

            public final String component11() {
                return this.lastName;
            }

            public final String component12() {
                return this.lastNameKana;
            }

            public final String component13() {
                return this.lastNameKanji;
            }

            public final String component14() {
                return this.maidenName;
            }

            public final Map<String, String> component15() {
                return this.metadata;
            }

            public final String component16() {
                return this.phone;
            }

            public final String component17() {
                return this.ssnLast4;
            }

            public final Verification component18() {
                return this.verification;
            }

            public final AddressJapanParams component2() {
                return this.addressKana;
            }

            public final AddressJapanParams component3() {
                return this.addressKanji;
            }

            public final DateOfBirth component4() {
                return this.dateOfBirth;
            }

            public final String component5() {
                return this.email;
            }

            public final String component6() {
                return this.firstName;
            }

            public final String component7() {
                return this.firstNameKana;
            }

            public final String component8() {
                return this.firstNameKanji;
            }

            public final String component9() {
                return this.gender;
            }

            public final Individual copy(Address address2, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, String str12, Verification verification2) {
                return new Individual(address2, addressJapanParams, addressJapanParams2, dateOfBirth2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, map, str11, str12, verification2);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Individual)) {
                    return false;
                }
                Individual individual = (Individual) obj;
                return i.a(this.address, individual.address) && i.a(this.addressKana, individual.addressKana) && i.a(this.addressKanji, individual.addressKanji) && i.a(this.dateOfBirth, individual.dateOfBirth) && i.a(this.email, individual.email) && i.a(this.firstName, individual.firstName) && i.a(this.firstNameKana, individual.firstNameKana) && i.a(this.firstNameKanji, individual.firstNameKanji) && i.a(this.gender, individual.gender) && i.a(this.idNumber, individual.idNumber) && i.a(this.lastName, individual.lastName) && i.a(this.lastNameKana, individual.lastNameKana) && i.a(this.lastNameKanji, individual.lastNameKanji) && i.a(this.maidenName, individual.maidenName) && i.a(this.metadata, individual.metadata) && i.a(this.phone, individual.phone) && i.a(this.ssnLast4, individual.ssnLast4) && i.a(this.verification, individual.verification);
            }

            public final Address getAddress() {
                return this.address;
            }

            public final AddressJapanParams getAddressKana() {
                return this.addressKana;
            }

            public final AddressJapanParams getAddressKanji() {
                return this.addressKanji;
            }

            public final DateOfBirth getDateOfBirth() {
                return this.dateOfBirth;
            }

            public final String getEmail() {
                return this.email;
            }

            public final String getFirstName() {
                return this.firstName;
            }

            public final String getFirstNameKana() {
                return this.firstNameKana;
            }

            public final String getFirstNameKanji() {
                return this.firstNameKanji;
            }

            public final String getGender() {
                return this.gender;
            }

            public final String getIdNumber() {
                return this.idNumber;
            }

            public final String getLastName() {
                return this.lastName;
            }

            public final String getLastNameKana() {
                return this.lastNameKana;
            }

            public final String getLastNameKanji() {
                return this.lastNameKanji;
            }

            public final String getMaidenName() {
                return this.maidenName;
            }

            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            public List<Pair<String, Object>> getParamsList() {
                Pair[] pairArr = new Pair[18];
                Address address2 = this.address;
                Map<String, Object> map = null;
                pairArr[0] = new Pair("address", address2 != null ? address2.toParamMap() : null);
                AddressJapanParams addressJapanParams = this.addressKana;
                pairArr[1] = new Pair(PARAM_ADDRESS_KANA, addressJapanParams != null ? addressJapanParams.toParamMap() : null);
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                pairArr[2] = new Pair(PARAM_ADDRESS_KANJI, addressJapanParams2 != null ? addressJapanParams2.toParamMap() : null);
                DateOfBirth dateOfBirth2 = this.dateOfBirth;
                pairArr[3] = new Pair(PARAM_DOB, dateOfBirth2 != null ? dateOfBirth2.toParamMap() : null);
                pairArr[4] = new Pair("email", this.email);
                pairArr[5] = new Pair(PARAM_FIRST_NAME, this.firstName);
                pairArr[6] = new Pair(PARAM_FIRST_NAME_KANA, this.firstNameKana);
                pairArr[7] = new Pair(PARAM_FIRST_NAME_KANJI, this.firstNameKanji);
                pairArr[8] = new Pair(PARAM_GENDER, this.gender);
                pairArr[9] = new Pair(PARAM_ID_NUMBER, this.idNumber);
                pairArr[10] = new Pair(PARAM_LAST_NAME, this.lastName);
                pairArr[11] = new Pair(PARAM_LAST_NAME_KANA, this.lastNameKana);
                pairArr[12] = new Pair(PARAM_LAST_NAME_KANJI, this.lastNameKanji);
                pairArr[13] = new Pair(PARAM_MAIDEN_NAME, this.maidenName);
                pairArr[14] = new Pair(PARAM_METADATA, this.metadata);
                pairArr[15] = new Pair("phone", this.phone);
                pairArr[16] = new Pair(PARAM_SSN_LAST_4, this.ssnLast4);
                Verification verification2 = this.verification;
                if (verification2 != null) {
                    map = verification2.toParamMap();
                }
                pairArr[17] = new Pair(PARAM_VERIFICATION, map);
                return g.K(pairArr);
            }

            public final String getPhone() {
                return this.phone;
            }

            public final String getSsnLast4() {
                return this.ssnLast4;
            }

            public final Verification getVerification() {
                return this.verification;
            }

            public int hashCode() {
                Address address2 = this.address;
                int i = 0;
                int hashCode = (address2 != null ? address2.hashCode() : 0) * 31;
                AddressJapanParams addressJapanParams = this.addressKana;
                int hashCode2 = (hashCode + (addressJapanParams != null ? addressJapanParams.hashCode() : 0)) * 31;
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                int hashCode3 = (hashCode2 + (addressJapanParams2 != null ? addressJapanParams2.hashCode() : 0)) * 31;
                DateOfBirth dateOfBirth2 = this.dateOfBirth;
                int hashCode4 = (hashCode3 + (dateOfBirth2 != null ? dateOfBirth2.hashCode() : 0)) * 31;
                String str = this.email;
                int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.firstName;
                int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.firstNameKana;
                int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
                String str4 = this.firstNameKanji;
                int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
                String str5 = this.gender;
                int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
                String str6 = this.idNumber;
                int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
                String str7 = this.lastName;
                int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 31;
                String str8 = this.lastNameKana;
                int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
                String str9 = this.lastNameKanji;
                int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
                String str10 = this.maidenName;
                int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 31;
                Map<String, String> map = this.metadata;
                int hashCode15 = (hashCode14 + (map != null ? map.hashCode() : 0)) * 31;
                String str11 = this.phone;
                int hashCode16 = (hashCode15 + (str11 != null ? str11.hashCode() : 0)) * 31;
                String str12 = this.ssnLast4;
                int hashCode17 = (hashCode16 + (str12 != null ? str12.hashCode() : 0)) * 31;
                Verification verification2 = this.verification;
                if (verification2 != null) {
                    i = verification2.hashCode();
                }
                return hashCode17 + i;
            }

            public final void setAddress(Address address2) {
                this.address = address2;
            }

            public final void setAddressKana(AddressJapanParams addressJapanParams) {
                this.addressKana = addressJapanParams;
            }

            public final void setAddressKanji(AddressJapanParams addressJapanParams) {
                this.addressKanji = addressJapanParams;
            }

            public final void setDateOfBirth(DateOfBirth dateOfBirth2) {
                this.dateOfBirth = dateOfBirth2;
            }

            public final void setEmail(String str) {
                this.email = str;
            }

            public final void setFirstName(String str) {
                this.firstName = str;
            }

            public final void setFirstNameKana(String str) {
                this.firstNameKana = str;
            }

            public final void setFirstNameKanji(String str) {
                this.firstNameKanji = str;
            }

            public final void setGender(String str) {
                this.gender = str;
            }

            public final void setIdNumber(String str) {
                this.idNumber = str;
            }

            public final void setLastName(String str) {
                this.lastName = str;
            }

            public final void setLastNameKana(String str) {
                this.lastNameKana = str;
            }

            public final void setLastNameKanji(String str) {
                this.lastNameKanji = str;
            }

            public final void setMaidenName(String str) {
                this.maidenName = str;
            }

            public final void setMetadata(Map<String, String> map) {
                this.metadata = map;
            }

            public final void setPhone(String str) {
                this.phone = str;
            }

            public final void setSsnLast4(String str) {
                this.ssnLast4 = str;
            }

            public final void setVerification(Verification verification2) {
                this.verification = verification2;
            }

            public String toString() {
                StringBuilder P0 = a.P0("Individual(address=");
                P0.append(this.address);
                P0.append(", addressKana=");
                P0.append(this.addressKana);
                P0.append(", addressKanji=");
                P0.append(this.addressKanji);
                P0.append(", dateOfBirth=");
                P0.append(this.dateOfBirth);
                P0.append(", email=");
                P0.append(this.email);
                P0.append(", firstName=");
                P0.append(this.firstName);
                P0.append(", firstNameKana=");
                P0.append(this.firstNameKana);
                P0.append(", firstNameKanji=");
                P0.append(this.firstNameKanji);
                P0.append(", gender=");
                P0.append(this.gender);
                P0.append(", idNumber=");
                P0.append(this.idNumber);
                P0.append(", lastName=");
                P0.append(this.lastName);
                P0.append(", lastNameKana=");
                P0.append(this.lastNameKana);
                P0.append(", lastNameKanji=");
                P0.append(this.lastNameKanji);
                P0.append(", maidenName=");
                P0.append(this.maidenName);
                P0.append(", metadata=");
                P0.append(this.metadata);
                P0.append(", phone=");
                P0.append(this.phone);
                P0.append(", ssnLast4=");
                P0.append(this.ssnLast4);
                P0.append(", verification=");
                P0.append(this.verification);
                P0.append(")");
                return P0.toString();
            }

            /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Map$Entry, java.lang.Object] */
            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                Address address2 = this.address;
                if (address2 != null) {
                    parcel.writeInt(1);
                    address2.writeToParcel(parcel, 0);
                } else {
                    parcel.writeInt(0);
                }
                AddressJapanParams addressJapanParams = this.addressKana;
                if (addressJapanParams != null) {
                    parcel.writeInt(1);
                    addressJapanParams.writeToParcel(parcel, 0);
                } else {
                    parcel.writeInt(0);
                }
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                if (addressJapanParams2 != null) {
                    parcel.writeInt(1);
                    addressJapanParams2.writeToParcel(parcel, 0);
                } else {
                    parcel.writeInt(0);
                }
                DateOfBirth dateOfBirth2 = this.dateOfBirth;
                if (dateOfBirth2 != null) {
                    parcel.writeInt(1);
                    dateOfBirth2.writeToParcel(parcel, 0);
                } else {
                    parcel.writeInt(0);
                }
                parcel.writeString(this.email);
                parcel.writeString(this.firstName);
                parcel.writeString(this.firstNameKana);
                parcel.writeString(this.firstNameKanji);
                parcel.writeString(this.gender);
                parcel.writeString(this.idNumber);
                parcel.writeString(this.lastName);
                parcel.writeString(this.lastNameKana);
                parcel.writeString(this.lastNameKanji);
                parcel.writeString(this.maidenName);
                Map<String, String> map = this.metadata;
                if (map != null) {
                    Iterator l1 = a.l1(parcel, 1, map);
                    while (l1.hasNext()) {
                        ? next = l1.next();
                        parcel.writeString((String) next.getKey());
                        parcel.writeString((String) next.getValue());
                    }
                } else {
                    parcel.writeInt(0);
                }
                parcel.writeString(this.phone);
                parcel.writeString(this.ssnLast4);
                Verification verification2 = this.verification;
                if (verification2 != null) {
                    parcel.writeInt(1);
                    verification2.writeToParcel(parcel, 0);
                    return;
                }
                parcel.writeInt(0);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Individual(Address address2, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, String str12, Verification verification2) {
                super(BusinessType.Individual, (f) null);
                this.address = address2;
                this.addressKana = addressJapanParams;
                this.addressKanji = addressJapanParams2;
                this.dateOfBirth = dateOfBirth2;
                this.email = str;
                this.firstName = str2;
                this.firstNameKana = str3;
                this.firstNameKanji = str4;
                this.gender = str5;
                this.idNumber = str6;
                this.lastName = str7;
                this.lastNameKana = str8;
                this.lastNameKanji = str9;
                this.maidenName = str10;
                this.metadata = map;
                this.phone = str11;
                this.ssnLast4 = str12;
                this.verification = verification2;
            }
        }

        private BusinessTypeParams(BusinessType businessType) {
            this.type = businessType;
        }

        public abstract List<Pair<String, Object>> getParamsList();

        public final BusinessType getType$payments_core_release() {
            return this.type;
        }

        public Map<String, Object> toParamMap() {
            List<Pair<String, Object>> paramsList = getParamsList();
            Map<String, Object> o = g.o();
            for (Pair pair : paramsList) {
                String str = (String) pair.c;
                B b = pair.d;
                Map S2 = b != null ? h.S2(new Pair(str, b)) : null;
                if (S2 == null) {
                    S2 = g.o();
                }
                o = g.b0(o, S2);
            }
            return o;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\b\b\u0018\u0000 f2\u00020\u0001:\u0004gfhiB¯\u0001\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bd\u0010eJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J¸\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b*\u0010\u000fJ\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020+HÖ\u0001¢\u0006\u0004\b2\u0010-J \u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020+HÖ\u0001¢\u0006\u0004\b7\u00108R$\u0010 \u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u00109\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010<R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010=\u001a\u0004\b>\u0010\u0004\"\u0004\b?\u0010@R$\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010A\u001a\u0004\bB\u0010\u0007\"\u0004\bC\u0010DR$\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010E\u001a\u0004\bF\u0010\u000b\"\u0004\bG\u0010HR$\u0010'\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010I\u001a\u0004\bJ\u0010\u0019\"\u0004\bK\u0010LR$\u0010#\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u00109\u001a\u0004\bM\u0010\u000f\"\u0004\bN\u0010<R$\u0010$\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u00109\u001a\u0004\bO\u0010\u000f\"\u0004\bP\u0010<R$\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u00109\u001a\u0004\bQ\u0010\u000f\"\u0004\bR\u0010<R*\u0010W\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010.0T0S8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR$\u0010\"\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010E\u001a\u0004\bX\u0010\u000b\"\u0004\bY\u0010HR$\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010E\u001a\u0004\bZ\u0010\u000b\"\u0004\b[\u0010HR$\u0010%\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u00109\u001a\u0004\b\\\u0010\u000f\"\u0004\b]\u0010<R$\u0010!\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u00109\u001a\u0004\b^\u0010\u000f\"\u0004\b_\u0010<R$\u0010&\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u00109\u001a\u0004\b`\u0010\u000f\"\u0004\ba\u0010<R$\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010A\u001a\u0004\bb\u0010\u0007\"\u0004\bc\u0010D¨\u0006j"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "Lcom/stripe/android/model/Address;", "component1", "()Lcom/stripe/android/model/Address;", "Lcom/stripe/android/model/AddressJapanParams;", "component2", "()Lcom/stripe/android/model/AddressJapanParams;", "component3", "", "component4", "()Ljava/lang/Boolean;", "component5", "", "component6", "()Ljava/lang/String;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "component14", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "address", "addressKana", "addressKanji", "directorsProvided", "executivesProvided", "name", "nameKana", "nameKanji", "ownersProvided", "phone", "taxId", "taxIdRegistrar", "vatId", "verification", "copy", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getNameKana", "setNameKana", "(Ljava/lang/String;)V", "Lcom/stripe/android/model/Address;", "getAddress", "setAddress", "(Lcom/stripe/android/model/Address;)V", "Lcom/stripe/android/model/AddressJapanParams;", "getAddressKanji", "setAddressKanji", "(Lcom/stripe/android/model/AddressJapanParams;)V", "Ljava/lang/Boolean;", "getDirectorsProvided", "setDirectorsProvided", "(Ljava/lang/Boolean;)V", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "getVerification", "setVerification", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)V", "getPhone", "setPhone", "getTaxId", "setTaxId", "getName", "setName", "", "Lkotlin/Pair;", "getParamsList", "()Ljava/util/List;", "paramsList", "getOwnersProvided", "setOwnersProvided", "getExecutivesProvided", "setExecutivesProvided", "getTaxIdRegistrar", "setTaxIdRegistrar", "getNameKanji", "setNameKanji", "getVatId", "setVatId", "getAddressKana", "setAddressKana", "<init>", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)V", "Companion", "Builder", "Document", "Verification", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: AccountParams.kt */
        public static final class Company extends BusinessTypeParams {
            public static final Parcelable.Creator<Company> CREATOR = new Creator();
            private static final Companion Companion = new Companion((f) null);
            @Deprecated
            private static final String PARAM_ADDRESS = "address";
            @Deprecated
            private static final String PARAM_ADDRESS_KANA = "address_kana";
            @Deprecated
            private static final String PARAM_ADDRESS_KANJI = "address_kanji";
            @Deprecated
            private static final String PARAM_DIRECTORS_PROVIDED = "directors_provided";
            @Deprecated
            private static final String PARAM_EXECUTIVES_PROVIDED = "executives_provided";
            @Deprecated
            private static final String PARAM_NAME = "name";
            @Deprecated
            private static final String PARAM_NAME_KANA = "name_kana";
            @Deprecated
            private static final String PARAM_NAME_KANJI = "name_kanji";
            @Deprecated
            private static final String PARAM_OWNERS_PROVIDED = "owners_provided";
            @Deprecated
            private static final String PARAM_PHONE = "phone";
            @Deprecated
            private static final String PARAM_TAX_ID = "tax_id";
            @Deprecated
            private static final String PARAM_TAX_ID_REGISTRAR = "tax_id_registrar";
            @Deprecated
            private static final String PARAM_VAT_ID = "vat_id";
            @Deprecated
            private static final String PARAM_VERIFICATION = "verification";
            private Address address;
            private AddressJapanParams addressKana;
            private AddressJapanParams addressKanji;
            private Boolean directorsProvided;
            private Boolean executivesProvided;
            private String name;
            private String nameKana;
            private String nameKanji;
            private Boolean ownersProvided;
            private String phone;
            private String taxId;
            private String taxIdRegistrar;
            private String vatId;
            private Verification verification;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001e\u0010\u0016J\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b \u0010\u0016J\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\"\u0010\u0016J\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b$\u0010\u0016J\u0017\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010+R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010+R\u0018\u0010!\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010+R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010.R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0018\u0010#\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010+R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010/¨\u00062"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "Lcom/stripe/android/model/Address;", "address", "setAddress", "(Lcom/stripe/android/model/Address;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Builder;", "Lcom/stripe/android/model/AddressJapanParams;", "addressKana", "setAddressKana", "(Lcom/stripe/android/model/AddressJapanParams;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Builder;", "addressKanji", "setAddressKanji", "", "directorsProvided", "setDirectorsProvided", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Builder;", "executivesProvided", "setExecutivesProvided", "", "name", "setName", "(Ljava/lang/String;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Builder;", "nameKana", "setNameKana", "nameKanji", "setNameKanji", "ownersProvided", "setOwnersProvided", "phone", "setPhone", "taxId", "setTaxId", "taxIdRegistrar", "setTaxIdRegistrar", "vatId", "setVatId", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "verification", "setVerification", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Builder;", "build", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "Ljava/lang/String;", "Ljava/lang/Boolean;", "Lcom/stripe/android/model/Address;", "Lcom/stripe/android/model/AddressJapanParams;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: AccountParams.kt */
            public static final class Builder implements ObjectBuilder<Company> {
                private Address address;
                private AddressJapanParams addressKana;
                private AddressJapanParams addressKanji;
                private Boolean directorsProvided;
                private Boolean executivesProvided;
                private String name;
                private String nameKana;
                private String nameKanji;
                private Boolean ownersProvided;
                private String phone;
                private String taxId;
                private String taxIdRegistrar;
                private String vatId;
                private Verification verification;

                public final Builder setAddress(Address address2) {
                    this.address = address2;
                    return this;
                }

                public final Builder setAddressKana(AddressJapanParams addressJapanParams) {
                    this.addressKana = addressJapanParams;
                    return this;
                }

                public final Builder setAddressKanji(AddressJapanParams addressJapanParams) {
                    this.addressKanji = addressJapanParams;
                    return this;
                }

                public final Builder setDirectorsProvided(Boolean bool) {
                    this.directorsProvided = bool;
                    return this;
                }

                public final Builder setExecutivesProvided(Boolean bool) {
                    this.executivesProvided = bool;
                    return this;
                }

                public final Builder setName(String str) {
                    this.name = str;
                    return this;
                }

                public final Builder setNameKana(String str) {
                    this.nameKana = str;
                    return this;
                }

                public final Builder setNameKanji(String str) {
                    this.nameKanji = str;
                    return this;
                }

                public final Builder setOwnersProvided(Boolean bool) {
                    this.ownersProvided = bool;
                    return this;
                }

                public final Builder setPhone(String str) {
                    this.phone = str;
                    return this;
                }

                public final Builder setTaxId(String str) {
                    this.taxId = str;
                    return this;
                }

                public final Builder setTaxIdRegistrar(String str) {
                    this.taxIdRegistrar = str;
                    return this;
                }

                public final Builder setVatId(String str) {
                    this.vatId = str;
                    return this;
                }

                public final Builder setVerification(Verification verification2) {
                    this.verification = verification2;
                    return this;
                }

                public Company build() {
                    return new Company(this.address, this.addressKana, this.addressKanji, this.directorsProvided, this.executivesProvided, this.name, this.nameKana, this.nameKanji, this.ownersProvided, this.phone, this.taxId, this.taxIdRegistrar, this.vatId, this.verification);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Companion;", "", "", "PARAM_ADDRESS", "Ljava/lang/String;", "PARAM_ADDRESS_KANA", "PARAM_ADDRESS_KANJI", "PARAM_DIRECTORS_PROVIDED", "PARAM_EXECUTIVES_PROVIDED", "PARAM_NAME", "PARAM_NAME_KANA", "PARAM_NAME_KANJI", "PARAM_OWNERS_PROVIDED", "PARAM_PHONE", "PARAM_TAX_ID", "PARAM_TAX_ID_REGISTRAR", "PARAM_VAT_ID", "PARAM_VERIFICATION", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: AccountParams.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<Company> {
                public final Company createFromParcel(Parcel parcel) {
                    Boolean bool;
                    Boolean bool2;
                    Boolean bool3;
                    Parcel parcel2 = parcel;
                    i.e(parcel2, "in");
                    Address createFromParcel = parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel2) : null;
                    AddressJapanParams createFromParcel2 = parcel.readInt() != 0 ? AddressJapanParams.CREATOR.createFromParcel(parcel2) : null;
                    AddressJapanParams createFromParcel3 = parcel.readInt() != 0 ? AddressJapanParams.CREATOR.createFromParcel(parcel2) : null;
                    boolean z = true;
                    if (parcel.readInt() != 0) {
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                    } else {
                        bool = null;
                    }
                    if (parcel.readInt() != 0) {
                        bool2 = Boolean.valueOf(parcel.readInt() != 0);
                    } else {
                        bool2 = null;
                    }
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        if (parcel.readInt() == 0) {
                            z = false;
                        }
                        bool3 = Boolean.valueOf(z);
                    } else {
                        bool3 = null;
                    }
                    return new Company(createFromParcel, createFromParcel2, createFromParcel3, bool, bool2, readString, readString2, readString3, bool3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Verification.CREATOR.createFromParcel(parcel2) : null);
                }

                public final Company[] newArray(int i) {
                    return new Company[i];
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B!\b\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e¨\u0006\""}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "", "", "toParamMap", "()Ljava/util/Map;", "front", "back", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: AccountParams.kt */
            public static final class Document implements StripeParamsModel, Parcelable {
                public static final Parcelable.Creator<Document> CREATOR = new Creator();
                private static final Companion Companion = new Companion((f) null);
                @Deprecated
                private static final String PARAM_BACK = "back";
                @Deprecated
                private static final String PARAM_FRONT = "front";
                private final String back;
                private final String front;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document$Companion;", "", "", "PARAM_BACK", "Ljava/lang/String;", "PARAM_FRONT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
                /* compiled from: AccountParams.kt */
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(f fVar) {
                        this();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
                public static class Creator implements Parcelable.Creator<Document> {
                    public final Document createFromParcel(Parcel parcel) {
                        i.e(parcel, "in");
                        return new Document(parcel.readString(), parcel.readString());
                    }

                    public final Document[] newArray(int i) {
                        return new Document[i];
                    }
                }

                public Document() {
                    this((String) null, (String) null, 3, (f) null);
                }

                public Document(String str) {
                    this(str, (String) null, 2, (f) null);
                }

                public Document(String str, String str2) {
                    this.front = str;
                    this.back = str2;
                }

                private final String component1() {
                    return this.front;
                }

                private final String component2() {
                    return this.back;
                }

                public static /* synthetic */ Document copy$default(Document document, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = document.front;
                    }
                    if ((i & 2) != 0) {
                        str2 = document.back;
                    }
                    return document.copy(str, str2);
                }

                public final Document copy(String str, String str2) {
                    return new Document(str, str2);
                }

                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Document)) {
                        return false;
                    }
                    Document document = (Document) obj;
                    return i.a(this.front, document.front) && i.a(this.back, document.back);
                }

                public int hashCode() {
                    String str = this.front;
                    int i = 0;
                    int hashCode = (str != null ? str.hashCode() : 0) * 31;
                    String str2 = this.back;
                    if (str2 != null) {
                        i = str2.hashCode();
                    }
                    return hashCode + i;
                }

                public Map<String, Object> toParamMap() {
                    List<Pair> K = g.K(new Pair(PARAM_FRONT, this.front), new Pair(PARAM_BACK, this.back));
                    Map<String, Object> o = g.o();
                    for (Pair pair : K) {
                        String str = (String) pair.c;
                        String str2 = (String) pair.d;
                        Map S2 = str2 != null ? h.S2(new Pair(str, str2)) : null;
                        if (S2 == null) {
                            S2 = g.o();
                        }
                        o = g.b0(o, S2);
                    }
                    return o;
                }

                public String toString() {
                    StringBuilder P0 = a.P0("Document(front=");
                    P0.append(this.front);
                    P0.append(", back=");
                    return a.y0(P0, this.back, ")");
                }

                public void writeToParcel(Parcel parcel, int i) {
                    i.e(parcel, "parcel");
                    parcel.writeString(this.front);
                    parcel.writeString(this.back);
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Document(String str, String str2, int i, f fVar) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\"\u0010!J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "component1", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "document", "copy", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "getDocument", "setDocument", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;)V", "<init>", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: AccountParams.kt */
            public static final class Verification implements StripeParamsModel, Parcelable {
                public static final Parcelable.Creator<Verification> CREATOR = new Creator();
                private static final Companion Companion = new Companion((f) null);
                @Deprecated
                private static final String PARAM_DOCUMENT = "document";
                private Document document;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification$Companion;", "", "", "PARAM_DOCUMENT", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
                /* compiled from: AccountParams.kt */
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(f fVar) {
                        this();
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
                public static class Creator implements Parcelable.Creator<Verification> {
                    public final Verification createFromParcel(Parcel parcel) {
                        i.e(parcel, "in");
                        return new Verification(parcel.readInt() != 0 ? Document.CREATOR.createFromParcel(parcel) : null);
                    }

                    public final Verification[] newArray(int i) {
                        return new Verification[i];
                    }
                }

                public Verification() {
                    this((Document) null, 1, (f) null);
                }

                public Verification(Document document2) {
                    this.document = document2;
                }

                public static /* synthetic */ Verification copy$default(Verification verification, Document document2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        document2 = verification.document;
                    }
                    return verification.copy(document2);
                }

                public final Document component1() {
                    return this.document;
                }

                public final Verification copy(Document document2) {
                    return new Verification(document2);
                }

                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this != obj) {
                        return (obj instanceof Verification) && i.a(this.document, ((Verification) obj).document);
                    }
                    return true;
                }

                public final Document getDocument() {
                    return this.document;
                }

                public int hashCode() {
                    Document document2 = this.document;
                    if (document2 != null) {
                        return document2.hashCode();
                    }
                    return 0;
                }

                public final void setDocument(Document document2) {
                    this.document = document2;
                }

                public Map<String, Object> toParamMap() {
                    Document document2 = this.document;
                    Map<String, Object> S2 = document2 != null ? h.S2(new Pair(PARAM_DOCUMENT, document2.toParamMap())) : null;
                    return S2 != null ? S2 : g.o();
                }

                public String toString() {
                    StringBuilder P0 = a.P0("Verification(document=");
                    P0.append(this.document);
                    P0.append(")");
                    return P0.toString();
                }

                public void writeToParcel(Parcel parcel, int i) {
                    i.e(parcel, "parcel");
                    Document document2 = this.document;
                    if (document2 != null) {
                        parcel.writeInt(1);
                        document2.writeToParcel(parcel, 0);
                        return;
                    }
                    parcel.writeInt(0);
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Verification(Document document2, int i, f fVar) {
                    this((i & 1) != 0 ? null : document2);
                }
            }

            public Company() {
                this((Address) null, (AddressJapanParams) null, (AddressJapanParams) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Verification) null, 16383, (f) null);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ Company(com.stripe.android.model.Address r16, com.stripe.android.model.AddressJapanParams r17, com.stripe.android.model.AddressJapanParams r18, java.lang.Boolean r19, java.lang.Boolean r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Boolean r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification r29, int r30, m0.n.b.f r31) {
                /*
                    r15 = this;
                    r0 = r30
                    r1 = r0 & 1
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r1 = r2
                    goto L_0x000b
                L_0x0009:
                    r1 = r16
                L_0x000b:
                    r3 = r0 & 2
                    if (r3 == 0) goto L_0x0011
                    r3 = r2
                    goto L_0x0013
                L_0x0011:
                    r3 = r17
                L_0x0013:
                    r4 = r0 & 4
                    if (r4 == 0) goto L_0x0019
                    r4 = r2
                    goto L_0x001b
                L_0x0019:
                    r4 = r18
                L_0x001b:
                    r5 = r0 & 8
                    if (r5 == 0) goto L_0x0021
                    r5 = r2
                    goto L_0x0023
                L_0x0021:
                    r5 = r19
                L_0x0023:
                    r6 = r0 & 16
                    if (r6 == 0) goto L_0x0029
                    r6 = r2
                    goto L_0x002b
                L_0x0029:
                    r6 = r20
                L_0x002b:
                    r7 = r0 & 32
                    if (r7 == 0) goto L_0x0031
                    r7 = r2
                    goto L_0x0033
                L_0x0031:
                    r7 = r21
                L_0x0033:
                    r8 = r0 & 64
                    if (r8 == 0) goto L_0x0039
                    r8 = r2
                    goto L_0x003b
                L_0x0039:
                    r8 = r22
                L_0x003b:
                    r9 = r0 & 128(0x80, float:1.794E-43)
                    if (r9 == 0) goto L_0x0041
                    r9 = r2
                    goto L_0x0043
                L_0x0041:
                    r9 = r23
                L_0x0043:
                    r10 = r0 & 256(0x100, float:3.59E-43)
                    if (r10 == 0) goto L_0x004a
                    java.lang.Boolean r10 = java.lang.Boolean.FALSE
                    goto L_0x004c
                L_0x004a:
                    r10 = r24
                L_0x004c:
                    r11 = r0 & 512(0x200, float:7.175E-43)
                    if (r11 == 0) goto L_0x0052
                    r11 = r2
                    goto L_0x0054
                L_0x0052:
                    r11 = r25
                L_0x0054:
                    r12 = r0 & 1024(0x400, float:1.435E-42)
                    if (r12 == 0) goto L_0x005a
                    r12 = r2
                    goto L_0x005c
                L_0x005a:
                    r12 = r26
                L_0x005c:
                    r13 = r0 & 2048(0x800, float:2.87E-42)
                    if (r13 == 0) goto L_0x0062
                    r13 = r2
                    goto L_0x0064
                L_0x0062:
                    r13 = r27
                L_0x0064:
                    r14 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r14 == 0) goto L_0x006a
                    r14 = r2
                    goto L_0x006c
                L_0x006a:
                    r14 = r28
                L_0x006c:
                    r0 = r0 & 8192(0x2000, float:1.14794E-41)
                    if (r0 == 0) goto L_0x0071
                    goto L_0x0073
                L_0x0071:
                    r2 = r29
                L_0x0073:
                    r16 = r15
                    r17 = r1
                    r18 = r3
                    r19 = r4
                    r20 = r5
                    r21 = r6
                    r22 = r7
                    r23 = r8
                    r24 = r9
                    r25 = r10
                    r26 = r11
                    r27 = r12
                    r28 = r13
                    r29 = r14
                    r30 = r2
                    r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.AccountParams.BusinessTypeParams.Company.<init>(com.stripe.android.model.Address, com.stripe.android.model.AddressJapanParams, com.stripe.android.model.AddressJapanParams, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.model.AccountParams$BusinessTypeParams$Company$Verification, int, m0.n.b.f):void");
            }

            public static /* synthetic */ Company copy$default(Company company, Address address2, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Verification verification2, int i, Object obj) {
                Company company2 = company;
                int i2 = i;
                return company.copy((i2 & 1) != 0 ? company2.address : address2, (i2 & 2) != 0 ? company2.addressKana : addressJapanParams, (i2 & 4) != 0 ? company2.addressKanji : addressJapanParams2, (i2 & 8) != 0 ? company2.directorsProvided : bool, (i2 & 16) != 0 ? company2.executivesProvided : bool2, (i2 & 32) != 0 ? company2.name : str, (i2 & 64) != 0 ? company2.nameKana : str2, (i2 & 128) != 0 ? company2.nameKanji : str3, (i2 & 256) != 0 ? company2.ownersProvided : bool3, (i2 & 512) != 0 ? company2.phone : str4, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? company2.taxId : str5, (i2 & 2048) != 0 ? company2.taxIdRegistrar : str6, (i2 & 4096) != 0 ? company2.vatId : str7, (i2 & 8192) != 0 ? company2.verification : verification2);
            }

            public final Address component1() {
                return this.address;
            }

            public final String component10() {
                return this.phone;
            }

            public final String component11() {
                return this.taxId;
            }

            public final String component12() {
                return this.taxIdRegistrar;
            }

            public final String component13() {
                return this.vatId;
            }

            public final Verification component14() {
                return this.verification;
            }

            public final AddressJapanParams component2() {
                return this.addressKana;
            }

            public final AddressJapanParams component3() {
                return this.addressKanji;
            }

            public final Boolean component4() {
                return this.directorsProvided;
            }

            public final Boolean component5() {
                return this.executivesProvided;
            }

            public final String component6() {
                return this.name;
            }

            public final String component7() {
                return this.nameKana;
            }

            public final String component8() {
                return this.nameKanji;
            }

            public final Boolean component9() {
                return this.ownersProvided;
            }

            public final Company copy(Address address2, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Verification verification2) {
                return new Company(address2, addressJapanParams, addressJapanParams2, bool, bool2, str, str2, str3, bool3, str4, str5, str6, str7, verification2);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Company)) {
                    return false;
                }
                Company company = (Company) obj;
                return i.a(this.address, company.address) && i.a(this.addressKana, company.addressKana) && i.a(this.addressKanji, company.addressKanji) && i.a(this.directorsProvided, company.directorsProvided) && i.a(this.executivesProvided, company.executivesProvided) && i.a(this.name, company.name) && i.a(this.nameKana, company.nameKana) && i.a(this.nameKanji, company.nameKanji) && i.a(this.ownersProvided, company.ownersProvided) && i.a(this.phone, company.phone) && i.a(this.taxId, company.taxId) && i.a(this.taxIdRegistrar, company.taxIdRegistrar) && i.a(this.vatId, company.vatId) && i.a(this.verification, company.verification);
            }

            public final Address getAddress() {
                return this.address;
            }

            public final AddressJapanParams getAddressKana() {
                return this.addressKana;
            }

            public final AddressJapanParams getAddressKanji() {
                return this.addressKanji;
            }

            public final Boolean getDirectorsProvided() {
                return this.directorsProvided;
            }

            public final Boolean getExecutivesProvided() {
                return this.executivesProvided;
            }

            public final String getName() {
                return this.name;
            }

            public final String getNameKana() {
                return this.nameKana;
            }

            public final String getNameKanji() {
                return this.nameKanji;
            }

            public final Boolean getOwnersProvided() {
                return this.ownersProvided;
            }

            public List<Pair<String, Object>> getParamsList() {
                Pair[] pairArr = new Pair[14];
                Address address2 = this.address;
                Map<String, Object> map = null;
                pairArr[0] = new Pair("address", address2 != null ? address2.toParamMap() : null);
                AddressJapanParams addressJapanParams = this.addressKana;
                pairArr[1] = new Pair(PARAM_ADDRESS_KANA, addressJapanParams != null ? addressJapanParams.toParamMap() : null);
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                pairArr[2] = new Pair(PARAM_ADDRESS_KANJI, addressJapanParams2 != null ? addressJapanParams2.toParamMap() : null);
                pairArr[3] = new Pair(PARAM_DIRECTORS_PROVIDED, this.directorsProvided);
                pairArr[4] = new Pair(PARAM_EXECUTIVES_PROVIDED, this.executivesProvided);
                pairArr[5] = new Pair("name", this.name);
                pairArr[6] = new Pair(PARAM_NAME_KANA, this.nameKana);
                pairArr[7] = new Pair(PARAM_NAME_KANJI, this.nameKanji);
                pairArr[8] = new Pair(PARAM_OWNERS_PROVIDED, this.ownersProvided);
                pairArr[9] = new Pair("phone", this.phone);
                pairArr[10] = new Pair(PARAM_TAX_ID, this.taxId);
                pairArr[11] = new Pair(PARAM_TAX_ID_REGISTRAR, this.taxIdRegistrar);
                pairArr[12] = new Pair(PARAM_VAT_ID, this.vatId);
                Verification verification2 = this.verification;
                if (verification2 != null) {
                    map = verification2.toParamMap();
                }
                pairArr[13] = new Pair(PARAM_VERIFICATION, map);
                return g.K(pairArr);
            }

            public final String getPhone() {
                return this.phone;
            }

            public final String getTaxId() {
                return this.taxId;
            }

            public final String getTaxIdRegistrar() {
                return this.taxIdRegistrar;
            }

            public final String getVatId() {
                return this.vatId;
            }

            public final Verification getVerification() {
                return this.verification;
            }

            public int hashCode() {
                Address address2 = this.address;
                int i = 0;
                int hashCode = (address2 != null ? address2.hashCode() : 0) * 31;
                AddressJapanParams addressJapanParams = this.addressKana;
                int hashCode2 = (hashCode + (addressJapanParams != null ? addressJapanParams.hashCode() : 0)) * 31;
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                int hashCode3 = (hashCode2 + (addressJapanParams2 != null ? addressJapanParams2.hashCode() : 0)) * 31;
                Boolean bool = this.directorsProvided;
                int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
                Boolean bool2 = this.executivesProvided;
                int hashCode5 = (hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
                String str = this.name;
                int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
                String str2 = this.nameKana;
                int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.nameKanji;
                int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
                Boolean bool3 = this.ownersProvided;
                int hashCode9 = (hashCode8 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
                String str4 = this.phone;
                int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
                String str5 = this.taxId;
                int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 31;
                String str6 = this.taxIdRegistrar;
                int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 31;
                String str7 = this.vatId;
                int hashCode13 = (hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 31;
                Verification verification2 = this.verification;
                if (verification2 != null) {
                    i = verification2.hashCode();
                }
                return hashCode13 + i;
            }

            public final void setAddress(Address address2) {
                this.address = address2;
            }

            public final void setAddressKana(AddressJapanParams addressJapanParams) {
                this.addressKana = addressJapanParams;
            }

            public final void setAddressKanji(AddressJapanParams addressJapanParams) {
                this.addressKanji = addressJapanParams;
            }

            public final void setDirectorsProvided(Boolean bool) {
                this.directorsProvided = bool;
            }

            public final void setExecutivesProvided(Boolean bool) {
                this.executivesProvided = bool;
            }

            public final void setName(String str) {
                this.name = str;
            }

            public final void setNameKana(String str) {
                this.nameKana = str;
            }

            public final void setNameKanji(String str) {
                this.nameKanji = str;
            }

            public final void setOwnersProvided(Boolean bool) {
                this.ownersProvided = bool;
            }

            public final void setPhone(String str) {
                this.phone = str;
            }

            public final void setTaxId(String str) {
                this.taxId = str;
            }

            public final void setTaxIdRegistrar(String str) {
                this.taxIdRegistrar = str;
            }

            public final void setVatId(String str) {
                this.vatId = str;
            }

            public final void setVerification(Verification verification2) {
                this.verification = verification2;
            }

            public String toString() {
                StringBuilder P0 = a.P0("Company(address=");
                P0.append(this.address);
                P0.append(", addressKana=");
                P0.append(this.addressKana);
                P0.append(", addressKanji=");
                P0.append(this.addressKanji);
                P0.append(", directorsProvided=");
                P0.append(this.directorsProvided);
                P0.append(", executivesProvided=");
                P0.append(this.executivesProvided);
                P0.append(", name=");
                P0.append(this.name);
                P0.append(", nameKana=");
                P0.append(this.nameKana);
                P0.append(", nameKanji=");
                P0.append(this.nameKanji);
                P0.append(", ownersProvided=");
                P0.append(this.ownersProvided);
                P0.append(", phone=");
                P0.append(this.phone);
                P0.append(", taxId=");
                P0.append(this.taxId);
                P0.append(", taxIdRegistrar=");
                P0.append(this.taxIdRegistrar);
                P0.append(", vatId=");
                P0.append(this.vatId);
                P0.append(", verification=");
                P0.append(this.verification);
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                Address address2 = this.address;
                if (address2 != null) {
                    parcel.writeInt(1);
                    address2.writeToParcel(parcel, 0);
                } else {
                    parcel.writeInt(0);
                }
                AddressJapanParams addressJapanParams = this.addressKana;
                if (addressJapanParams != null) {
                    parcel.writeInt(1);
                    addressJapanParams.writeToParcel(parcel, 0);
                } else {
                    parcel.writeInt(0);
                }
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                if (addressJapanParams2 != null) {
                    parcel.writeInt(1);
                    addressJapanParams2.writeToParcel(parcel, 0);
                } else {
                    parcel.writeInt(0);
                }
                Boolean bool = this.directorsProvided;
                if (bool != null) {
                    parcel.writeInt(1);
                    parcel.writeInt(bool.booleanValue() ? 1 : 0);
                } else {
                    parcel.writeInt(0);
                }
                Boolean bool2 = this.executivesProvided;
                if (bool2 != null) {
                    parcel.writeInt(1);
                    parcel.writeInt(bool2.booleanValue() ? 1 : 0);
                } else {
                    parcel.writeInt(0);
                }
                parcel.writeString(this.name);
                parcel.writeString(this.nameKana);
                parcel.writeString(this.nameKanji);
                Boolean bool3 = this.ownersProvided;
                if (bool3 != null) {
                    parcel.writeInt(1);
                    parcel.writeInt(bool3.booleanValue() ? 1 : 0);
                } else {
                    parcel.writeInt(0);
                }
                parcel.writeString(this.phone);
                parcel.writeString(this.taxId);
                parcel.writeString(this.taxIdRegistrar);
                parcel.writeString(this.vatId);
                Verification verification2 = this.verification;
                if (verification2 != null) {
                    parcel.writeInt(1);
                    verification2.writeToParcel(parcel, 0);
                    return;
                }
                parcel.writeInt(0);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Company(Address address2, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Verification verification2) {
                super(BusinessType.Company, (f) null);
                this.address = address2;
                this.addressKana = addressJapanParams;
                this.addressKanji = addressJapanParams2;
                this.directorsProvided = bool;
                this.executivesProvided = bool2;
                this.name = str;
                this.nameKana = str2;
                this.nameKanji = str3;
                this.ownersProvided = bool3;
                this.phone = str4;
                this.taxId = str5;
                this.taxIdRegistrar = str6;
                this.vatId = str7;
                this.verification = verification2;
            }
        }

        public /* synthetic */ BusinessTypeParams(BusinessType businessType, f fVar) {
            this(businessType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0007\u0010\u000eJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/AccountParams$Companion;", "", "", "tosShownAndAccepted", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "individual", "Lcom/stripe/android/model/AccountParams;", "create", "(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;)Lcom/stripe/android/model/AccountParams;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "company", "(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;)Lcom/stripe/android/model/AccountParams;", "Lcom/stripe/android/model/AccountParams$BusinessType;", "businessType", "(ZLcom/stripe/android/model/AccountParams$BusinessType;)Lcom/stripe/android/model/AccountParams;", "(Z)Lcom/stripe/android/model/AccountParams;", "", "PARAM_BUSINESS_TYPE", "Ljava/lang/String;", "PARAM_TOS_SHOWN_AND_ACCEPTED", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AccountParams.kt */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                BusinessType.values();
                int[] iArr = new int[2];
                $EnumSwitchMapping$0 = iArr;
                iArr[BusinessType.Individual.ordinal()] = 1;
                iArr[BusinessType.Company.ordinal()] = 2;
            }
        }

        private Companion() {
        }

        public final AccountParams create(boolean z, BusinessTypeParams.Individual individual) {
            i.e(individual, "individual");
            return new AccountParams(z, individual);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final AccountParams create(boolean z, BusinessTypeParams.Company company) {
            i.e(company, "company");
            return new AccountParams(z, company);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.stripe.android.model.AccountParams$BusinessTypeParams$Company} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.stripe.android.model.AccountParams$BusinessTypeParams$Individual} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.stripe.android.model.AccountParams$BusinessTypeParams$Company} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.stripe.android.model.AccountParams$BusinessTypeParams$Company} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.stripe.android.model.AccountParams create(boolean r24, com.stripe.android.model.AccountParams.BusinessType r25) {
            /*
                r23 = this;
                java.lang.String r0 = "businessType"
                r1 = r25
                m0.n.b.i.e(r1, r0)
                com.stripe.android.model.AccountParams r0 = new com.stripe.android.model.AccountParams
                int r1 = r25.ordinal()
                if (r1 == 0) goto L_0x0033
                r2 = 1
                if (r1 != r2) goto L_0x002d
                com.stripe.android.model.AccountParams$BusinessTypeParams$Company r1 = new com.stripe.android.model.AccountParams$BusinessTypeParams$Company
                r3 = r1
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 16383(0x3fff, float:2.2957E-41)
                r19 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                goto L_0x0055
            L_0x002d:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            L_0x0033:
                com.stripe.android.model.AccountParams$BusinessTypeParams$Individual r22 = new com.stripe.android.model.AccountParams$BusinessTypeParams$Individual
                r1 = r22
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 262143(0x3ffff, float:3.6734E-40)
                r21 = 0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            L_0x0055:
                r2 = r24
                r0.<init>(r2, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.AccountParams.Companion.create(boolean, com.stripe.android.model.AccountParams$BusinessType):com.stripe.android.model.AccountParams");
        }

        public final AccountParams create(boolean z) {
            return new AccountParams(z, (BusinessTypeParams) null, 2, (f) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<AccountParams> {
        public final AccountParams createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new AccountParams(parcel.readInt() != 0, (BusinessTypeParams) parcel.readParcelable(AccountParams.class.getClassLoader()));
        }

        public final AccountParams[] newArray(int i) {
            return new AccountParams[i];
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountParams(boolean z, BusinessTypeParams businessTypeParams2, int i, f fVar) {
        this(z, (i & 2) != 0 ? null : businessTypeParams2);
    }

    private final boolean component1() {
        return this.tosShownAndAccepted;
    }

    private final BusinessTypeParams component2() {
        return this.businessTypeParams;
    }

    public static /* synthetic */ AccountParams copy$default(AccountParams accountParams, boolean z, BusinessTypeParams businessTypeParams2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accountParams.tosShownAndAccepted;
        }
        if ((i & 2) != 0) {
            businessTypeParams2 = accountParams.businessTypeParams;
        }
        return accountParams.copy(z, businessTypeParams2);
    }

    public static final AccountParams create(boolean z) {
        return Companion.create(z);
    }

    public static final AccountParams create(boolean z, BusinessType businessType) {
        return Companion.create(z, businessType);
    }

    public static final AccountParams create(boolean z, BusinessTypeParams.Company company) {
        return Companion.create(z, company);
    }

    public static final AccountParams create(boolean z, BusinessTypeParams.Individual individual) {
        return Companion.create(z, individual);
    }

    public final AccountParams copy(boolean z, BusinessTypeParams businessTypeParams2) {
        return new AccountParams(z, businessTypeParams2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountParams)) {
            return false;
        }
        AccountParams accountParams = (AccountParams) obj;
        return this.tosShownAndAccepted == accountParams.tosShownAndAccepted && i.a(this.businessTypeParams, accountParams.businessTypeParams);
    }

    public Map<String, Object> getTypeDataParams() {
        Map map;
        Map S2 = h.S2(new Pair(PARAM_TOS_SHOWN_AND_ACCEPTED, Boolean.valueOf(this.tosShownAndAccepted)));
        BusinessTypeParams businessTypeParams2 = this.businessTypeParams;
        if (businessTypeParams2 != null) {
            map = g.N(new Pair(PARAM_BUSINESS_TYPE, businessTypeParams2.getType$payments_core_release().getCode()), new Pair(businessTypeParams2.getType$payments_core_release().getCode(), businessTypeParams2.toParamMap()));
        } else {
            map = null;
        }
        if (map == null) {
            map = g.o();
        }
        return g.b0(S2, map);
    }

    public int hashCode() {
        boolean z = this.tosShownAndAccepted;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        BusinessTypeParams businessTypeParams2 = this.businessTypeParams;
        return i + (businessTypeParams2 != null ? businessTypeParams2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("AccountParams(tosShownAndAccepted=");
        P0.append(this.tosShownAndAccepted);
        P0.append(", businessTypeParams=");
        P0.append(this.businessTypeParams);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeInt(this.tosShownAndAccepted ? 1 : 0);
        parcel.writeParcelable(this.businessTypeParams, i);
    }

    public AccountParams(boolean z, BusinessTypeParams businessTypeParams2) {
        super(Token.Type.Account, (Set) null, 2, (f) null);
        this.tosShownAndAccepted = z;
        this.businessTypeParams = businessTypeParams2;
    }
}
