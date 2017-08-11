import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainWind extends JFrame {
	private static final long serialVersionUID = 1337L;

	public MainWind() {
		super("SpamScript V" + SpamScr.VERSION);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		JPanel pan = new JPanel();
		JTextArea feld = new JTextArea();
		feld.setPreferredSize(new Dimension(380, 200));
		feld.setEditable(true);
		feld.setLineWrap(true);
		pan.add(feld);
		JTextField anz = new JTextField();
		anz.setPreferredSize(new Dimension(30, 20));
		pan.add(anz);
		JButton b1 = new JButton("Start the Spam");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = feld.getText();
				int n = 1;
				try {
					n = Integer.parseInt(anz.getText());
				} catch (NumberFormatException exc) {
					JOptionPane.showMessageDialog(null, "Bitte eine Zahl ins kleine Textfeld eingeben.");
				}

				SpamScr.send(s, n);
			}
		});
		pan.add(b1);
		this.add(pan);
		this.setVisible(true);
	}
}
