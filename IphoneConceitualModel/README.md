# Representação abstrata de um Iphone via Diagrama de Classes

Ultilizando o conceito de `interface`, `herança`, `abstração` e `polimorfismo`, pude desenvolver um molde conceitual de um Iphone em seu lançamento em 2007.

O grande diferencial deste telefone, era a capacidade de emular três outros dispositivos distintos, nele mesmo.

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
