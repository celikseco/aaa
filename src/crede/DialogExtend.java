import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JFrame;

class DialogExtend extends JDialog {
        private JFrame frame;
        public DialogExtend(JFrame frame) {
            super(frame);
            this.frame = frame;
        }

        public void createUI() {
            setLocationRelativeTo(frame);
            setTitle("Dialog created by extending JDialog class.");
            setSize(new Dimension(400, 100));
            setModal(true);
            setVisible(true);
        }
    }