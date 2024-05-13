package br.com.plusoft.jadv.challenge.servicos.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UsuarioRequest(
		
		@NotNull
	    @NotBlank
	    @Size(min = 2, max = 255)
	    String nome,
	    @NotNull
	    @NotBlank
	    @Size(min = 2, max = 255)
	    String email,
	    @NotNull
	    @NotBlank
	    @Size(min = 2, max = 255)
	    String senha,
	    @NotNull
	    @NotBlank
	    @Size(min = 2, max = 255)
	    String chaveGoogleAds
		
		) {

	
}
