package br.com.trier.farmacia;

public class Medicamentos extends Produtos {

	private boolean isReceita;

	public Medicamentos(String nome, int estoque, double valor) {
		super(nome, estoque, valor);
		this.isReceita = isReceita;
	}

	@Override
	public boolean vender(Vendas venda) {
		if(isReceita && venda.getMedico() == null) {
			return false;
		}else if (getEstoque() >= venda.getQnt()) {
			return super.vender(venda);
		}
		return false;
	}
}
