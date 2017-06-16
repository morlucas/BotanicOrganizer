package tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

import aplicativo.actionListeners.NovoJardim;

public class TelaPrincipal {
	static JFrame tela;
	private LayoutManager borderPrincipal;

	
	private JMenuBar menu;
	private JMenu arq;
	private JMenuItem abrir;
	private JMenuItem salvar;
	private JMenuItem sair;
	private JMenuItem nJar;
	
	JPanel panePrincipal;
	
	public TelaPrincipal() {
		super();
		menu = new JMenuBar();
		arq = new JMenu("Arquivo");
		abrir = new JMenuItem("Abrir");
		salvar = new JMenuItem("Salvar");
		sair = new JMenuItem("Sair");
		nJar = new JMenuItem("Novo Jardim");
		
		panePrincipal = new JPanel();
		borderPrincipal = new BorderLayout();
		tela = new JFrame("Organizador");
	}
	
	public void criarTela(){
		//configuracao de tela
		configTela();
		
		//config Menu
		configMenu();
	}
	
	private void configTela(){
		
		tela.setBackground(Color.GREEN);
		tela.setSize(ConstantesTela.dimensaoTela());
		tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		tela.setVisible(true);
		
		tela.add(panePrincipal);
		
		//configuracao layout
		panePrincipal.setLayout(borderPrincipal);
		panePrincipal.add(menu, BorderLayout.NORTH);
		
		
	}
	
	private void configMenu(){
		menu.add(arq);
		arq.add(nJar);
		arq.add(abrir);
		arq.add(salvar);
		arq.add(sair);
		
		nJar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		ActionListener tl = new NovoJardim();
		nJar.addActionListener(tl);
	}
	
	public JFrame getTela() {
		return tela;
	}

	public void setTela(JFrame tela) {
		this.tela = tela;
	}
	
}
