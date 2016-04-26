package maxaub.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Socio
 */
@Entity
@Table(name="socio")
public class Socio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer socioId;
	private String dni;
	private String nombre;
	private String apellidos;
	private String email;
	private Integer telefono;
	private String direccion;
	private String clave;
	//private Alumno alumno;
	
	public Socio() {
	}
	
	public Socio(String dni, String nombre, String apellidos, Integer telefono, String direccion, String clave) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.clave = clave;
    }
	
	public Socio(String dni, String nombre, String apellidos, String email, Integer telefono, String direccion, String clave, Alumno alumno) {
       this.dni = dni;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.email = email;
       this.telefono = telefono;
       this.direccion = direccion;
       this.clave = clave;
       //this.alumno = alumno;
    }
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", columnDefinition="NUMBER(19)", unique=true, nullable=false, precision=19)
	public Integer getSocioId() {
		return socioId;
	}
	public void setSocioId(Integer socioId) {
		this.socioId = socioId;
	}
	
	@Column(name="DNI", columnDefinition="VARCHAR2(9 CHAR)", nullable=false, length=9)
	public String getDni() {
		return this.dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Column(name="nombre", columnDefinition="VARCHAR2(16 CHAR)", nullable=false, length=16)
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name="apellidos", columnDefinition="VARCHAR2(25 CHAR)", nullable=false, length=25)
	public String getApellidos() {
		return this.apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Column(name="email", columnDefinition="VARCHAR2(50 CHAR)", nullable=false, length=50)
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="telefono", columnDefinition="NUMBER(11)", nullable=false, precision=11)
	public Integer getTelefono() {
		return this.telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	@Column(name="direccion", columnDefinition="VARCHAR2(50 CHAR)", nullable=false, length=50)
	public String getDireccion() {
		return this.direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Column(name="clave", columnDefinition="VARCHAR2(45 CHAR)", nullable=false, length=45)
	public String getClave() {
        return this.clave;
    }
	public void setClave(String clave) {
        this.clave = clave;
    }
	
//	@ManyToOne(fetch=FetchType.LAZY)
//    @JoinColumn(name="alumno", nullable=false, insertable=true, updatable=true)
//	public Alumno getAlumno() {
//		return this.alumno;
//	}
//	public void setAlumno(Alumno alumno) {
//		this.alumno = alumno;
//	}
}