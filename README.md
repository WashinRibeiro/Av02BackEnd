## Atividade Final do módulo de Backend - Tech4me

## PROJETO LOJA

Vamos desenvolver um novo projeto utilizando microsserviços. Crie toda a estrutura necessária para criar um serviço de cadastro de produtos e outro para vendê-los.

Para cadastrar um produto (microsserviço), você precisará de nome, código e preço, todos eles
obrigatórios. O preço deve ser, obrigatoriamente, maior do que zero.

Para vender um produto, informe seu código, a quantidade e a data da venda.

Todos os campos são obrigatórios.

Não se esqueça de configurar toda a infraestrutura requerida para gerência dos microsserviços!

-------------------------------------------------------------------

**Pré-requisitos**

- Um produto deve ter os seguintes atributos: código, nome, valor e quantidade em estoque. 
- Uma venda deve ter os seguintes atributos: data da venda, o produto vendido e a quantidade vendida. 
- As vendas são feitas sempre para um único produto. 
- Para realizar a venda, sempre verifique se o produto a ser vendido existe em estoque. 

**As funcionalidades que o aplicativo deve ter é a seguinte:**

1 – Incluir produto <br />
2 – Consultar produto <br />
3 – Listagem de produtos <br />
4 – Vendas por período – detalhado <br />
5 – Realizar venda <br />

 
-------------------------------------------------------------------

**Informações adicionais:**

Criar um microsserviço para Produto e um para Venda<br />
Banco de Dados: MongoDB ou PostgreSQL<br />
Criar Eureka e Zuul Server<br />
Usar Optional e Renponse Entity (personalização das responses)<br />
Usar DTO e modelos de Request e Response<br />
Usar Open Feign/Hystrix para comunicação/monitoramento da conexão entre microsserviços<br />
Não precisa utilizar Config-Server por enquanto<br />
Implementar CRUD de Produtos e Vendas<br />

