# Tela_Login

## Introdução

Este projeto Java apresenta uma implementação simples de uma tela de login. A classe `LoginScreen` oferece funcionalidades de autenticação de usuários e permite a adição de novos usuários ao banco de dados.
![image](https://github.com/VanessaCristinaSilva/Tela_Login/assets/115050243/48a4616f-dcf3-41bf-9415-f7b47a3cd286)

## Funcionalidades Principais

+ Autenticação de Usuário: A verificação ocorre entre um nome de usuário e uma senha fornecidos com os dados armazenados no banco de dados.
+ Adição de Novo Usuário: Adiciona novos usuários ao banco de dados utilizando a classe `LoginScreen`.

## Métodos 
+ public boolean login(String username, String password): verifica se um usuário com o nome `username` e a senha correspondente password está presente no banco de dados.
+ public void addUser(String username, String password): adiciona um novo usuário ao banco de dados com o nome de usuário username e a senha associada password.
  
## Parâmetros
+ username: Nome de usuário a ser autenticado.
+ password: Senha associada ao nome de usuário.

## Retorno
+ true caso a autenticação for bem-sucedida.
+ false caso não for bem-sucedida.

## Passo a passo do Projeto criado
Criar uma instância da tela de login - LoginScreen loginScreen = new LoginScreen();</p>
<p>1. Autenticar um usuário existente - boolean resultadoAutenticacao = loginScreen.login("john", "password123");</p>
<p>2.Adicionar um novo usuário - loginScreen.addUser("novousuario", "novasenha");</p>
<p>3.Autenticar o novo usuário adicionado - boolean resultadoAutenticacaoNovoUsuario = loginScreen.login("novousuario", "novasenha");</p>

## Testes realizados 

![image](https://github.com/VanessaCristinaSilva/Tela_Login/assets/115050243/09a32706-6f32-4b5a-948a-e407140f34e7)
![image](https://github.com/VanessaCristinaSilva/Tela_Login/assets/115050243/f3dfb353-75b9-4de6-970e-0c79827026fc)
![image](https://github.com/VanessaCristinaSilva/Tela_Login/assets/115050243/eecdca77-697a-456c-bb9b-3f5a618e2efc)



