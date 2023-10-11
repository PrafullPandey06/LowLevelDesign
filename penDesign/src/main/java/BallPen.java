import strategies.writestrategies.WriteBehaviour;

public class BallPen extends Pen implements RefilPen{

    // Builder + factory
    public BallPen(WriteBehaviour writeBehaviour) {
        super(PenType.BALLPOINT, writeBehaviour);
    }
    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public void write() {

    }

    public Refil getRefil() {
        return null;
    }

    public boolean canChangeRefil() {
        return false;
    }

    public void changeRefil(Refil newRefil) {

    }




}
