package com.airbnb.epoxy;

import com.airbnb.epoxy.ControllerModelList;
import i0.b.a.t;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ModelList extends ArrayList<t<?>> {
    public boolean c;
    public d d;

    public class b implements Iterator<t<?>> {
        public int c;
        public int d = -1;
        public int q;

        public b(a aVar) {
            this.q = ModelList.this.modCount;
        }

        public final void a() {
            if (ModelList.this.modCount != this.q) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            return this.c != ModelList.this.size();
        }

        public Object next() {
            a();
            int i = this.c;
            this.c = i + 1;
            this.d = i;
            return (t) ModelList.this.get(i);
        }

        public void remove() {
            if (this.d >= 0) {
                a();
                try {
                    ModelList.this.X(this.d);
                    this.c = this.d;
                    this.d = -1;
                    this.q = ModelList.this.modCount;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public class c extends b implements ListIterator<t<?>> {
        public c(int i) {
            super((a) null);
            this.c = i;
        }

        public void add(Object obj) {
            t tVar = (t) obj;
            a();
            try {
                int i = this.c;
                ModelList.this.T(i, tVar);
                this.c = i + 1;
                this.d = -1;
                this.q = ModelList.this.modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasPrevious() {
            return this.c != 0;
        }

        public int nextIndex() {
            return this.c;
        }

        public Object previous() {
            a();
            int i = this.c - 1;
            if (i >= 0) {
                this.c = i;
                this.d = i;
                return (t) ModelList.this.get(i);
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.c - 1;
        }

        public void set(Object obj) {
            t tVar = (t) obj;
            if (this.d >= 0) {
                a();
                try {
                    ModelList.this.set(this.d, tVar);
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public interface d {
    }

    public ModelList(int i) {
        super(i);
    }

    public void T(int i, t<?> tVar) {
        V(i, 1);
        super.add(i, tVar);
    }

    public boolean U(t<?> tVar) {
        V(size(), 1);
        return super.add(tVar);
    }

    public final void V(int i, int i2) {
        d dVar;
        if (!this.c && (dVar = this.d) != null) {
            Objects.requireNonNull((ControllerModelList.a) dVar);
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    }

    public final void W(int i, int i2) {
        d dVar;
        if (!this.c && (dVar = this.d) != null) {
            Objects.requireNonNull((ControllerModelList.a) dVar);
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    }

    public t<?> X(int i) {
        W(i, 1);
        return (t) super.remove(i);
    }

    /* renamed from: Y */
    public t<?> set(int i, t<?> tVar) {
        t<?> tVar2 = (t) super.set(i, tVar);
        if (tVar2.b != tVar.b) {
            W(i, 1);
            V(i, 1);
        }
        return tVar2;
    }

    public void add(int i, Object obj) {
        V(i, 1);
        super.add(i, (t) obj);
    }

    public boolean addAll(Collection<? extends t<?>> collection) {
        V(size(), collection.size());
        return super.addAll(collection);
    }

    public void clear() {
        if (!isEmpty()) {
            W(0, size());
            super.clear();
        }
    }

    public Iterator<t<?>> iterator() {
        return new b((a) null);
    }

    public ListIterator<t<?>> listIterator() {
        return new c(0);
    }

    public Object remove(int i) {
        W(i, 1);
        return (t) super.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        Iterator<t<?>> it = iterator();
        boolean z = false;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return z;
            }
            if (collection.contains(bVar.next())) {
                bVar.remove();
                z = true;
            }
        }
    }

    public void removeRange(int i, int i2) {
        if (i != i2) {
            W(i, i2 - i);
            super.removeRange(i, i2);
        }
    }

    public boolean retainAll(Collection<?> collection) {
        Iterator<t<?>> it = iterator();
        boolean z = false;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return z;
            }
            if (!collection.contains(bVar.next())) {
                bVar.remove();
                z = true;
            }
        }
    }

    public List<t<?>> subList(int i, int i2) {
        if (i < 0 || i2 > size()) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            return new e(this, i, i2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public ModelList() {
    }

    public ListIterator<t<?>> listIterator(int i) {
        return new c(i);
    }

    public boolean addAll(int i, Collection<? extends t<?>> collection) {
        V(i, collection.size());
        return super.addAll(i, collection);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        W(indexOf, 1);
        super.remove(indexOf);
        return true;
    }

    public boolean add(Object obj) {
        V(size(), 1);
        return super.add((t) obj);
    }

    public static class e extends AbstractList<t<?>> {
        public final ModelList c;
        public int d;
        public int q;

        public static final class a implements ListIterator<t<?>> {
            public final e c;
            public final ListIterator<t<?>> d;
            public int q;
            public int x;

            public a(ListIterator<t<?>> listIterator, e eVar, int i, int i2) {
                this.d = listIterator;
                this.c = eVar;
                this.q = i;
                this.x = i + i2;
            }

            public void add(Object obj) {
                this.d.add((t) obj);
                this.c.b(true);
                this.x++;
            }

            public boolean hasNext() {
                return this.d.nextIndex() < this.x;
            }

            public boolean hasPrevious() {
                return this.d.previousIndex() >= this.q;
            }

            public Object next() {
                if (this.d.nextIndex() < this.x) {
                    return this.d.next();
                }
                throw new NoSuchElementException();
            }

            public int nextIndex() {
                return this.d.nextIndex() - this.q;
            }

            public Object previous() {
                if (this.d.previousIndex() >= this.q) {
                    return this.d.previous();
                }
                throw new NoSuchElementException();
            }

            public int previousIndex() {
                int previousIndex = this.d.previousIndex();
                int i = this.q;
                if (previousIndex >= i) {
                    return previousIndex - i;
                }
                return -1;
            }

            public void remove() {
                this.d.remove();
                this.c.b(false);
                this.x--;
            }

            public void set(Object obj) {
                this.d.set((t) obj);
            }
        }

        public e(ModelList modelList, int i, int i2) {
            this.c = modelList;
            this.modCount = modelList.modCount;
            this.d = i;
            this.q = i2 - i;
        }

        public void add(int i, Object obj) {
            t tVar = (t) obj;
            if (this.modCount != this.c.modCount) {
                throw new ConcurrentModificationException();
            } else if (i < 0 || i > this.q) {
                throw new IndexOutOfBoundsException();
            } else {
                this.c.T(i + this.d, tVar);
                this.q++;
                this.modCount = this.c.modCount;
            }
        }

        public boolean addAll(int i, Collection<? extends t<?>> collection) {
            if (this.modCount != this.c.modCount) {
                throw new ConcurrentModificationException();
            } else if (i < 0 || i > this.q) {
                throw new IndexOutOfBoundsException();
            } else {
                boolean addAll = this.c.addAll(i + this.d, collection);
                if (addAll) {
                    this.q = collection.size() + this.q;
                    this.modCount = this.c.modCount;
                }
                return addAll;
            }
        }

        public void b(boolean z) {
            if (z) {
                this.q++;
            } else {
                this.q--;
            }
            this.modCount = this.c.modCount;
        }

        public Object get(int i) {
            if (this.modCount != this.c.modCount) {
                throw new ConcurrentModificationException();
            } else if (i >= 0 && i < this.q) {
                return (t) this.c.get(i + this.d);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public Iterator<t<?>> iterator() {
            return listIterator(0);
        }

        public ListIterator<t<?>> listIterator(int i) {
            if (this.modCount != this.c.modCount) {
                throw new ConcurrentModificationException();
            } else if (i < 0 || i > this.q) {
                throw new IndexOutOfBoundsException();
            } else {
                ModelList modelList = this.c;
                Objects.requireNonNull(modelList);
                return new a(new c(i + this.d), this, this.d, this.q);
            }
        }

        public Object remove(int i) {
            if (this.modCount != this.c.modCount) {
                throw new ConcurrentModificationException();
            } else if (i < 0 || i >= this.q) {
                throw new IndexOutOfBoundsException();
            } else {
                t<?> X = this.c.X(i + this.d);
                this.q--;
                this.modCount = this.c.modCount;
                return X;
            }
        }

        public void removeRange(int i, int i2) {
            if (i == i2) {
                return;
            }
            if (this.modCount == this.c.modCount) {
                ModelList modelList = this.c;
                int i3 = this.d;
                modelList.removeRange(i + i3, i3 + i2);
                this.q -= i2 - i;
                this.modCount = this.c.modCount;
                return;
            }
            throw new ConcurrentModificationException();
        }

        public Object set(int i, Object obj) {
            t tVar = (t) obj;
            if (this.modCount != this.c.modCount) {
                throw new ConcurrentModificationException();
            } else if (i >= 0 && i < this.q) {
                return this.c.set(i + this.d, tVar);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public int size() {
            if (this.modCount == this.c.modCount) {
                return this.q;
            }
            throw new ConcurrentModificationException();
        }

        public boolean addAll(Collection<? extends t<?>> collection) {
            if (this.modCount == this.c.modCount) {
                boolean addAll = this.c.addAll(this.d + this.q, collection);
                if (addAll) {
                    this.q = collection.size() + this.q;
                    this.modCount = this.c.modCount;
                }
                return addAll;
            }
            throw new ConcurrentModificationException();
        }
    }
}
