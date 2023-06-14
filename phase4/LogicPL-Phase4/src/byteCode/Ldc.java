package byteCode;

public class Ldc extends ByteCode {
    private String index_;

    public Ldc(String index) {
        index_ = index;
    }

    @Override
    public String toString() {
        return "ldc\t" + index_;
    }
}
