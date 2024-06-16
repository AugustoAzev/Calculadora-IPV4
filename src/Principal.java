import java.util.Scanner;

public class Principal {

    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        //entre com um endereço de ip
        Endereco endereco = new Endereco(127, 100, 10, 80);

        endereco.verificaClasse(endereco.octeto1);

        System.out.print("Representação binária: ");
        endereco.transformaEmBinario(endereco.octeto1);
        endereco.transformaEmBinario(endereco.octeto2);
        endereco.transformaEmBinario(endereco.octeto3);
        endereco.transformaEmBinario(endereco.octeto4);

        endereco.enderecoDeRede(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        //subredes
        Subrede subrede = new Subrede();
        subrede.bits = 24;
        subrede.definirCidr(subrede.bits);

    }
}
