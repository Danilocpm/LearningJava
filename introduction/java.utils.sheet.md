# Java Utils

## O que e?
> Uma lista de bibliotecas padroes do java que permitem o uso de algumas funcionalidades

## Como usar?
> Basta importar no inicio do seu codigo com "import java.util.nomedalib"

# Scanner
> import java.util.Scanner

`Permite com que usemos o console do terminal para inserir valores para variaveis`

### Como usar?
> Scanner nome = new Scanner(System.in);

### Como encerrar?
> nome.close();

### Como faco minha variavel receber o valor?
|  Tipo  |        Comando        |  Exemplo com nome da var sc   |
|:------:|:---------------------:|:-----------------------------:|
|  int   |      nome.next()      |     String x = sc.next()      |
|  str   |    nome.nextInt()     |     int x = sc.nextInt()      |
| double |   nome.nextDouble()   |  double x = sc.nextDouble()   |
|  char  | nome.next().charAt(0) | char x = sc.next().charAt(0)  |

### Como ler ate a quebra de linha?
> nome.nextLine()

```Isso permite por exemplo eu inserir "Bom dia" com espaco entre as palavras```
<br>

```Obs: Qualquer comando sem nextLine a quebra de linha fica pendente ate um nextLine```
