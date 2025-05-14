# Contador de dias de aula em Java
Aplicação web para calcular a quantidade de **dias de aula entre duas datas**, **excluindo segundas, sábados e domingos** (dias que não tenho aula).

## Funcionalidades

- Cálculo do total de dias de aula entre duas datas.
- Exclusão automática de:
  - **Segundas-feiras**
  - **Sábados**
  - **Domingos**
- Interface web com HTML, CSS e JavaScript puro.

## Tecnologias utilizadas

- **Backend**:
  - Java 17+
  - Spring Boot
  - `java.time.LocalDate`
  - `java.time.DayOfWeek`
  - `java.time.format.DateTimeFormatter`

- **Frontend**:
  - HTML5
  - CSS3
  - JavaScript (puro)

## Como executar localmente

### 1. Clone o repositório
`git clone https://github.com/anabsouzx/contador-dias-java.git`
### 2. Navegue ate a pasta do projeto
`cd exemplo/pasta/contador-dias-java`
### 3. Execute com Maven
`./mvnw spring-boot:run`
### 4. Acesse no navegador
`localhost:8080/index.html`
