package ForoAlura.api.topico;

import ForoAlura.api.modelo.Topico;

public record DatosListadoTopico(Long id, String titulo, String mensaje, String fecha_creacion, String estatus, String autor) {

	public DatosListadoTopico(Topico topico) {
		this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha_creacion(), topico.getEstatus(), topico.getAutor());
	}
}
