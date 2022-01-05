package com.instabug.library.annotation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: MarkUpStack */
public class d implements Serializable {
    public ArrayList<c> c = new ArrayList<>();
    public ArrayList<c> d = new ArrayList<>();
    public ArrayList<c> q = new ArrayList<>();
    public Stack<c> x = new Stack<>();

    public void a(c cVar) {
        this.q.add(cVar);
        this.c.clear();
        this.c.addAll(this.q);
        this.c.addAll(this.d);
        this.x.add(cVar);
    }

    public int b() {
        return this.c.size();
    }

    public void c(c cVar) {
        this.d.add(cVar);
        this.c.clear();
        this.c.addAll(this.q);
        this.c.addAll(this.d);
        this.x.add(cVar);
    }
}
