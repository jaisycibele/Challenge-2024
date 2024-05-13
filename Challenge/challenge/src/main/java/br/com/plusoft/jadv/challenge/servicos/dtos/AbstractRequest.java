package br.com.plusoft.jadv.challenge.servicos.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record AbstractRequest(
		@NotNull
	    @Positive
	    Long id
		) {
	
}
