package br.com.gearcode.tutorials.pesssoasms.repo;

import br.com.gearcode.tutorials.pesssoasms.entity.PessoaFisica;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface PessoaFisicaRepository extends MongoRepository <PessoaFisica, String> {

    public PessoaFisica findByCpf(String cpf);

    public List<PessoaFisica> findByPessoa_Nome(String nome);
}
