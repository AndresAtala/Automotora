public abstract class Persona {

	private String nombre;
	private String apellido;
	private String direccion;
	private String rut;
	private String nroTelefono;
	public Persona() {
	}

	public Persona(String nombre, String apellido, String rut, String direccion, String nroTelefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
		this.direccion = direccion;
		this.nroTelefono = nroTelefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNroTelefono() {
		return nroTelefono;
	}

	public void setNroTelefono(String nroTelefono) {
		this.nroTelefono = nroTelefono;
	}
}
