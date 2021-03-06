package maxaub.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Ejemplar
 */
@Entity
@Table(name="libroejemplar")
public class Ejemplar implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", columnDefinition="INT(11)", unique=true, nullable=false, precision=11)
	private int id;
	
	@Column(name="estado", columnDefinition="INT(1)", nullable=false, precision=1)
	private int estado;
	
	//bi-directional one-to-one association to Libro
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="librogenerico_id", referencedColumnName="id")
	private Libro libro;
	
	public Ejemplar() {
		super();
	}
	
	public Ejemplar(int estado, Libro libro) {
		super();
		this.estado = estado;
		this.libro = libro;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
		
	public int getEstado() {
		return this.estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public Libro getLibro() {
		return this.libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
}