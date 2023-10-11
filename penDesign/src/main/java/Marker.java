public class Marker extends  Pen implements RefilPen{

    public Marker() {
        super(PenType.MARKER);
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
