# Bhut Tecnoligia - Teste técnico back-end 
- Resumo: O projeto é uma API para consumir alguns ENDPOINT de uma API externa da empresa bhut-soluções em tecnologia.

## 💻Funcionalidades da API
- [x] GET api/listCars, endpoint de listar todos os carros registrados da api externa.
- [x] POST api/createCar, endpoint de registrar um carro na api externa.  
- [x] GET api/logs, endpoint de consultar todos os log registrado que confirma o regitro na api externa.  

## 🛠Tecnologias utilizada
1.  [Java]()
2.  [Spring Framework]()
5.  [Lombok]()
6.  [Spring Doc]()
7.  [Swagger]()
8.  [Devtools]()
9.  [MongoDB]()
10. [ModelMapper]()
11. [Docker]()
12. [Postman para testes dos endpoint]()
13. [Intelij]()
14. [Maven]()
15. [RabbitMQ]()
16. [OpenFeign-Cloud]()

## Como Testar a API 
- Clone o projeto através do terminal na sua maquina
````
git clone git@github.com:Dev-Leonardo-Costa/bhut-api-test.git
````
- Vamos precisar do banco de dados MongoDB instalado na nossa maquina, caso não tenha instalado link abaixo de instalação
````
https://www.mongodb.com/try/download/community
````
- Comando para conectar com o banco MongoDB digite no seu terminal 
````
 mongod 
````
Escolha uma IDe para abrir o projeto, depois vá ate o mongoDB que foi baixado na sua maquina crie uma base de dados com nome " bhut " e retorne ate o projeto e der um start.
## Testando os ENDPOIND da API
- Agora vamos testar os endpoints do projeto, se quiser testar com Postman fique a vontade.  
1. Lista todos os carros registrados
````
http://localhost:8080/api/listCars
````
2. Registrar um carro na base de dados da api externa, também podemos ver se foi registrado realmente o carro na 
api de terceiro olhando na base de dados que criamos com o nome " bhut " la terá uma tabela chamada " log " onde fica registrado o ID do log, DATA/HORA e o ID do carro que foi salvo    
````
http://localhost:8080/api/createCar
````
3. Lista todos os logs que foi armazenado na nossa base de dados.
````
http://localhost:8080/api/logs
````
4. Cria um WeHook
````
http://localhost:8080/webhook/add
````
### Segunda opção de teste da API através da url abaixo, copie e coloque na barra do seu navegador que abrirá uma documentação e la estara os 4 endpoint para testar 
````
http://localhost:8080/swagger-ui/index.html
````
### Informação do carro registrado para uma fila usando RabbitMQ, link a baixo esta a url que estara as informações da conexão e da fila que se encontra em " QUEUE " nome é Information_Car ja estara consumida a cada registro de um carro novo a fila 
````
http://localhost:15672/
````
- Username
````
bhut
````
- Password
````
bhut
````
### Para testar o WebHook temos que registrar uma url, usei a Url do site WebHook.site, esse site ja gera um token para realizar os teste processo
````
https://webhook.site
````
Sempre que fizer a requisição do endpoind api/createCar aparecera o PAYLOAD e tipo POST no site informando que ocorreu tudo bem   


