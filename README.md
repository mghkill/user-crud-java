# Spring Boot Application

Este projeto é uma aplicação básica em **Spring Boot** para gerenciar usuários.

## Pré-requisitos

Para rodar a aplicação no **Windows 11**, você precisa instalar:

1. **JDK (Java Development Kit)**
   - Baixe e instale o **JDK 11** do site oficial da Oracle ou use o OpenJDK.
   - [Download JDK 11](https://adoptium.net/temurin/releases/?version=11)

2. **Maven**
   - Baixe o Maven do site oficial: [Download Maven](https://maven.apache.org/download.cgi)
   - Extraia o arquivo `.zip` para uma pasta, por exemplo: `C:\Program Files\Apache\maven`.
   - Adicione o caminho da pasta `bin` do Maven ao `PATH` do sistema:
     - Abra as Configurações do Sistema → Variáveis de Ambiente.
     - Edite a variável `PATH` e adicione o caminho: `C:\Program Files\Apache\maven\bin`.

3. **Verificar as instalações**  
   Abra um novo terminal (Prompt de Comando ou PowerShell) e digite:
   ```bash
   mvn -version
   java -version
   ```

---

## Executar o Projeto

1. **Navegue até a pasta do projeto:**
   Abra um terminal e vá para a pasta onde o projeto está localizado.

2. **Execute o seguinte comando:**
   ```bash
   mvn spring-boot:run
   ```

---

## Testar a API

Você pode usar **Postman**, **cURL** ou o navegador para testar as rotas:

### Usando Postman (Recomendado)
   - Baixe e instale: [Download Postman](https://www.postman.com/downloads/).

### Usando cURL (Windows 11)

**Listar usuários:**
```bash
curl http://localhost:8080/api/users
```

**Criar usuário:**
```bash
curl -X POST http://localhost:8080/api/users -H "Content-Type: application/json" -d '{"nome":"João Silva","idade":30}'
```

### Usando o navegador
   Para listar usuários, abra o seguinte link no navegador:
   ```
   http://localhost:8080/api/users
   ```

---

## Dicas Importantes

- Certifique-se de que **nenhuma outra aplicação esteja usando a porta 8080**.
- Mantenha o terminal aberto enquanto a aplicação estiver rodando.
- Para parar a aplicação, pressione **Ctrl+C** no terminal.

**Se encontrar erros, verifique:**
1. Se todas as dependências do Maven foram baixadas.
2. Se o Java está corretamente instalado.
3. Se as variáveis de ambiente estão configuradas corretamente.
