package Empresa;

import java.util.ArrayList;

import Trecho.Trechos;

import Utilitarios.Utilitario;
import Voo.Voo;

import Udidecola.udidecola;

public class Companhia extends Super_Empresa {


        private ArrayList <Trechos> T;
        private ArrayList <Voo> H;

        private float desconto;

        public Companhia(String cnpj, String nome, String nomefantasia, String datacriacao){
            super(cnpj, nome, nomefantasia, datacriacao);
            H = new ArrayList<Voo>();
            T = new ArrayList<Trechos>();
        }

        public boolean venda(Voo A, int quantidade){ // ADICIONAR VERIFICADOR
            if(!Utilitario.validavenda(A, quantidade)) return false;
            float faturamento = getFaturamento()+ (quantidade*A.getPreco());
            setFaturamento(faturamento);
            float taxa = getTaxa() + (quantidade*UdiDecola.getTaxa());
            setTaxa(taxa);
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


