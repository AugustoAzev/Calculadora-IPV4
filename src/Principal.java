
public class Principal {

    public static void main(String [] args){
        //entre com um endereço de subrede
        Subrede subrede = new Subrede(255, 255, 0, 0, 24);
        //entre com um endereço de ip
        Endereco endereco = new Endereco(130, 100, 10, 80);
        //CLASSIFICAÇÃO
        endereco.classeEndereco(endereco.octeto1);
        endereco.enderecoDeRede(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        endereco.primeiroEnderecoValido(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        endereco.ultimoEnderecoValido(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        subrede.mascaraDeSubrede(subrede.mascara1, subrede.mascara2, subrede.mascara3, subrede.mascara4);
        subrede.classeMascara(subrede.mascara1, subrede.mascara2, subrede.mascara3, subrede.mascara4);
        subrede.numeroDeHost(subrede.bits);
        subrede.cIDR(subrede.bits);

        System.out.print("Representação binária do endereço: ");
        endereco.enderecoEmBinario(endereco.octeto1);
        endereco.enderecoEmBinario(endereco.octeto2);
        endereco.enderecoEmBinario(endereco.octeto3);
        endereco.enderecoEmBinario(endereco.octeto4);
        System.out.println();
        System.out.print("Representação binária da Máscara: ");
        subrede.mascaraEmBinario(subrede.mascara1);
        subrede.mascaraEmBinario(subrede.mascara2);
        subrede.mascaraEmBinario(subrede.mascara3);
        subrede.mascaraEmBinario(subrede.mascara4);


    }
}
