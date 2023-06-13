package byteCode;

public class Istore extends ByteCode {
    int index_;

    public Istore(int index) {
        index_ = index;
    }

    @Override
    public String toString() {
        if (index_ <= 3)
            return "istore_" + index_;
        return "istore\t" + index_;
    }
}
