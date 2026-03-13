# Bootcamp Deloitte – API de Produtos

## 📌 Sobre o Projeto

Este projeto foi desenvolvido durante o **Bootcamp Java da Deloitte** com o objetivo de praticar conceitos fundamentais de desenvolvimento backend utilizando **Spring Boot**.

A aplicação consiste em uma **API REST para gerenciamento de produtos**, permitindo realizar operações básicas de cadastro, consulta, atualização e remoção de produtos.

O projeto foi estruturado seguindo boas práticas de desenvolvimento, separando responsabilidades em camadas como **controller, service, repository e validation**, além de possuir **testes unitários para a camada de serviço**.

---

## 🛠 Tecnologias Utilizadas

* Java 25
* Spring Boot
* Maven
* H2 Database (banco em memória)
* JUnit 5
* Mockito

---

## 📂 Estrutura do Projeto

O projeto segue uma arquitetura em camadas para organizar melhor as responsabilidades:

```
src/main/java/com/example/bootcamp_deloitte

controller   → Endpoints da API
service      → Regras de negócio
repository   → Acesso aos dados
model        → Entidades da aplicação
validation   → Regras de validação dos produtos
```

Essa estrutura facilita manutenção, testes e evolução da aplicação.

---

## 🚀 Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/seu-usuario/bootcamp-deloitte.git
```

### 2️⃣ Entrar na pasta do projeto

```bash
cd bootcamp-deloitte
```

### 3️⃣ Executar a aplicação

```bash
mvn spring-boot:run
```

A aplicação será iniciada em:

```
http://localhost:8080
```

---

## 🗄 Banco de Dados H2

O projeto utiliza o **H2 Database**, que é um banco de dados em memória utilizado para desenvolvimento e testes.

### Acessar o console do H2

Após iniciar a aplicação, acesse:

```
http://localhost:8080/h2-console
```

### Configuração da conexão

Utilize os seguintes dados:

```
JDBC URL: jdbc:h2:mem:testdb
User Name: root
Password: ademar123
```

Após conectar, será possível visualizar as tabelas e executar consultas SQL diretamente pelo navegador.

---

## 📦 Endpoints da API

A API possui endpoints para gerenciamento de produtos.

### Criar Produto

```
POST /products
```

Exemplo de corpo da requisição:

```json
{
  "name": "Mouse",
  "price": 17.99,
  "quantity": 10
}
```

---

### Listar Produtos

```
GET /products
```

Retorna todos os produtos cadastrados no sistema.

---

### Atualizar Produto

```
PUT /products/{id}
```

Exemplo:

```
PUT /products/1
```

Exemplo de corpo da requisição:

```json
{
  "name": "Mouse Gamer",
  "price": 25.99,
  "quantity": 5
}
```

---

### Deletar Produto

```
DELETE /products/{id}
```

Exemplo:

```
DELETE /products/1
```

---

## 🧪 Executar Testes

Para executar os testes unitários do projeto:

```bash
mvn test
```

Os testes foram implementados utilizando **JUnit 5** e **Mockito**, focando principalmente na **camada de serviço**, garantindo que as regras de negócio funcionem corretamente.

---

## 👨‍💻 Autor

Desenvolvido por **Walter Cabral** durante o Bootcamp Java da Deloitte.
