package org.example;

public class Pedido {

    private String descricao;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoNovo.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean prontoParaEntrega() {
        return estado.prontoParaEntrega(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public PedidoEstado getEstado() {
        return estado;
    }
}
