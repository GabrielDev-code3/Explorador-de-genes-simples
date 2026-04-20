# Explorador de Genes Simples (Simple Gene Finder) 🧬

Este projeto em Java foi desenvolvido para analisar sequências de DNA e identificar genes válidos com base em regras biológicas e matemáticas. 

## 🚀 Sobre o Projeto

O sistema foi construído em duas etapas progressivas, focando no aprimoramento da lógica de programação e manipulação de texto (Strings):

* **Parte 1 (Algoritmo Base):** Um motor de busca que procura por um códon de início fixo (`ATG`) e um códon de parada fixo (`TAA`). O sistema valida matematicamente se a distância entre eles é um múltiplo de 3, garantindo a integridade do gene antes de extraí-lo da sequência.
* **Parte 2 (Flexibilidade e Padronização):** Refatoração do motor de busca para torná-lo universal. O algoritmo passou a receber parâmetros dinâmicos para os códons de início e parada. Além disso, foi implementada uma trava de segurança que padroniza automaticamente letras maiúsculas e minúsculas durante a busca, preservando a integridade e o formato do dado original na hora da entrega.

## 🛠️ Tecnologias e Conceitos Aplicados

* **Linguagem:** Java
* **Conceitos de Engenharia de Software:**
  * Manipulação avançada de Strings (`indexOf`, `substring`, `toUpperCase`).
  * Criação de métodos com múltiplos parâmetros e escopo de variáveis.
  * Lógica condicional e validação de regras de negócio (operador de módulo `%`).
  * Construção de um laboratório de testes locais para validar cenários de sucesso e casos de falha (falsos-positivos).

## ⚙️ Como Executar

1. Clone este repositório para a sua máquina.
2. Abra o projeto na sua IDE de preferência.
3. Execute os arquivos `Part1.java` ou `Part2.java`.
4. O método `testSimpleGene()` rodará automaticamente uma bateria de testes com diferentes fitas de DNA, imprimindo os recortes exatos no console.

---
*Projeto desenvolvido como passo prático na construção de uma base sólida para o ecossistema backend.*
