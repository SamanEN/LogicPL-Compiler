package byteCode;

public class Iconst extends ByteCode {
    private int index_;

    public Iconst(int index) {
        index_ = index;
    }

    @Override
    public String toString() {
        return "iconst_" + index_;
    }

}
