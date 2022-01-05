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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\b\u0018\u0000 f2\u00020\u0001:\u0005gfhijB÷\u0001\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bd\u0010eJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000eJ\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u000eJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u000eJ\u0012\u0010!\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0002\u00106\u001a\u00020\u00002\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\n\b\u0002\u00102\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00105\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b8\u0010\u000eJ\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u000209HÖ\u0001¢\u0006\u0004\bA\u0010;J \u0010F\u001a\u00020E2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u000209HÖ\u0001¢\u0006\u0004\bF\u0010GR'\u00101\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010H\u001a\u0004\bI\u0010\u001aR\"\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020<0\u00188V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u001aR\u001b\u0010)\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010L\u001a\u0004\bM\u0010\u000eR\u001b\u0010$\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010N\u001a\u0004\bO\u0010\u0007R\u001b\u0010'\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010L\u001a\u0004\bP\u0010\u000eR\u001b\u00100\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010L\u001a\u0004\bQ\u0010\u000eR\u001b\u0010.\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010L\u001a\u0004\bR\u0010\u000eR\u001b\u0010(\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010L\u001a\u0004\bS\u0010\u000eR\u001b\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010T\u001a\u0004\bU\u0010\u0004R\u001b\u0010*\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010L\u001a\u0004\bV\u0010\u000eR\u001b\u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010N\u001a\u0004\bW\u0010\u0007R\u001b\u00102\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010L\u001a\u0004\bX\u0010\u000eR\u001b\u0010,\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010L\u001a\u0004\bY\u0010\u000eR\u001b\u00104\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010L\u001a\u0004\bZ\u0010\u000eR\u001b\u0010-\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010L\u001a\u0004\b[\u0010\u000eR\u001b\u00105\u001a\u0004\u0018\u00010 8\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010\\\u001a\u0004\b]\u0010\"R\u001b\u00103\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010^\u001a\u0004\b_\u0010\u001eR\u001b\u0010&\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010`\u001a\u0004\ba\u0010\u000bR\u001b\u0010+\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010L\u001a\u0004\bb\u0010\u000eR\u001b\u0010/\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010L\u001a\u0004\bc\u0010\u000e¨\u0006k"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams;", "Lcom/stripe/android/model/TokenParams;", "Lcom/stripe/android/model/Address;", "component1", "()Lcom/stripe/android/model/Address;", "Lcom/stripe/android/model/AddressJapanParams;", "component2", "()Lcom/stripe/android/model/AddressJapanParams;", "component3", "Lcom/stripe/android/model/DateOfBirth;", "component4", "()Lcom/stripe/android/model/DateOfBirth;", "", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "", "component15", "()Ljava/util/Map;", "component16", "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "component17", "()Lcom/stripe/android/model/PersonTokenParams$Relationship;", "component18", "Lcom/stripe/android/model/PersonTokenParams$Verification;", "component19", "()Lcom/stripe/android/model/PersonTokenParams$Verification;", "address", "addressKana", "addressKanji", "dateOfBirth", "email", "firstName", "firstNameKana", "firstNameKanji", "gender", "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", "metadata", "phone", "relationship", "ssnLast4", "verification", "copy", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/DateOfBirth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/model/PersonTokenParams$Relationship;Ljava/lang/String;Lcom/stripe/android/model/PersonTokenParams$Verification;)Lcom/stripe/android/model/PersonTokenParams;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getMetadata", "getTypeDataParams", "typeDataParams", "Ljava/lang/String;", "getFirstNameKana", "Lcom/stripe/android/model/AddressJapanParams;", "getAddressKana", "getEmail", "getMaidenName", "getLastNameKana", "getFirstName", "Lcom/stripe/android/model/Address;", "getAddress", "getFirstNameKanji", "getAddressKanji", "getPhone", "getIdNumber", "getSsnLast4", "getLastName", "Lcom/stripe/android/model/PersonTokenParams$Verification;", "getVerification", "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "getRelationship", "Lcom/stripe/android/model/DateOfBirth;", "getDateOfBirth", "getGender", "getLastNameKanji", "<init>", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/DateOfBirth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/model/PersonTokenParams$Relationship;Ljava/lang/String;Lcom/stripe/android/model/PersonTokenParams$Verification;)V", "Companion", "Builder", "Document", "Relationship", "Verification", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PersonTokenParams.kt */
public final class PersonTokenParams extends TokenParams {
    public static final Parcelable.Creator<PersonTokenParams> CREATOR = new Creator();
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
    private static final String PARAM_PERSON = "person";
    @Deprecated
    private static final String PARAM_PHONE = "phone";
    @Deprecated
    private static final String PARAM_RELATIONSHIP = "relationship";
    @Deprecated
    private static final String PARAM_SSN_LAST_4 = "ssn_last_4";
    @Deprecated
    private static final String PARAM_VERIFICATION = "verification";
    private final Address address;
    private final AddressJapanParams addressKana;
    private final AddressJapanParams addressKanji;
    private final DateOfBirth dateOfBirth;
    private final String email;
    private final String firstName;
    private final String firstNameKana;
    private final String firstNameKanji;
    private final String gender;
    private final String idNumber;
    private final String lastName;
    private final String lastNameKana;
    private final String lastNameKanji;
    private final String maidenName;
    private final Map<String, String> metadata;
    private final String phone;
    private final Relationship relationship;
    private final String ssnLast4;
    private final Verification verification;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b@\u0010AJ\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001e\u0010\u0014J\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b \u0010\u0014J\u0017\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b$\u0010\u0014J\u0017\u0010&\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b&\u0010\u0014J#\u0010)\u001a\u00020\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b,\u0010\u0014J\u0017\u0010/\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b2\u0010\u0014J\u0017\u00105\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0002H\u0016¢\u0006\u0004\b7\u00108R\u0018\u0010!\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u00109R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010:R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u00109R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u00109R$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010;R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010<R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010<R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010=R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u00109R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u0010>R\u0018\u0010+\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u00109R\u0018\u0010%\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u00109R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010?R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u00109R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u00109R\u0018\u00101\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00109R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u00109R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u00109R\u0018\u0010#\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u00109¨\u0006B"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PersonTokenParams;", "Lcom/stripe/android/model/Address;", "address", "setAddress", "(Lcom/stripe/android/model/Address;)Lcom/stripe/android/model/PersonTokenParams$Builder;", "Lcom/stripe/android/model/AddressJapanParams;", "addressKana", "setAddressKana", "(Lcom/stripe/android/model/AddressJapanParams;)Lcom/stripe/android/model/PersonTokenParams$Builder;", "addressKanji", "setAddressKanji", "Lcom/stripe/android/model/DateOfBirth;", "dateOfBirth", "setDateOfBirth", "(Lcom/stripe/android/model/DateOfBirth;)Lcom/stripe/android/model/PersonTokenParams$Builder;", "", "email", "setEmail", "(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;", "firstName", "setFirstName", "firstNameKana", "setFirstNameKana", "firstNameKanji", "setFirstNameKanji", "gender", "setGender", "idNumber", "setIdNumber", "lastName", "setLastName", "lastNameKana", "setLastNameKana", "lastNameKanji", "setLastNameKanji", "maidenName", "setMaidenName", "", "metadata", "setMetadata", "(Ljava/util/Map;)Lcom/stripe/android/model/PersonTokenParams$Builder;", "phone", "setPhone", "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "relationship", "setRelationship", "(Lcom/stripe/android/model/PersonTokenParams$Relationship;)Lcom/stripe/android/model/PersonTokenParams$Builder;", "ssnLast4", "setSsnLast4", "Lcom/stripe/android/model/PersonTokenParams$Verification;", "verification", "setVerification", "(Lcom/stripe/android/model/PersonTokenParams$Verification;)Lcom/stripe/android/model/PersonTokenParams$Builder;", "build", "()Lcom/stripe/android/model/PersonTokenParams;", "Ljava/lang/String;", "Lcom/stripe/android/model/Address;", "Ljava/util/Map;", "Lcom/stripe/android/model/AddressJapanParams;", "Lcom/stripe/android/model/DateOfBirth;", "Lcom/stripe/android/model/PersonTokenParams$Verification;", "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PersonTokenParams.kt */
    public static final class Builder implements ObjectBuilder<PersonTokenParams> {
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
        private Relationship relationship;
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

