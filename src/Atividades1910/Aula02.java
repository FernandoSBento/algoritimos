package Atividades1910;

public class Aula02 {

    public static int ConectarBD() {
        // Codigos de conexão
        //...
        System.out.println("Conectado ao BD tal.");
        return 57843;
    }

    public static void inserir(String nome, int id) {
        // Comandos para insetir dados
        //....
        System.out.println("Dados inseridos");

    }

    public static void atualizar(String nome, int id) {
        // Comandos para atualizar dados
        //...
        System.out.println("Dados atualizados");

    }

    public static String[] selecionar(String tabela) {
        //Comandos para selecionar
        //....

        String[] lista = new String[10];
        //Só de exemplo
        
        lista[0]= "Amauri";
        
        //...
        
        return lista; 
    }

    public static void main(String[] args) {

        System.out.println("Rodando...");
        
        double r =  Math.sqrt(148);
        
        System.out.println("Resultado: " + r);
        
        

    }
}
