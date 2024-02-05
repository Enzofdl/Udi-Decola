# **Elementos e Classes a Serem Trabalhados**



## *Classes*
  - [ ] Aeroporto (Cogitar a implementação e vinculação da Classe Cidades)
      - [ ] Construtor
      - [ ] Nome
      - [ ] Cidade
      - [ ] Vetor de Trechos
      - [ ] Registrar Trecho
      - [ ] Remover Trecho
      - [ ] Alterar Trecho
      - [ ] Buscar Trecho
      - [ ] Visualizar Trechos 
        
        
  - [ ] Companhia Aérea -> Enzo Faria
      - [X] Construtor
      - [X] CNPJ
      - [X] Nome Oficial
      - [X] Nome Fantasia
          - [ ] Altera nome fantasia 
      - [x] Faturamento
          - [ ] Vincular à classe Voo 
      - [X] Quanto deve pagar ao APP
          - [ ] Vincular à classe Voo para calculo da taxa
          - [ ] Vincular ao atributo estático TAXA da Classe UdiDecola 
      - [X] Data de Criação
      - [X] Alteração de nome fantasia
          - [ ] Método de Alteração 
      - [X] Trechos
          - [ ] // public boolean NovoTrecho()
          - [ ] // public boolean AlterarTrecho()
          - [ ] // public boolean ApagarTrecho()
          - [ ] // public Trecho BuscarTrecho()
          - [ ] // public void MostrarTrechos()
      - [X] Histórico de voos
          - [ ] // public void AdicionarHistorico()
          - [ ] // public void MostrarHistorico()
      - [X] Descontos para VIPS
       
  
  - [ ] Trechos (Vinculado à aeroporto e companhia)
      - [ ] Nome
      - [ ] Construtor
      - [ ] Origem
      - [ ] Destino
      - [ ] Voos Futuros
      - [ ] Histórico de Voos
      - [ ] Criar Trecho
      - [ ] Encerrar Trecho
      - [ ] Alterar Trecho
      
      
  - [ ] Voo (Vinculado à Trechos)
      - [ ] Preço
      - [ ] Trecho
      - [ ] Quantidade Vendida
      - [ ] Data de saída
      - [ ] Data de chegada
      - [ ] Horários Planejados
      - [ ] Horários em que aconteceram
      - [ ] Alterar Preço
      - [ ] Cancelar Voo
      - [ ] Adiar/Adiantar Voo

   
  - [ ] Hoteis (Vinculados à cidades e funcionário)
      - [ ] Nome
      - [ ] Construtor
      - [ ] CNPJ
      - [ ] Nome Fantasia
      - [ ] Endereço Completo
      - [ ] Ano de Criação
      - [ ] Nro de Estrelas
      - [ ] Aceitação de PETS
      - [ ] Nro de Quartos
      - [ ] Vetor Quartos
      - [ ] SubClasse QUARTOS
        - [ ] Disponível
        - [ ] Capacidade de Pessoas
        - [ ] Preço
        - [ ] Check-In
        - [ ] Check-Out
        - [ ] Cancelamento de reserva
        - [ ] Reserva
        - [ ] Possíveis Descontos
        - [ ] Preço a qual foi alugado
      - [ ]  Mensagem de Exibição na Busca
      - [ ]  Descrição do Hotel
      - [ ]  Cidade à qual o Hotel reside
      - [ ]  Tipos de quartos
      - [ ]  Descontos Para VIPS

  
  - [ ] Funcionários (Pode também ser cliente)
      - [ ] Nome
      - [ ] Construtor
      - [ ] CPF
      - [ ] Numero de Registro
      - [ ] Salario fixo
      - [ ] Hoteis Gerenciados
      - [ ] Salario final

    
  - [ ] Clientes (Pode também ser funcionário)
      - [ ] Construtor
      - [ ] Nome
      - [ ] CPF
      - [ ] Endereço de Cobrança
      - [ ] Data de Nascimento
      - [ ] Data de Cadastro
      - [ ] Email
      - [ ] VIP
      - [ ] Voos Futuros
      - [ ] Diárias Futuras
      - [ ] Histórico de Compras
      - [ ] Número de Compras
      - [ ] Valor gasto
      - [ ] Histórico de Pesquisas

  
  - [ ] Pesquisas (Vincular ao cliente. Verificar possiveis outros vínculos)
      - [ ] Data de Início
      - [ ] Data Final
      - [ ] Destino
      - [ ] Origem
      - [ ] Data e hora da pesquisa realizada

   
  - [ ] Compra (Vinculada à trecho, companhia aerea/hotéis, cliente)
      - [ ] Voo
      - [ ] Valor Pago
      - [ ] Valor da Companhia (Se houver)
      - [ ] Valor do Aplicativo
      - [ ] Valor do Hotel (Se houver)
      - [ ] Diárias em Hotel (Pensar em SubClasse)
      - [ ] Quantidades de diárias, voos e etc.
      - [ ] Data e Hora da Compra
      - [ ] Método de Pagamento
      - [ ] Atualizar Nro de compras do cliente
      - [ ] Compra VIP ou não
       
  
  - [ ] UdiDecola (Vinculada a todas as outras classes)
      - [ ] Funcionários
      - [ ] Faturamento Total
      - [ ] Métodos para administrar/moderar todas as classes
      - [ ] Sócios
      - [ ] Faturamento mensal (opcional)
   
  - [ ] Pensar em classe adicional para ser implementada.

## *Banco de Dados*

## *Interface*
