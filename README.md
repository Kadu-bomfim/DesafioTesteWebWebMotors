# Teste Automatizado Web

Projeto desenvolvido para executar testes automatizados para consultar ofertas da plataforma Web Motors


##  Requisitos
* Java 8+ JDK deve estar instalado e com as variaveis de ambientes configuradas
* Maven deve estar instalado e configurado no path da aplicação.
* IDE Eclipse ou InteliJ deve estar instalada.


##  Abrindo projeto na sua IDE

INTELIJ: com InteliJ aberto, clicar em file, depois em open e localizar a pasta do projeto e clicar em OK. Se tiver alguma pergunta relacionada a maven diga que sim.

ECLIPSE: com Eclipse aberto,  clicar em file, import,  maven project e localizar a pasta do projeto e clicar em finish.

## Como executar os Testes Automatizados

* Primeiro é executar o Appium como adm e start.
* Segundo abrir android studio e criar um device com android v 10.0
* Terceiro com seu projeto aberto, na sua IDE de preferência, na raiz do projeto, você deve procurar o package "runners" abrir a classe "RunnerTest" e clicar com o botão direito do mouse em cima da classe e acionar a opção "Run 'RunnerTest'".

A aplicação começara a executar os scripts de teste. Basta observar a execução e seus resultados na IDE.


## Relatórios Gerados

Para acessar o arquivo responsável por gerar os relatórios dos teste, é necessário acessar a pasta do projeto, no computador, na raiz do projeto, navegar até a pasta "target/cucumber-report/" e abrir o arquivo "index.html" no Google Chrome.

Com o arquivo aberto no seu navegador, você consegue ver os passos percorridos para a execução do teste.

## Evidências dos testes

As Envidências/Imagens dos testes executados, ficam dentro da pasta target/screenshots na raiz do projeto.

##  Autor

Analista de Qualidade Pleno

Carlos Eduardo do Bomfim Brito

+55 61 98503-0785
