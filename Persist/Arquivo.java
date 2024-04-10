package Persist;

import java.io.*;

public class Arquivo {

    public static boolean gravar(Object a, String s)
    {
        try {
            FileOutputStream arquivoGrav = new FileOutputStream(s);
            ObjectOutputStream objetoGrav = new ObjectOutputStream(arquivoGrav);
            objetoGrav.writeObject(a);
            objetoGrav.flush();
            objetoGrav.close();
            arquivoGrav.flush();
            arquivoGrav.close();
            return true;
        } catch (Exception e) {return false;}

    }


    public static Object recuperar(String s)
    {
        Object obj = null;
        FileInputStream arquivoLeitura = null;
        ObjectInputStream objetoLeitura = null;
        try
        {
            arquivoLeitura = new FileInputStream(s);
            objetoLeitura = new ObjectInputStream(arquivoLeitura);
            obj = objetoLeitura.readObject();
            objetoLeitura.close();
            arquivoLeitura.close();
        }
        catch(Exception e) {return null;}
        return obj;
    }
}
