package br.com.etec.biblioteca.cadastro;

public class ClasseInformacoes {

	// Atributo
	String titulosAt;
	String subtitulosAt;
	int numerosPaginasAt;
	String autoresAt;
	String generosAt;
	
	// Construtor vazio
	public ClasseInformacoes(){
	}
	
	// Construtor vazio
	public ClasseInformacoes(String autor, String titulo){
		this.autoresAt = autor;
		this.titulosAt = titulo;
	}
	
	// Getters
	public String getTitulo(){
		return titulosAt;
	}
	
	public String getSubTitulo(){
		return subtitulosAt;
	}
	
	public String getAutores(){
		return autoresAt;
	}
	
	public String getGeneros(){
		return generosAt;
	}
	
	public int getNumeroPaginas(){
		return numerosPaginasAt;
	}
	
	// Setters
	public void setAutores(String name){
		this.autoresAt = name;
	}
	
	public void setTitulos(String title){
		this.titulosAt = title;
	}
	
	public void setSubTitulos(String subtitle){
		this.subtitulosAt = subtitle;
	}
	
	public void setGeneros(String gender){
		this.generosAt = gender;
	}
	
	public void setNumerosPaginas(int page){
		this.numerosPaginasAt = page;
	}
	
	// Método próprio
	public void mostrarDados(){
		System.out.println("Informações do Produto:");  // sysout + ctrl + space
		System.out.println(titulosAt);
		System.out.println(subtitulosAt);
		System.out.println(autoresAt);
		System.out.println(generosAt);
		System.out.println(numerosPaginasAt);
	}
	
	
	
}
