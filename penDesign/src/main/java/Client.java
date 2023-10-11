import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Pen> pens = new ArrayList<>();

        for(Pen pen : pens) {
            if(pen.getType().equals(PenType.BALLPOINT)) {

            }
        }

        GelPen reynoldsTrimaxPen = PenFactory
                .createGelPen()
                .setCanChangeRefil(true)
                .setRefil(new Refil())
                .build();
        reynoldsTrimaxPen.setName("Reynolds Trimax");
        reynoldsTrimaxPen.setCompany("Reynolds");
    }
}
