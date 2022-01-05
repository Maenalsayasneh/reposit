package com.clubhouse.android.data.models.local;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.explore.SearchQuery;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.g1;
import n0.c.k.h0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: SearchItem.kt */
public final class SearchItem {
    public static final Companion Companion = new Companion((f) null);
    public final UserInList a;
    public final ClubWithAdmin b;
    public final ChannelInFeed c;
    public final EventInClub d;
    public final SearchQuery e;
    public final Map<String, Object> f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/SearchItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/SearchItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: SearchItem.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<SearchItem> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: SearchItem.kt */
    public static final class a implements v<SearchItem> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.SearchItem", aVar, 6);
            pluginGeneratedSerialDescriptor.i("user", true);
            pluginGeneratedSerialDescriptor.i("club", true);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, true);
            pluginGeneratedSerialDescriptor.i("event", true);
            pluginGeneratedSerialDescriptor.i("search_query", true);
            pluginGeneratedSerialDescriptor.i("logging_context", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(UserInList.a.a), m0.r.t.a.r.m.a1.a.R1(ClubWithAdmin.a.a), m0.r.t.a.r.m.a1.a.R1(ChannelInFeed.a.a), m0.r.t.a.r.m.a1.a.R1(EventInClub.a.a), m0.r.t.a.r.m.a1.a.R1(SearchQuery.a.a), m0.r.t.a.r.m.a1.a.R1(new h0(g1.b, i0.e.b.b3.a.b.c.a.a))};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0085, code lost:
            r14 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0092, code lost:
            r7 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00af, code lost:
            r7 = r8;
            r8 = r3;
            r3 = 3;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r18) {
            /*
                r17 = this;
                r0 = r18
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 3
                r4 = 0
                r5 = 4
                r6 = 5
                r7 = 1
                r8 = 0
                r9 = 2
                if (r2 == 0) goto L_0x004e
                com.clubhouse.android.data.models.local.user.UserInList$a r2 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                java.lang.Object r2 = r0.v(r1, r8, r2, r4)
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r8 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                java.lang.Object r7 = r0.v(r1, r7, r8, r4)
                com.clubhouse.android.data.models.local.channel.ChannelInFeed$a r8 = com.clubhouse.android.data.models.local.channel.ChannelInFeed.a.a
                java.lang.Object r8 = r0.v(r1, r9, r8, r4)
                com.clubhouse.android.data.models.local.EventInClub$a r9 = com.clubhouse.android.data.models.local.EventInClub.a.a
                java.lang.Object r3 = r0.v(r1, r3, r9, r4)
                com.clubhouse.android.data.models.local.explore.SearchQuery$a r9 = com.clubhouse.android.data.models.local.explore.SearchQuery.a.a
                java.lang.Object r5 = r0.v(r1, r5, r9, r4)
                n0.c.k.h0 r9 = new n0.c.k.h0
                n0.c.k.g1 r10 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r11 = i0.e.b.b3.a.b.c.a.a
                r9.<init>(r10, r11)
                java.lang.Object r4 = r0.v(r1, r6, r9, r4)
                r6 = 63
                r16 = r7
                r7 = r6
                r6 = r16
                goto L_0x00ba
            L_0x004e:
                r2 = r4
                r10 = r2
                r11 = r10
                r12 = r11
                r13 = r12
                r15 = r7
                r14 = r8
            L_0x0055:
                if (r15 == 0) goto L_0x00b3
                int r8 = r0.x(r1)
                switch(r8) {
                    case -1: goto L_0x00ac;
                    case 0: goto L_0x00a0;
                    case 1: goto L_0x0094;
                    case 2: goto L_0x0088;
                    case 3: goto L_0x007d;
                    case 4: goto L_0x0074;
                    case 5: goto L_0x0064;
                    default: goto L_0x005e;
                }
            L_0x005e:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r8)
                throw r0
            L_0x0064:
                n0.c.k.h0 r8 = new n0.c.k.h0
                n0.c.k.g1 r7 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r9 = i0.e.b.b3.a.b.c.a.a
                r8.<init>(r7, r9)
                java.lang.Object r12 = r0.v(r1, r6, r8, r12)
                r7 = r14 | 32
                goto L_0x0085
            L_0x0074:
                com.clubhouse.android.data.models.local.explore.SearchQuery$a r7 = com.clubhouse.android.data.models.local.explore.SearchQuery.a.a
                java.lang.Object r11 = r0.v(r1, r5, r7, r11)
                r7 = r14 | 16
                goto L_0x0085
            L_0x007d:
                com.clubhouse.android.data.models.local.EventInClub$a r7 = com.clubhouse.android.data.models.local.EventInClub.a.a
                java.lang.Object r10 = r0.v(r1, r3, r7, r10)
                r7 = r14 | 8
            L_0x0085:
                r14 = r7
                r9 = 2
                goto L_0x0092
            L_0x0088:
                com.clubhouse.android.data.models.local.channel.ChannelInFeed$a r7 = com.clubhouse.android.data.models.local.channel.ChannelInFeed.a.a
                r9 = 2
                java.lang.Object r2 = r0.v(r1, r9, r7, r2)
                r7 = r14 | 4
                r14 = r7
            L_0x0092:
                r7 = 1
                goto L_0x009e
            L_0x0094:
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r7 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r8 = 1
                java.lang.Object r4 = r0.v(r1, r8, r7, r4)
                r14 = r14 | 2
                r7 = r8
            L_0x009e:
                r8 = 0
                goto L_0x0055
            L_0x00a0:
                r8 = r7
                com.clubhouse.android.data.models.local.user.UserInList$a r7 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r3 = 0
                java.lang.Object r7 = r0.v(r1, r3, r7, r13)
                r14 = r14 | 1
                r13 = r7
                goto L_0x00af
            L_0x00ac:
                r8 = r7
                r3 = 0
                r15 = r3
            L_0x00af:
                r7 = r8
                r8 = r3
                r3 = 3
                goto L_0x0055
            L_0x00b3:
                r8 = r2
                r6 = r4
                r3 = r10
                r5 = r11
                r4 = r12
                r2 = r13
                r7 = r14
            L_0x00ba:
                r0.b(r1)
                com.clubhouse.android.data.models.local.SearchItem r0 = new com.clubhouse.android.data.models.local.SearchItem
                r1 = r2
                com.clubhouse.android.data.models.local.user.UserInList r1 = (com.clubhouse.android.data.models.local.user.UserInList) r1
                r9 = r6
                com.clubhouse.android.data.models.local.club.ClubWithAdmin r9 = (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r9
                r10 = r8
                com.clubhouse.android.data.models.local.channel.ChannelInFeed r10 = (com.clubhouse.android.data.models.local.channel.ChannelInFeed) r10
                r11 = r3
                com.clubhouse.android.data.models.local.EventInClub r11 = (com.clubhouse.android.data.models.local.EventInClub) r11
                r12 = r5
                com.clubhouse.android.data.models.local.explore.SearchQuery r12 = (com.clubhouse.android.data.models.local.explore.SearchQuery) r12
                r13 = r4
                java.util.Map r13 = (java.util.Map) r13
                r6 = r0
                r8 = r1
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.SearchItem.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            SearchItem searchItem = (SearchItem) obj;
            i.e(encoder, "encoder");
            i.e(searchItem, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(searchItem, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || searchItem.a != null) {
                c.l(serialDescriptor, 0, UserInList.a.a, searchItem.a);
            }
            if (c.v(serialDescriptor, 1) || searchItem.b != null) {
                c.l(serialDescriptor, 1, ClubWithAdmin.a.a, searchItem.b);
            }
            if (c.v(serialDescriptor, 2) || searchItem.c != null) {
                c.l(serialDescriptor, 2, ChannelInFeed.a.a, searchItem.c);
            }
            if (c.v(serialDescriptor, 3) || searchItem.d != null) {
                c.l(serialDescriptor, 3, EventInClub.a.a, searchItem.d);
            }
            if (c.v(serialDescriptor, 4) || searchItem.e != null) {
                c.l(serialDescriptor, 4, SearchQuery.a.a, searchItem.e);
            }
            if (c.v(serialDescriptor, 5) || searchItem.f != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 5, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), searchItem.f);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public SearchItem() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchItem)) {
            return false;
        }
        SearchItem searchItem = (SearchItem) obj;
        return i.a(this.a, searchItem.a) && i.a(this.b, searchItem.b) && i.a(this.c, searchItem.c) && i.a(this.d, searchItem.d) && i.a(this.e, searchItem.e) && i.a(this.f, searchItem.f);
    }

    public int hashCode() {
        UserInList userInList = this.a;
        int i = 0;
        int hashCode = (userInList == null ? 0 : userInList.hashCode()) * 31;
        ClubWithAdmin clubWithAdmin = this.b;
        int hashCode2 = (hashCode + (clubWithAdmin == null ? 0 : clubWithAdmin.hashCode())) * 31;
        ChannelInFeed channelInFeed = this.c;
        int hashCode3 = (hashCode2 + (channelInFeed == null ? 0 : channelInFeed.hashCode())) * 31;
        EventInClub eventInClub = this.d;
        int hashCode4 = (hashCode3 + (eventInClub == null ? 0 : eventInClub.hashCode())) * 31;
        SearchQuery searchQuery = this.e;
        int hashCode5 = (hashCode4 + (searchQuery == null ? 0 : searchQuery.hashCode())) * 31;
        Map<String, Object> map = this.f;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SearchItem(user=");
        P0.append(this.a);
        P0.append(", club=");
        P0.append(this.b);
        P0.append(", channel=");
        P0.append(this.c);
        P0.append(", event=");
        P0.append(this.d);
        P0.append(", searchQuery=");
        P0.append(this.e);
        P0.append(", loggingContext=");
        return i0.d.a.a.a.B0(P0, this.f, ')');
    }

    public SearchItem(int i, UserInList userInList, ClubWithAdmin clubWithAdmin, ChannelInFeed channelInFeed, EventInClub eventInClub, SearchQuery searchQuery, Map map) {
        if ((i & 0) == 0) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = userInList;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = clubWithAdmin;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = channelInFeed;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = eventInClub;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = searchQuery;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = map;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        }
    }
}
