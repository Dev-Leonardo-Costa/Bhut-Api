# Bhut Tecnologia - Teste técnico back-end 
- Resumo: O projeto é uma API para consumir endpoints de uma API externa da empresa bhut-soluções em tecnologia.

## 💻Funcionalidades da API:
- [x] GET api/listCars: endpoint para listar todos os carros registrados da API externa.
- [x] POST api/createCar: endpoint para registrar um carro na API externa.  
- [x] GET api/logs: endpoint para consultar todos os logs registrados que confirmam o registro na API externa.  

## 🛠Tecnologias utilizadas:
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

## Como Testar a API: 
- Clonar o projeto para o terminal de trabalho:
````
git clone git@github.com:Dev-Leonardo-Costa/bhut-api-test.git
````
- Instalar o banco de dados MongoDB. Link abaixo de instalação:
````
https://www.mongodb.com/try/download/community
````
- Conectar ao banco de dados MongoDB, digitar no terminal de trabalhao o comando abaixo:
````
 mongod 
````
Escolher uma IDe para abrir o projeto, criar uma base de dados mongoDB com nome " bhut ", retornar ao projeto rodar o docker-compose para baixar a image da RabbitMQ e dar o start.
## Testando os endpoints da API:
- Iniciar os testes de endpoints do projeto. Para essa ação é necessário utilizar ferramenta de requisições como Postman.
1. Listar todos os carros registrados.  Para confirmar criação de novo registro a listagem pode ser utilizada:
````
http://localhost:8080/api/listCars
````
2. Registrar um carro na base de dados da API externa:
````
http://localhost:8080/api/createCar
````
3. Listar todos os logs que foram armazenados na base de dados:
````
http://localhost:8080/api/logs
````
4. Criar um WebHook:
````
http://localhost:8080/webhook/add
````
### Opção de teste da API através da URL com documentação e endpoints para testar: 
````
http://localhost:8080/swagger-ui/index.html
````
### Link da URL para informação do carro registrado em uma fila usando RabbitMQ. As informações da conexão e da fila que se encontram em " QUEUE ". O nome é Information_Car e será consumida a cada registro de um carro novo: 
````
http://localhost:15672
````
- Username
````
bhut
````
- Password
````
bhut
````
### Link da URL para gerar o token de acesso e testar o processo WebHook:
````
https://webhook.site
````
Na requisição do endpoint api/createCar será exibido o PAYLOAD e tipo POST no site informando sucesso na requisição.  


