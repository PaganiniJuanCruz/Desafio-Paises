public class Pais {
	private int id;
	private String nombre;
	private int cod_area;
	
	public Pais(int id, String nombre, int cod_area) {
		this.id = id;
		this.nombre = nombre;
		this.cod_area = cod_area;
		}
	
	public int getId () {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCodArea() {
		return cod_area;
	}
	
	public void setId(int id){this.id = id;}
	public void setNombre(String nombre){this.nombre = nombre;}
	public void setCodArea(int cod_area){this.cod_area = cod_area;}
	
	@Override
	public String toString() {
		return "Pais{"+
				"id=' "+ id + '\''+
				", nombre=' " + nombre + '\'' +
				", codigo de area= "+ cod_area +
				'}';
	}
}
