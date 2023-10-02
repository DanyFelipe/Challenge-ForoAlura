package ForoAlura.api.topico;

import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
		@NotNull String titulo,
		@NotNull String mensaje,
		@NotNull String fecha_creacion,
		@NotNull String estatus,
		@NotNull String autor) {

}
