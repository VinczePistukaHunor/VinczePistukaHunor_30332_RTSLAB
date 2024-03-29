import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.util.Observable;
import java.util.Observer;

public class Window extends JFrame implements Observer {

    ArrayList<JProgressBar> bars = new ArrayList<JProgressBar>();

    public Window(int nrThreads, FirModel model) {
        setLayout(null);
        setSize(450, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init(nrThreads);
        model.addObserver(this);
        this.setVisible(true);
    }

    private void init(int n) {
        for (int i = 0; i < n; i++) {
            JProgressBar pb = new JProgressBar();
            pb.setMaximum(1000);
            pb.setBounds(50, (i + 1) * 30, 350, 20);
            this.add(pb);
            this.bars.add(pb);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof FirProgress) {
            FirProgress progress = (FirProgress) arg;
            bars.get(progress.getId()).setValue(progress.getProgress());
        }
    }
}
