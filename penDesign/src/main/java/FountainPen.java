public class FountainPen extends Pen implements RefilPen{

    public FountainPen() {
        super(PenType.FOUNTAIN);
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
