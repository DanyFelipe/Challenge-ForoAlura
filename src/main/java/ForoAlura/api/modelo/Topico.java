package ForoAlura.api.modelo;

import ForoAlura.api.topico.DatosActualizarTopico;
import ForoAlura.api.topico.DatosRegistroTopico;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Topicos")
@Entity(name = "Topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String mensaje;
	private String fecha_creacion;
	private String estatus;
	private String autor;

	public Topico(DatosRegistroTopico datosRegistroTopico) {
		this.titulo = datosRegistroTopico.titulo();
		this.mensaje = datosRegistroTopico.mensaje();
		this.fecha_creacion = datosRegistroTopico.fecha_creacion();
		this.estatus = datosRegistroTopico.estatus();
		this.autor = datosRegistroTopico.autor();
	}

	public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {


		if(datosActualizarTopico.titulo() != null){
			this.titulo = datosActualizarTopico.titulo();
		}
		if(datosActualizarTopico.mensaje() != null){
			this.mensaje = datosActualizarTopico.mensaje();
		}
		if(datosActualizarTopico.estatus() != null){
			this.estatus = datosActualizarTopico.estatus();
		}
		if(datosActualizarTopico.autor() != null){
			this.autor = datosActualizarTopico.autor();
		}
	}
}
