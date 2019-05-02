package examen;

public class suministros extends Proveedor{
	
	public int retencion=0;
	
	public suministros(String[]datos,int retencion) {
		super(datos);
		this.retencion=retencion;
	}
	
	
	
	public int getRetencion() {
		return retencion;
	}



	public void setRetencion(int retencion) {
		this.retencion = retencion;
	}



	public String ToString() {
		return "Suministro [retencion=" + getRetencion() + ", codigo=" + getCodigo() + ", cif=" + getCif() + ", nombre=" + getNombre()
				+ ", contacto=" + contacto + "]";
	}

}
