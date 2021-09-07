# language: pt

  @cadastro
  Funcionalidade: Cadastro de usuário

    @cadastro-sucesso
    Cenario: Registrar novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuário
      Quando eu preencho o formulário de cadastro
      E clico em registrar
      Então vejo cadastro realizado com sucesso