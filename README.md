# Sistema de Gerenciamento de Contatos

Este é um simples sistema de gerenciamento de contatos em Java, que permite ao usuário adicionar, listar, editar, detalhar e remover contatos. O sistema armazena até 100 contatos e opera no console.

## Funcionalidades

- **Adicionar Contato:** Adicione um novo contato fornecendo o nome, telefone e e-mail.
- **Detalhar Contato:** Visualize os detalhes de um contato existente, buscando pelo telefone.
- **Editar Contato:** Edite as informações de um contato existente.
- **Remover Contato:** Remova um contato existente.
- **Listar Contatos:** Liste todos os contatos armazenados no sistema.

## Estrutura do Contato

Cada contato é armazenado numa matriz como um array de Strings com as seguintes informações:
- **Nome:** Nome do contato
- **Telefone:** Número de telefone do contato
- **E-mail:** Endereço de e-mail do contato

## Como Usar

1. **Compilando e Executando:**
   - Compile o código fonte com o comando:
     ```bash
     javac Contatos.java
     ```
   - Execute o programa com o comando:
     ```bash
     java Contatos
     ```

2. **Menu de Opções:**
   - Ao iniciar o programa, um menu será exibido com as seguintes opções:
     1. **Adicionar Contato:** Insira as informações do contato no formato "nome, telefone, email".
     2. **Detalhar Contato:** Insira o número de telefone do contato que deseja buscar.
     3. **Editar Contato:** Insira o número de telefone do contato que deseja editar, seguido das novas informações no formato "nome, telefone, email".
     4. **Remover Contato:** Insira o número de telefone do contato que deseja remover.
     5. **Sair:** Encerra o programa.

## Exemplo de Uso

- **Adicionar Contato:**
  - Entrada: `João Silva, 123456789, joao.silva@email.com`
- **Detalhar Contato:**
  - Entrada: `123456789`
  - Saída:
    ```
    Id | Nome        | Telefone  | Email
    1  | João Silva  | 123456789 | joao.silva@email.com
    ```
- **Editar Contato:**
  - Entrada: `123456789`
  - Nova Informação: `João Santos, 123456789, joao.santos@email.com`
- **Remover Contato:**
  - Entrada: `123456789`
  - Saída: `Contato removido com sucesso.`

## Requisitos

- **Java JDK 8** ou superior.

## Observações

- O sistema armazena até 100 contatos, mas pode ser expandido conforme necessário.
- O sistema realiza operações básicas de gerenciamento de contatos e é ideal para quem está aprendendo os fundamentos de arrays e manipulação de strings em Java.
