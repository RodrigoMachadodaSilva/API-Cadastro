# API-Cadastro

Visão Geral
Projeto de uma API, no padrão MVC , com o intuito de realizar o cadastro e a visualização dos usuários cadastrados no sistema, faz uso de Spring Boot 2.7.10, JDK 17 e Maven , a autenticação do usuário é realizada com o Spring Security Oauth 2 e a documentação com Spring Doc.

Para ilustrar o projeto inclui:

 Controlador de gerenciamento de usuários, onde é possivel cadastrar, listar, buscar pelo identificador e alterar os dados desse usuário, são utilizadas camadas de serviço e repositório, além de DTOs para a representação  das respostas e entrada de dados.
 
 Controlador de gerenciamento de grupos, onde é possivel cadastrar, listar, buscar pelo identificador e alterar os dados desse grupo, são utilizadas camadas de serviço e repositório, além de DTOs para a representação das respostas e entrada de dados, esse grupo serve para relacionar os usuários com suas respectivas permissões de a cesso na API.
 
 Controlador que busca os dados das permissões cadastradas.
 
 Controlador com dois métodos que permitem fazer a associação e dissociação do relacionamento entre usuários e grupos.
 
 Controlador com dois métodos que permitem fazer a associação e dissociação do relacionamento entre grupos e permissões.
 

Tecnologias :

Java

Spring Boot

Spring Data Jpa

Spring Security

Spring Doc

My Sql

Demais Funcionalidades
A aplicação usa o Flyway para migração de banco de dados, ModelMapper para a corversão de Dtos e oferece respostas de erro customizadas e tratamento dessas respostas, através de um ExceptionHandler, com objetivo de auxiliar o usuário, além de validações de entrada com Spring Doc.

Observação: Projeto em fase de desenvolvimento.
