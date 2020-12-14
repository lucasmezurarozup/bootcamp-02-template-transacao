package br.com.zup.nossoCartao.transacao.transacao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransacaoRepository extends CrudRepository<Transacao, Long> {
    List<Transacao> findTop10ByCartaoId(String numeroCartao);
}
