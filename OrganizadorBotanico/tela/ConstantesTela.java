package tela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ConstantesTela {
	private static Dimension d;
	private static Dimension dime(){
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		return d;
	}
	public static Dimension dimensaoTelaInfo(){
		d = dime();
		d.width = (int) Math.round(d.width*0.30);
		d.height = (int) Math.round(d.height*0.30);
		return d;
	}
	public static Dimension dimensaoTela(){
		d = dime();
		d.width = (int) Math.round(d.width*0.8);
		d.height = (int) Math.round(d.height*0.8);
		return d;
	}
}
