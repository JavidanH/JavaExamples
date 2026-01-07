public class Permissions {
    public static final int READ   = 1;
    public static final int WRITE  = 2;
    public static final int DELETE = 4;
    public static final int EXEC   = 8;

    private int mask;

    public Permissions(int initial) {
        this.mask = initial;
    }

    public void add(int perm) { mask |= perm; }

    public void remove(int perm) { mask &= ~perm; }

    public void toggle(int perm) { mask ^= perm; }

    public boolean has(int perm) { return (mask & perm) != 0; }

    public int value() { return mask; }
}
