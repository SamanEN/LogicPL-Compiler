package byteCode.ISA;

public class Iload extends ByteCode {
    int index_;

    public Iload(int index) {
        index_ = index;
    }

    @Override
    public String toString() {
        if (index_ <= 3)
            return "iload_" + index_;
        return "iload\t" + index_;
    }
}
