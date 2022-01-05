package i0.h.a.a.h.e;

/* compiled from: AutoValue_AndroidClientInfo */
public final class h extends a {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, a aVar) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    public String a() {
        return this.l;
    }

    public String b() {
        return this.j;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.h;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.l;
                                                    if (str11 == null) {
                                                        if (aVar.a() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.a())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.i;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.k;
    }

    public int hashCode() {
        Integer num = this.a;
        int i2 = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        if (str11 != null) {
            i2 = str11.hashCode();
        }
        return hashCode11 ^ i2;
    }

    public String i() {
        return this.b;
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.e;
    }

    public Integer l() {
        return this.a;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AndroidClientInfo{sdkVersion=");
        P0.append(this.a);
        P0.append(", model=");
        P0.append(this.b);
        P0.append(", hardware=");
        P0.append(this.c);
        P0.append(", device=");
        P0.append(this.d);
        P0.append(", product=");
        P0.append(this.e);
        P0.append(", osBuild=");
        P0.append(this.f);
        P0.append(", manufacturer=");
        P0.append(this.g);
        P0.append(", fingerprint=");
        P0.append(this.h);
        P0.append(", locale=");
        P0.append(this.i);
        P0.append(", country=");
        P0.append(this.j);
        P0.append(", mccMnc=");
        P0.append(this.k);
        P0.append(", applicationBuild=");
        return i0.d.a.a.a.y0(P0, this.l, "}");
    }
}
