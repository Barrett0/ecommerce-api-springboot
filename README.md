# 🛒 Ecommerce API - Spring Boot

API REST de E-commerce desenvolvida com Java + Spring Boot.

Projeto criado com foco em aprendizado backend profissional utilizando arquitetura REST, PostgreSQL, Swagger e autenticação JWT.

---

# 🚀 Tecnologias Utilizadas

- Java 22
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- JWT Authentication
- PostgreSQL
- Swagger / OpenAPI
- Maven
- Hibernate

---

# 📂 Estrutura do Projeto

```bash
src/main/java/com/br/ecommerce

├── controller
├── service
├── repository
├── model
├── dto
├── config
```

---

# 📌 Funcionalidades

## ✅ Produtos
- Criar produto
- Listar produtos
- Buscar produto por ID
- Atualizar produto
- Deletar produto

---

## ✅ Categorias
- Criar categoria
- Listar categorias
- Buscar categoria por ID
- Atualizar categoria
- Deletar categoria

---

## ✅ Usuários
- Criar usuário
- Login de usuário
- Buscar usuários
- Atualizar usuário
- Deletar usuário

---

## 🔐 Segurança
- Spring Security
- JWT Authentication
- Rotas protegidas

---

# 🗄️ Banco de Dados

PostgreSQL

### Configuração no `application.properties`

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce_db
spring.datasource.username=postgres
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# ▶️ Como Executar o Projeto

## 1️⃣ Clonar repositório

```bash
git clone https://github.com/SEU-USUARIO/ecommerce-api-springboot.git
```

---

## 2️⃣ Entrar na pasta

```bash
cd ecommerce-api-springboot
```

---

## 3️⃣ Configurar PostgreSQL

Criar banco:

```sql
CREATE DATABASE ecommerce_db;
```

---

## 4️⃣ Executar projeto

Pelo Eclipse ou:

```bash
mvn spring-boot:run
```

---

# 📖 Swagger
![Swagger](src/main/java/screenshots/swagger-completo.png)


```bash
http://localhost:8080/swagger-ui/index.html
```

---

# 🔥 Endpoints Principais

## Produtos

| Método | Endpoint |
|---|---|
| POST | /produtos |
| GET | /produtos |
| GET | /produtos/{id} |
| PUT | /produtos/{id} |
| DELETE | /produtos/{id} |

---

## Categorias

| Método | Endpoint |
|---|---|
| POST | /categorias |
| GET | /categorias |
| GET | /categorias/{id} |
| PUT | /categorias/{id} |
| DELETE | /categorias/{id} |

---

## Usuários

| Método | Endpoint |
|---|---|
| POST | /usuarios |
| POST | /auth/login |

---

# 🧪 Exemplo JSON Produto

```json
{
  "nome": "Notebook Gamer",
  "preco": 4500.00
}
```

---

# 🧪 Exemplo JSON Categoria

```json
{
  "nome": "Eletrônicos"
}
```

---

# 🧪 Exemplo JSON Usuário

```json
{
  "nome": "Barreto",
  "email": "barreto@gmail.com",
  "senha": "123456"
}
```

---

# 🔐 Exemplo Login JWT

```json
{
  "email": "barreto@gmail.com",
  "senha": "123456"
}
```

---

# 🎯 Objetivo do Projeto

Projeto desenvolvido para prática de:
- APIs REST
- Arquitetura backend
- Spring Boot
- Banco de dados relacional
- Segurança com JWT
- Boas práticas Java

---

# 👨‍💻 Autor

Desenvolvido por Barreto 🚀
