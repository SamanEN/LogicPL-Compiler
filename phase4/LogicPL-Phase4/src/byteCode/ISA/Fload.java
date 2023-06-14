package byteCode.ISA;

public class Fload extends ByteCode {
    private int index_;

    public Fload(int index) {
        index_ = index;
    }

    @Override
    public String toString() {
        if (index_ > 3)
            return "fload\t" + index_;
        return "fload_" + index_;
    }
}
