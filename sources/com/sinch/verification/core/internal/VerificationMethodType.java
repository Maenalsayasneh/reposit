package com.sinch.verification.core.internal;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.i.d;

@e
/* compiled from: VerificationMethodType.kt */
public enum VerificationMethodType {
    SMS("sms"),
    FLASHCALL("flashCall"),
    CALLOUT("callout"),
    SEAMLESS("seamless"),
    AUTO("auto");
    
    public static final Companion Companion = null;
    /* access modifiers changed from: private */
    public static final SerialDescriptor descriptor = null;
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/sinch/verification/core/internal/VerificationMethodType$Companion;", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/verification/core/internal/VerificationMethodType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: VerificationMethodType.kt */
    public static final class Companion implements KSerializer<VerificationMethodType> {
        public Companion() {
        }

        public Object deserialize(Decoder decoder) {
            i.e(decoder, "decoder");
            String n = decoder.n();
            Locale locale = Locale.ROOT;
            i.d(locale, "Locale.ROOT");
            Objects.requireNonNull(n, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = n.toLowerCase(locale);
            i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            VerificationMethodType verificationMethodType = VerificationMethodType.SMS;
            String value = verificationMethodType.getValue();
            i.d(locale, "Locale.ROOT");
            Objects.requireNonNull(value, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = value.toLowerCase(locale);
            i.d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            if (!i.a(lowerCase, lowerCase2)) {
                verificationMethodType = VerificationMethodType.FLASHCALL;
                String value2 = verificationMethodType.getValue();
                i.d(locale, "Locale.ROOT");
                Objects.requireNonNull(value2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase3 = value2.toLowerCase(locale);
                i.d(lowerCase3, "(this as java.lang.String).toLowerCase(locale)");
                if (!i.a(lowerCase, lowerCase3)) {
                    verificationMethodType = VerificationMethodType.CALLOUT;
                    String value3 = verificationMethodType.getValue();
                    i.d(locale, "Locale.ROOT");
                    Objects.requireNonNull(value3, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase4 = value3.toLowerCase(locale);
                    i.d(lowerCase4, "(this as java.lang.String).toLowerCase(locale)");
                    if (!i.a(lowerCase, lowerCase4)) {
                        verificationMethodType = VerificationMethodType.SEAMLESS;
                        String value4 = verificationMethodType.getValue();
                        i.d(locale, "Locale.ROOT");
                        Objects.requireNonNull(value4, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase5 = value4.toLowerCase(locale);
                        i.d(lowerCase5, "(this as java.lang.String).toLowerCase(locale)");
                        if (!i.a(lowerCase, lowerCase5)) {
                            verificationMethodType = VerificationMethodType.AUTO;
                            String value5 = verificationMethodType.getValue();
                            i.d(locale, "Locale.ROOT");
                            Objects.requireNonNull(value5, "null cannot be cast to non-null type java.lang.String");
                            String lowerCase6 = value5.toLowerCase(locale);
                            i.d(lowerCase6, "(this as java.lang.String).toLowerCase(locale)");
                            if (!i.a(lowerCase, lowerCase6)) {
                                StringBuilder P0 = a.P0("Unknown element ");
                                P0.append(decoder.n());
                                throw new SerializationException(P0.toString());
                            }
                        }
                    }
                }
            }
            return verificationMethodType;
        }

        public SerialDescriptor getDescriptor() {
            return VerificationMethodType.descriptor;
        }

        public void serialize(Encoder encoder, Object obj) {
            VerificationMethodType verificationMethodType = (VerificationMethodType) obj;
            i.e(encoder, "encoder");
            i.e(verificationMethodType, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            encoder.F(verificationMethodType.getValue());
        }

        public final KSerializer<VerificationMethodType> serializer() {
            return VerificationMethodType.Companion;
        }

        public Companion(f fVar) {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((f) null);
        descriptor = m0.r.t.a.r.m.a1.a.w("VerificationMethodType", d.i.a);
    }

    private VerificationMethodType(String str) {
        this.value = str;
    }

    public final boolean getAllowsManualVerification() {
        return this != SEAMLESS;
    }

    public final String getValue() {
        return this.value;
    }
}
