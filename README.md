# WebServices SOAP com <img src="https://devkico.itexto.com.br/wp-content/uploads/2014/08/spring-boot-project-logo-300x270.png" width="40"> Spring Boot 
<img src="https://i.imgur.com/5onucdo.png" width="800"><br>

** Este projeto destina-se apenas a estudos de schemas xml, JaxB, xsd spring boot, para construção de serviços rest com webservices soap, apesar de, em termos tecnicos, xml seja or uma maioria defasado, ainda há organizações que lidam melhor com esta estrutura, melhor pelo fato de a refatoração de uma aplicação existênte para as tecnologias atuais seria de grande custo financeiro.

** Wsld gerado. Em tempos atuais, o arquivo wsdl, muitas das vezes é utilizado como nosso atual swagger para quem está familiarizado com o mundo spring, documento que é possível visualzar os serviços disponíveis, porta, os serviços disponíveis, os tipos de respostas e tipagens correta para construção das chamadas. <br>
<img src="https://i.imgur.com/rCT2wn0.png" width="800">

<hr>
* <b>types</b>: Contem detalhes das requisições e respostas<br>
* <b>message</b>: Contem as troca de requisições e respostas<br>
* <b>portType</b>: Através de interface é possível chegar aos sevriços e implementações concretas<br>
* <b>bind</b>: Define a implementação, usamos o soap/http, o style="document" indica que estamos realizando requisições http completas, ou rpc, chamar serviço remoto, seria necessário definir parametros de entrada, autenticação. etc.<br>
* <b>service</b>: Endereço dsn onde os serviços soap estão disponíveis<br>
<hr>

** WSDL e SoapUI | requisições, utilizei a plataforma SoapUi para requisições e respostas <br>
<img src="https://i.imgur.com/JoXqf1U.png" width="800"><br>

Listando os Customers<br>
<img src="https://i.imgur.com/GeuBozY.png" width="800"><br>

Listando Customer por ID<br>
<img src="https://i.imgur.com/pDAeFN9.png" width="800"><br>

Deletando Customer por ID<br>
<img src="https://i.imgur.com/3m3Ewug.png" width="800"><br>
