package ForoAlura.api.controller;

import java.util.List;

import ForoAlura.api.topico.DatosActualizarTopico;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ForoAlura.api.modelo.TopicoRepository;
import ForoAlura.api.topico.DatosListadoTopico;
import ForoAlura.api.topico.DatosRegistroTopico;
import jakarta.validation.Valid;
import ForoAlura.api.modelo.Topico;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

	@Autowired
	private TopicoRepository topicoRepository;
	
	@PostMapping
	public void resgistrarTopico(@RequestBody @Valid DatosRegistroTopico request){
		topicoRepository.save(new Topico(request));
	}
	@GetMapping
	public List<DatosListadoTopico>ListadoTopicos(){
		return topicoRepository.findAll().stream().map(DatosListadoTopico::new).toList();
	}
	@PutMapping
	@Transactional
	public void actualizarTopico(@RequestBody @Valid DatosActualizarTopico request){
		try {
			Topico topico = topicoRepository.getReferenceById(request.id());
			topico.actualizarDatos(request);
		}catch (Exception e){
			System.out.println("ID no encontrado");
		}
	}
	@DeleteMapping("/{id}")
	@Transactional
	public void eliminarTopico(@PathVariable Long id){
		Topico topico = topicoRepository.getReferenceById(id);
		topicoRepository.delete(topico);
	}
}
