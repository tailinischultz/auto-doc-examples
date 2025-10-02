# auto-doc-examples
Exemplos práticos de geração automática de documentação a partir de código-fonte.

# Demonstração Prática OpenAPI/Swagger

## Fluxo da Apresentação

### 1. Swagger Editor - Design da API
**Objetivo:** Mostrar como escrever e validar uma spec OpenAPI

**Passos:**
1. Acessar: https://editor.swagger.io
2. Mostrar a estrutura básica já carregada (Petstore)
3. Apontar para a divisão da tela:
   - Esquerda: Código YAML
   - Direita: Documentação gerada automaticamente
4. **Demonstrar validação em tempo real:**
   - Modificar algo (ex: adicionar um campo em um modelo)
   - Mostrar como a doc atualiza instantaneamente
   - Propositalmente causar um erro (ex: remover `:` de alguma linha)
   - Mostrar o erro em vermelho
   - Corrigir o erro
---

### 2. Postman - Importação e Testes
**Objetivo:** Mostrar como usar a spec no Postman

**Passos:**
1. Abrir Postman
2. **Import → Upload Files**
3. Selecionar o arquivo `petstore-api.yaml` salvo anteriormente
4. Escolher: **OpenAPI 3.0 Specification with a Postman Collection**
5. **Mostrar o resultado:**
   - Collection criada automaticamente
   - Todos os endpoints organizados
   - Parâmetros já preenchidos
6. **Explorar um request:**
   - Abrir `GET /pet/findByStatus`
   - Mostrar query params já configurados
   - Mostrar examples no body (se aplicável)
7. **Mostrar a documentação no Postman:**
   - Collection → View Documentation
   - Mostrar como fica a doc formatada
8. **Testar um request:**
   - Configurar autenticação se necessário
   - Send
   - Mostrar a response

---

### 3. Swagger Codegen - Geração de Código
**Objetivo:** Mostrar geração automática de código cliente

**Preparação prévia:**
- Ter o projeto Maven já criado no Eclipse
- Arquivo `petstore-api.yaml` na pasta correta

**Passos:**
1. Mostrar o `pom.xml` configurado (rapidamente)
2. **Executar Maven:**
   - Run As → Maven build
   - Goals: `clean generate-sources`
   - Run
3. **Aguardar geração**
4. **Mostrar o código gerado:**
   - Navegar em `target/generated-sources`
   - Abrir `PetApi.java` → mostrar os métodos
   - Abrir `Pet.java` → mostrar o modelo com getters/setters
   - "Olha quanto código foi gerado automaticamente!"
5. **Mostrar código de uso:**
   - Abrir classe `TestePetstore.java`
   - Mostrar como é simples usar a API gerada

---

### 4. Swagger UI - Documentação Interativa
**Objetivo:** Mostrar documentação auto-gerada e testável

**Passos:**
1. Acessar: https://petstore3.swagger.io
2. **Navegar pela documentação:**
   - Mostrar a página inicial
   - Expandir um endpoint (ex: POST /pet)
   - Mostrar descrição, parâmetros, exemplos
3. **Testar direto na UI:**
   - Clicar em "Try it out"
   - Preencher os dados (ou usar o example)
   - Clicar em "Execute"
   - Mostrar a resposta (curl, request, response)
4. **Mostrar os Schemas:**
   - Rolar até o final da página
   - Mostrar os modelos de dados documentados
5. **Mencionar:**
   - "Essa mesma UI pode ser gerada para qualquer API"
   - "É só servir o arquivo YAML/JSON"

---
