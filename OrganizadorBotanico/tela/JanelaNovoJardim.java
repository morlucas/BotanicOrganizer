package tela;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.security.AlgorithmConstraints;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JanelaNovoJardim {
	private JDialog jd;
	private JPanel pane,paneCentro,paneButtons;
	private JTextField info1,info2;
	private JLabel prop,id;
	private JButton criar,cancelar;
	private BoxLayout bl;
	
	
	public void show(){
		paneCentro = new JPanel();
		paneButtons = new JPanel();
		pane = new JPanel();
		prop = new JLabel("Proprietário:");
		id = new JLabel("Identificador");
		info1 = new JTextField();
		info2 = new JTextField();
		criar = new JButton("Criar Jardim");
		cancelar = new JButton("Cancelar");
		
		Dimension dtxt = ConstantesTela.dimensaoTelaInfo();
		dtxt.height = 25;
		info1.setMaximumSize(dtxt);
		info2.setMaximumSize(dtxt);
		
		jd = new JDialog(TelaPrincipal.tela, "Novo Jardim", Dialog.ModalityType.DOCUMENT_MODAL);
		jd.setLocationRelativeTo(TelaPrincipal.tela);
		jd.setSize(ConstantesTela.dimensaoTelaInfo());

		bl = new BoxLayout(pane, BoxLayout.Y_AXIS);
		pane.setLayout(bl);
		
		bl = new BoxLayout(paneButtons, BoxLayout.X_AXIS);
		paneButtons.setLayout(bl);
		paneButtons.add(criar);
		paneButtons.add(cancelar);
		jd.add(paneCentro);
		
		paneCentro.setLayout(new BorderLayout());
		paneCentro.add(pane,BorderLayout.CENTER);
		paneCentro.add(paneButtons,BorderLayout.SOUTH);
		
		pane.setSize(ConstantesTela.dimensaoTelaInfo());
		pane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		pane.add(prop);
		pane.add(info1);
		
		info1.setAlignmentX(SwingConstants.CENTER);
		pane.add(id);
		pane.add(info2);
		info2.setAlignmentX(SwingConstants.CENTER);

		jd.setVisible(true);
	}
}
