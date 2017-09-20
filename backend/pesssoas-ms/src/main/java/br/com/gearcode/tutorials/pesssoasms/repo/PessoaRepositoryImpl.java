package br.com.gearcode.tutorials.pesssoasms.repo;

import br.com.gearcode.tutorials.pesssoasms.entity.IPessoa;
import br.com.gearcode.tutorials.pesssoasms.entity.PessoaFisica;
import br.com.gearcode.tutorials.pesssoasms.entity.PessoaJuridica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by luan on 19/09/17.
 */
public class PessoaRepositoryImpl implements PessoaRepository {

    @Autowired
    private PessoaFisicaRepository repositoryPessoaFisica;
    @Autowired
    private PessoaJuridicaRepository repositoryPessoaJuridica;


    @Override
    public <S extends IPessoa> S save(S s) {
        return null;
    }

    @Override
    public IPessoa findOne(String s) {
        return null;
    }

    @Override
    public boolean exists(String s) {
        return false;
    }

    @Override
    public List<IPessoa> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void delete(IPessoa iPessoa) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends IPessoa> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends IPessoa> boolean exists(Example<S> example) {
        return false;
    }
}
