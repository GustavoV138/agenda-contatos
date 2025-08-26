📒 Agenda Telefônica em Java

Um projeto simples desenvolvido em Java puro para treinar Orientação a Objetos (OO) e os conceitos básicos de CRUD (Create, Read, Update, Delete).

🚀 Funcionalidades

Adicionar um novo contato (nome, telefone, email, endereço).

Listar todos os contatos cadastrados.

Atualizar os dados de um contato a partir do telefone.

Remover contatos existentes.

Validações básicas (ex.: não permitir campo de telefone vazio, mensagens quando não encontra contato).

🛠️ Tecnologias utilizadas

Java 17+ (pode ser ajustado conforme sua versão).

Nenhuma dependência externa, por enquanto. Apenas Java puro.

📂 Estrutura básica do projeto
src/
└── agenda/
├── entity/
│    └── Contato.java      # Classe que representa um contato
│    └── Endereco.java      # Classe que representa um endereço de um contato
│    └── Agenda.java      # Classe que representa a agenda com os contatos
├── service/
└── Main.java              # Classe principal para rodar o projeto

🎯 Objetivo

Este projeto foi feito para praticar fundamentos de Java e OO, servindo como ponto de partida para evoluir futuramente para:

Persistência de dados em banco (ex.: H2, MySQL).

Criação de APIs usando Spring Boot.

Testes automatizados (JUnit).

📌 Próximos passos (ideias de evolução)

Refatorar código para melhorar clareza e legibilidade.

Implementar persistência de contatos em arquivo ou banco de dados.

Criar interface web com Spring Boot.