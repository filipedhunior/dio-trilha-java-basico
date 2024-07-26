# Representação abstrata de um Iphone via Diagrama de Classes 
```` mermaid
---
title: Iphone Conceitual
---
classDiagram
	Iphone <|-- ReprodutorMusical
	Iphone <|-- aparelhoTelefonico
	Iphone <|-- NavegadorInternet
	class Iphone{
	}
	class ReprodutorMusical{
	+ tocar() void
	+ pausar() void
	+ selecionarMusica(String musica) void
	}
	class aparelhoTelefonico{
	}
	class NavegadorInternet{
	}
````
