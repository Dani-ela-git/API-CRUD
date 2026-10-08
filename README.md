# API CRUD - Usuários

API REST para gerenciamento de usuários, desenvolvida com **Java 17** e **Spring Boot 3**.

##  Sobre o projeto

Este projeto foi criado com o objetivo de praticar e consolidar os principais conceitos de desenvolvimento de APIs REST com Spring Boot, incluindo:

- Arquitetura em camadas (Controller, Service, Repository, Model, DTO)
- Mapeamento objeto-relacional com JPA/Hibernate
- Validação de dados de entrada
- Boas práticas REST (status HTTP, versionamento de rotas, DTOs)
- Banco de dados em memória para desenvolvimento

##  Tecnologias utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Web** — criação dos endpoints REST
- **Spring Data JPA** — persistência de dados
- **Hibernate** — implementação JPA
- **H2 Database** — banco em memória para desenvolvimento
- **Jakarta Validation** — validação de dados (`@NotBlank`, `@Email`, etc.)
- **Lombok** — redução de código boilerplate
- **Maven** — gerenciamento de dependências

### Responsabilidade de cada camada

| Camada | Responsabilidade |
|--------|------------------|
| `controller` | Receber requisições HTTP e devolver respostas |
| `service` | Aplicar regras de negócio |
| `repository` | Comunicar com o banco de dados |
| `model` | Representar as tabelas do banco |
| `dto` | Definir o formato de entrada/saída da API |

## Como executar

### Pré-requisitos

- Java 17+
- Maven (ou usar o wrapper `./mvnw`)

### Passos

```bash
# Clone o repositório
git clone <url-do-repositorio>
cd api-crud

# Execute a aplicação
./mvnw spring-boot:run

# Ou, se tiver Maven instalado globalmente
mvn spring-boot:run

### A API estará disponível em: http://localhost:8080/h2-console
