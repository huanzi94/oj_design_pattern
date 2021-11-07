package visitorpattern;

/**
 * CPU
 */
public class Cpu extends HardWare{

    public Cpu() {
    }

    @Override
    void accept(Visitor visitor) {
        visitor.CPUVisitor(this);
    }
}
