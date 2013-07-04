ClientManager
=============

Um operador de telecomunicações pretende uma aplicação informática para gerir os seus clientes e que permita calcular a mensalidade de qualquer um deles. Este valor é em função dos serviços contratados.
Os serviços disponiblizados pela operadora são dois: telefone e internet. O serviço de telefone é caracterizado por uma designação alfanumérica (código do operador), pelo número de telefone e por um custo mensal igual para todos os telefones. O serviço de internet é caracterizado por uma designação ("20M" ou "100M"), por uma conta (valor alfanumérico) e por um custo mensal que depende da velocidade contratada: 20 ou 100 Mbps.
Os clientes são caracterizados pelo nome, número de cliente e serviços contratados. Um cliente pode contratar um ou mais serviços de telefone e/ou de internet.


----------

**Para desenvolver a aplicação:**

1. Crie uma classe de exceção, chamada NumeroClienteInvalidoException, para permitir à aplicação lidar com números de cliente inválidos passados por parâmetro. Objectos desta classe devem permitir à aplicação o número inválido que originou a exceção.

2. Crie classes adequadas para construir objectos representativos de clientes e serviços, que satisfaçam os seguintes requisitos:
	- Cada classe tem de possuir um construtor completo (com uma lista de parâmetros completa para inicializar todos os campos de dados).
	- Apenas deve ser validado o parâmetro que recebe o número de cliente. Este número deve ser um número inteiro positivo, caso contrário, deve originar uma exceção do tipo criado no ponto 1.
	- Os custos dos serviços devem poder ser modificados pelo utilizador da aplicação.
	- Cada objecto representativo de um cliente deve:
		- Guardar um ou mais serviços contratados;
		- Permitir adicionar novos serviços contratados, em qualquer momento;
		- Permitir calcular a mensalidade do cliente (soma dos custos dos serviços contratados).

3. Crie a classe principal para testar as classes criadas anteriormente e que satisfaça os seguintes requisitos:
	- Crie um objecto representativo de um cliente que contrata dois tipos de serviços disponíveis
	- Crie um contentor de objectos de tipo genérico e que permita guardar qualquer cliente
	- Guarde um objecto cliente criado no contentor
	- Ordene o contentor por ordem alfabética dos nomes dos clientes armazenados
	- Imprima na consola uma listagem das mensalidades dos clientes guardados no contentor, juntamente com o respectivo nº de cliente. A mensalidade deve ser mostrada formatada com duas casas decimais.
	- O bloco de tratamento de excepções deve imprimir na consola o valor que originou a exceção

