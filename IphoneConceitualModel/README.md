# Representação abstrata de um Iphone via Diagrama de Classes 
```` mermaid
---
title: Iphone Conceitual
---
classDiagram
	Iphone <|-- ReprodutorMusical
	Iphone <|-- AparelhoTelefonico
	Iphone <|-- NavegadorInternet
	
	class Iphone{
	}
	
	class ReprodutorMusical{
	    <<interface>> 
	+ tocar() void
	+ pausar() void
	+ selecionarMusica(String musica) void
	}

	class AparelhoTelefonico{
	    <<interface>> 
	+ ligar(String numero) void
	+ atender() void
	+ iniciarCorreioVoz() void
	}
	
	class NavegadorInternet{
	    <<interface>> 
	+ exibirPagina(String url) void
	+ adicionarNovaAba()void
	+ atualizarPagina() void
	}
````
