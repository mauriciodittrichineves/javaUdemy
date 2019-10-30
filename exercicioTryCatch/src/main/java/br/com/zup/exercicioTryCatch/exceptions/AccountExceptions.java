package br.com.zup.exercicioTryCatch.exceptions;

public class AccountExceptions extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AccountExceptions (String mensagem) {
		super(mensagem);
	}
	
}
