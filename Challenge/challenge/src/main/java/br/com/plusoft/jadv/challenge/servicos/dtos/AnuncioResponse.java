package br.com.plusoft.jadv.challenge.servicos.dtos;

import lombok.Builder;

@Builder
public record AnuncioResponse(
		Long idAnuncio,
		String titulo,
		String textoAnuncio,
		String urlAnuncio,
		String tipoAnuncio,
		String dataCriacao,
		Long impressoes,
		Long qtdCliques,
		Double custoAnuncio,
		
		UsuarioResponse usuario
		
		) {

}
