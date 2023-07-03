# Biblioteca-Jogos-API
Este é um projeto de API REST desenvolvido utilizando o framework Spring Boot. A API tem como objetivo fornecer funcionalidades relacionadas à gestão de uma biblioteca virtual de jogos, incluindo cadastro, atualização, listagem e exclusão de médicos.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.1
- Spring Data JPA 3.1.1
- Maven
- HATEOAS
- PostgreSQL

## Pré-requisitos

- JDK 8 ou superior
- Maven

## Configuração do Projeto
1. Clone o repositório do projeto: `https://github.com/TiagoPantoja/Biblioteca-Jogos-API.git`
2. Navegue até o diretório raiz do projeto: `cd src`
3. Compile o projeto com o Maven: `mvn compile`
4. Execute o projeto: `mvn spring-boot:run`

A API estará disponível em `http://localhost:8080/biblioteca`

## Dependências
O projeto utiliza as seguintes dependências:

`spring-boot-starter-web`: Fornece as dependências necessárias para criar uma aplicação web com Spring Boot.

`spring-boot-devtools`: Fornece ferramentas de desenvolvimento para agilizar o processo de desenvolvimento.

`lombok`: Biblioteca que simplifica a criação de classes Java, gerando automaticamente os getters, setters, construtores e outros métodos comuns.

`spring-boot-starter-test`: Fornece as dependências necessárias para realizar testes na aplicação.

`spring-boot-starter-data-jpa`: Fornece suporte ao Spring Data JPA para persistência de dados.

`spring-boot-starter-validation`: Fornece suporte à validação de dados usando as anotações de validação do Bean Validation.

## Banco de Dados
O projeto utiliza um banco de dados PostgreSQL para armazenar os dados dos médicos. Certifique-se de ter um servidor MySQL em execução e atualize as configurações de conexão no arquivo `application.properties` com as informações corretas do seu banco de dados.

## Executando o Projeto
Para executar o projeto, você pode utilizar o comando abaixo:

`mvn spring-boot:run`

A aplicação será iniciada e estará disponível no endereço `http://localhost:8080`.

## Endpoints
A API possui os seguintes endpoints:

`POST /`: Cadastra um novo jogo com base nos dados fornecidos no corpo da requisição.

`GET /findAll`: Retorna uma lista paginada com todos os jogos ativos.

`PUT /`: Atualiza as informações de um jogo existente com base nos dados fornecidos no corpo da requisição.

`DELETE /jogos/{id}`: Exclui um jogo com o ID especificado.

## Estrutura do Projeto
A estrutura do projeto segue uma organização padrão do Spring Boot, onde os arquivos Java estão agrupados em pacotes de acordo com sua funcionalidade.

`controller`: Contém os controladores da API responsáveis por receber as requisições e retornar as respostas adequadas.

`endereco`: Contém as classes relacionadas aos dados de endereço.

`jogos`: Contém as classes relacionadas aos médicos, incluindo as entidades, os DTOs e o repositório.

`ApiApplication.java`: Classe principal responsável por iniciar a aplicação Spring Boot.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request com melhorias, correções de bugs ou novos recursos.
