package recuperacao.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import recuperacao.demo.dtos.AlunoDto;
import recuperacao.demo.entity.Aluno;
import recuperacao.demo.repository.AlunoRepository;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {
	
		
	@Autowired
	AlunoRepository repository;
	
	
	@GetMapping()
	public ResponseEntity<?> listar(){		
		List<Aluno> alunos = repository.findAll();	
		return ResponseEntity.status(HttpStatus.OK).body(alunos);		
	}
	
	
	@PostMapping()
	public ResponseEntity<?> cadastrar(@RequestBody  AlunoDto alunoDto) {
				
		Aluno aluno =  repository.save(alunoDto.transformaAlunoDto());	
		return ResponseEntity.status(HttpStatus.OK).body(aluno);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> deletar(@PathVariable long id) {
				
		 repository.deleteById(id);	
		return ResponseEntity.status(HttpStatus.OK).body("Delete com sucesso!");
	}
	
	
	@GetMapping("/atualizar")
	public ResponseEntity<?> listarPorId(@RequestBody  AlunoDto alunoDto){	
		
		Aluno aluno = repository.findByMatricula(alunoDto.getMatricula());
		
		if(!aluno.equals(null))
			if(alunoDto.getEmail()!= aluno.getEmail()) {
				aluno.setEmail(alunoDto.getEmail());
				repository.save(aluno);
			}
			
		return ResponseEntity.status(HttpStatus.OK).body(aluno);
	}
		
		
}
