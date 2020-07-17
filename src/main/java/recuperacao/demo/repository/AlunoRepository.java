package recuperacao.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import recuperacao.demo.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
	Aluno findByMatricula(long matricula);	

}
