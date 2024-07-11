import java.util.Scanner;

public class Principal {

    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        // Solicita ao usuário que entre com um endereço IP
        System.out.println("Entre com um endereço IP no formato 192.168.0.0/24:");
        String ipComMascara = teclado.nextLine();

        String[] partes = ipComMascara.split("/");
        String enderecoIP = partes[0];
        int bits = Integer.parseInt(partes[1]);

        String[] octetos = enderecoIP.split("\\.");
        int octeto1 = Integer.parseInt(octetos[0]);
        int octeto2 = Integer.parseInt(octetos[1]);
        int octeto3 = Integer.parseInt(octetos[2]);
        int octeto4 = Integer.parseInt(octetos[3]);

        Rede endereco = new Rede(octeto1, octeto2, octeto3, octeto4, bits);
        //CLASSIFICAÇÃO
        endereco.classeEndereco(endereco.octeto1);
        endereco.enderecoDeRede(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        endereco.primeiroEnderecoValido(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        endereco.ultimoEnderecoValido(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        endereco.ultimoEndereco(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4, endereco.bits);
        endereco.mascaraDaRede(endereco.bits);
        endereco.classeDaMascara(endereco.bits);
        endereco.numeroDeHost(endereco.bits);
        endereco.cIDR(endereco.bits);
        endereco.verificarTipoDeEndereco(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);

        System.out.print("Representação binária da máscara: ");
        endereco.mascaraEmBinario(endereco.bits);

        System.out.print("Representação binária do endereço: ");
        endereco.enderecoEmBinario(endereco.octeto1);
        endereco.enderecoEmBinario(endereco.octeto2);
        endereco.enderecoEmBinario(endereco.octeto3);
        endereco.enderecoEmBinario(endereco.octeto4);
        System.out.println();

    }
}
