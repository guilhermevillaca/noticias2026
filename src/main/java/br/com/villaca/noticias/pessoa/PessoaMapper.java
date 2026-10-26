package br.com.villaca.noticias.pessoa;

import br.com.villaca.noticias.core.GenericMapper;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PessoaMapper implements GenericMapper<Pessoa, PessoaDTO> {
    @Override
    public PessoaDTO toDTO(Pessoa pessoa) {
        return new PessoaDTO(
                pessoa.getId(),
                pessoa.getNome(),
                pessoa.getNomeSocial(),
                pessoa.getNomeMae(),
                pessoa.getNomePai(),
                pessoa.getDataNascimento(),
                pessoa.getSexo(),
                pessoa.getEstadoCivil(),
                pessoa.getNacionalidade(),
                pessoa.getNaturalidade(),
                pessoa.getRaca(),
                pessoa.getCor(),
                pessoa.getCpf(),
                pessoa.getRg(),
                pessoa.getOrgaoExpedidorRg(),
                pessoa.getUfRg(),
                pessoa.getCnh(),
                pessoa.getCategoriaCnh(),
                pessoa.getValidadeCnh(),
                pessoa.getProfissao(),
                pessoa.getOrganizacao(),
                pessoa.getCargo(),
                pessoa.getDataAdmissao(),
                pessoa.getAtivo(),
                pessoa.getDataCadastro(),
                pessoa.getObservacao()
        );
    }

    @Override
    public Pessoa toEntity(PessoaDTO pessoaDTO) {
        return new Pessoa(
                pessoaDTO.id(),
                pessoaDTO.nome(),
                pessoaDTO.nomeSocial(),
                pessoaDTO.nomeMae(),
                pessoaDTO.nomePai(),
                pessoaDTO.dataNascimento(),
                pessoaDTO.sexo(),
                pessoaDTO.estadoCivil(),
                pessoaDTO.nacionalidade(),
                pessoaDTO.naturalidade(),
                pessoaDTO.raca(),
                pessoaDTO.cor(),
                pessoaDTO.cpf(),
                pessoaDTO.rg(),
                pessoaDTO.orgaoExpedidorRg(),
                pessoaDTO.ufRg(),
                pessoaDTO.cnh(),
                pessoaDTO.categoriaCnh(),
                pessoaDTO.validadeCnh(),
                pessoaDTO.profissao(),
                pessoaDTO.organizacao(),
                pessoaDTO.cargo(),
                pessoaDTO.dataAdmissao(),
                pessoaDTO.ativo(),
                pessoaDTO.dataCadastro(),
                pessoaDTO.observacao()

        );
    }
}
