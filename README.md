# Sistema de Cadastro de Animais (CRUD)

Este é um projeto de console desenvolvido em Java para realizar o cadastro, busca, alteração e exclusão de animais (como cães e gatos).

## 🛠️ O que o sistema faz:

* **Cadastrar:** Adiciona novos animais ao sistema com informações como Nome, Raça, Idade, Peso, Sexo e Endereço.
* **Buscar e Filtrar:** Permite buscar animais aplicando filtros específicos e acumulativos (você pode filtrar por nome e depois por tipo do animal, por exemplo).
* **Editar:** Permite alterar qualquer informação de um animal específico após selecioná-lo na busca.
* **Excluir:** Remove o animal selecionado do sistema.

## 🚀 Tecnologias utilizadas

* **Java 8+**
* **Git:** Para o controle de versão do código.

## 📁 Estrutura do Projeto

O projeto está dividido nas seguintes pastas:

* **`Domain`**: Onde fica a classe `Animal` e os Enums (`GatoOuCachorro`, `SexoAnimal`).
* **`Main`**: Onde fica a classe `Menu` que roda o programa no console.
* **`Regexs`**: Classes para validação de textos e dados.
* **`Service/PetsServices`**: Onde estão as regras do sistema, divididas em:
* `CadastroPet`: Classes para cadastrar os animais.
* `FilterSetDelet`: Classes para buscar, editar e deletar os animais.
* `Pets` e `SaveInformacoes`: Controle e salvamento da lista de pets.
* **`QuestionsReading`**: Arquivos de texto e classes que lêem as perguntas do sistema.

## 💻 Como rodar o projeto

1. Baixe ou clone este repositório.
2. Abra a pasta do projeto na sua IDE (IntelliJ, Eclipse ou VS Code).
3. Execute a classe principal (`Main`) do projeto.
4. Use o menu numérico no console para navegar pelas opções do sistema.

---
Desenvolvido por [Paulo Marano](https://github.com/seu-usuario).