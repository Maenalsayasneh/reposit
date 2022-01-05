package com.instabug.featuresrequest.ui.custom;

/* compiled from: ToolbarActionButton */
public class f {
    public int a;
    public int b;
    public a c;
    public b d;

    /* compiled from: ToolbarActionButton */
    public interface a {
        void a();
    }

    /* compiled from: ToolbarActionButton */
    public enum b {
        ICON(0),
        TEXT(1),
        VOTE(2);
        
        private int type;

        private b(int i) {
            this.type = i;
        }
    }

    public f(int i, int i2, a aVar, b bVar) {
        this.a = i;
        this.b = i2;
        this.c = aVar;
        this.d = bVar;
    }
}
