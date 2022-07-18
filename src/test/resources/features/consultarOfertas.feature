#language: pt
#encondig: utf-8

@detalhesVeiculos
Funcionalidade: Consultar Ofertas
  Eu enquanto usuario
  Apos abrir a plataforma da webMotors desejo consultar as ofertas apreentadas


    Cenario: Consultar ofertas
    Dado que o usuario acesse a plataforma webMotors
    E clica em ver ofertas
    Entao apresenta a lista de carros novos e usados

  Cenario: Consultar lista de veiculos em ofertas
    Dado que o usuario acesse a plataforma webMotors
    Quando clicar em ver ofertas
    Entao apresenta a lista de carros novos e usados em oferta

  Cenario: Consultar veiculo de das ofertas
    Dado que o usuario acesse a plataforma webMotors
    Quando clicar em ver ofertas
    E clicar em um veiculo para consulta
    Entao apresenta informacoes do veiculo e opcoes de parcelas, agendar videoChamada e enviar mensagem

  Cenario: Consultar parcelas de veiculo
    Dado que o usuario acesse a plataforma webMotors
    Quando clicar em ver ofertas
    E clicar em um veiculo para consulta
    E clicar em ver parcelar e preencher e marcar todos os campos obrigatorios
    E acionar o botao ver parcelas que ficara habilitado apos preencher as informacoes
    Entao apresenta uma mensagem e opção de clicar simular as parcelas

  Cenario: Consultar condicoes de parcelas de veiculo
    Dado que o usuario acesse a plataforma webMotors
    Quando clicar em ver ofertas
    E clicar em um veiculo para consulta
    E clicar em ver parcelar e preencher e marcar todos os campos obrigatorios
    E acionar o botao ver parcelas que ficara habilitado apos preencher as informacoes
    Quando acionar o botao ver parcelas
    E acionar o botao ver codicoes
    Entao apresenta uma tela com os dados do veiculos e uma simulacao de credito sem compromisso

  Cenario: Garantir meu credito de condicoes de parcelas de veiculo - positivo
    Dado que o usuario acesse a plataforma webMotors
    Quando clicar em ver ofertas
    E clicar em um veiculo para consulta
    E clicar em ver parcelar e preencher e marcar todos os campos obrigatorios
    E acionar o botao ver parcelas que ficara habilitado apos preencher as informacoes
    Quando acionar o botao ver parcelas
    E acionar o botao ver codicoes
    E acionar o botao garantir meu credito
    E preencher formulario com todos os dados solicitados e acionar enviar proposta
    Entao apresenta uma mensagem

  Cenario: Garantir meu credito de condicoes de parcelas de veiculo - negativo
    Dado que o usuario acesse a plataforma webMotors
    Quando clicar em ver ofertas
    E clicar em um veiculo para consulta
    E clicar em ver parcelar e preencher e marcar todos os campos obrigatorios
    E acionar o botao ver parcelas que ficara habilitado apos preencher as informacoes
    Quando acionar o botao ver parcelas
    E acionar o botao ver codicoes
    E acionar o botao garantir meu credito
    E preencher formulario com todos os dados solicitados invalidos e acionar enviar proposta
    Entao apresenta uma mensagem avisando que a proposta foi negada

  Cenario: Enviar mensagem ao vendedor
    Dado que o usuario acesse a plataforma webMotors
    Quando clicar em ver ofertas
    E clicar em um veiculo para consulta
    E preencher o formulario com uma mensagem para o vendedor
    E acionar o botao enviar mensagem
    Entao apresenta uma mensagem avisando que a mensagem foi enviada

  Cenario: Agendar videoChamada
    Dado que o usuario acesse a plataforma webMotors
    Quando clicar em ver ofertas
    E clicar em um veiculo para consulta
    E acionar o botao agendar videoChamada
    E preencher informacoes de dia e horarios
    Entao apresenta uma mensagem avisando que foi agendado

  Cenario: Ver telefone do vendedor
    Dado que o usuario acesse a plataforma webMotors
    Quando clicar em ver ofertas
    E clicar em um veiculo para consulta
    E acionar o botao ver telefone
    Entao o numero de telefone do vendedor e apresentado

  Cenario: Denunciar anuncio em oferta
    Dado que o usuario acesse a plataforma webMotors
    Quando clicar em ver ofertas
    E clicar em um veiculo para consulta
    E acionar o botao denunciar este anuncio
    E preencher formulario com dados obrigatorios e acionar o botao enviar
    Entao apresenta mensagem de sucesso


