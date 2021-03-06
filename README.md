Desafio Desenvolvedor Sênior
======================================

Esta página contém detalhes do exercício utilizado como requisito para a oportunidade em aberto para atuar como desenvolvedor de software sênior pela empresa MapLink.

Uma equipe solicitou a criação de um componente para a realização de cálculos de valores totais da rota.

O contrato do componente define como <b>entrada</b> os seguintes parâmetros:

Lista de endereços

Cada endereço contém os dados:

* Nome da rua/avenida;
* Número;
* Cidade;
* Estado.

Tipos de rota

Considere a relação de tipos de rota permitidos:

* Rota padrão mais rápida;
* Rota evitando o trânsito.

O contrato de <b>saída</b> deste componente deve conter:

Valores totais da rota

Neste item devem constar: 

* Tempo total da rota;
* Distância total;
* Custo de combustível;
* Custo total considerando pedágio.

Deve-se utilizar os web services de Geocodificação e de Rotas da MapLink para realizar esta tarefa. 

Você encontrará <b>detalhes de uso</b> nestes endereços:

* <a href="http://dev.maplink.com.br/webservices/addressfinder/" target="_blank">Geocodificação - dev.maplink.com.br/webservices/addressfinder</a>
* <a href="http://dev.maplink.com.br/webservices/rotas/" target="_blank">Roteirização - dev.maplink.com.br/webservices/rotas</a>

Para consumir os métodos dos serviços SOAP da MapLink é necessário utilizar uma chave de acesso. Você deve utilizar a seguinte: <b>c13iyCvmcC9mzwkLd0LCbmYC5mUF5m2jNGNtNGt6NmK6NJK=</b>

Caso você opte por trabalhar com a API Javascript, use esta chave: <b>ymYmaxLXdMBJRmLgendrG0RjGYOIbvLXOwBvSJvgNMpPSAFAGKdAOKFgTmzPTKs9</b>

Você tem a <b>liberdade de escolher e definir</b> sobre a linguagem de programação, frameworks, design e arquitetura a ser adotada. O único requisito é a disponibilização deste componente para a utilização em outro projeto qualquer (independente de linguagem de programação / plataforma / ambiente).

Outros parâmetros dos serviços de Geocodificação e de Rotas, os quais não foram mencionados, não são relevantes para essa solução, sendo assim, você tem a liberdade de definí-los como preferir.

O compartilhamento do resultado produzido deve ser feito diretamente pelo GitHub. Para isso, faça um <a href="https://help.github.com/articles/fork-a-repo" target="_blank">fork</a> e nos envie sua versão com a devida implementação.

Qualquer dúvida, você pode enviar um e-mail para webservices@maplink.com.br.

Lhe desejamos um ótimo desafio!

*Time MapLink API / Web Services*