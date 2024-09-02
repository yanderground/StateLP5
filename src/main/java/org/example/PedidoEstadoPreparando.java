package org.example;

public class PedidoEstadoPreparando extends PedidoEstado {

    private PedidoEstadoPreparando() {}
    private static PedidoEstadoPreparando instance = new PedidoEstadoPreparando();

    public static PedidoEstadoPreparando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Preparando";
    }

    public boolean prontoParaEntrega(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPronto.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
