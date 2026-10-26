package br.com.villaca.noticias.pessoa;

import br.com.villaca.noticias.core.GenericService;
import br.com.villaca.noticias.pais.Pais;
import org.springframework.stereotype.Service;

@Service
public class PessoaService extends GenericService<Pessoa, PessoaDTO, Integer> {

    public PessoaService(PessoaRepository repository, PessoaMapper mapper){
        super(repository, mapper);
    }

    @Override
    public PessoaDTO atualizar(Integer id, PessoaDTO pessoaDTO) {
        Pessoa pessoa = repository.findById(id).orElse(null);
        if(pessoa == null){
            return null;
        }
        pessoa.setNome(pessoaDTO.nome());
        pessoa.setNomeSocial(pessoaDTO.nomeSocial());
        //fazer demais atributos

        Pessoa pessoaAtualizado = repository.save(pessoa);
        return mapper.toDTO(pessoaAtualizado);
    }
}
