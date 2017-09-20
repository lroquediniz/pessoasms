package br.com.gearcode.tutorials.pesssoasms.repo;

import br.com.gearcode.tutorials.pesssoasms.entity.IPessoa;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by luan on 19/09/17.
 */
public interface PessoaRepository {

    public <S extends IPessoa> S save(S s);

    public IPessoa findOne(String s);

    public boolean exists(String s);

    public List<IPessoa> findAll();

    public long count();

    public void delete(String s);

    public void delete(IPessoa iPessoa);

    public void deleteAll();

    public <S extends IPessoa> long count(Example<S> example);

    public <S extends IPessoa> boolean exists(Example<S> example);

}
