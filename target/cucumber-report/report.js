$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/consultarOfertas.feature");
formatter.feature({
  "name": "Consultar Ofertas",
  "description": "  Eu enquanto usuario\n  Apos abrir a plataforma da webMotors desejo consultar as ofertas apreentadas",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@detalhesVeiculos"
    }
  ]
});
formatter.scenario({
  "name": "Consultar ofertas",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@detalhesVeiculos"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario acesse a plataforma webMotors",
  "keyword": "Dado "
});
formatter.match({
  "location": "ConsultarOfertasSteps.queOUsuarioAcesseAPlataformaWebMotors()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clica em ver ofertas",
  "keyword": "E "
});
formatter.match({
  "location": "ConsultarOfertasSteps.clicaEmVerOfertas()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//h2[contains(@class,\u0027sc-uJMKN hNiOat\u0027)])[1]\"}\n  (Session info: chrome\u003d103.0.5060.114)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-UNN7C33\u0027, ip: \u0027192.168.100.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 103.0.5060.114, chrome: {chromedriverVersion: 103.0.5060.53 (a1711811edd7..., userDataDir: C:\\Users\\55619\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50800}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7a06604e46b4e9e32dcc5fac37557888\n*** Element info: {Using\u003dxpath, value\u003d(//h2[contains(@class,\u0027sc-uJMKN hNiOat\u0027)])[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat pages.ConultarOfertasPage.\u003cinit\u003e(ConultarOfertasPage.java:21)\r\n\tat actions.ConsultarOfertasActions.\u003cinit\u003e(ConsultarOfertasActions.java:6)\r\n\tat actions.ConsultarOfertasActions.consultarOfertasActions(ConsultarOfertasActions.java:9)\r\n\tat steps.ConsultarOfertasSteps.clicaEmVerOfertas(ConsultarOfertasSteps.java:18)\r\n\tat ✽.clica em ver ofertas(file:src/test/resources/features/consultarOfertas.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "apresenta a lista de carros novos e usados",
  "keyword": "Entao "
});
formatter.match({
  "location": "ConsultarOfertasSteps.apresentaAListaDeCarrosNovosEUsados()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});