package br.com.dengueefocoApp.model;

public enum Status {
	NAO_ENVIANDO("Não enviado"), AGUARDANDO("Aguardando aprovação"), APROVADO("Aprovado");

	public String valor;
	Status(String valor) {
		this.valor = valor;
	}

}
