package byteCode.ISA;

public class Astore extends ByteCode {
    int index_;

    public Astore(int index) {
        index_ = index;
    }

    @Override
    public String toString() {
        if (index_ <= 3)
            return "astore_" + index_;
        return "astore\t" + index_;
    }
}
