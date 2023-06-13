package byteCode;

public class Bipush extends ByteCode {
    private int value_;

    public Bipush(int value) {
        value_ = value;
    }

    @Override
    public String toString() {
        return "bipush\t" + value_;
    }
}
