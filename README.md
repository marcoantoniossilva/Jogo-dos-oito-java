# Jogo-dos-oito-java

Implementação do famoso jogo dos oito utilizando [Java](https://github.com/topics/java), [Maven](https://github.com/topics/maven) e testes unitários com [Junit](https://junit.org/junit4/).

---

### Sobre o jogo:

O Jogo dos Oito é um jogo de tabuleiro. O jogo é estruturado em um tabuleiro 3×3 com 8 peças (cada peça tem um número de 1 a 8) e um espaço vazio. O objetivo é colocar os números nas peças para combinar com a configuração final usando o espaço vazio. Podemos deslizar quatro peças adjacentes (esquerda, direita, acima e abaixo) no espaço vazio.<br>

Estado final ou vitória:<br>

1 2 3<br>
4 5 6<br>
7 8<br>

Exemplo de estado inicial ou embaralhado:<br>

1 2 3<br>
4 8 6<br>
7 5<br>

### Sobre os arquivos:

A classe do jogo é a [Application.java](src/main/java/io/github/marcoantoniossilva/application/Application.java) e a de execução é a [NumberPuzzle.java](src/main/java/io/github/marcoantoniossilva/puzzle/NumberPuzzle.java).

Ao instanciar um jogo, pode-se escolher a quantidade de linhas e colunas, tornando-se um jogo dos 15 por exemplo ao ser instanciado desda forma:

```Java
NumberPuzzle Puzzle = new NumberPuzzle(4)
```

### Testes unitários

Os testes unitários foram divididos nos arquivos:

1 - [NumberPuzzleCheckResolutionTest.java](src/test/java/io/github/marcoantoniossilva/NumberPuzzleCheckResolutionTest.java): Testa se uma determinada disposição das peças resolve o desafio ou não;<br>
2 - [NumberPuzzleMovementsCountTest.java](src/test/java/io/github/marcoantoniossilva/NumberPuzzleMovementsCountTest.java): Testa a contagem de movimentos feito em uma partida;<br>
3 - [NumberPuzzleMovementsTest.java](src/test/java/io/github/marcoantoniossilva/NumberPuzzleMovementsTest.java): Testa alguns movimentos no jogo são válidos ou não;<br>
4 - [NumberPuzzlePositionsTest.java](src/test/java/io/github/marcoantoniossilva/NumberPuzzlePositionsTest.java): Testa se um número está numa posição esperada ou não.<br>

### Executando a aplicação:

1 - Para compilar o projeto e gerar o arquivo .jar executável:

```Maven
mvn clean install
```

2 - Para executar os testes unitários:

```Maven
mvn clean test
```

3 - Para executar o projeto:

```Bash
java -jar target/JogoDeOito-1.0-SNAPSHOT.jar
```
