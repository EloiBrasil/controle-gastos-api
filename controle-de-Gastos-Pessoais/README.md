# Controle de Gastos Pessoais

## Objetivo
Este projeto tem como objetivo fornecer uma aplicação para controle de gastos pessoais, permitindo ao usuário registrar, consultar e gerenciar suas despesas de forma simples e eficiente.

## Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot**
- **Maven**
- **Spring Data JPA**
- **PostGre ou H2** (ou outro banco relacional configurável)

## Como Usar

1. **Clone o repositório:**
   ```bash
   git clone <url-do-repositorio>
   ```
2. **Acesse a pasta do projeto:**
   ```bash
   cd controle-de-Gastos-Pessoais
   ```
3. **Execute o projeto:**
   - Via terminal:
     ```bash
     ./mvnw spring-boot:run
     ```
   - Ou importe em sua IDE favorita (IntelliJ, Eclipse, VS Code) e rode a classe `ControleDeGastosPessoaisApplication`.
4. **Acesse a aplicação:**
   - Por padrão, estará disponível em: [http://localhost:8080](http://localhost:8080)

## Estrutura do Projeto
- `Controller/`: Camada responsável pelas rotas e requisições HTTP.
- `Model/`: Entidades e modelos de dados.
- `Repository/`: Interface de persistência de dados.
- `Services/`: Lógica de negócio.
- `resources/`: Configurações e templates.

## Possíveis Melhorias
- Implementar autenticação e autorização de usuários.
- Adicionar testes unitários e de integração.
- Criar interface web responsiva (frontend).
- Permitir exportação de relatórios (PDF/Excel).
- Internacionalização (i18n).
- Deploy em nuvem (Heroku, Azure, AWS).

---

> Para dúvidas ou sugestões, contribua com issues ou pull requests.
