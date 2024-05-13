package br.com.plusoft.jadv.challenge.servicos.dtos;

import lombok.Builder;

@Builder
public record UsuarioResponse(
		Long idUsuario,
        String nome,
        String email,
        String senha,
        String chaveGoogleAds
		
		) {

}
