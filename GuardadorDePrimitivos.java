//package br.com.faesa.exercicio.modelo;

public class GuardadorDePrimitivos {
	
	private int valores[];
	private int tamanhoDoVetorPreenchido;
	private int tamanho;
	private int contadorWhile;
	private int contadorIf;
	
	
	public int getContadorWhile() {
		return this.contadorWhile;
	}
	
	public int getContadorIf() {
		return this.contadorIf;
	}
	
	
	public GuardadorDePrimitivos(int tamanho){
		this.tamanho = tamanho;
		valores = new int[tamanho];
		tamanhoDoVetorPreenchido = 0;
	}
	
	
	public void gerarElementos() {
		for (int i = 0; i < this.tamanho; i++) {
			int numero = (int) (Math.random() *100) ;
			this.adiciona(numero);
			
		}
	}


	public void adiciona(int elemento) {
		this.valores[this.tamanhoDoVetorPreenchido] = elemento;
		this.tamanhoDoVetorPreenchido++;
	}


	public void verVetor() {
		if (this.tamanhoDoVetorPreenchido == 0) {
			System.out.println("VETOR VAZIO!!");
		}else {
			for (int i = 0; i < this.tamanhoDoVetorPreenchido; i++) {
				if (i % 5 == 0 &&  i!=0) {
					System.out.print(this.getElemento(i)+"\n");
				}else
					System.out.print(this.getElemento(i) +"  ");
					
			}
		}
	}
	
	public int getElemento(int posicao) {
		return this.valores[posicao];
	}


	public void buscaLinear(int elemento) {
		int i = 0;
		
		while((i < this.tamanhoDoVetorPreenchido) && (elemento != this.valores[i])){
			i++;
			this.contadorWhile++;
		}
		if (i == this.tamanhoDoVetorPreenchido){
			System.out.println("não achou!!!");
			this.contadorIf++;
		}else{
			System.out.println("Acho, posicao:   "+ i);
		}
	}
	
	

}
