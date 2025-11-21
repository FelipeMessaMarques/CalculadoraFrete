# O Novo Desafio: Calculadora de Frete (Strategy Pattern)

## Objetivo

Aplicar **Inversão de Dependência (DIP)** e **Princípio Aberto/Fechado (OCP)** de SOLID usando o **Strategy Pattern** para desacoplar a lógica de cálculo das empresas de transporte.

---

## 🎯 Cenário

Você deve criar um serviço que calcula o custo total de uma remessa. O custo varia de acordo com a transportadora (FedEx, DHL, etc.), mas o sistema central de pedidos deve ser completamente **agnóstico** às regras usadas.

---

## 📝 Requisitos do Projeto

### **FASE 1 — Configuração e Fundamentos**

#### **Setup do Repositório**

* Criar um novo repositório Maven ou Gradle.
* Incluir dependências **JUnit 5** e **Mockito**.

#### **Entidade Imutável: Remessa (Shipment)**

Crie a classe `Remessa` contendo:

* `peso` (Double)
* `distanciaKm` (Double)
* `codigoRastreio` (String)

**MANDATÓRIO:**

* A classe deve ser **imutável**.
* Nenhum setter.
* Estado definido apenas no construtor.

---

### **FASE 2 — Strategy Pattern (DIP)**

#### **Interface (DIP): CalculadoraFrete (ShippingCalculator)**

Criar a interface:

```java
double calcular(Remessa remessa);
```

#### **Implementações Concretas (Strategies)**

##### **FreteFedex**

Regra:

* Custo fixo: **R$ 20.00**
* * **R$ 1.50 por quilômetro**

##### **FreteDHL**

Regra:

* Custo fixo: **R$ 50.00**
* * **R$ 0.10 por quilômetro**
* * **R$ 0.50 por kg**

---

### **FASE 3 — Serviço Agnóstico e Testes**

#### **ProcessadorRemessa (ShipmentProcessor)**

Criar a classe que:

* Recebe `CalculadoraFrete` no **construtor** (Injeção de Dependência).
* Possui método:

```java
double processar(Remessa remessa);
```

* O método apenas chama `calcular()` da interface injetada.

---

### **Teste Unitário (TDD)**

Arquivo: `ProcessadorRemessaTest.java`

#### **Mock**

* Criar um Mock de `CalculadoraFrete` usando Mockito.
* Configurar o Mock para sempre retornar **R$ 100.00**.

#### **Asserção**

O teste deve verificar que:

```java
processador.processar(remessa) == 100.00
```

#### **Objetivo do Teste**

Garantir que:

* `ProcessadorRemessa` está **totalmente isolado**.
* Não depende das regras da FedEx ou DHL.
* Apenas segue o **contrato** da interface mockada.

---

## ✅ Resultado Esperado

Um design limpo, seguindo SOLID, com uso correto de Strategy Pattern, dependência invertida e testes unitários robustos.
