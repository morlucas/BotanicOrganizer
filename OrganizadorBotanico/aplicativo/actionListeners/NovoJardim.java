package aplicativo.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import tela.JanelaNovoJardim;

public class NovoJardim implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JanelaNovoJardim jnj = new JanelaNovoJardim();
		jnj.show();
		
		
	}
	
}
