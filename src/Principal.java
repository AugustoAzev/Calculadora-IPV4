
public class Principal {

    public static void main(String [] args){
        //entre com um endereço de ip
        Rede endereco = new Rede(127, 100, 100, 80, 12);
        //CLASSIFICAÇÃO
        endereco.classeEndereco(endereco.octeto1);
        endereco.enderecoDeRede(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        endereco.primeiroEnderecoValido(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        endereco.ultimoEnderecoValido(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        endereco.classeMascara(endereco.bits);
        endereco.numeroDeHost(endereco.bits);
        endereco.cIDR(endereco.bits);
        endereco.classeDaMascara(endereco.bits);

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
