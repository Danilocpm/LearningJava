# Estrutura Sequencial

## Sequencia de Execucao
```Segue a matematica no quesito multiplicacao -> divisao -> soma -> subtracao e priorizando o que esta entre "()"```

## Operadores Aritmeticos
| Operador |                 Funcao                 |
|:--------:|:--------------------------------------:|
|    +     |           Soma de 2 valores            |
|    -     |         Subtracao de 2 valores         | 
|    *     |       Multiplicacao de 2 valores       | 
|    /     |          Divisao de 2 valores          |
|    %     | Modulo de 2 valores (resto da divisao) |

## Variaveis
```A formula de criacao de uma variavel e bem simples sendo <tipo> <nome> = <valor_inicial>```

### Tipos de variavel
<br>

#### Numerico Inteiro
|     Tipo      | Valor Padrao | Tamanho (Bytes) |
|:-------------:|:------------:|:---------------:|
|     byte      |      0       |     8 bits      |
|     short     |      0       |     16 bits     |
|      int      |      0       |     32 bits     |
|     long      |      0L      |     64 bits     |

#### Numerico com ponto flutuante
|  Tipo  | Valor Padrao | Tamanho (Bytes) |
|:------:|:------------:|:---------------:|
| float  |     0.0f     |     32 bits     |
| double |     0.0      |     64 bits     |

#### Unicode
| Tipo | Valor Padrao | Tamanho (Bytes) |
|:----:|:------------:|:---------------:|
| char |   '\u0000'   |     16 bits     |

#### Boolean
|  Tipo   | Valor Padrao | Tamanho (Bytes) |
|:-------:|:------------:|:---------------:|
| boolean |    false     |     1 bits      |
<br>

### Nome de Variavel
* Nao pode comecar com digito: user letra ou "_"
* Nao pode ter espaco branco
* Nao pode ter acento
* Sugerido usar CamelCase
* Sugerido comecar com letra minuscula

## Println ou Print ou Printf?

| Comando |    Quebra a linha     |                                          Explicacao                                          |
|:-------:|:---------------------:|:--------------------------------------------------------------------------------------------:|
| Println |         True          |           O println encerra a linha logo qualquer print depois comeca em uma nova            |
|  Print  |         False         | O print nao encerra a linha fazendo com que o proximo print ou println continue na msm linha |
| Printf  | Se constar na mascara |       Recebe 2 args um sendo a mascara de formatacao e o outro o valor a ser impresso        |


## *Concatenacao*
```E possivel concatenar de 2 formas:```
* *Uma utilizando o operador de soma:*
> System.out.println("Resultado= " + x + " Metros")
* *Outra utilizando printf:*
> System.out.printf("Texto 1 %f Texto 2 %f Texto 3", variavel1, variavel2)
> <br>
> %f = ponto flutuante que e substituido pela variavel colocada como argumento depois
> <br>
> %d = inteiro que sera substituido pela variavel que vem no segundo arg
> <br>
> %s = texto que sera substituido pela variavel que vem no segundo arg
> <br>
> %n = quebra de linha

## *Casting*
```Para atribuir um valor a uma variavel e apenas utilizar "="```
* *Exemplo:*
> double resultado = a + b


```Mas e se eu quiser usar tipos diferentes em uma operacao? Como Double / 2```
* *Exemplo:*
> int x = 2, double y = 5
> <br>
> resultado = y / x
> <br>
> println(resultado) = 2

```Porque? Simples eu nao realizei um casting logo o resultado sera interpretado como int...```
* Para resolver isso usamos o casting que ira tratar o resultado da operacao como o tipo passado
> resultado = (double) y / x
> <br>
> println(resultado) = 2.5