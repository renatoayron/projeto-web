# Transportadora Pão com Ovo

Pão com Ovo é uma transportadora de encomedas fictícia que representa uma implementação de uma solução em software consistente e funcional de uma transportadora convencional como aplicação WEB.

## Notas desta Versão
O projeto apresenta três CRUD's. Sendo eles USUÁRIO, FRANQUIA e ENCOMENDA. 
Todos os CRUDS estão operando corretamente. Porém, é possível CRIAR, EDITAR e VISUALIZAR os respectivos valores, tanto na aplicação, quanto na base de dados.

O Javadoc encontra-se na seguinte pasta abaixo:

```
/doc
```

O arquivo para inserção da base de dados encontra-se no seguinte diretório abaixo:

```
\src\main\resources
```

Para que este arquivo de script opere automaticamente, é necessário configurar o arquivo application.properties para o modo "create-drop" apenas na primeira execução. A partir da segunda, recomenda-se o uso do "update".

```
spring.jpa.hibernate.ddl-auto = create-drop
spring.jpa.hibernate.ddl-auto = update
```

## Começando

Essas instruções irão possibilitar que você tenha uma cópia do projeto em execução na sua máquina local para fins de desenvolvimento e testes.

### Pré requisitos

O que você precisa para que o projeto funcione é necessário ter, inicialmente, os seguintes softwares com as seguintes versões:

```
MySQL Server 8.0.17
Java JDK 1.8.0_181
Java JRE 1.8.0_181
```

### Instalação

Para startar o projeto em seu computador, siga as seguintes instruções:

#### 1ª Opção

Baixar este projeto em formato .zip.

Vá no link abaixo:

[https://github.com/renatoayron/projeto-web.git]([https://renatoayron@bitbucket.org/renatoayron/projetoweb.git](https://github.com/renatoayron/projeto-web.git))

Em seguida, vá em "Code" e depois "Download ZIP".

```
Downloads > Download repository
```

Após terminar de baixar, extraia o projeto para seu workspace.

No Eclipse, importe o projeto como projeto *Maven* seguindo os passos abaixo:

```
File > Import >  Maven > Existing Maven Projects (next) 
```

Navegue até o diretório que encontra-se a pasta do projeto que foi extraído (browse):

```
File > Import >  Maven > Existing Maven Projects (next) > Finish
```

#### 2ª Opção

Clonar este repositório através do Git.

Antes de clonar, baixe e instale o Git em seu computador.
Depois de instalado, inicie o Eclipse e vá em:

```
File > Import > Git > Projects from Git
```

Em seguida clique em "Clone URI" e localize:

```
Location > URI
```

Cole a URI do repositório abaixo:

[https://github.com/renatoayron/projeto-web.git](https://github.com/renatoayron/projeto-web.git)

Clique em "Next", deixe marcado a opção "master" e siga em "Next" novamente. Após isso, vá no seguinte bloco:

```
Destination > Directory
```

Defina o diretório onde o projeto será clonado e clique em "Next".
Logo depois de carregar marque "Import existing Eclipse projects" e clique em "Next".
Clique em "Finish" para finalizar.

## Informações de Configuração dos Pacotes

Utilizar o MySQL versão 8 instalado na máquina.
Criar manualmente um database denominado "transportadora" (create database transportadora;) antes de iniciar a aplicação.
Configurar o login e senha no arquivo application.properties com o Login e Senha do seu MySQL.

Para qualquer outra observação, inspecionar o arquivo "application.properties" e também o "pom.xml".

## Rodando a aplicação

Após importar o projeto, o Maven irá fazer o downloads das dependências necessárias e isso levará alguns minutos, conforme informação no console que se encontra na barra inferior esquerda do eclipse (Progress).

### Iniciando a aplicação WEB

Executar a seguinte classe (Run As Java Application).

```
paocomovo > com.transportadora > PaocomovoApplication.java
```

### No seu navegador, executar a seguinte url:.

```
http://localhost:8080/
ou
http://localhost:8060/
```

## Tecnologias Utilizadas

```
Spring Boot, Materialize, Hibernate, MySQL, Maven, JPA
```

## Authors

**Samuel Rufino e Renato Ayron**
