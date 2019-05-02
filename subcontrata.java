package examen;

public class subcontrata extends Proveedor{
	
	public int personal=0;
	
	public subcontrata(String[]datos, int personal) {
		super(datos);
		this.personal=personal;
	}
	
	
	public int getPersonal() {
		return personal;
	}



	public void setPersonal(int personal) {
		this.personal = personal;
	}



	@Override
	public String toString() {
		return "Subcontrata [n_personas=" + getPersonal() + ", codigo=" + getCodigo() + ", cif=" + getCif() + ", nombre=" + getNombre()
				+ ", contacto=" + contacto + "]";
	}

}
