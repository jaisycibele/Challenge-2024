package br.com.plusoft.jadv.challenge.servicos.dtos;

import lombok.Builder;

@Builder
public record CampanhaResponse(
		Long idCampanha,
		String nomeCampanha,
		String orcamento,
		String dataInicio,
		String dataTermino,
		String status,
		String tipoCampanha,
		
		AnuncioResponse anuncio
		) {
	
	
}
