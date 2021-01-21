package br.com.projetozup.springbootapi.controller;

import br.com.projetozup.springbootapi.model.Pessoa;
import br.com.projetozup.springbootapi.repository.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bancos")
public class bController {

    @Autowired //instanciar implementação em tempo de exec.
    private BancoRepository bancoRepository;

    @GetMapping
    public List<Pessoa> listar() {
    return bancoRepository.findAll();

    }
     //resposta com OK(200) ou NOT_FOUND
    //Busca elaborada pelo id da pessoa com a ulr devida

    @RequestMapping(path = "buscarIdPessoa/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pessoa> GetById(@PathVariable(value = "id") Long id)
    {
        Optional<Pessoa> pessoa = bancoRepository.findById(id);
        if(pessoa.isPresent())
            return new ResponseEntity<>(pessoa.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "buscarIdPessoa/{id}", method =  RequestMethod.PUT)
    public ResponseEntity<Pessoa> Put(@PathVariable(value = "id") long id, @Validated @RequestBody Pessoa newPessoa)
    {
        Optional<Pessoa> oldPessoa = bancoRepository.findById(id);
        if(oldPessoa.isPresent()){
            Pessoa pessoa = oldPessoa.get();
            pessoa.setNome(newPessoa.getNome());
            bancoRepository.save(pessoa);
            return new ResponseEntity<>(pessoa, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa cadastrar(@RequestBody Pessoa pessoa){
        return bancoRepository.save(pessoa);
    }

    @RequestMapping(value = "deletarIdPessoa/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id)
    {
        Optional<Pessoa> pessoa = bancoRepository.findById(id);
        if(pessoa.isPresent()){
            bancoRepository.delete(pessoa.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



}