        public final Builder setRelationship(Relationship relationship2) {
            this.relationship = relationship2;
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

        public PersonTokenParams build() {
            return new PersonTokenParams(this.address, this.addressKana, this.addressKanji, this.dateOfBirth, this.email, this.firstName, this.firstNameKana, this.firstNameKanji, this.gender, this.idNumber, this.lastName, this.lastNameKana, this.lastNameKanji, this.maidenName, this.metadata, this.phone, this.relationship, this.ssnLast4, this.verification);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Companion;", "", "", "PARAM_ADDRESS", "Ljava/lang/String;", "PARAM_ADDRESS_KANA", "PARAM_ADDRESS_KANJI", "PARAM_DOB", "PARAM_EMAIL", "PARAM_FIRST_NAME", "PARAM_FIRST_NAME_KANA", "PARAM_FIRST_NAME_KANJI", "PARAM_GENDER", "PARAM_ID_NUMBER", "PARAM_LAST_NAME", "PARAM_LAST_NAME_KANA", "PARAM_LAST_NAME_KANJI", "PARAM_MAIDEN_NAME", "PARAM_METADATA", "PARAM_PERSON", "PARAM_PHONE", "PARAM_RELATIONSHIP", "PARAM_SSN_LAST_4", "PARAM_VERIFICATION", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PersonTokenParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<PersonTokenParams> {
        public final PersonTokenParams createFromParcel(Parcel parcel) {
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
            return new PersonTokenParams(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, readString, readString2, readString3, readString4, readString5, readString6, str, str2, readString9, readString10, linkedHashMap, parcel.readString(), parcel.readInt() != 0 ? Relationship.CREATOR.createFromParcel(parcel2) : null, parcel.readString(), parcel.readInt() != 0 ? Verification.CREATOR.createFromParcel(parcel2) : null);
        }

        public final PersonTokenParams[] newArray(int i) {
            return new PersonTokenParams[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B!\b\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b \u0010\t¨\u0006$"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Document;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "front", "back", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Document;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBack", "getFront", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PersonTokenParams.kt */
    public static final class Document implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Document> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_BACK = "back";
        @Deprecated
        private static final String PARAM_FRONT = "front";
        private final String back;
        private final String front;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Document$Companion;", "", "", "PARAM_BACK", "Ljava/lang/String;", "PARAM_FRONT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PersonTokenParams.kt */
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

        public static /* synthetic */ Document copy$default(Document document, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = document.front;
            }
            if ((i & 2) != 0) {
                str2 = document.back;
            }
            return document.copy(str, str2);
        }

        public final String component1() {
            return this.front;
        }

        public final String component2() {
            return this.back;
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

        public final String getBack() {
            return this.back;
        }

        public final String getFront() {
            return this.front;
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
            List<Pair> K = g.K(new Pair(PARAM_BACK, this.back), new Pair(PARAM_FRONT, this.front));
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u000243BO\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b1\u00102J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JX\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010\nR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b+\u0010\u0012R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\b,\u0010\nR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b-\u0010\nR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b/\u0010\u000fR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b0\u0010\n¨\u00065"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Relationship;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "()Ljava/lang/String;", "director", "executive", "owner", "percentOwnership", "representative", "title", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Relationship;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getOwner", "Ljava/lang/String;", "getTitle", "getRepresentative", "getDirector", "Ljava/lang/Integer;", "getPercentOwnership", "getExecutive", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PersonTokenParams.kt */
    public static final class Relationship implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Relationship> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_DIRECTOR = "director";
        @Deprecated
        private static final String PARAM_EXECUTIVE = "executive";
        @Deprecated
        private static final String PARAM_OWNER = "owner";
        @Deprecated
        private static final String PARAM_PERCENT_OWNERSHIP = "percent_ownership";
        @Deprecated
        private static final String PARAM_REPRESENTATIVE = "representative";
        @Deprecated
        private static final String PARAM_TITLE = "title";
        private final Boolean director;
        private final Boolean executive;
        private final Boolean owner;
        private final Integer percentOwnership;
        private final Boolean representative;
        private final String title;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "", "director", "setDirector", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "executive", "setExecutive", "owner", "setOwner", "", "percentOwnership", "setPercentOwnership", "(Ljava/lang/Integer;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "representative", "setRepresentative", "", "title", "setTitle", "(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "build", "()Lcom/stripe/android/model/PersonTokenParams$Relationship;", "Ljava/lang/Integer;", "Ljava/lang/Boolean;", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PersonTokenParams.kt */
        public static final class Builder implements ObjectBuilder<Relationship> {
            private Boolean director;
            private Boolean executive;
            private Boolean owner;
            private Integer percentOwnership;
            private Boolean representative;
            private String title;

            public final Builder setDirector(Boolean bool) {
                this.director = bool;
                return this;
            }

            public final Builder setExecutive(Boolean bool) {
                this.executive = bool;
                return this;
            }

            public final Builder setOwner(Boolean bool) {
                this.owner = bool;
                return this;
            }

            public final Builder setPercentOwnership(Integer num) {
                this.percentOwnership = num;
                return this;
            }

            public final Builder setRepresentative(Boolean bool) {
                this.representative = bool;
                return this;
            }

            public final Builder setTitle(String str) {
                this.title = str;
                return this;
            }

            public Relationship build() {
                return new Relationship(this.director, this.executive, this.owner, this.percentOwnership, this.representative, this.title);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Relationship$Companion;", "", "", "PARAM_DIRECTOR", "Ljava/lang/String;", "PARAM_EXECUTIVE", "PARAM_OWNER", "PARAM_PERCENT_OWNERSHIP", "PARAM_REPRESENTATIVE", "PARAM_TITLE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PersonTokenParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Relationship> {
            public final Relationship createFromParcel(Parcel parcel) {
                Boolean bool;
                Boolean bool2;
                Boolean bool3;
                Boolean bool4;
                i.e(parcel, "in");
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
                if (parcel.readInt() != 0) {
                    bool3 = Boolean.valueOf(parcel.readInt() != 0);
                } else {
                    bool3 = null;
                }
                Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    bool4 = Boolean.valueOf(z);
                } else {
                    bool4 = null;
                }
                return new Relationship(bool, bool2, bool3, valueOf, bool4, parcel.readString());
            }

            public final Relationship[] newArray(int i) {
                return new Relationship[i];
            }
        }

        public Relationship() {
            this((Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (String) null, 63, (f) null);
        }

        public Relationship(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str) {
            this.director = bool;
            this.executive = bool2;
            this.owner = bool3;
            this.percentOwnership = num;
            this.representative = bool4;
            this.title = str;
        }

        public static /* synthetic */ Relationship copy$default(Relationship relationship, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = relationship.director;
            }
            if ((i & 2) != 0) {
                bool2 = relationship.executive;
            }
            Boolean bool5 = bool2;
            if ((i & 4) != 0) {
                bool3 = relationship.owner;
            }
            Boolean bool6 = bool3;
            if ((i & 8) != 0) {
                num = relationship.percentOwnership;
            }
            Integer num2 = num;
            if ((i & 16) != 0) {
                bool4 = relationship.representative;
            }
            Boolean bool7 = bool4;
            if ((i & 32) != 0) {
                str = relationship.title;
            }
            return relationship.copy(bool, bool5, bool6, num2, bool7, str);
        }

        public final Boolean component1() {
            return this.director;
        }

        public final Boolean component2() {
            return this.executive;
        }

        public final Boolean component3() {
            return this.owner;
        }

        public final Integer component4() {
            return this.percentOwnership;
        }

        public final Boolean component5() {
            return this.representative;
        }

        public final String component6() {
            return this.title;
        }

        public final Relationship copy(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str) {
            return new Relationship(bool, bool2, bool3, num, bool4, str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Relationship)) {
                return false;
            }
            Relationship relationship = (Relationship) obj;
            return i.a(this.director, relationship.director) && i.a(this.executive, relationship.executive) && i.a(this.owner, relationship.owner) && i.a(this.percentOwnership, relationship.percentOwnership) && i.a(this.representative, relationship.representative) && i.a(this.title, relationship.title);
        }

        public final Boolean getDirector() {
            return this.director;
        }

        public final Boolean getExecutive() {
            return this.executive;
        }

        public final Boolean getOwner() {
            return this.owner;
        }

        public final Integer getPercentOwnership() {
            return this.percentOwnership;
        }

        public final Boolean getRepresentative() {
            return this.representative;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Boolean bool = this.director;
            int i = 0;
            int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
            Boolean bool2 = this.executive;
            int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.owner;
            int hashCode3 = (hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Integer num = this.percentOwnership;
            int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
            Boolean bool4 = this.representative;
            int hashCode5 = (hashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            String str = this.title;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode5 + i;
        }

        public Map<String, Object> toParamMap() {
            List<Pair> K = g.K(new Pair(PARAM_DIRECTOR, this.director), new Pair(PARAM_EXECUTIVE, this.executive), new Pair(PARAM_OWNER, this.owner), new Pair(PARAM_PERCENT_OWNERSHIP, this.percentOwnership), new Pair(PARAM_REPRESENTATIVE, this.representative), new Pair("title", this.title));
            Map<String, Object> o = g.o();
            for (Pair pair : K) {
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

        public String toString() {
            StringBuilder P0 = a.P0("Relationship(director=");
            P0.append(this.director);
            P0.append(", executive=");
            P0.append(this.executive);
            P0.append(", owner=");
            P0.append(this.owner);
            P0.append(", percentOwnership=");
            P0.append(this.percentOwnership);
            P0.append(", representative=");
            P0.append(this.representative);
            P0.append(", title=");
            return a.y0(P0, this.title, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            Boolean bool = this.director;
            if (bool != null) {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            } else {
                parcel.writeInt(0);
            }
            Boolean bool2 = this.executive;
            if (bool2 != null) {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            } else {
                parcel.writeInt(0);
            }
            Boolean bool3 = this.owner;
            if (bool3 != null) {
                parcel.writeInt(1);
                parcel.writeInt(bool3.booleanValue() ? 1 : 0);
            } else {
                parcel.writeInt(0);
            }
            Integer num = this.percentOwnership;
            if (num != null) {
                a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
            Boolean bool4 = this.representative;
            if (bool4 != null) {
                parcel.writeInt(1);
                parcel.writeInt(bool4.booleanValue() ? 1 : 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.title);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Relationship(java.lang.Boolean r6, java.lang.Boolean r7, java.lang.Boolean r8, java.lang.Integer r9, java.lang.Boolean r10, java.lang.String r11, int r12, m0.n.b.f r13) {
            /*
                r5 = this;
                r13 = r12 & 1
                r0 = 0
                if (r13 == 0) goto L_0x0007
                r13 = r0
                goto L_0x0008
            L_0x0007:
                r13 = r6
            L_0x0008:
                r6 = r12 & 2
                if (r6 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r7
            L_0x000f:
                r6 = r12 & 4
                if (r6 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r8
            L_0x0016:
                r6 = r12 & 8
                if (r6 == 0) goto L_0x001c
                r3 = r0
                goto L_0x001d
            L_0x001c:
                r3 = r9
            L_0x001d:
                r6 = r12 & 16
                if (r6 == 0) goto L_0x0023
                r4 = r0
                goto L_0x0024
            L_0x0023:
                r4 = r10
            L_0x0024:
                r6 = r12 & 32
                if (r6 == 0) goto L_0x002a
                r12 = r0
                goto L_0x002b
            L_0x002a:
                r12 = r11
            L_0x002b:
                r6 = r5
                r7 = r13
                r8 = r1
                r9 = r2
                r10 = r3
                r11 = r4
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.PersonTokenParams.Relationship.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.String, int, m0.n.b.f):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B!\b\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b#\u0010$J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ(\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\nR\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b\"\u0010\n¨\u0006&"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Verification;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "Lcom/stripe/android/model/PersonTokenParams$Document;", "component1", "()Lcom/stripe/android/model/PersonTokenParams$Document;", "component2", "document", "additionalDocument", "copy", "(Lcom/stripe/android/model/PersonTokenParams$Document;Lcom/stripe/android/model/PersonTokenParams$Document;)Lcom/stripe/android/model/PersonTokenParams$Verification;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/PersonTokenParams$Document;", "getDocument", "getAdditionalDocument", "<init>", "(Lcom/stripe/android/model/PersonTokenParams$Document;Lcom/stripe/android/model/PersonTokenParams$Document;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PersonTokenParams.kt */
    public static final class Verification implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Verification> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_ADDITIONAL_DOCUMENT = "additional_document";
        @Deprecated
        private static final String PARAM_DOCUMENT = "document";
        private final Document additionalDocument;
        private final Document document;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Verification$Companion;", "", "", "PARAM_ADDITIONAL_DOCUMENT", "Ljava/lang/String;", "PARAM_DOCUMENT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PersonTokenParams.kt */
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

        public Map<String, Object> toParamMap() {
            Pair[] pairArr = new Pair[2];
            Document document2 = this.document;
            pairArr[0] = new Pair(PARAM_ADDITIONAL_DOCUMENT, document2 != null ? document2.toParamMap() : null);
            Document document3 = this.additionalDocument;
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

    public PersonTokenParams() {
        this((Address) null, (AddressJapanParams) null, (AddressJapanParams) null, (DateOfBirth) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, (String) null, (Relationship) null, (String) null, (Verification) null, 524287, (f) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PersonTokenParams(com.stripe.android.model.Address r21, com.stripe.android.model.AddressJapanParams r22, com.stripe.android.model.AddressJapanParams r23, com.stripe.android.model.DateOfBirth r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.util.Map r35, java.lang.String r36, com.stripe.android.model.PersonTokenParams.Relationship r37, java.lang.String r38, com.stripe.android.model.PersonTokenParams.Verification r39, int r40, m0.n.b.f r41) {
        /*
            r20 = this;
            r0 = r40
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r21
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r22
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r23
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r24
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r25
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r26
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r27
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r28
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r29
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r30
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r31
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r32
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r33
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r34
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r35
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r36
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r37
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r38
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r19
            if (r0 == 0) goto L_0x00a4
            r0 = 0
            goto L_0x00a6
        L_0x00a4:
            r0 = r39
        L_0x00a6:
            r21 = r20
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r15
            r36 = r2
            r37 = r16
            r38 = r17
            r39 = r18
            r40 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.PersonTokenParams.<init>(com.stripe.android.model.Address, com.stripe.android.model.AddressJapanParams, com.stripe.android.model.AddressJapanParams, com.stripe.android.model.DateOfBirth, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, com.stripe.android.model.PersonTokenParams$Relationship, java.lang.String, com.stripe.android.model.PersonTokenParams$Verification, int, m0.n.b.f):void");
    }

    public static /* synthetic */ PersonTokenParams copy$default(PersonTokenParams personTokenParams, Address address2, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, String str11, Relationship relationship2, String str12, Verification verification2, int i, Object obj) {
        PersonTokenParams personTokenParams2 = personTokenParams;
        int i2 = i;
        return personTokenParams.copy((i2 & 1) != 0 ? personTokenParams2.address : address2, (i2 & 2) != 0 ? personTokenParams2.addressKana : addressJapanParams, (i2 & 4) != 0 ? personTokenParams2.addressKanji : addressJapanParams2, (i2 & 8) != 0 ? personTokenParams2.dateOfBirth : dateOfBirth2, (i2 & 16) != 0 ? personTokenParams2.email : str, (i2 & 32) != 0 ? personTokenParams2.firstName : str2, (i2 & 64) != 0 ? personTokenParams2.firstNameKana : str3, (i2 & 128) != 0 ? personTokenParams2.firstNameKanji : str4, (i2 & 256) != 0 ? personTokenParams2.gender : str5, (i2 & 512) != 0 ? personTokenParams2.idNumber : str6, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? personTokenParams2.lastName : str7, (i2 & 2048) != 0 ? personTokenParams2.lastNameKana : str8, (i2 & 4096) != 0 ? personTokenParams2.lastNameKanji : str9, (i2 & 8192) != 0 ? personTokenParams2.maidenName : str10, (i2 & 16384) != 0 ? personTokenParams2.metadata : map, (i2 & 32768) != 0 ? personTokenParams2.phone : str11, (i2 & 65536) != 0 ? personTokenParams2.relationship : relationship2, (i2 & 131072) != 0 ? personTokenParams2.ssnLast4 : str12, (i2 & 262144) != 0 ? personTokenParams2.verification : verification2);
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

    public final Relationship component17() {
        return this.relationship;
    }

    public final String component18() {
        return this.ssnLast4;
    }

    public final Verification component19() {
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

    public final PersonTokenParams copy(Address address2, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, Relationship relationship2, String str12, Verification verification2) {
        return new PersonTokenParams(address2, addressJapanParams, addressJapanParams2, dateOfBirth2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, map, str11, relationship2, str12, verification2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonTokenParams)) {
            return false;
        }
        PersonTokenParams personTokenParams = (PersonTokenParams) obj;
        return i.a(this.address, personTokenParams.address) && i.a(this.addressKana, personTokenParams.addressKana) && i.a(this.addressKanji, personTokenParams.addressKanji) && i.a(this.dateOfBirth, personTokenParams.dateOfBirth) && i.a(this.email, personTokenParams.email) && i.a(this.firstName, personTokenParams.firstName) && i.a(this.firstNameKana, personTokenParams.firstNameKana) && i.a(this.firstNameKanji, personTokenParams.firstNameKanji) && i.a(this.gender, personTokenParams.gender) && i.a(this.idNumber, personTokenParams.idNumber) && i.a(this.lastName, personTokenParams.lastName) && i.a(this.lastNameKana, personTokenParams.lastNameKana) && i.a(this.lastNameKanji, personTokenParams.lastNameKanji) && i.a(this.maidenName, personTokenParams.maidenName) && i.a(this.metadata, personTokenParams.metadata) && i.a(this.phone, personTokenParams.phone) && i.a(this.relationship, personTokenParams.relationship) && i.a(this.ssnLast4, personTokenParams.ssnLast4) && i.a(this.verification, personTokenParams.verification);
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

    public final String getPhone() {
        return this.phone;
    }

    public final Relationship getRelationship() {
        return this.relationship;
    }

    public final String getSsnLast4() {
        return this.ssnLast4;
    }

    public Map<String, Object> getTypeDataParams() {
        Pair[] pairArr = new Pair[19];
        Address address2 = this.address;
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
        Relationship relationship2 = this.relationship;
        pairArr[16] = new Pair(PARAM_RELATIONSHIP, relationship2 != null ? relationship2.toParamMap() : null);
        pairArr[17] = new Pair(PARAM_SSN_LAST_4, this.ssnLast4);
        Verification verification2 = this.verification;
        pairArr[18] = new Pair(PARAM_VERIFICATION, verification2 != null ? verification2.toParamMap() : null);
        List<Pair> K = g.K(pairArr);
        Map<String, Object> o = g.o();
        for (Pair pair : K) {
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
        Relationship relationship2 = this.relationship;
        int hashCode17 = (hashCode16 + (relationship2 != null ? relationship2.hashCode() : 0)) * 31;
        String str12 = this.ssnLast4;
        int hashCode18 = (hashCode17 + (str12 != null ? str12.hashCode() : 0)) * 31;
        Verification verification2 = this.verification;
        if (verification2 != null) {
            i = verification2.hashCode();
        }
        return hashCode18 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PersonTokenParams(address=");
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
        P0.append(", relationship=");
        P0.append(this.relationship);
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
        Relationship relationship2 = this.relationship;
        if (relationship2 != null) {
            parcel.writeInt(1);
            relationship2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
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
    public PersonTokenParams(Address address2, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, Relationship relationship2, String str12, Verification verification2) {
        super(Token.Type.Person, (Set) null, 2, (f) null);
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
        this.relationship = relationship2;
        this.ssnLast4 = str12;
        this.verification = verification2;
    }
}
