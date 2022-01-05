package com.stripe.android.view;

import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\bb\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0013B-\b\u0002\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\u00038\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007R\u001c\u0010\u000f\u001a\u00020\u00038\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bi¨\u0006j"}, d2 = {"Lcom/stripe/android/view/NetbankingBank;", "", "Lcom/stripe/android/view/Bank;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "", "brandIconResId", "Ljava/lang/Integer;", "getBrandIconResId", "()Ljava/lang/Integer;", "id", "getId", "displayName", "getDisplayName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Companion", "KotakBank", "AndraBank", "AllahabadBank", "AndhraPragathiBank", "AirtelBank", "AUSmallFinanceBank", "BankOfBahrainAndKuwait", "BankOfBaroda", "BasseinCatholicBank", "BandhanBank", "BankOfIndia", "BankofMaharashtra", "CentralBankOfIndia", "CanaraBank", "CosmosBank", "CorporationBank", "CatholicSyrianBank", "CityUnionBank", "DeutscheBank", "Digibank", "DevelopmentCreditBank", "DenaBank", "DhanlakshmiBank", "EquitasSmallFinanceBank", "ESAFBank", "FederalBank", "FincareBank", "HDFCBank", "ICICIBank", "IDBIBank", "IDFCBank", "IndusIndBank", "IndianBank", "IndianOverseasBank", "JammuKashmirBank", "JanaBank", "JanataSahakariBank", "KarnatakaBank", "KalyanJanataBank", "KalpurBank", "KarurVysyaBank", "KarnatakaVikasGrameenaBank", "LaxmiVilasBank", "MehsanaBank", "NEBank", "NKGSBBank", "OBCBank", "PunjabNationalBank", "PunjabAndSindBank", "RBLBank", "SBI", "StandardCharteredBank", "ShivalikMercantileBank", "SouthIndianBank", "SuryodayBank", "SaraswatBank", "SyndicateBank", "ThaneBharatBank", "TJSBBank", "TamilnadMercantileBank", "TamilNaduStateBank", "UBI", "UNIBank", "AxisBank", "VijayaBank", "VarachhaBank", "YesBank", "ZoroastrianBank", "KarnatakaGraminBank", "ShamraoVithalBank", "NutanNagrikBank", "BOBBank", "PunjabNationalCorpBank", "ShamraoVithalCorpBank", "BNPParibas", "RBLCorpBank", "ICICICorpBank", "IDBICorpBank", "AxisCorpBank", "AndhraCorpBank", "DhanlaxmiCorpBank", "AllahabadCorpBank", "HFDCCorpBank", "YesCorpBank", "CorporationBankCorporate", "BarclaysCorpBank", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: NetbankingBank.kt */
public enum NetbankingBank implements Bank {
    KotakBank("162", "kotak", "Kotak Bank", (String) null, 8, (Integer) null),
    AndraBank("ADB", "andhra", "Andhra Bank", (String) null, 8, (Integer) null),
    AllahabadBank("ALB", "allahabad", "Allahabad Bank", (String) null, 8, (Integer) null),
    AndhraPragathiBank("APG", "andhra_pragathi", "Andhra Pragathi Grameena Bank", (String) null, 8, (Integer) null),
    AirtelBank("ATP", "airtel", "Airtel Payment Bank", (String) null, 8, (Integer) null),
    AUSmallFinanceBank("AUB", "au_small_finance", "AU Small Finance Bank", (String) null, 8, (Integer) null),
    BankOfBahrainAndKuwait("BBK", "bank_of_bahrain_and_kuwait", "Bank of Bahrain and Kuwait", (String) null, 8, (Integer) null),
    BankOfBaroda("BBR", "bob", "Bank of Baroda - Retail Banking", (String) null, 8, (Integer) null),
    BasseinCatholicBank("BCB", "bassein_catholic", "Bassein Catholic Co-operative Bank", (String) null, 8, (Integer) null),
    BandhanBank("BDN", "bandhan", "Bandhan Bank", (String) null, 8, (Integer) null),
    BankOfIndia("BOI", "bank_of_india", "Bank of India", (String) null, 8, (Integer) null),
    BankofMaharashtra("BOM", "bank_of_maharashtra", "Bank of Maharashtra", (String) null, 8, (Integer) null),
    CentralBankOfIndia("cbi001", "central_bank_of_india", "Central Bank of India", (String) null, 8, (Integer) null),
    CanaraBank("CNB", "canara", "Canara Bank", (String) null, 8, (Integer) null),
    CosmosBank("COB", "cosmos", "Cosmos Bank", (String) null, 8, (Integer) null),
    CorporationBank("CRP", "corporation_bank", "Corporation Bank", (String) null, 8, (Integer) null),
    CatholicSyrianBank("CSB", "catholic_syrian", "Catholic Syrian Bank", (String) null, 8, (Integer) null),
    CityUnionBank("CUB", "city_union", "City Union Bank", (String) null, 8, (Integer) null),
    DeutscheBank("DBK", "deutsche", "Deutsche Bank", (String) null, 8, (Integer) null),
    Digibank("DBS", "digibank_dbs", "Digibank by DBS", (String) null, 8, (Integer) null),
    DevelopmentCreditBank("DCB", "development_credit_bank", "Development Credit Bank", (String) null, 8, (Integer) null),
    DenaBank("DEN", "dena", "Dena Bank", (String) null, 8, (Integer) null),
    DhanlakshmiBank("DLB", "dhanlakshmi", "Dhanlakshmi Bank", (String) null, 8, (Integer) null),
    EquitasSmallFinanceBank("EQB", "equitas_small_finance", "Equitas Small Finance Bank", (String) null, 8, (Integer) null),
    ESAFBank("ESF", "esaf", "ESAF Small Finance Bank", (String) null, 8, (Integer) null),
    FederalBank("FBK", "federal_bank", "Federal Bank", (String) null, 8, (Integer) null),
    FincareBank("FNC", "fincare", "Fincare Bank", (String) null, 8, (Integer) null),
    HDFCBank("HDF", "hdfc", "HDFC Bank", (String) null, 8, (Integer) null),
    ICICIBank("ICI", "icici", "ICICI Bank", (String) null, 8, (Integer) null),
    IDBIBank("IDB", "idbi", "IDBI Bank", (String) null, 8, (Integer) null),
    IDFCBank("IDN", "idfc_first", "IDFC FIRST Bank", (String) null, 8, (Integer) null),
    IndusIndBank("IDS", "indusind", "IndusInd Bank", (String) null, 8, (Integer) null),
    IndianBank("INB", "indian_bank", "Indian Bank", (String) null, 8, (Integer) null),
    IndianOverseasBank("IOB", "indian_overseas", "Indian Overseas Bank", (String) null, 8, (Integer) null),
    JammuKashmirBank("JKB", "jnk", "Jammu & Kashmir Bank", (String) null, 8, (Integer) null),
    JanaBank("JNB", "jana_small_finance", "Jana Small Finance Bank", (String) null, 8, (Integer) null),
    JanataSahakariBank("JSB", "janata_sahakari_bank", "Janata Sahakari Bank Ltd Pune", (String) null, 8, (Integer) null),
    KarnatakaBank("KBL", "karnataka_bank", "Karnataka Bank Limited", (String) null, 8, (Integer) null),
    KalyanJanataBank("KJB", "kalyan_janata", "Kalyan Janata Sahakari Bank", (String) null, 8, (Integer) null),
    KalpurBank("KLB", "The Kalupur Commercial Co-operative Bank", "kalupur", (String) null, 8, (Integer) null),
    KarurVysyaBank("KVB", "karur_vysya", "Karur Vysya Bank", (String) null, 8, (Integer) null),
    KarnatakaVikasGrameenaBank("KVG", "kvg", "Karnataka Vikas Grameena Bank", (String) null, 8, (Integer) null),
    LaxmiVilasBank("LVR", "kvg", "Laxmi Vilas Bank", (String) null, 8, (Integer) null),
    MehsanaBank("MSB", "mehsana", "Mehsana urban Co-operative Bank", (String) null, 8, (Integer) null),
    NEBank("NEB", "ne_small_finance", "North East Small Finance Bank", (String) null, 8, (Integer) null),
    NKGSBBank("NKB", "nkgsb", "NKGSB Co-op Bank", (String) null, 8, (Integer) null),
    OBCBank("OBC", "obc", "PNB (Erstwhile-Oriental Bank of Commerce)", (String) null, 8, (Integer) null),
    PunjabNationalBank("PNB", "pnb", "Punjab National Bank - Retail Banking", (String) null, 8, (Integer) null),
    PunjabAndSindBank("PSB", "punjab_and_sind", "Punjab & Sind Bank", (String) null, 8, (Integer) null),
    RBLBank("RBL", "rbl", "RBL Bank Limited", (String) null, 8, (Integer) null),
    SBI("SBI", "sbi", "State Bank of India", (String) null, 8, (Integer) null),
    StandardCharteredBank("SCB", "scb", "Standard Chartered Bank", (String) null, 8, (Integer) null),
    ShivalikMercantileBank("SHB", "shivalik", "Shivalik Mercantile Cooperative Bank Ltd", (String) null, 8, (Integer) null),
    SouthIndianBank("SIB", "south_indian_bank", "South Indian Bank", (String) null, 8, (Integer) null),
    SuryodayBank("SRB", "suryoday", "Suryoday Small Finance Bank", (String) null, 8, (Integer) null),
    SaraswatBank("SWB", "saraswat", "Saraswat Bank", (String) null, 8, (Integer) null),
    SyndicateBank("SYD", "syndicate", "Syndicate Bank", (String) null, 8, (Integer) null),
    ThaneBharatBank("TBB", "thane_bharat", "Thane Bharat Sahakari Bank Ltd", (String) null, 8, (Integer) null),
    TJSBBank("TJB", "tjsb", "TJSB Bank", (String) null, 8, (Integer) null),
    TamilnadMercantileBank("TMB", "tamilnad_mercantile", "Tamilnad Mercantile Bank Limited", (String) null, 8, (Integer) null),
    TamilNaduStateBank("TNC", "tnc", "Tamil Nadu State Co-operative Bank", (String) null, 8, (Integer) null),
    UBI("UBI", "ubi", "Union Bank of India", (String) null, 8, (Integer) null),
    UNIBank("UNI", "united_bank_of_india", "PNB (Erstwhile-United Bank of India)", (String) null, 8, (Integer) null),
    AxisBank("UTI", "axis", "Axis Bank", (String) null, 8, (Integer) null),
    VijayaBank("VJB", "vijaya", "Vijaya Bank", (String) null, 8, (Integer) null),
    VarachhaBank("VRB", "varachha", "Varachha Co-operative Bank Limited", (String) null, 8, (Integer) null),
    YesBank("YBK", "yes", "Yes Bank", (String) null, 8, (Integer) null),
    ZoroastrianBank("ZOB", "zoroastrian", "Zoroastrian Co-operative Bank Limited", (String) null, 8, (Integer) null),
    KarnatakaGraminBank("PKB", "karnataka_gramin", "Karnataka Gramin Bank", (String) null, 8, (Integer) null),
    ShamraoVithalBank("SVC", "shamrao_vithal", "Shamrao Vithal Co-op Bank", (String) null, 8, (Integer) null),
    NutanNagrikBank("NUT", "nutan_nagrik", "Nutan Nagrik Bank", (String) null, 8, (Integer) null),
    BOBBank("BBC", "bob_corp", "Bank of Baroda - Corporate Banking", (String) null, 8, (Integer) null),
    PunjabNationalCorpBank("CPN", "pnb_corp", "Punjab National Bank - Corporate Banking", (String) null, 8, (Integer) null),
    ShamraoVithalCorpBank("SV2", "shamrao_vithal_corp", "Shamrao Vithal Co-op Bank - Corporate", (String) null, 8, (Integer) null),
    BNPParibas("BNP", "bnp_paribas", "BNP Paribas", (String) null, 8, (Integer) null),
    RBLCorpBank("RTC", "rbl_corp", "RBL Bank Limited - Corporate Banking", (String) null, 8, (Integer) null),
    ICICICorpBank("ICO", "icici_corp", "ICICI Corporate Netbanking", (String) null, 8, (Integer) null),
    IDBICorpBank("IDC", "idbi_corp", "IDBI Corporate", (String) null, 8, (Integer) null),
    AxisCorpBank("AXC", "axis_corp", "Axis Bank Corporate", (String) null, 8, (Integer) null),
    AndhraCorpBank("ADC", "andhra_corp", "Andhra Bank Corporate", (String) null, 8, (Integer) null),
    DhanlaxmiCorpBank("DL2", "dhanlaxmi_corp", "Dhanlaxmi Bank Corporate", (String) null, 8, (Integer) null),
    AllahabadCorpBank("ALC", "allahabad_corp", "Allahabad Bank Corporate", (String) null, 8, (Integer) null),
    HFDCCorpBank("CH3", "hdfc_corp", "HDFC Bank Corporate", (String) null, 8, (Integer) null),
    YesCorpBank("YBC", "yes_corp", "Yes Bank Corporate", (String) null, 8, (Integer) null),
    CorporationBankCorporate("CR2", "corporation_bank_corp", "Corporation Bank - Corporate", (String) null, 8, (Integer) null),
    BarclaysCorpBank("BRL", "barclays_corp", "Barclays Bank - Corporate Net Banking", (String) null, 8, (Integer) null);
    
    public static final Companion Companion = null;
    private final Integer brandIconResId;
    private final String code;
    private final String displayName;
    private final String id;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/NetbankingBank$Companion;", "", "", "bankCode", "Lcom/stripe/android/view/NetbankingBank;", "get", "(Ljava/lang/String;)Lcom/stripe/android/view/NetbankingBank;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: NetbankingBank.kt */
    public static final class Companion {
        private Companion() {
        }

        public final NetbankingBank get(String str) {
            NetbankingBank[] values = NetbankingBank.values();
            for (int i = 0; i < 86; i++) {
                NetbankingBank netbankingBank = values[i];
                if (i.a(netbankingBank.getCode(), str)) {
                    return netbankingBank;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((f) null);
    }

    private NetbankingBank(String str, String str2, String str3, Integer num) {
        this.id = str;
        this.code = str2;
        this.displayName = str3;
        this.brandIconResId = num;
    }

    public static final NetbankingBank get(String str) {
        return Companion.get(str);
    }

    public Integer getBrandIconResId() {
        return this.brandIconResId;
    }

    public String getCode() {
        return this.code;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getId() {
        return this.id;
    }
}
