Gerenciamento de Usuários - Projeto CRUD com MongoDB e Java
Este projeto é uma API de CRUD para gerenciamento de usuários, desenvolvida em Java e utilizando o banco de dados MongoDB. A aplicação permite criar, listar, atualizar e excluir usuários, com a interface mostrando as consultas de busca na parte inferior.

Requisitos
Java (versão 11 ou superior)
MongoDB (porta padrão 27017)
Maven ou outra ferramenta para construir o projeto
Instruções para Rodar a Aplicação
Inicializar o MongoDB:

Certifique-se de que o MongoDB está rodando na porta 27017, que é a porta padrão.
Caso precise alterar a porta, ajuste o arquivo de configuração da sua instância do MongoDB.
Rodar a Aplicação Java:

No terminal ou prompt de comando, navegue até a raiz do projeto.
Utilize o comando abaixo para compilar e iniciar o servidor:
bash
Copiar código
mvn spring-boot:run
A aplicação estará disponível na porta 8080.
Acessar a Interface da Aplicação:

No navegador, acesse: http://localhost:8080/usuarios.
Funcionalidades da API
A interface principal da aplicação oferece as seguintes funcionalidades:

Buscar Usuário por Nome:

Permite buscar um usuário específico pelo nome.
Os resultados da busca são exibidos na parte inferior da interface.
Buscar Usuário por ID:

Permite buscar um usuário pelo seu identificador único.
Os resultados são mostrados na parte inferior.
Listar Todos os Usuários:

Exibe uma lista completa de todos os usuários cadastrados na aplicação.
Basta clicar no botão "Listar Todos".
Criar Novo Usuário:

Permite adicionar um novo usuário, preenchendo os dados necessários e salvando-os no banco de dados.
Atualizar Usuário:

Permite atualizar os dados de um usuário existente, especificando seu ID.
Excluir Usuário:

Exclui um usuário do banco de dados utilizando seu ID.
Observações
Todas as operações de busca, incluindo por nome, ID e listagem de usuários, mostram os resultados na parte inferior da interface.
Certifique-se de que as portas 8080 (aplicação) e 27017 (MongoDB) estão liberadas e disponíveis para a execução correta do projeto.