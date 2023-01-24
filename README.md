# Projeto Bhut Tecnoligia - Teste técnico back-end 
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
Escolha uma IDe para abrir o projeto, depois vá ate o mongoDB que foi baixado na sua maquina crie uma base de dados com nome ( bhut ) e retorne ate o projeto e der um start.
## Testando os ENDPOIND da API
- Agora vamos testar os endpoints do projeto, se quiser testar com Postman fique a vontade.  
1. Lista todos os carros registrados na api
````
http://localhost:8080/api/listCars
````
2. Registrar um carro na base de dados da api externa, também podemos ver se foi registrado realmente o carro na 
api de terceiro olhando na base de dados que criamos com o nome (bhut) la terá uma tabela chamada (log) onde fica registrado o ID do log, DATA/HORA e o ID do carro que foi salvo    
````
http://localhost:8080/api/createCar
````
3. Lista todos os logs que foi armazenado na nossa base de dados.
````
http://localhost:8080/api/logs
````

