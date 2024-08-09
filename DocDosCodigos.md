# Documento dos códigos do projeto de instalações elétrica residenciais 

## Funcionamento da classe de CalculosDeTomadas

### Área ≤ 6 m²

Para ambientes com uma área de 6 metros quadrados ou menos, o método retorna um número fixo de 1 tomada. Isso simplifica o cálculo para espaços pequenos, assumindo que uma única tomada é suficiente.

### Área > 6 m²

Para áreas maiores, o método calcula o número de tomadas necessárias com base no perímetro do ambiente. 

A fórmula utilizada é `Math.ceil(perimetro / 5)`. A função `Math.ceil` é usada para arredondar para cima o resultado da divisão do perímetro por 5. Isso garante que mesmo uma pequena fração adicional de perímetro resulta em uma tomada adicional.

A divisão por 5 pode estar baseada em uma recomendação ou norma que sugere um ponto de tomada a cada 5 metros de perímetro.

### Notas Adicionais

- **Arredondamento para Cima:** Utilizar `Math.ceil` garante que o cálculo sempre arredonda para o número inteiro superior, evitando a falta de tomadas em caso de perímetro não exato.

## Conclusão

A classe `CalculoTomadas` fornece um método simples e direto para determinar a quantidade de tomadas necessárias em um ambiente, considerando tanto a área quanto o perímetro. Este método é útil em planejamento de instalações elétricas, ajudando a garantir que as tomadas sejam distribuídas de forma adequada para atender às necessidades do espaço. O uso do arredondamento para cima assegura que o número de tomadas seja suficiente, mesmo em casos em que a divisão não resulta em um número inteiro.


## Classe Comodo 

## Análise do Código

### Atributos

- **`nome`:** Armazena o nome do cômodo (por exemplo, "Sala", "Quarto").
- **`largura` e `comprimento`:** Armazenam as dimensões do cômodo, usadas para calcular a área.
- **`quantidadeJanelas` e `quantidadePortas`:** Armazenam o número de janelas e portas no cômodo.
- **`componentes`:** Uma lista de objetos do tipo `Componente`, representando componentes associados ao cômodo, como ventiladores, lâmpadas, tomadas, etc.
- **`area`:** Calcula a área do cômodo multiplicando largura e comprimento.

### Construtor

O construtor inicializa os atributos com os valores fornecidos e calcula a área do cômodo com base nas dimensões fornecidas.

### Métodos

- **Getters:** Métodos para acessar os valores dos atributos (`getNome`, `getLargura`, `getComprimento`, `getQuantidadeJanelas`, `getQuantidadePortas`, `getComponente`, `getArea`).
- **`addComponente(Componente componente)`**: Permite adicionar um componente à lista de componentes associados ao cômodo.

## Classe Componentes 
## Análise do Código

### Atributos

- **`nome`:** Armazena o nome do cômodo (por exemplo, "Sala", "Quarto").
- **`largura` e `comprimento`:** Armazenam as dimensões do cômodo, utilizadas para calcular a área.
- **`quantidadeJanelas` e `quantidadePortas`:** Armazenam o número de janelas e portas no cômodo.
- **`componentes`:** Uma lista de objetos do tipo `Componente`, representando elementos associados ao cômodo, como ventiladores, lâmpadas, tomadas, etc.
- **`area`:** Armazena a área do cômodo, calculada multiplicando a largura pelo comprimento.

### Construtor

O construtor inicializa os atributos com os valores fornecidos e calcula a área do cômodo com base nas dimensões fornecidas.

### Métodos

- **Getters:** Métodos para acessar os valores dos atributos (`getNome`, `getLargura`, `getComprimento`, `getQuantidadeJanelas`, `getQuantidadePortas`, `getComponente`, `getArea`).
- **`addComponente(Componente componente)`**: Permite adicionar um componente à lista de componentes associados ao cômodo.

## Classe ventilador 
## Explicação do Código


A classe `Ventilador` estende a classe `Componente`, ou seja, herda as propriedades e métodos da classe `Componente`.

### Construtor

O construtor da classe `Ventilador` recebe três parâmetros:
- **`nome`** (do tipo `String`)
- **`quantidade`** (do tipo `int`)
- **`potencia`** (do tipo `double`)

Esses parâmetros são passados para o construtor da superclasse (`Componente`) usando a palavra-chave `super`.

### Comentários sobre o Código

- **Herdando a Superclasse:**  
  Se a classe `Componente` já define atributos como `nome`, `quantidade` e `potencia`, o uso do `super` no construtor é uma forma eficiente de inicializar esses atributos diretamente na classe `Ventilador`.

- **Verificação do Construtor da Superclasse:**  
  Verifique se a classe `Componente` possui um construtor que aceita esses três parâmetros. Caso contrário, o código pode gerar erros de compilação.

- **Possíveis Melhorias:**  
  Se houver comportamento específico do `Ventilador` que difere dos outros componentes, você pode adicionar métodos ou sobrepor métodos da classe `Componente`.

  Considerar adicionar documentação ao código usando comentários `//` ou `/** ... */` para explicar o propósito da classe e dos métodos.

## Classe interruptor 

### Herança

A classe `Interruptor` estende a classe `Componente`, o que significa que ela herda todas as propriedades e métodos da classe `Componente`.
java
public Interruptor(String nome, int quantidade) {
    super(nome, quantidade, 0.0); // passa 0.0 como potência
}


## Classe lampada

### Herança

A classe `Lampada` estende a classe `Componente`, o que significa que herda todos os atributos e métodos da classe `Componente`.

### Construtor

java
public Lampada(String nome, int quantidade, double potencia) {
    super(nome, quantidade, potencia);
}

## Classe ProjetoDeInstalacoes 
## Classe `ProjetoDeInstalacaoEletrica`

### Atributos e Estrutura

- **Constante `CUSTO_POR_METRO_FIO`:**  
  Define o custo por metro de fio utilizado no projeto (1,5 unidades monetárias por metro).

- **Listas `comodos` e `componentes`:**  
  - **`comodos`:** Armazena os cômodos que fazem parte do projeto de instalação elétrica.  
  - **`componentes`:** Armazena os componentes elétricos (como lâmpadas, interruptores, etc.) utilizados no projeto.

### Construtor
`java
ProjetoDeInstalacaoEletrica() {
    comodos = new ArrayList<>();
    componentes = new ArrayList<>();
}

