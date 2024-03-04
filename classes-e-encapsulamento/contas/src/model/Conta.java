package model;



public class Conta {
    private int idConta;
    private String dataVencimento;
    private String dataPagamento;
    private Produto produto;
    private Cliente cliente;

    public Conta(int idConta, String dataVencimento, String dataPagamento, Produto produto, Cliente cliente) {
        this.idConta = idConta;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.produto = produto;
        this.cliente = cliente;
    }

    public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void visualizarConta() {
    	System.out.println("CONTAS PAGAS");
        System.out.println("IDENTIFICADOR: "+ idConta);
        System.out.println("PRODUTO: "+ produto.getDescricaoProduto());
        System.out.println("CLIENTE: " + cliente.getNomeCliente() + "  CPF: " + cliente.getCpf());
        System.out.println("VALOR: " + produto.getValorProduto());
        System.out.println("DATA DE VENCIMENTO: " + dataVencimento);
        System.out.println("DATA DE PAGAMENTO: " + dataPagamento);
        System.out.println("");
        System.out.print("---------------------------------------");
    }
}