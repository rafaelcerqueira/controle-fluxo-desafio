# Desafio Controle de Fluxo 🚀

Projeto desenvolvido para o desafio de controle de fluxo, onde o objetivo é criar um programa Java que utilize exceções personalizadas e controle de fluxo para realizar uma contagem entre dois números inteiros fornecidos pelo usuário.

## 📋 Descrição do Projeto

O projeto consiste em um programa Java que solicita ao usuário dois números inteiros. O programa deve verificar se o primeiro número é maior que o segundo. Se for, uma exceção personalizada chamada `ParametrosInvalidosException` será lançada. Caso contrário, o programa realizará uma contagem a partir do primeiro número até o segundo, imprimindo cada número no console.
O objetivo é praticar o uso de exceções, controle de fluxo e manipulação de entradas no Java.

## 🛠 Tecnologias Utilizadas

- Java 22
- IDE: IntelliJ IDEA
- Git
- GitHub

Links:
- [Java Documentation](https://docs.oracle.com/en/java/)
- [DIO](https://www.dio.me/)
- [Repositório](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo)

## 📌 Requisitos do Desafio

- Criar um projeto chamado **DesafioControleFluxo**.
- Criar uma classe `Contador.java` para realizar a lógica do programa.
- Criar uma exceção personalizada `ParametrosInvalidosException`.
- O programa deve receber dois parâmetros via terminal.
- Se o primeiro parâmetro for maior que o segundo, lançar `ParametrosInvalidosException`.
- Caso contrário, realizar uma contagem e imprimir os valores incrementados no console.

## 📚 Conteúdo

- Exceções em Java
- Controle de Fluxo
- Manipulação de Entradas
- Programação Orientada a Objetos
- Tratamento de Erros

## 🛠 Como Executar o Projeto

1. Clone o repositório ou baixe os arquivos.
2. Compile o projeto Java utilizando um ambiente de desenvolvimento ou via terminal:
   ```sh
   javac Main.java Contador.java ParametrosInvalidosException.java
3. Execute o programa passando dois números inteiros como parâmetros:
   ```sh
   java Main 5 10
   ```
4. Insira os números desejados e observe a contagem no console.
5. Caso o primeiro número seja maior que o segundo, uma exceção personalizada será lançada:
   ```sh
   java Main 10 5
   ```
   
## 📚 Exemplo de Uso

### Entrada sem erro:

```
    Digite o primeiro parâmetro: 5
    Digite o segundo parâmetro: 10
    
    Imprimindo o número 5
    Imprimindo o número 6
    Imprimindo o número 7
    Imprimindo o número 8
    Imprimindo o número 9
    Imprimindo o número 10
 
``` 

### Entrada com erro:

```
    Digite o primeiro parâmetro: 10
    Digite o segundo parâmetro: 5
    
    Exceção: Parâmetros inválidos. O primeiro número deve ser menor ou igual ao segundo.
```
## 📜 Licença
Este projeto é de uso livre e pode ser utilizado para fins educacionais. Sinta-se à vontade para modificar e adaptar o código conforme necessário.

## 👤 Autor
- Nome: [Rafael Cerqueira](https://github.com/rafaelcerqueira)
