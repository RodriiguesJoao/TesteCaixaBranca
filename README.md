# TesteCaixaBranca

Nome: João Victor Rafael Rodrigues;
RA: 236193.

-- TESTE CAIXA BRANCA --

Etapa 1:

APONTAR ERROS NO CÓDIGO:
1. Código aponta fragilidade contra o SQL injection;
2. Fechar conexões e recursos após o uso;
3. Logar as exceções;
   
A DOCUMENTAÇÃO FOI DESCRITA NO CÓDIGO?
R. Não, não há comentários explicativos no código.

AS VARIÁVEIS E CONSTANTES POSSUEM BOA NOMENCLATURA?
R. Parcialmente, alguma variáveis possuem bons nomes, porém algumas variáveis como conn não são tão claras.

EXISTEM LEGIBILIDADE E ORGANIZAÇÃO NO CÓDIGO?
R. Sim, o código e legível e organizado, só poderia apresentar melhores descrições e comentários.

TODOS OS NULLPOINTERS FORAM TRATADOS?
R. Não, um exemplo é para o caso da falha de conexão com o Banco de Dados retornando 'null'.

A ARQUITETURA UTILIZADA FOI DEVIDAMENTE RESPEITADA?
R. O código não apresenta uma classe para a realização da conexão com o banco de dados.

AS CONEXÕES UTILIZADAS FORAM FECHADAS?
R. Não, a cada vez que o verificarUsuario é chamado, uma nova conexão é aberta e não fechada.

PREENCHA A PLANILHA DE TESTE DE CAIXA BRANCA ESTÁTICA ENCONTRADA NA PLANILHA DE TESTE.
R. Inserido o arquivo Plano_De_Teste_AF.xls
