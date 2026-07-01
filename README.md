# Discount Calculator (Java)

Uma aplicação em console desenvolvida em Java para calcular o preço final de um produto após a aplicação de um desconto percentual. O programa recebe os dados do usuário, valida as entradas e exibe um resumo formatado com os valores calculados.

---

## Funcionalidades

* **Entrada de Dados:** Solicita o nome do produto, preço original e o percentual de desconto.
* **Validação de Regras de Negócio:** 
  * Impede o cálculo se o preço do produto for menor ou igual a zero.
  * Impede o cálculo se o valor do desconto for menor ou igual a zero.
* **Formatação de Moeda:** Exibe os valores monetários calculados com duas casas decimais (`R$ %.2f`).

---

## Lógica de Cálculo

O programa utiliza a taxa percentual informada para extrair o valor do desconto em dinheiro e, em seguida, realiza a dedução:

1. **Valor do Desconto:** `originalPrice * (valueDiscount / 100)`
2. **Preço Final:** `originalPrice - discount`

---

## Tecnologias Utilizadas

* **Linguagem:** Java (Compatível com Java 8 ou superior)
* **Biblioteca Nativa:** `java.util.Scanner` para captura de dados do terminal.

---

## Como Executar o Projeto

### Pré-requisitos
Você precisa ter o Java Development Kit (**JDK**) instalado em sua máquina.

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com
   ```

2. **Acesse a pasta do projeto:**
   ```bash
   cd discount-calculator
   ```

3. **Compile o arquivo Java:**
   ```bash
   javac Solution.java
   ```

4. **Execute a aplicação:**
   ```bash
   java Solution
   ```

---

## Exemplo de Uso no Terminal

```text
=== Discount Calculator ===

Enter the product name: Notebook
Enter the original price: 2500.00
Enter the discount (%): 10

======= Product ==========
Product: Notebook
Original Price: R\$ 2500,00
Discount: 10%
Discount Value: R\$ 250,00
Final Price: R\$ 2250,00
=========================
```

---

## Autor

Desenvolvido por Matheus.
