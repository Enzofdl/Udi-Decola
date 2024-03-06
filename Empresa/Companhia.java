package Empresa;

import java.util.ArrayList;

import Trecho.Trechos;

import Utilitarios.Utilitario;
import Voo.Voo;
import UdiDecola.*;

public class Companhia extends Super_Empresa {


        private ArrayList <Trechos> T;
        private ArrayList <Voo> H;

        private float desconto;

        public Companhia(String cnpj, String nome, String nomefantasia, String datacriacao){
            super(cnpj, nome, nomefantasia, datacriacao);
            H = new ArrayList<Voo>();
            T = new ArrayList<Trechos>();
        }

        public boolean venda(Voo A, int quantidade){
            // ADICIONAR VERIFICADOR
            if(!Utilitario.validavenda(A, quantidade)) return false;
            float faturamento = getFaturamento()+ (quantidade*A.getPreco());
            setFaturamento(faturamento);
            double taxa = getTaxa() + (quantidade*(UdiDecola.getTaxa()));
            setTaxa(taxa);
            AdicionarHistorico(A);
            return true;
        }


         public void NovoTrecho(Trechos a){
            T.add(a);
     }
         public void AlterarTrecho(Trechos antigo, Trechos novo) {
            T.set(T.indexOf(antigo), novo);
         }
        public void ApagarTrecho(Trechos a){
            T.remove(a);
        }
        public boolean BuscarTrecho(Trechos a){
            return T.contains(a);
        }
        public Trechos BuscarTrecho(int a){
            return T.get(a);
        }
        public ArrayList<Trechos> getTrechos(){
            return T;
        }

        public ArrayList<Voo> retornaHistorico(){
            return H;
        }


        public float consultafaturamento(){
            return getFaturamento();
        }
        public double consultataxa(){
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

        public ArrayList<Trechos> getT() {
            return T;
        }

        public void AdicionarHistorico(Voo historico) {
            H.add(historico);
        }

        public float getDesconto() {
            return desconto;
        }

        public void setDesconto(float desconto) {
            this.desconto = desconto;
        }

    }


