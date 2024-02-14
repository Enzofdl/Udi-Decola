package Empresa;

import java.util.ArrayList;

public class Companhia extends Super_Empresa {


        ArrayList <Trechos> T = new ArrayList<Trechos>();
        ArrayList <historico> H = new ArrayList<historico>();
        private float desconto;

        public Companhia(String cnpj, String nome, String nomefantasia, String datacriacao){
            super(cnpj, nome, nomefantasia, datacriacao);
        }

        public boolean venda(Voo A, int quantidade){ // ADICIONAR VERIFICADOR
            faturamento += quantidade*A.getPreco();
            taxa += quantidade*UdiDecola.Taxa;
            AdicionarHistorico(A);
        }

        // public boolean NovoTrecho()
        // public boolean AlterarTrecho()
        // public boolean ApagarTrecho()
        // public Trecho BuscarTrecho()
        // public void MostrarTrechos()
        // public void AdicionarHistorico()
        // public void MostrarHistorico()
        public float consultafaturamento(){
            return getFaturamento();
        }
        public float consultataxa(){
            return getTaxa();
        }
        public boolean alteradesconto(float desconto){
            if(desconto > 0 && desconto <=1)this.desconto = desconto;
            else return false;
            return true;
        }

        public float consultadesconto(){
            return getDesconto();
        }

        public Trechos[] getT() {
            return T;
        }

        public void setT(Trechos[] t) {
            T = t;
        }

        public Voo[] getHistorico() {
            return historico;
        }

        public void setHistorico(Voo[] historico) {
            this.historico = historico;
        }

        public int getDesconto() {
            return desconto;
        }

        public void setDesconto(int desconto) {
            this.desconto = desconto;
        }

    }


