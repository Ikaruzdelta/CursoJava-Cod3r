package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    
    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto"); //put além de add ele tbm substitui
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");
        
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty()); //verifica se ta vazio
        
        System.out.println(usuarios.keySet()); //Mostra a chave
        System.out.println(usuarios.values()); //Mostra os valores
        System.out.println(usuarios.entrySet()); //Chave e valor
        
        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));
        
        System.out.println(usuarios.get(20));
        
        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        
        for(String valores: usuarios.values()){
            System.out.println(valores);
        }
        
        for(Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + "=");
            System.out.println(registro.getValue());
        }
    }
}
