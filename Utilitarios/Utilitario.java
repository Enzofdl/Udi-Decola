package Utilitarios;

public class Utilitario {



    public static boolean validacnpj(){return true;}
    public static boolean validacpf(String CPF){

        //verificar se o CPF possui o tamanho ideal
        if(CPF.length() != 11) return false;


        int prim = 0, seg = 0;
        for(int i = 0; i < 10; i++)
        {
            if(i == 9) seg += 9 * (CPF.charAt(9) - '0'); //Calcula o ultimo numero (que so seg armazena)
            else
            {
                seg += i * (CPF.charAt(i) - '0'); //Aumenta o segundo digito verificador
                prim += (i + 1) * (CPF.charAt(i) - '0'); //Aumenta o primeiro digito verificador
            }
        }
        seg = seg %11; // arredonda pra 0 se for 10
        prim = prim % 11;
        if(seg == 10) seg = 0;
        if(prim == 10) prim = 0;

        if((prim == (CPF.charAt(9) - '0')) && (seg == (CPF.charAt(10) - '0'))) return true;
        return false;
    }
    public static boolean validadata(){return true;}
    public static boolean validahorario(){return true;}
    public static boolean validaendereco(){return true;}
    public static boolean validaquarto(){return true;}
    public static boolean validaprecos(){return true;}
    public static boolean validasalario(){return true;}
    public static boolean validavoo(){return true;}





}
