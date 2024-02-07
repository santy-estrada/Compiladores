package Clase;

import java.math.BigInteger;
import java.util.Objects;

public class VideoJuego {

	private Integer id;
	private String nombre;
	private String desarrolladora;
	private BigInteger ventas;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDesarrolladora() {
		return desarrolladora;
	}
	public void setDesarrolladora(String desarrolladora) {
		this.desarrolladora = desarrolladora;
	}
	public BigInteger getVentas() {
		return ventas;
	}
	public void setVentas(BigInteger ventas) {
		this.ventas = ventas;
	}
	
	
	public VideoJuego(Integer id, String nombre, String desarrolladora, BigInteger ventas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.desarrolladora = desarrolladora;
		this.ventas = ventas;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VideoJuego other = (VideoJuego) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "VideoJuego [nombre=" + nombre + ", ventas="
				+ ventas + ", id=" + id + "]";
	}
	
	
	
	
	
}
