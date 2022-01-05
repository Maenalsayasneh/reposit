package com.instabug.apm.model;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import com.instabug.library.apichecker.APIChecker;
import com.instabug.library.apichecker.VoidRunnable;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import i0.j.a.d.a.d.f;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public class ExecutionTrace implements Parcelable {
    public static final Parcelable.Creator<ExecutionTrace> CREATOR = new a();
    /* access modifiers changed from: private */
    public final transient i0.j.a.n.a.a apmLogger;
    /* access modifiers changed from: private */
    public final Map<String, String> attrs;
    /* access modifiers changed from: private */
    public long endTimeMicro;
    /* access modifiers changed from: private */
    public final transient i0.j.a.h.b.a executionTracesHandler;
    /* access modifiers changed from: private */
    public final transient Executor executor;
    /* access modifiers changed from: private */
    public final long id;
    /* access modifiers changed from: private */
    public final String name;
    /* access modifiers changed from: private */
    public long startTime;
    /* access modifiers changed from: private */
    public long startTimeMicro;

    public static class a implements Parcelable.Creator<ExecutionTrace> {
        public Object createFromParcel(Parcel parcel) {
            return new ExecutionTrace(parcel);
        }

        public Object[] newArray(int i) {
            return new ExecutionTrace[i];
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ String c;

        public b(String str) {
            this.c = str;
        }

        public void run() {
            i0.j.a.h.b.a access$200 = ExecutionTrace.this.executionTracesHandler;
            long access$000 = ExecutionTrace.this.id;
            String str = this.c;
            long access$100 = ExecutionTrace.this.startTime;
            i0.j.a.h.b.c cVar = (i0.j.a.h.b.c) access$200;
            synchronized (cVar) {
                i0.j.a.d.b.d dVar = ((i0.j.a.h.d.d) cVar.d).f;
                if (dVar != null) {
                    if (((i0.j.a.d.a.b.d) cVar.a).e(access$000, dVar.a, str, access$100, false)) {
                        f fVar = cVar.e;
                        if (fVar != null) {
                            fVar.i(dVar.a, 1);
                            int b = cVar.b(dVar.a, ((i0.j.a.e.c) cVar.f).e());
                            if (b > 0) {
                                cVar.e.n(dVar.a, b);
                            }
                        }
                        SharedPreferences sharedPreferences = ((i0.j.a.e.c) cVar.f).a;
                        long j = 2500;
                        if (sharedPreferences != null) {
                            j = sharedPreferences.getLong("TRACES_STORE_LIMIT", 2500);
                        }
                        cVar.c(j);
                    } else {
                        Objects.requireNonNull(cVar.c);
                        InstabugSDKLogger.p("Instabug - APM", "Session meta data was not updated. Failed to insert custom trace " + str);
                    }
                } else {
                    ((i0.j.a.d.a.b.b) cVar.b).c(access$000, str, access$100, true);
                }
            }
            i0.j.a.n.a.a access$300 = ExecutionTrace.this.apmLogger;
            StringBuilder P0 = i0.d.a.a.a.P0("Execution trace ");
            P0.append(this.c);
            P0.append(" has started.");
            access$300.e(P0.toString());
        }
    }

    public class c implements VoidRunnable {

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                long access$400 = ExecutionTrace.this.endTimeMicro - ExecutionTrace.this.startTimeMicro;
                ((i0.j.a.h.b.c) ExecutionTrace.this.executionTracesHandler).a(ExecutionTrace.this.id, access$400);
                i0.j.a.n.a.a access$300 = ExecutionTrace.this.apmLogger;
                StringBuilder P0 = i0.d.a.a.a.P0("Execution trace ");
                P0.append(ExecutionTrace.this.name);
                P0.append(" has ended.\nTotal duration: ");
                P0.append(access$400);
                P0.append(" ms\nAttributes: ");
                P0.append(new JSONObject((Map<?, ?>) ExecutionTrace.this.attrs).toString());
                access$300.e(P0.toString());
            }
        }

        public c() {
        }

        public void run() throws Exception {
            long unused = ExecutionTrace.this.endTimeMicro = System.nanoTime() / 1000;
            ExecutionTrace.this.executor.execute(new a());
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public d(String str, String str2) {
            this.c = str;
            this.d = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r23 = this;
                r1 = r23
                com.instabug.apm.model.ExecutionTrace r0 = com.instabug.apm.model.ExecutionTrace.this
                i0.j.a.h.b.a r0 = r0.executionTracesHandler
                com.instabug.apm.model.ExecutionTrace r2 = com.instabug.apm.model.ExecutionTrace.this
                long r9 = r2.id
                com.instabug.apm.model.ExecutionTrace r2 = com.instabug.apm.model.ExecutionTrace.this
                java.lang.String r2 = r2.name
                java.lang.String r11 = r1.c
                java.lang.String r3 = r1.d
                r12 = 0
                if (r3 != 0) goto L_0x001d
                r13 = r12
                goto L_0x0022
            L_0x001d:
                java.lang.String r3 = r3.trim()
                r13 = r3
            L_0x0022:
                i0.j.a.h.b.c r0 = (i0.j.a.h.b.c) r0
                i0.j.a.d.a.b.c r3 = r0.a
                i0.j.a.d.a.b.d r3 = (i0.j.a.d.a.b.d) r3
                boolean r3 = r3.d(r9)
                if (r3 == 0) goto L_0x0039
                i0.j.a.d.a.b.c r3 = r0.a
                i0.j.a.d.a.b.d r3 = (i0.j.a.d.a.b.d) r3
                r4 = r9
                r6 = r2
                r7 = r11
                r8 = r13
                r3.c(r4, r6, r7, r8)
            L_0x0039:
                i0.j.a.d.a.b.a r3 = r0.b
                i0.j.a.d.a.b.b r3 = (i0.j.a.d.a.b.b) r3
                com.instabug.library.internal.storage.cache.db.DatabaseManager r4 = r3.a
                r5 = 1
                r6 = 0
                if (r4 == 0) goto L_0x008a
                java.lang.String r17 = "trace_id = ? "
                java.lang.String[] r4 = new java.lang.String[r5]
                java.lang.String r7 = java.lang.String.valueOf(r9)
                r4[r6] = r7
                com.instabug.library.internal.storage.cache.db.DatabaseManager r3 = r3.a
                com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r3 = r3.openDatabase()
                java.lang.String r15 = "dangling_execution_traces"
                r16 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r14 = r3
                r18 = r4
                android.database.Cursor r4 = r14.query(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0080 }
                if (r4 == 0) goto L_0x0077
                int r7 = r4.getCount()     // Catch:{ all -> 0x0074 }
                if (r7 <= 0) goto L_0x0077
                r4.close()
                r3.close()
                r3 = r5
                goto L_0x008b
            L_0x0074:
                r0 = move-exception
                r12 = r4
                goto L_0x0081
            L_0x0077:
                if (r4 == 0) goto L_0x007c
                r4.close()
            L_0x007c:
                r3.close()
                goto L_0x008a
            L_0x0080:
                r0 = move-exception
            L_0x0081:
                if (r12 == 0) goto L_0x0086
                r12.close()
            L_0x0086:
                r3.close()
                throw r0
            L_0x008a:
                r3 = r6
            L_0x008b:
                if (r3 == 0) goto L_0x01b9
                i0.j.a.d.a.b.a r0 = r0.b
                i0.j.a.d.a.b.b r0 = (i0.j.a.d.a.b.b) r0
                java.lang.String r3 = "attribute_key"
                if (r13 != 0) goto L_0x00bd
                com.instabug.library.internal.storage.cache.db.DatabaseManager r2 = r0.a
                if (r2 == 0) goto L_0x01b9
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "delete from dangling_execution_traces_attributes where trace_id = "
                r2.append(r4)
                r2.append(r9)
                java.lang.String r4 = " and "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r3 = " = \""
                java.lang.String r4 = "\""
                java.lang.String r2 = i0.d.a.a.a.z0(r2, r3, r11, r4)
                com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = r0.a
                i0.d.a.a.a.o(r0, r2)
                goto L_0x01b9
            L_0x00bd:
                com.instabug.library.internal.storage.cache.db.DatabaseManager r4 = r0.a
                java.lang.String r7 = "attribute_value"
                java.lang.String r8 = ""
                if (r4 == 0) goto L_0x011a
                h0.f.a r4 = new h0.f.a
                r4.<init>()
                java.lang.String[] r5 = new java.lang.String[r5]
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r9)
                r14.append(r8)
                java.lang.String r14 = r14.toString()
                r5[r6] = r14
                com.instabug.library.internal.storage.cache.db.DatabaseManager r14 = r0.a
                com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r22 = r14.openDatabase()
                r16 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                java.lang.String r15 = "dangling_execution_traces_attributes"
                java.lang.String r17 = "trace_id = ?"
                r14 = r22
                r18 = r5
                android.database.Cursor r5 = r14.query(r15, r16, r17, r18, r19, r20, r21)
                if (r5 == 0) goto L_0x0116
            L_0x00f9:
                boolean r14 = r5.moveToNext()
                if (r14 == 0) goto L_0x0113
                int r14 = r5.getColumnIndex(r3)
                java.lang.String r14 = r5.getString(r14)
                int r15 = r5.getColumnIndex(r7)
                java.lang.String r15 = r5.getString(r15)
                r4.put(r14, r15)
                goto L_0x00f9
            L_0x0113:
                r5.close()
            L_0x0116:
                r22.close()
                goto L_0x011b
            L_0x011a:
                r4 = r12
            L_0x011b:
                java.lang.String r5 = "dangling_execution_traces_attributes"
                if (r4 == 0) goto L_0x0155
                java.lang.Object r14 = r4.getOrDefault(r11, r12)
                if (r14 == 0) goto L_0x0155
                com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = r0.a
                if (r0 == 0) goto L_0x01b9
                com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r0 = r0.openDatabase()
                android.content.ContentValues r2 = new android.content.ContentValues
                r2.<init>()
                r2.put(r7, r13)
                r3 = 2
                java.lang.String[] r3 = new java.lang.String[r3]
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r9)
                r4.append(r8)
                java.lang.String r4 = r4.toString()
                r3[r6] = r4
                r4 = 1
                r3[r4] = r11
                java.lang.String r4 = "trace_id = ? AND attribute_key= ?"
                r0.update(r5, r2, r4, r3)
                r0.close()
                goto L_0x01b9
            L_0x0155:
                i0.j.a.e.b r6 = i0.j.a.g.a.g()
                i0.j.a.e.c r6 = (i0.j.a.e.c) r6
                android.content.SharedPreferences r6 = r6.a
                r14 = 5
                if (r6 == 0) goto L_0x0166
                java.lang.String r15 = "TRACES_ATTRIBUTES_COUNT"
                int r14 = r6.getInt(r15, r14)
            L_0x0166:
                if (r4 == 0) goto L_0x0195
                int r4 = r4.Z1
                if (r4 != r14) goto L_0x0195
                i0.j.a.n.a.a r0 = r0.b
                java.lang.String r3 = "Trace attribute \"$s1\" wasn't added to \"$s2\". Max allowed trace attributes reached. Please note that you can add up 5 attributes to the same trace."
                java.lang.String r4 = "$s1"
                java.lang.String r3 = r3.replace(r4, r11)
                java.lang.String r4 = "$s2"
                java.lang.String r2 = r3.replace(r4, r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r14)
                r3.append(r8)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "$s3"
                java.lang.String r2 = r2.replace(r4, r3)
                r0.f(r2)
                goto L_0x01b9
            L_0x0195:
                com.instabug.library.internal.storage.cache.db.DatabaseManager r2 = r0.a
                if (r2 == 0) goto L_0x01b9
                android.content.ContentValues r2 = new android.content.ContentValues
                r2.<init>()
                java.lang.Long r4 = java.lang.Long.valueOf(r9)
                java.lang.String r6 = "trace_id"
                r2.put(r6, r4)
                r2.put(r3, r11)
                r2.put(r7, r13)
                com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = r0.a
                com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r0 = r0.openDatabase()
                r0.insert(r5, r12, r2)
                r0.close()
            L_0x01b9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.apm.model.ExecutionTrace.d.run():void");
        }
    }

    @SuppressFBWarnings({"DMI_RANDOM_USED_ONLY_ONCE"})
    public ExecutionTrace(String str) {
        Executor f = i0.j.a.g.a.f("execution_traces_thread_executor");
        this.executor = f;
        this.executionTracesHandler = i0.j.a.g.a.r();
        this.apmLogger = i0.j.a.g.a.i();
        this.endTimeMicro = -1;
        this.id = new Random().nextLong();
        this.startTime = System.currentTimeMillis() * 1000;
        this.startTimeMicro = System.nanoTime() / 1000;
        this.name = str;
        this.attrs = new HashMap();
        f.execute(new b(str));
    }

    public int describeContents() {
        return 0;
    }

    public void end() {
        APIChecker.checkAndRun("ExecutionTrace.end", new c());
    }

    public long getId() {
        return this.id;
    }

    public void setAttribute(String str, String str2) {
        String str3;
        if (str == null || str.trim().isEmpty()) {
            this.apmLogger.f("Trace attribute wasn't added to \"$s\". Trace attribute key can't be null or empty string.".replace("$s", this.name));
            return;
        }
        String trim = str.trim();
        if (trim.length() > 30) {
            this.apmLogger.f("Trace attribute \"$s1\" wasn't added to \"$s2\" as it was too long. Please limit attribute key names to 30 characters.".replace("$s1", str).replace("$s2", this.name));
            return;
        }
        if (str2 != null) {
            String trim2 = str2.trim();
            if (trim2.length() == 0) {
                this.apmLogger.f("Trace attribute \"$s1\" wasn't added to \"$s2\". Trace attribute value can't be empty string.".replace("$s1", trim).replace("$s2", this.name));
                return;
            } else if (trim2.length() > 60) {
                this.apmLogger.f("Trace attribute \"$s1\" wasn't added to \"$s2\" as its value was too long. Please limit trace attribute values to 60 characters.".replace("$s1", str).replace("$s2", this.name));
                return;
            }
        }
        if (this.endTimeMicro != -1) {
            this.apmLogger.f("Trace attribute \"$s1\" wasn't added to \"$s2\" because attribute was added after the trace had already ended.".replace("$s1", str).replace("$s2", this.name));
            return;
        }
        if (str2 == null) {
            str3 = null;
        } else {
            str3 = str2.trim();
        }
        this.attrs.put(trim, str3);
        this.executor.execute(new d(trim, str2));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeInt(this.attrs.size());
        for (Map.Entry next : this.attrs.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
        parcel.writeString(this.name);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.startTimeMicro);
        parcel.writeLong(this.endTimeMicro);
    }

    @SuppressLint({"ERADICATE_FIELD_NOT_NULLABLE"})
    public ExecutionTrace(Parcel parcel) {
        this.executor = i0.j.a.g.a.f("execution_traces_thread_executor");
        this.executionTracesHandler = i0.j.a.g.a.r();
        this.apmLogger = i0.j.a.g.a.i();
        this.endTimeMicro = -1;
        this.id = parcel.readLong();
        int readInt = parcel.readInt();
        this.attrs = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.attrs.put(parcel.readString(), parcel.readString());
        }
        this.name = parcel.readString();
        this.startTime = parcel.readLong();
        this.startTimeMicro = parcel.readLong();
        this.endTimeMicro = parcel.readLong();
    }
}
