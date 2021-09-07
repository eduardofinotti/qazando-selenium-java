# language: pt

@message
Funcionalidade: Enviar mensagem

  @enviar-mensagem-sucesso
  Cenario: Enviar uma mensagem com sucesso
    Dado que estou na tela de mensagens
    E preencho todos os campos
    Quando clico em enviar mensagem
    Então vejo feedbback de mensagem enviada com sucesso