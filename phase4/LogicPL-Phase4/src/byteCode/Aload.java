package byteCode;

public class Aload extends ByteCode {
    int index_;

    public Aload(int index) {
        index_ = index;
    }

    @Override
    public String toString() {
        if (index_ <= 3)
            return "aload_" + index_;
        return "aload\t" + index_;
    }
}
