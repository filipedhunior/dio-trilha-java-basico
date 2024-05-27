saldoCliente = 10.00

# Apresentação
print("")
print("----------------CONTA TERMINAL PYTHON----------------")
print("")

print("Ola, eu sou a PIA: a Assistente Interativa Python e vou estar conduzindo seu acesso a sua conta bancaria")

# Criando os textos para auxiliar na solicitação de informações do programa ao usuario
print("")
print("PIA: Assistente Interativa Python")
nomeCliente = input("Por favor, digite seu nome completo ")

print("")
print("PIA: Assistente Interativa Python")
agenciaCliente = input(f"{nomeCliente} digite sua agencia no formato de três digitos separando o ultimo valor por traço. Ex: 000-0 ")

print("")
print("PIA: Assistente Interativa Python")
numeroConta = input("Agora digite o número da sua conta usando somente números e sem espaços ")

print("");
print("Carregando suas informações de conta, aguarde...");

# Exibição das informações de forma formatada
print("")
print(f"Olá {nomeCliente}, obrigado por criar uma conta em nosso banco, sua agência é {agenciaCliente}, numero de conta {numeroConta} e seu saldo de R$ {saldoCliente} já está disponível para saque.")
print("")