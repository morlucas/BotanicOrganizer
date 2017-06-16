package aplicativo.objetos;
import java.io.Serializable;
import java.util.Calendar;

public class Jardim implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int identificador;
	private String proprietario;
	private Calendar dataCriado;
	
	public Jardim(int identificador, String proprietario) {
		super();
		this.identificador = identificador;
		this.proprietario = proprietario;
		dataCriado = Calendar.getInstance();
	}

	public Jardim(int identificador, String proprietario, Calendar dataCriado) {
		super();
		this.identificador = identificador;
		this.proprietario = proprietario;
		this.dataCriado = dataCriado;
	}
	
	public Calendar getDataCriado() {
		return dataCriado;
	}
	public void setDataCriado(Calendar dataCriado) {
		this.dataCriado = dataCriado;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
}
