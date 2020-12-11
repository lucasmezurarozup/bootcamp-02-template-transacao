package br.com.zup.nossoCartao.transacao.transacao;

import javax.validation.constraints.NotBlank;

public class Cartao {
    @NotBlank
    private String numeroCartao;
    @NotBlank
    private String email;

    public Cartao(@NotBlank String numeroCartao, @NotBlank String email) {
        this.numeroCartao = numeroCartao;
        this.email = email;
    }

    @Deprecated
    private Cartao() {

    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getEmail() {
        return email;
    }
}
