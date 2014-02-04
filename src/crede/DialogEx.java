import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class DialogEx {
    private void createUI() {
        final JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        JButton button1 = new JButton("Top Click");
        JButton button2 = new JButton("Bottom Click");

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new DialogExtend(frame).createUI();
            }
        });

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new DialogWithoutExtend(frame).cretaUI();
            }
        });

        frame.setTitle("Test Dialog Instances.");
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300, 200));
        frame.setVisible(true);
    }

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

    class DialogWithoutExtend {

        private JFrame frame;
        public DialogWithoutExtend(JFrame frame) {
            this.frame = frame;
        }

        public void cretaUI() {
            JDialog dialog = new JDialog();
            dialog.setTitle("Dialog created without extending JDialog class.");
            dialog.setSize(new Dimension(400, 100));
            dialog.setLocationRelativeTo(frame);
            dialog.setModal(true);
            dialog.setVisible(true);
        }
    }
}