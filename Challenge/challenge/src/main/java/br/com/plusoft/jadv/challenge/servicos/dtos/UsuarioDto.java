package br.com.plusoft.jadv.challenge.servicos.dtos;

import br.com.plusoft.jadv.challenge.entidades.Usuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UsuarioDto {

    @NotBlank(message = "Nome do usuário deve ser informado")
    private String nome;

    @NotBlank(message = "Email do usuário deve ser informado")
    @Email(message = "Email do usuário deve ser válido")
    private String email;

    @NotBlank(message = "Senha do usuário deve ser informada")
    private String senha;
    
    @NotBlank(message="Chave Google Ads deve ser informada")
    private String chaveGoogleAds;

    // Construtor padrão sem argumentos
    public UsuarioDto() {
    }

    // Construtor com argumentos para converter um objeto Usuario em UsuarioDto
    public UsuarioDto(Usuario novoUsuario) {
        this.nome = novoUsuario.getNome();
        this.email = novoUsuario.getEmail();
        // Você pode definir a senha como null ou vazia, dependendo dos requisitos
        this.senha = "";
        this.chaveGoogleAds = novoUsuario.getChaveGoogleAds();
    }

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setChaveGoogleAds(String chaveGoogleAds) {
        this.chaveGoogleAds = chaveGoogleAds;
    }

    public String ChaveGoogleAds() {
        return chaveGoogleAds;
    }

}