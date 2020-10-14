package ValueOb;

public class Fornecedor {
    private  double desconto;

    public void Desconto() {
        System.out.println("Digite o desconto para o fornecedor: ");
        setDesconto();
    }


    public void getDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public double setDesconto() {
        return desconto;
    }
}
