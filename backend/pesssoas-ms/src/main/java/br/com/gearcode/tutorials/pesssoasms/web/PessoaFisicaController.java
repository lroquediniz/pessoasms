package br.com.gearcode.tutorials.pesssoasms.web;


import br.com.gearcode.tutorials.pesssoasms.entity.PessoaFisica;
import br.com.gearcode.tutorials.pesssoasms.repo.PessoaFisicaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/pessoa/fisica")
public class PessoaFisicaController {

    @Autowired
    private PessoaFisicaRepository repository;


    @RequestMapping(method = RequestMethod.POST)
    public void createBook(@RequestBody PessoaFisica book) {
        repository.save(book);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<PessoaFisica> findAllBooks() {
        return repository.findAll();
    }

    @RequestMapping( method = RequestMethod.GET, value = "/{id}")
    public PessoaFisica findBookById(@PathVariable String id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public void deleteBookWithId(@PathVariable String id) {
        repository.delete(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAllBooks() {
        repository.deleteAll();
    }
}
