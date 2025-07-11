# Estrutura Condicional

## Tabela de condicionais

### Comparativas
| Syntax  |    Output     |        Explicacao         |
|:-------:|:-------------:|:-------------------------:|
|  x > y  | True or False |         Maior que         |
|  x < y  | True or False |         Menor que         |
| x >= y  | True or False |    Maior ou igual que     |
| x <= y  | True or False |    Menor ou igual que     |
| x == y  | True or False |      igual em valor       |
| x === y | True or False |   igual em valor e tipo   |
| x != y  | True or False |    diferente em valor     |
| x !== y | True or False | diferente em valor e tipo |


### Logicas
> x && y (retorna True quando ambos valores forem iguais)
> <br>
> x || y (retorna True quando um dos valores for verdadeiro)
> <br>
> !(x == 10) (retorna True quando nao cumprir a expressao)

### Bitwise
| Syntax | Output  |                      Explicação                       |
|:------:|:-------:|:-----------------------------------------------------:|
| x ^ y  | inteiro |     XOR bit a bit: 1 se os bits forem diferentes      |
|   ~x   | inteiro |         NOT bit a bit: inverte todos os bits          |
| x << n | inteiro |     Shift à esquerda: adiciona 2 zeros a esquerda     |
| x >> n | inteiro | Shift à direita com sinal: adiciona 2 zeros a direita |


## Fluxo de Controle

### If-else
```if(condicao) { bloco de codigo }```
> Se a condicao for verdadeira o bloco de codigo sera executado
<br>
 
```if(condicao) { bloco de codigo } else { bloco de codigo }```
> Permite executar um bloco de codigo em caso do if ser falso
<br>

```if(condicao) { bloco de codigo } else if (condicao) { bloco de codigo }```
> Permite adicionar mais uma condicao e mais um bloco de codigo a ela em especifico
<br>

### Switch-Case
> Usamos switch case para casos onde ja sabemos a entrada e rodamos um bloco de codigo para ela
> <br>


```
switch (x) {
case 1: 
    dia = "domingo";
    break;
case 2:
    dia = "sabado";
    break;
default:
    dia = "Nao e final de semana"
    break;
}
```

### Condicional Ternaria
```(condicao) ? valor_se_verdadeiro : valor_se_falso```
> Acaba sendo um if-else simples de uma linha
