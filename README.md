# Projeto Restaurante

## Descrição

Este é um projeto acadêmico desenvolvido no 2º semestre do curso de Análise e Desenvolvimento de Sistemas. O objetivo é criar um sistema de gerenciamento para restaurantes, permitindo o cadastro e gerenciamento de informações relacionadas ao funcionamento de um estabelecimento gastronômico.

## Funcionalidades

- **Cadastro de Clientes**: Permite adicionar, atualizar, remover e listar clientes.
- **Gestão de Pedidos**: Facilita a criação, edição e acompanhamento de pedidos realizados.
- **Controle de Estoque**: Gerencia os itens disponíveis no estoque, incluindo entradas e saídas de produtos.

## Tecnologias Utilizadas

- **Linguagem:** Java
- **Build Tool:** Maven
- **Arquitetura:** MVC (Model-View-Controller)
- **Banco de Dados:** PostgreSQL

## Pré-requisitos

- Java 11 ou superior instalado.
- Maven instalado.
- PostgreSQL instalado e em funcionamento.

## Configuração do Banco de Dados

1. **Criação do Banco de Dados:**
   - Acesse o PostgreSQL e crie um novo banco de dados com o nome desejado.

2. **Execução dos Scripts SQL:**
   - Navegue até o diretório `src/main/resources/sql` do projeto.
   - Execute os scripts SQL presentes nesse diretório para criar as tabelas necessárias no banco de dados.

3. **Configuração de Conexão:**
   - Edite o arquivo `src/main/resources/application.properties`.
   - Atualize as propriedades de conexão com o banco de dados, como URL, usuário e senha, conforme as configurações do seu ambiente.

## Compilação e Execução do Projeto

1. **Compilação do Projeto:**
   - No terminal, navegue até o diretório raiz do projeto.
   - Execute o comando para limpar e compilar o projeto:
     ```bash
     mvn clean install
     ```

2. **Execução do Projeto:**
   - Após a compilação bem-sucedida, execute o comando para iniciar a aplicação:
     ```bash
     mvn exec:java -Dexec.mainClass="com.(nomedoprojeto).Main"
     ```


## Contato

Para mais informações, entre em contato:

- **Nome:** Frank Freitas
- **E-mail:** frankguerhardt2@gmail.com
