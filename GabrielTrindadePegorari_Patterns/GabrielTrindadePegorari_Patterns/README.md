# Design Patterns em Java

Gabriel Trindade Pegorari

| Categoria | Padrão | Exercício |
|---|---|---|
| Criacional | Abstract Factory | Renderiza botão, caixa de texto e checkbox nos temas claro e escuro. |
| Estrutural | Adapter | Adapta as chamadas `info` e `error` ao logger legado. |
| Comportamental | Strategy | Troca a estratégia de desconto de um carrinho em tempo de execução. |

## Executar no IntelliJ IDEA

1. Abra a pasta do projeto e selecione um JDK, como o Java 21.
2. Se necessário, clique com o botão direito em `src` e selecione **Mark Directory as → Sources Root**.
3. Execute a classe `Main` do pacote `abstractfactory`, `adapter` ou `strategy`. Cada exercício roda de forma independente.

## Executar no PowerShell

Na raiz do projeto, compile e execute com o JDK disponível no PATH.

```powershell
$fontes = Get-ChildItem -Path src -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $fontes
java -cp out abstractfactory.Main
java -cp out adapter.Main
java -cp out strategy.Main
```

## Onde cada padrão aparece

- **Abstract Factory.** A classe `Application` recebe uma `UIComponentFactory` e cria os três componentes por ela. Cada fábrica entrega uma família completa do mesmo tema. Um novo tema pode ser usado ao injetar outra fábrica.
- **Adapter.** A classe `Application` usa a interface `Logger`. O adaptador traduz `info` e `error` em chamadas de `log` com os níveis `INFO` e `ERROR`.
- **Strategy.** O mesmo carrinho calcula três totais ao trocar a estratégia de desconto. O desconto fixo tem piso zero e o percentual aceito vai de 0 a 100.
