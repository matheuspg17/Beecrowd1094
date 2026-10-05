# Resolução exercício Beecrowd1094

## Descrição do problema
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.


## Como Funciona
1. O usuário insere o número de experimentos (`controle`).
2. Uma estrutura de repetição `for` lê cada linha, separando por espaços a quantidade (`num`) e o tipo de cobaia (`tipocobaia`).
3. Uma estrutura condicional (`if / else if`) acumula as quantidades nas variáveis específicas: `totalc` (coelhos), `totalr` (ratos) ou `totals` (sapos).
4. O código realiza o cálculo de porcentagem convertendo os inteiros para `double` para evitar divisões truncadas, multiplicando por 100.